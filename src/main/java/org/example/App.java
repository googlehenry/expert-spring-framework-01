package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 简单验证调用顺序.
 */

public class App {
    public static void main(String[] args) {
        System.out.println("main: context initalizing...");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("main: context initialized ------------------");
        System.out.println("main: get bean start...");
        UserService userService = (UserService) context.getBean("userService");
        OrderService orderService = context.getBean(OrderService.class);
        DBService dbService = context.getBean(DBService.class);
        System.out.println("main: get bean done ------------------");
        userService.businessMethod();
        orderService.businessMethod();
        dbService.businessMethod();
    }
}
