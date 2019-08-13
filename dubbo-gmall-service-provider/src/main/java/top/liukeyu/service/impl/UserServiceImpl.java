package top.liukeyu.service.impl;

import top.liukeyu.service.UserAddress;
import top.liukeyu.service.UserService;

public class UserServiceImpl  implements UserService {
    public UserAddress getUserAddressByUseID(Integer userId) {
        // TODO Auto-generated method stub
        System.out.println("服务端被调用");
        UserAddress userAddress = new UserAddress();
        userAddress.setAddress("上海市徐汇区龙田路190号");
        userAddress.setName("Mike");
        userAddress.setPhone("19901897543");
        return userAddress;
    }

}
