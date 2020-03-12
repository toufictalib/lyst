package com.example.lyst.helper;

import com.example.lyst.dao.UserDetails;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

	public static void main(String[] args) {
		UserDetails details = new UserDetails("toufic", "talib", "toufictalib@gmail.com", "toufictalib");
		ObjectMapper mapper = new ObjectMapper();
		String writeValueAsString;
		try {
			writeValueAsString = mapper.writeValueAsString(details);
			System.out.println(writeValueAsString);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
