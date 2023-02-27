package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("org.example") //放在app配置根类上
@EnableAspectJAutoProxy
public class AppConfig {
    @Bean
    public UserService userService(UserAdmin userAdmin) {
        UserService userService = new UserService();
        userService.setUserAdmin(userAdmin);
        return userService;
    }
    @Bean
    public UserAdmin userAdmin(){
        return new UserAdmin("zhangsan");
    }
}
