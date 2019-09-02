//package com.ccc.demoboot.controller;
//
//import com.ccc.demoboot.domain.Sendorder;
//import com.ccc.demoboot.domain.Shelf;
//import com.ccc.demoboot.domain.Warehouse;
//import com.ccc.demoboot.service.SendorderService;
//import com.ccc.demoboot.service.ShelfService;
//import com.ccc.demoboot.service.WarehouseService;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import javax.annotation.Resource;
//import java.util.List;
//import java.util.UUID;
//
//
///**
// * 出库操作
// */
//@Controller
//public class getOutStorage {
//    @Resource(name = "warehouseServiceImpl")
//    WarehouseService warehouseService;
//    @Resource(name = "shelfServiceImpl")
//    ShelfService shelfService;
//    @Resource
//    Sendorder sendorder;
//    @Resource(name = "sendorderServiceImpl")
//    SendorderService sendorderService;
//
//    List<Shelf> shelfList;//保存货架信息
//
//    /**
//     * 点击调度时查询商品所在的仓库，和商品所在货架
//     */
//
//    @RequestMapping("/scheduling/{id}")
//    public String Scheduling(Model model, @PathVariable(value = "id") String id) {
//
//        System.out.println("执行调度");
//
//        String goodId = "23";
//        int goodNum = 88;
//        //查询商品所在仓库
//        List<Warehouse> warehouseList = warehouseService.selectByGoodid(goodId);
//        int sNum = 0;
//        for (int i = 0; i < warehouseList.size(); i++) {
//            int s = warehouseList.get(i).getGoodamount();
//
//            sNum = sNum + s;
//            if (goodNum <= sNum) {
//                //查询商品所在货架
//                shelfList = shelfService.selectByGoodid(goodId, id);
//                model.addAttribute(warehouseList);
//                model.addAttribute(shelfList);
//                return "Scheduling";
//            }
//        }
//        System.out.println("no");
//        return null;
//    }
//
//    /**
//     * 打单
//     * sendOrder发货单和物流单
//     */
//
//    @RequestMapping(value = "/sendOrder")
//    public String sendOrder(Model model, String sNum[]) {
//        System.out.println("执行打单");
//
//        for (int i = 0; i < sNum.length; i++) {
//            if (sNum[i] != "") {
//                int p = shelfList.get(i).getGoodamount();
//                int q = Integer.parseInt(sNum[i]);
//                int r = p - q;
//                shelfList.get(i).setGoodamount(r);
//                shelfService.updateGoods(shelfList.get(i));
//            }
//
//
//        }
//
//
//        //发货单编号
//        String uuid = UUID.randomUUID().toString().replace("-", "").substring(0, 8);
//        //whNum,shNum接收jsp页面的数据
//        sendorder.setSendorderid(uuid);//订单编号
//        // System.out.println(uuid);
//        sendorder.setUsername("225");//收件人姓名
//        sendorder.setUseraddress("334");//收件人地址
//        sendorder.setTelnum("556");//收件人电话
//        sendorder.setGoodid("36689");//商品编号
//        sendorder.setGoodnum("5555");//商品数量
//        sendorder.setSendname("335");//拣货人
//        sendorder.setSendcom("335");//发货单位
//        sendorder.setComaddress("336");//单位地址
//
//
//        try {
//            //添加一条发货订单信息
//            int rs = sendorderService.inseretSendorder(sendorder);
//            if (rs == 1) {
//                model.addAttribute(sendorder);
//                return "sendOrder";
//
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//            System.out.println("出错");
//            // return "Scheduling";
//        }
//        return "Scheduling";
//    }
//
//    /**
//     * 复核
//     */
//    @RequestMapping(value = "/checkOrder")
//    public String checkGoods(Model model) {
//        System.out.println("执行复核");
//        //仓库
//
//        return "checkGoods";
//    }
//
//
//}
