package com.example.lyst.dto;

import javax.xml.bind.annotation.XmlElement;

public class DivideRequest {

	@XmlElement(required = true)
	private long a;

	@XmlElement(required = true)
	private long b;

	public DivideRequest() {
		super();
	}

	public DivideRequest(long a, long b) {
		super();
		this.a = a;
		this.b = b;
	}

	public long getA() {
		return a;
	}

	public void setA(long a) {
		this.a = a;
	}

	public long getB() {
		return b;
	}

	public void setB(long b) {
		this.b = b;
	}

}
