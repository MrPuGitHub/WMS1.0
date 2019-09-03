package com.ccc.demoboot.httpClient;

import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;

public class ChuKuClient {

    private static RequestConfig requestConfig = RequestConfig.custom()
            .setSocketTimeout(15000).setConnectTimeout(15000)
            .setConnectionRequestTimeout(15000).build();

    // 发送get请求
    @Test
    public void get( ) throws Exception, IOException {
         String url = "http://192.168.1.22:8080/getallorderanddetail";//没有参数
//        String url = "http://localhost:8080/mavprj/y/selalluser?page=2";//可以传参数
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);

        httpGet.setConfig(requestConfig);
        // 执行请求
        CloseableHttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        String responseContent = EntityUtils.toString(entity, "UTF-8");

//        System.out.println(responseContent);

        String[] s1 = responseContent.split(",");
        System.out.println(s1[2]);
        //ObjectMapper om = new ObjectMapper();
        //JavaType javaType1 = om.getTypeFactory().constructParametricType(ArrayList.class, 	//User2.class);//json转list
        //List<User2> list = om.readValue(listJson,javaType1);
        // 关闭连接
        response.close();
        httpClient.close();
    }

}
