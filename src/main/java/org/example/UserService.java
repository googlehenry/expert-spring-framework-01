package org.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class UserService implements BeanClassLoaderAware, BeanFactoryAware, BeanNameAware, InitializingBean {

    private UserAdmin userAdmin;

    public UserService(){
        System.out.println("UserService.constructor: 0 param");
    }

    public void businessMethod() {
        System.out.println("UserService.businessMethod, print name:"+userAdmin.getName());
    }

    public UserAdmin getUserAdmin() {
        return userAdmin;
    }

    public void setUserAdmin(UserAdmin userAdmin) {
        this.userAdmin = userAdmin;
    }

    public void postInit(){
        System.out.println("UserService.post_init invoked");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("UserService.setBeanClassLoader...");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("UserService.setBeanFactory...");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("UserService.setBeanName...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("UserService.afterPropertiesSet...");
    }
}
