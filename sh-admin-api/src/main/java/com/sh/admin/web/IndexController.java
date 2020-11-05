package com.sh.admin.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class IndexController {
	
	@GetMapping("index")
	public String index() {
		return "success";
	}

}
