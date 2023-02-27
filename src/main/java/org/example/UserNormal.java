package org.example;

public class UserNormal implements UserInterface{
    @Override
    public String doSth() {
        System.out.println("do sth in user normal!!");
        return null;
    }
}
