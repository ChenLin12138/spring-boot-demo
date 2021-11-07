package com.chenlin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chen Lin
 * @date 2021-10-12
 */

@RestController
public class HomeController {

	   @RequestMapping("/home")
	    public @ResponseBody String index() {
	        return "你好，这是第一个spring boot应用";
	    }
}
