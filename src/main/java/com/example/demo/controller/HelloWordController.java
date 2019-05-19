package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;




/**
 * @ClassName: HelloWordController
 * @Description: TODO
 * @author yejunjian
 * @date: 2019年1月21日 下午7:59:38
 * @version V1.0
 */
@RestController
public class HelloWordController {
	private static final Logger logger = LoggerFactory.getLogger(HelloWordController.class);

	@RequestMapping(value = "/getUrl", method = RequestMethod.GET)
	public String getBase64Url() {
				
		System.out.println("=====进来了===========");
		logger.debug("记录debug日志");
		logger.info("记录info日志");
		logger.error("记录error日志");
		System.out.println("=====返回了o===========");
		return "ddd";
		
	}
	/*
	 * URL格式：localhost:8080/hello/1000/ssh
	 */
	@RequestMapping(value = "/hello/{id}/{name}", method = RequestMethod.GET)
	public @ResponseBody String sayHello(@PathVariable("id") Integer id, @PathVariable("name") String name) {
		return "id:" + id + " name:" + name;
	}
	
	@RequestMapping(value="/hello2",method={RequestMethod.POST, RequestMethod.GET})
    public @ResponseBody String sayHello2(@RequestParam("id") Integer id){
		return "sss";
		
	}
}
