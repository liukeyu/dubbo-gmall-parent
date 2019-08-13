package top.liukeyu.service;

import java.io.Serializable;

public class UserAddress  implements Serializable{

    private Integer userId;

    private String name;
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    private String address;
    private String phone;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "UserAddress [userId=" + userId + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
    }



}