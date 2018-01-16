package com.zzk.spring.boot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by zhouzongkun on 2018/1/16.
 */
@Component
public class PersonProperties {

    @Value(value = "${zzk.name}")
    private String name;

    @Value(value = "${zzk.email}")
    private String email;

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
