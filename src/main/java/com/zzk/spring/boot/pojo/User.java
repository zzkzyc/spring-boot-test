package com.zzk.spring.boot.pojo;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by zhouzongkun on 2018/1/16.
 */
public class User {

    @ApiModelProperty(value = "用户id")
    private Long id;
    @ApiModelProperty(value = "用户名称")
    private String name;
    @ApiModelProperty(value = "用户年龄")
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
