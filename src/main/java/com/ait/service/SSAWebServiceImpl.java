package com.ait.service;

import org.springframework.stereotype.Service;

import com.ait.binding.SSAWebRequest;
import com.ait.binding.SSAWebResponse;

@Service
public class SSAWebServiceImpl implements SSAWebService {

	@Override
	public SSAWebResponse getCitizenInfo(SSAWebRequest request) {
		
		SSAWebResponse response = new SSAWebResponse();
		
		
		//get ssn frm request because we need to send it back via res
		Long ssn = request.getSsn();
		
		//send the ssn back what we r getting in request, so set it
				response.setSsn(ssn);
		
		//convert ssn to string frm long
		String ssnStr = String.valueOf(ssn);
		
		if(ssnStr.startsWith("1")) {
			response.setStateName("New Jersey");
			
		}else if(ssnStr.startsWith("2")) {
			response.setStateName("Texas");

		}else if(ssnStr.startsWith("3")) {
			response.setStateName("Ohio");

		}else if(ssnStr.startsWith("4")) {
			response.setStateName("Rhode Island");

		}else if(ssnStr.startsWith("5")) {
			response.setStateName("Kentucky");
			
		}else if(ssnStr.startsWith("6")) {
			response.setStateName("Minnesota");

		}else if(ssnStr.startsWith("7")) {
			response.setStateName("Miami");

		}else if(ssnStr.startsWith("8")) {
			response.setStateName("Alamaba");

		}else if(ssnStr.startsWith("9")) {
			response.setStateName("Washington DC");

		}
		
		return response;
	}

}
