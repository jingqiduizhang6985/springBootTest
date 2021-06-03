package com.test.pattern.Proxy;

/**
 * 代理模式
 * 真实主题
 */
public class RealSubject implements Subject {
    public String Request() {
        System.out.println("访问真实主题方法...");
        return "访问真实主题方法...";
    }
}
