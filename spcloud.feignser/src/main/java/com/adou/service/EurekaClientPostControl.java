package com.adou.service;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adou.common.EurekaClientFeignPost;
import com.adou.pojo.User;


/**
 * Created by fangzhipeng on 2017/6/21.
 */


/**liangz fangshi
 * @author adouhu
 *
 */

@RefreshScope
@RestController
public class EurekaClientPostControl implements EurekaClientFeignPost{

	@Override
	public String sayHiFromClientEureka() {
		System.out.println("post request no params");
		return null;
	}

	@Override 
	public String sayHiFromClientEurekaUserPost(@RequestBody User user) {
		System.out.println("post request user params");
		return user.getName();
	}

	
}
