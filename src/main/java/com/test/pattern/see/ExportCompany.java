package com.test.pattern.see;

/**
 * 观察值模式
 * 具体观察者2
 */
public class ExportCompany implements Company {
    public String response(int number) {
        if (number > 0) {
            return "人民币汇率升值" + number + "个基点，降低了出口产品收入，降低了出口公司的销售利润率。";
        } else if (number < 0) {
            return "人民币汇率贬值" + (-number) + "个基点，提升了出口产品收入，提升了出口公司的销售利润率。";
        }

        return "人民币汇率浮动为0 出口产品一切照旧";
    }
}