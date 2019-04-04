package com.adou.common;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.adou.pojo.User;
/**
 * Created by fangzhipeng on 2017/6/21.
 */
@FeignClient(name = "demo-feign-freeservice")	//去注册中心找该实例，通过GET方式调用该实例的/feign-service/user接口
public interface EurekaClientFeignGet {
	
	//feign 调用 参数前必须加上@RequestParam
    @RequestMapping(value="/feign-service/dou",method=RequestMethod.GET)  
    String sayHiFromClientEureka(@RequestParam("name") String name,@RequestParam("author") String author);
//    String sayHiFromClientEureka(String name,String author);

    @RequestMapping(value="/feign-service",method=RequestMethod.GET)  
    String sayHiFromClientEureka(@RequestParam("name") String name);

    @RequestMapping(value="/feign-service/user",method=RequestMethod.GET)  
    String sayHiFromClientEurekaUser();

}

