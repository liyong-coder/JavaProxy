package com.hyzs.demo;

/**
 * 定义委托类
 */
public class HelloServiceImpl implements HelloService{
    @Override
    public void sayHello(String name){

        System.out.println("hello"+name);
        System.out.println("11111");
    }
}
