package top.liukeyu.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Consumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( "consumer.xml" );
        context.start();
        System.out.println("dubbo服务消费端已启动...");
        OrderService demoService = (OrderService)context.getBean( OrderService.class );// 获取远程服务代理
        UserAddress hello = demoService.createOrder(null);//执行远程方法
        System.out.println(hello);//显示调用结果
        System.in.read(); // 按任意键退出
    }
}
