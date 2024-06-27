package com.jenkins.demo.MySprintBootApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/myapp")
public class MyAppController {

	@GetMapping("/headline")
	@ResponseBody
	public String getLatestNewsHeadline() {
		return "OC Supervisors Consider Gun Storage Law, Spark Constitutional Questions";
	} 
}
