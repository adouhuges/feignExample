package com.adou.service;

import java.util.Random;

import org.apache.log4j.spi.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * feign with no implements feign
 * @author adouhu
 *
 */
@RestController
@RequestMapping("/feign-service")
public class HelloServiceContorller {
	
	
	@RequestMapping(value="/serviceGet",method=RequestMethod.GET)
	public String helloService(@RequestParam String name) {
		System.out.println("serviceGet");
		return "HelloServiceImpl name 8767:"+name;
	}
}