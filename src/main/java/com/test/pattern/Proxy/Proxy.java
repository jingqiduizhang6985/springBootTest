package com.test.pattern.Proxy;

/**
 * 代理模式
 * 代理类
 */
public class Proxy implements Subject {
    private RealSubject realSubject;
    public String Request() {
        StringBuffer sb = new StringBuffer();
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        String message1 = preRequest();
        String message2 = realSubject.Request();
        String message3 = postRequest();
        sb.append(message1+" ");
        sb.append(message2+" ");
        sb.append(message3);
        return sb.toString();
    }
    public String preRequest() {
        System.out.println("访问真实主题之前的预处理。");
        return "访问真实主题之前的预处理。";
    }
    public String postRequest() {
        System.out.println("访问真实主题之后的后续处理。");
        return "访问真实主题之后的后续处理。";
    }
}