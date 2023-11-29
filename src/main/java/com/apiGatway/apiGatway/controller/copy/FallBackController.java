package com.apiGatway.apiGatway.controller.copy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	
	@GetMapping(value="/fallbackOrderService")
	public String fallbackMethod() {
		return "order service taking too much time for returing response";
		
	}
	
	@GetMapping(value="/fallbackProductService")
	public String fallbackProductMethod() {
		return "product service taking too much time for returing response";
		
	}

}
