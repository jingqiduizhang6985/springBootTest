package com.test.pattern.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        String message = proxy.Request();
        System.out.println(message);
    }

    public static String getProxyMessage(){
        Proxy proxy = new Proxy();
       return proxy.Request();
    }
}
