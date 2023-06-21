package com.nt.sbens;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component
@Data

public class menuItemPrice {
	@Value("${menu.dosarate}")
	private Float dosarate;
	@Value("$(menu.Idlyvada)")
	private Float Idlyvada;
	@Value("$(menu.porota)")
	private Float porota;
	@Value("$(menu.vade)")
	private Float vade;
	
	
	
	

}
