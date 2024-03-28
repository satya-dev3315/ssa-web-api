package com.ait.service;

import com.ait.binding.SSAWebRequest;
import com.ait.binding.SSAWebResponse;

public interface SSAWebService {

	public SSAWebResponse getCitizenInfo(SSAWebRequest request);
}
