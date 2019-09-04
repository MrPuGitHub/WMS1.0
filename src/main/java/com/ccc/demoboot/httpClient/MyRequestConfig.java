package com.ccc.demoboot.httpClient;

import org.apache.http.client.config.RequestConfig;

public class MyRequestConfig {
    private static RequestConfig requestConfig = RequestConfig.custom()
            .setSocketTimeout(45000).setConnectTimeout(45000)
            .setConnectionRequestTimeout(45000).build();

    public static RequestConfig getRequestConfig() {
        return requestConfig;

    }

}
