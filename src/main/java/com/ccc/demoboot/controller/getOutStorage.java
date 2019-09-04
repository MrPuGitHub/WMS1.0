package com.ccc.demoboot.controller;

import com.ccc.demoboot.domain.ChuKuDan;
import com.ccc.demoboot.domain.Sendorder;
import com.ccc.demoboot.domain.Shelf;
import com.ccc.demoboot.domain.Warehouse;
import com.ccc.demoboot.service.ChuKuService;
import com.ccc.demoboot.service.SendorderService;
import com.ccc.demoboot.service.ShelfService;
import com.ccc.demoboot.service.WarehouseService;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;
import java.util.UUID;


/**
 * 出库操作
 */
@Controller
public class getOutStorage {

    @Resource(name="chuKuServiceImpl")
    private ChuKuService chuKuService;

    @Resource(name = "warehouseServiceImpl")
    WarehouseService warehouseService;
    @Resource(name = "shelfServiceImpl")
    ShelfService shelfService;
    @Resource
    Sendorder sendorder;
    @Resource(name = "sendorderServiceImpl")
    SendorderService sendorderService;
    /**
     * 获取订单信息
     */
    @RequestMapping("/getOrder")
    public String http() {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        // HTTP Get请求，参数设置为请求地址
        HttpGet httpGet = new HttpGet("");
        // 设置请求和传输超时时间
        // RequestConfig requestConfig =
        // RequestConfig.custom().setSocketTimeout(TIME_OUT).setConnectTimeout(TIME_OUT).build();
        // httpGet.setConfig(requestConfig);
        String res = "";
        try {
            // 执行请求
            HttpResponse getAddrResp = httpClient.execute(httpGet);
            HttpEntity entity = getAddrResp.getEntity();
            if (entity != null) {
                res = EntityUtils.toString(entity);
            }
            System.out.println("响应" + getAddrResp.getStatusLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return res;
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return res;
            }
        }
        return res;
    }


    List<Shelf> shelfList;//保存商品货架信息

    /**
     * 点击调度时查询商品所在的仓库，和商品所在货架
     */

    @RequestMapping("/scheduling/{id}")
    public String Scheduling(Model model, @PathVariable(value = "id") int id) {

        ChuKuDan chuKuDan = chuKuService.selChuKuDanBuChukuid(id);
        System.out.println("goodId="+chuKuDan.getGoodid());
        System.out.println("goodNum="+chuKuDan.getOutnum());


        System.out.println("执行调度");
        //接收来自订单的信息
        int goodId = chuKuDan.getGoodid();
        int goodNum = chuKuDan.getOutnum();
        //查询商品所在仓库
        List<Warehouse> warehouseList = warehouseService.selectByGoodid(goodId);
        int sNum = 0;
        for (int i = 0; i < warehouseList.size(); i++) {
            int s = warehouseList.get(i).getGoodamount();

            sNum = sNum + s;
            if (goodNum <= sNum) {
                //查询商品所在货架
                shelfList = shelfService.selectByGoodid(goodId, id);
                model.addAttribute(warehouseList);
                model.addAttribute(shelfList);
                return "/ChuKu/Scheduling";
            }
        }
        System.out.println("no");
        return null;
    }

    /**
     * 打单
     * sendOrder发货单和物流单
     */

    @RequestMapping(value = "/sendOrder")
    public String sendOrder(Model model, String sNum[]) {
        System.out.println("执行打单");
        if (sNum != null) {
            for (int i = 0; i < sNum.length; i++) {
                if (sNum[i] != "") {
                    int p = shelfList.get(i).getGoodamount();
                    int q = Integer.parseInt(sNum[i]);
                    int r = p - q;
                    shelfList.get(i).setGoodamount(r);
                    shelfService.updateGoods(shelfList.get(i));
                }

            }


            //发货单编号
            String uuid = UUID.randomUUID().toString().replace("-", "").substring(0, 8);
            //whNum,shNum接收jsp页面的数据
            sendorder.setSendorderid(uuid);//订单编号
            // System.out.println(uuid);
            sendorder.setUsername("225");//收件人姓名
            sendorder.setUseraddress("334");//收件人地址
            sendorder.setTelnum("556");//收件人电话
            sendorder.setGoodid("36689");//商品编号
            sendorder.setGoodnum("5555");//商品数量
            sendorder.setSendname("335");//拣货人
            sendorder.setSendcom("335");//发货单位
            sendorder.setComaddress("336");//单位地址


            try {
                //添加一条发货订单信息
                int rs = sendorderService.inseretSendorder(sendorder);
                if (rs == 1) {
                    model.addAttribute(sendorder);
                    return "/ChuKu/sendOrder";

                }
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("出错");
                return "/ChuKu/Scheduling";
            }
        }
        return "/ChuKu/Scheduling";
    }

    /**
     * 复核
     */
    @RequestMapping(value = "/checkOrder")
    public String checkGoods() {
        System.out.println("执行复核");
        //仓库
        return "/ChuKu/checkGoods";
    }


}
