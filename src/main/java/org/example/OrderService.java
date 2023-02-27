package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private UserAdmin userAdmin;

    public OrderService(){
        System.out.println("OrderService.constructor: 0 param");
    }

    /*
    标记了Autowired那就优先用他来构造,否则用默认()构造方法.
     */
    @Autowired
    public OrderService(UserAdmin userAdmin){
        this.userAdmin = userAdmin;
        System.out.println(this.getClass()+"OrderService.constructor: 1 param");
    }
    /*
    有两个就报错了
     */
//    @Autowired
//    public OrderService(UserAdmin userAdmin,String abc){
//        this.userAdmin = userAdmin;
//        System.out.println("OrderService.constructor: 2 param");
//    }

    public void businessMethod() {
        System.out.println("OrderService.bizMethod."+userAdmin.getName());
    }

}
