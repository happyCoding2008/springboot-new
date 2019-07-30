package com.hgz.springboothello.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author huangguizhao
 */
@Component
@ConfigurationProperties(prefix = "resource")
public class Resource {

    //@Value("${resource.imageServer}")
    private String imageServer;

    //@Value("${resource.emailServer}")
    private String emailServer;

    public String getImageServer() {
        return imageServer;
    }

    public void setImageServer(String imageServer) {
        this.imageServer = imageServer;
    }

    public String getEmailServer() {
        return emailServer;
    }

    public void setEmailServer(String emailServer) {
        this.emailServer = emailServer;
    }
}
