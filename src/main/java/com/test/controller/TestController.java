package com.test.controller;

import com.test.pattern.chain.LeaveApprovalTest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("list")
    public List<String> list(){
        List<String> list = new ArrayList<>();
        for(int i=0; i<=10;i++){
            list.add("测试数据 "+i);
        }
         return list;
    }
    @RequestMapping("message/{day}")
    public String getMessage(@PathVariable Integer day){
        return LeaveApprovalTest.getMessage(day);
    }
}
