package com.adou.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adou.common.EurekaClientFeignGet;
import com.adou.common.EurekaClientFeignPost;
import com.adou.hystrix.HiHystrix;
import com.adou.pojo.User;

/**
 * Created by fangzhipeng on 2017/6/21.
 */
@RestController
public class HiController {
    @Autowired
    DemoFeignService feign;
    @Autowired
    EurekaClientFeignGet eurekaClientFeignGet;
    
    @Autowired
    EurekaClientFeignPost eurekaClientFeignPost;
    @Autowired
    HiHystrix hystrix;
    
    //Get
    @GetMapping("/hi/dou")
    public String sayHi(@RequestParam("name") String name,@RequestParam("author") String author){
    	System.out.println(name+":"+author);
        return eurekaClientFeignGet.sayHiFromClientEureka(name,author);
    }

    @GetMapping("/hi")
    public String sayHi(@RequestParam( defaultValue = "forezp",required = false)String name){
    	return eurekaClientFeignGet.sayHiFromClientEureka(name);
    }

    @GetMapping("/hi/user")
    public String sayHiUser(){
    	return eurekaClientFeignGet.sayHiFromClientEurekaUser();
    }

    
    //Post
    @PostMapping("/hi/post")
    public String sayHiPost(){
    	return eurekaClientFeignPost.sayHiFromClientEureka();
    }
    @PostMapping("/hi/post/user")
    public String sayHiPostUser(@RequestBody User user){
    	return eurekaClientFeignPost.sayHiFromClientEurekaUserPost(user);
    }

    
    
    @GetMapping("/hi2")
    public String sayHi2(@RequestParam( defaultValue = "name",required = false)String name){
    	return feign.helloService(name);
    }
    
   
}
