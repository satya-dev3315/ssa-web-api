package com.ait.binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class SSAWebRequest {

    private Integer appNumber;
	
	private String fullName;
	
	private Long ssn;
	
	private LocalDate dob;
	
	private String gender;
	
	private Integer planId;    
	
	private Integer citizenId;
	
	private LocalDate createdDate;
	
	private LocalDate updatedDate;
}
