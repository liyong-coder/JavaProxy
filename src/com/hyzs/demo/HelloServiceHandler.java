package com.hyzs.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.function.Function;
import java.util.function.Supplier;

public class HelloServiceHandler implements InvocationHandler {

    /**
     * 真实被代理对象
     */
    private Object target;

    /**
     * 绑定委托对象，并返回一个代理类
     * @param target
     * @return
     */
    public Object bind(Object target){
        this.target=target;
        //获取代理对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    /**
     * Proxy 代理对象
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        //反射方法前调用
        System.out.println("我准备说hello");
        //执行方法，相当于执行HelloServiceImpl类的sayHello方法
        result = method.invoke(target,args);

        System.out.println("我说了hellO");

        return result;
    }
}
