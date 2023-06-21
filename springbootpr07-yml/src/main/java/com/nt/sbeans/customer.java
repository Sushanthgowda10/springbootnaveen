package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;



@Component("cust")
@Data
@ConfigurationProperties(prefix="cust.info")
public class customer {
	private Integer  custNo;
	private String custName;
	private String custAddrs; 
     private Double billAmt;
 
	}


