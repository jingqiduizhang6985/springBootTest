package com.test.pattern.see;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式
 * 抽象目标汇率
 */
public abstract class Rate {
    protected List<Company> companys = new ArrayList<Company>();
    //增加观察者方法
    public void add(Company company) {
        companys.add(company);
    }
    //删除观察者方法
    public void remove(Company company) {
        companys.remove(company);
    }
    public abstract List<String> change(int number);
}