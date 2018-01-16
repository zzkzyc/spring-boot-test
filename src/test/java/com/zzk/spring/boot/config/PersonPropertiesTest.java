package com.zzk.spring.boot.config;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhouzongkun on 2018/1/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PersonPropertiesTest {

    @Autowired
    private PersonProperties personProperties;

    @Test
    public void readPersonProperties() {
        Assert.assertEquals(personProperties.getName(), "周宗坤");
        Assert.assertEquals(personProperties.getEmail(), "861728602@qq.com");
    }

}