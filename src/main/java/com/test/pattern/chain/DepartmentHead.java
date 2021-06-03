package com.test.pattern.chain;

/**
 * 责任链模式
 * 系主任
 */
public class DepartmentHead extends Leader {
    public String handleRequest(int LeaveDays) {
        if (LeaveDays <= 7) {
           return "系主任批准您请假" + LeaveDays + "天。";
        } else {
            if (getNext() != null) {
               return getNext().handleRequest(LeaveDays);
            } else {
                return "请假天数太多，没有人批准该假条！";
            }
        }
    }
}

