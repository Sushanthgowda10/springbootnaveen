package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component("comp")
@Setter
@ToString
@ConfigurationProperties(prefix="org.softek")
@PropertySource("App.properties")
public class company {
	
private String name;
private String addrs;
private Long pincode;
@Value("${softek.size}")
private Integer size;
private Long contact;
}
