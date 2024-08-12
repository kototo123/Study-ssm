package com.kototo.spring.allAnno.pojo;

public class NewsUser {
    private String username;
    private String password;

    @Override
    public String toString() {
        return "NewsUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void init() {
        System.out.println("初始化");
    }

    public void destory() {
        System.out.println("销毁");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public NewsUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public NewsUser() {
    }
}
