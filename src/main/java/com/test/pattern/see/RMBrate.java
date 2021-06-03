package com.test.pattern.see;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式
 * 具体目标：人民币汇率
 */
public class RMBrate extends Rate {
    public List<String> change(int number) {
        List<String> list = new ArrayList<>();
        for (Company obs : companys) {
            String message =  ((Company) obs).response(number);
            list.add(message);
        }
     return list;
    }
}