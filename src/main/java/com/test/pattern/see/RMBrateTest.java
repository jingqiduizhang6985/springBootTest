package com.test.pattern.see;

import java.util.List;

/**
 * 观察者模式
 * 测试类
 */
public class RMBrateTest {
    public static void main(String[] args) {
        Rate rate = new RMBrate();//被观察者
        Company watcher1 = new ImportCompany();//观察者1
        Company watcher2 = new ExportCompany();//观察者2
        rate.add(watcher1);
        rate.add(watcher2);
       List<String> list1 =  rate.change(10);//被观察值发生变化  观察者们发出了呐喊声
       for(String message:list1){
           System.out.println(message);
       }
       List<String> list2 =   rate.change(-9);//被观察值发生变化  观察者们发出了呐喊声
        for(String message:list2){
            System.out.println(message);
        }
    }

    /**
     * 观察者模式测试
     * @param number 汇率浮动
     * @return
     */
    public static List<String> getSeeList(Integer number){
        Rate rate = new RMBrate();//被观察者
        Company watcher1 = new ImportCompany();//观察者1
        Company watcher2 = new ExportCompany();//观察者2
        rate.add(watcher1);
        rate.add(watcher2);
        List<String> list =  rate.change(number);//被观察值发生变化  观察者们发出了呐喊声
        return list;
    }
}
