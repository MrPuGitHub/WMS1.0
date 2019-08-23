package com.ccc.demoboot.myproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my2")
@PropertySource("classpath:my2.properties")
public class My2 {
    private int age;
    private String name;
    private String email;
    private int sendteltime;

    public int getSendteltime() {
        return sendteltime;
    }

    public void setSendteltime(int sendteltime) {
        this.sendteltime = sendteltime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
