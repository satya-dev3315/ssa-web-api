package com.ait.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ait.binding.SSAWebRequest;
import com.ait.binding.SSAWebResponse;
import com.ait.service.SSAWebService;

@RestController
public class SSARestController {

	@Autowired
	private SSAWebService ssaWebService;

	@PostMapping("/ssa")
	public SSAWebResponse getCitizenInfo(@RequestBody SSAWebRequest request) {

		return ssaWebService.getCitizenInfo(request);
	}

//in aws cloud , ec3 : http://13.60.33.173:8080/ssa ,post method 

}