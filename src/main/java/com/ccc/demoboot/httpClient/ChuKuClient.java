package com.ccc.demoboot.httpClient;

import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ChuKuClient {

    public static RequestConfig requestConfig = RequestConfig.custom()
            .setSocketTimeout(15000).setConnectTimeout(15000)
            .setConnectionRequestTimeout(15000).build();


    // 发送get请求
    @Test
    public List<HashMap<String,String>> get(){

        //将字符串转为List<Map<String,String>>集合
        List<HashMap<String,String>> list= new ArrayList<>();

        try{
            String url = "http://192.168.1.22:8080/getallorderanddetail";//没有参数
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet(url);

            httpGet.setConfig(requestConfig);
            // 执行请求
            CloseableHttpResponse response = httpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();
            String responseContent = EntityUtils.toString(entity, "UTF-8");



            String s1 = responseContent.substring(1,responseContent.length()-2);
            String[] s2 = s1.split("}");

            //去除无用符号
            for(int i = 0;i < s2.length;i++){
                if(s2[i].startsWith(",")){
                    s2[i]=s2[i].substring(1);
                }
            }
            for(int i = 0;i < s2.length;i++){
                s2[i]=s2[i].substring(1);
            }
            //拆分
            for(int i = 0;i < s2.length;i++){
                String[] cs1 = s2[i].split(",");
                System.out.println(cs1);
                HashMap<String,String> sm = new HashMap<>();
                for(int j = 0;j < cs1.length;j++){
                    String cs2[] = cs1[j].split(":");
                    cs2[0] = cs2[0].substring(1,cs2[0].length()-1);
                    if(cs2[1].startsWith("\"")){
                        cs2[1] = cs2[1].substring(1,cs2[1].length()-1);
                    }

                    cs2[1].replaceAll("\""," ");
                    sm.put(cs2[0],cs2[1]);
                }
                list.add(sm);
            }




//        关闭连接
            response.close();
            httpClient.close();

        }catch (Exception e){
            System.out.println(e);
        }

        return list;
    }

}
