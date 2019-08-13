package top.liukeyu.service.impl;

import top.liukeyu.service.UserAddress;
import top.liukeyu.service.UserService;

public class UserServiceImpl  implements UserService {
    public UserAddress getUserAddressByUseID(Integer userId) {
        // TODO Auto-generated method stub
        System.out.println("服务端被调用");
        UserAddress userAddress = new UserAddress();
        userAddress.setAddress("北京市东城区89号");
        userAddress.setName("科比");
        userAddress.setPhone("187777737737");
        return userAddress;
    }

}
