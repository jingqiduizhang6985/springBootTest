package com.test.controller;

import com.test.pattern.Proxy.ProxyTest;
import com.test.pattern.chain.LeaveApprovalTest;
import com.test.pattern.see.RMBrateTest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("list")
    public List<String> list() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add("测试数据 " + i);
        }
        return list;
    }

    /**
     * 责任链模式
     *
     * @param day
     * @return
     */
    @RequestMapping("message/{day}")
    public String getMessage(@PathVariable Integer day) {
        return LeaveApprovalTest.getMessage(day);
    }

    /**
     * 观察者模式
     *
     * @param number
     * @return
     */
    @RequestMapping("see/{number}")
    public List<String> getSeeList(@PathVariable Integer number) {
        return RMBrateTest.getSeeList(number);
    }

    @RequestMapping("getProxy")
    public String getProxy() {
        return ProxyTest.getProxyMessage();
    }
}