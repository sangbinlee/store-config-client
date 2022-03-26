package com.sodi.store.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientRestController {

//	@Value("${test.str}")//  local yml key
	@Value("${sodi.store.info}")//  git yml key
	private String configStr;

	@GetMapping("test")
	public String test() {
		System.out.println("configStr="+ configStr);
		System.out.println("configStr="+ configStr);
		System.out.println("configStr="+ configStr);
		System.out.println("configStr="+ configStr);
		System.out.println("configStr="+ configStr);
		return configStr;
	}
}
