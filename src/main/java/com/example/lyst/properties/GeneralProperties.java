package com.example.lyst.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;

@PropertySource(value = "classpath:general.properties")
@Controller
public class GeneralProperties {
	@Value("${soap.url}")
	private String soapUrl;

	public String getSoapUrl() {
		return soapUrl;
	}
}