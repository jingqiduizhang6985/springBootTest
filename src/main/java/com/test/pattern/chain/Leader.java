package com.test.pattern.chain;

/**
 * 责任链模式
 * 抽象处理者：领导类
 */
public abstract class Leader {
    private Leader next;
    public void setNext(Leader next) {
        this.next = next;
    }
    public Leader getNext() {
        return next;
    }
    //处理请求的方法
    public abstract String handleRequest(int LeaveDays);
}