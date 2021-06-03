package com.test.pattern.chain;

public class LeaveApprovalTest {
    public static void main(String[] args) {
        //组装责任链
//        Leader teacher1 = new ClassAdviser();
//        Leader teacher2 = new DepartmentHead();
//        Leader teacher3 = new Dean();
//        Leader teacher4=new DeanOfStudies();
//
//        teacher1.setNext(teacher2);
//        teacher2.setNext(teacher3);
//        teacher3.setNext(teacher4);
//        //提交请求
//        teacher1.handleRequest(8);
    }

    /**
     * 责任链模式
     * 学生请假天数不同 需要不同的人来批准。
     * @param i
     * @return
     */
    public static String getMessage(int i){
        //组装责任链
        Leader teacher1 = new ClassAdviser();//系主任 2天以内配准
        Leader teacher2 = new DepartmentHead();// 系主任 7天以内批准
        Leader teacher3 = new Dean();// 院长 10以内批准
        Leader teacher4=new DeanOfStudies();//教务处长 20以内批准
        teacher1.setNext(teacher2);
        teacher2.setNext(teacher3);
        teacher3.setNext(teacher4);
        //提交请求
        String message = teacher1.handleRequest(i);
        return message;
    }
}