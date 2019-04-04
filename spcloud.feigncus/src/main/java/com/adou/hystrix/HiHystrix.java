package com.adou.hystrix;

import org.springframework.stereotype.Component;

import com.adou.web.DemoFeignService;

@Component
public class HiHystrix implements DemoFeignService{

	@Override
	public String helloService(String name) {
	
		return "System error";
	}

}
