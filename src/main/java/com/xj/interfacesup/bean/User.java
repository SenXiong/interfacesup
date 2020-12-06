package com.xj.interfacesup.bean;

import javax.persistence.*;

/**
 * @Author 80275425熊俊
 * @Date Create in 2020/12/3 16:45
 * @Description person实体类
 * @Version 1.0.0
 **/
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long user_id;

    @Column(name = "user_name", nullable = true, length = 20)
    private int user_name;

    @Column(name = "password", nullable = true, length = 20)
    private String password;

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public int getUser_name() {
        return user_name;
    }

    public void setUser_name(int user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
