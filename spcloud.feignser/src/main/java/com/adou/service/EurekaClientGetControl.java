package com.adou.service;

import java.util.Date;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adou.common.EurekaClientFeignGet;
import com.adou.pojo.User;



/**
 * feign with Get Method implements feign
 * @author adouhu
 *
 */
@RefreshScope
@RestController
public class EurekaClientGetControl implements EurekaClientFeignGet{

	@Override
//	public String sayHiFromClientEureka(@PathVariable("name") String name) {
	public String sayHiFromClientEureka(@RequestParam String name,@RequestParam String author) {
		System.out.println("继承 /feign-service/dou");
		System.out.println(name+" "+author);
		
		return "/feign-service/dou";
	}

	@Override
	public String sayHiFromClientEureka(@RequestParam String name) {
		System.out.println("继承 /feign-service");
		return "/feign-service";
	}
	
	
	
	@Override
	public String sayHiFromClientEurekaUser() {
		System.out.println("继承 /feign-service/user");
		return "/feign-service/user";
	}

}
//@RestController
//@RequestMapping("/feign-service")
//public class EurekaClientContro {
//	
//	@RequestMapping(value="/user",method=RequestMethod.GET)  
//	public String sayHiFromClientEureka(@RequestParam String name) {
//		System.out.println("access");
//		return "access";
//	}
//	
//	
//}
