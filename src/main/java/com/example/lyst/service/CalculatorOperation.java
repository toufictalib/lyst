package com.example.lyst.service;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;

import com.example.lyst.dto.DivideRequest;
import com.example.lyst.dto.DivideResponse;

public interface CalculatorOperation {

	public abstract DivideResponse divide(DivideRequest divideRequest)
			throws MalformedURLException, AxisFault, RemoteException;
}
