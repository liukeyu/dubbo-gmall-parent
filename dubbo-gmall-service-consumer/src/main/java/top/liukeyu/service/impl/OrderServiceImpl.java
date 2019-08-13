package top.liukeyu.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.liukeyu.service.OrderService;
import top.liukeyu.service.UserAddress;
import top.liukeyu.service.UserService;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;
    public UserAddress createOrder(Integer userId) {
        // TODO Auto-generated method stub
        UserAddress userAddressByUseID = userService.getUserAddressByUseID(userId);
        return userAddressByUseID;
    }

}