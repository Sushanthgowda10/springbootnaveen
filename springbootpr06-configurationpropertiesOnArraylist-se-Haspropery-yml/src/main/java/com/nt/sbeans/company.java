package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;
import lombok.ToString;

@Data
public class company {
	
private Integer id;
private String name;
//private Long pincode;

private String addrs;
private String size;
}
