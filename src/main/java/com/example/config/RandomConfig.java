package com.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author liuqi
 * @Title: RandomConfig
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/5/3018:12
 */
@Component
//@ConfigurationProperties(prefix = "user.random")
//@PropertySource(value="config/random.properties")
public class RandomConfig {

    private String secret;

    private int intNumber;

    private int lessTen;

    private int range;

    private long longNumber;

    private String uuid;

    public String getSecret() {
        return this.secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public int getIntNumber() {
        return this.intNumber;
    }

    public void setIntNumber(int intNumber) {
        this.intNumber = intNumber;
    }

    public int getLessTen() {
        return this.lessTen;
    }

    public void setLessTen(int lessTen) {
        this.lessTen = lessTen;
    }

    public int getRange() {
        return this.range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public long getLongNumber() {
        return this.longNumber;
    }

    public void setLongNumber(long longNumber) {
        this.longNumber = longNumber;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
