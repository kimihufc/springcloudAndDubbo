package com.yzf.visualboardtask.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atc.daizhang.system.user.facade.YhFacade;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: HJL
 * @create: 2019-03-06 20:31
 */
@RestController
@RequestMapping(value = "demo")
public class DemoController {

    @Reference
    private YhFacade yhFacade;

    @RequestMapping("hello")
    public String hello(){
        List<String> strings = yhFacade.querYhidByQyid(549998874656378880L);
        return strings.toString();
    }

}
