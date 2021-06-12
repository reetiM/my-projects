package com.vrgroups.controller;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test1")
public class MyController {

	@RequestMapping(value = "/hi", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public int hello(@RequestParam("firstDigit") Integer firstDigit, @RequestParam("secDigit") Integer secDigit) {
		return firstDigit + secDigit;
		
	}
}
