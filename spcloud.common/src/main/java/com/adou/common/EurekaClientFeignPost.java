package com.adou.common;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.adou.pojo.User;
/**
 * feign Post request implements feign
 */
@FeignClient(name = "demo-feign-freeservice")	//去注册中心找该实例，通过GET方式调用该实例的/feign-service/user接口
public interface EurekaClientFeignPost {
	
    @RequestMapping(value="/feign-service/post",method=RequestMethod.POST)  
    String sayHiFromClientEureka();

    @RequestMapping(value="/feign-service/post/user",method=RequestMethod.POST, consumes = "application/json")  
    String sayHiFromClientEurekaUserPost(@RequestBody User user);
    

    
}

