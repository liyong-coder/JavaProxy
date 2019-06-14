package com.hyzs.demo;

public class HelloServiceMain {


    public static void main(String[] args){
            HelloServiceHandler helloHandle = new HelloServiceHandler();
            HelloService helloProxy =(HelloService)helloHandle.bind(new HelloServiceImpl());
            helloProxy.sayHello("张三");


    }
}
