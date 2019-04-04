package com.adou.web;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.adou.common.config.FeignConfig;
import com.adou.hystrix.HiHystrix;

@FeignClient(name="demo-feign-freeservice",configuration=FeignConfig.class,fallback=HiHystrix.class)
public interface DemoFeignService{
	@RequestMapping(value="/feign-service/serviceGet",method=RequestMethod.GET)
	String helloService(@RequestParam("name") String name);
}
