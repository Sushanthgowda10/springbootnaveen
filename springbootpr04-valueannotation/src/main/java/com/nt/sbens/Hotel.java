package com.nt.sbens;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hotel")
public class Hotel {
	
	@Value("{1234}")
	private Integer hotelId;
	@Value("${Hotel.name}")
	private String hotelName;
	@Value("${Hotel.addrs}")
	private String hoteladdrs;
	@Value("${contact.num}")
	private String contactnum;
	
	@Value("${customer.name}")
	private String custName;
	
@Value("#{menu.getIdlyprice()+menuup.getDosaprice()}")
private float billAmount;

@Value("${os.name}")
private String osName;
@Value("${user.name}")
private String windowsUse;
@Override
public String toString() {
	return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hoteladdrs=" + hoteladdrs + ", contactnum="
			+ contactnum + ", custName=" + custName + ", billAmount=" + billAmount + ", osName=" + osName
			+ ", windowsUse=" + windowsUse + "]";
}


	
	

	

}
