package com.yzf.visualboardtask.facade;

import com.alibaba.dubbo.config.annotation.Service;
import com.yzf.visualboardfacade.Demofacade;

/**
 * @author: HJL
 * @create: 2019-03-06 20:18
 */
@Service
public class DemofacadeImpl implements Demofacade{

    @Override
    public String sayHello() {
        return "hello";
    }
}
