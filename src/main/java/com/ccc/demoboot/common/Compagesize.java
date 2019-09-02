package com.ccc.demoboot.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Compagesize {

    private static int pagesize;

    public static int getPagesize() {
        return pagesize;
    }

    @Value("${pagesize}")
    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }
}
