package com.example.lyst.service;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lyst.dto.DivideRequest;
import com.example.lyst.dto.DivideResponse;
import com.example.lyst.helper.SOAPConnector;
import com.example.lyst.properties.GeneralProperties;
import com.example.lyst.tempo.AddInteger;
import com.example.lyst.tempo.AddIntegerResponse;

@Service
public class CalculatorOperationImpl implements CalculatorOperation {

	@Autowired
	GeneralProperties generalProperties;

	Logger logger = LogManager.getLogger(CalculatorOperationImpl.class);

	@Autowired
	SOAPConnector SOAPConnector;

	@Override
	public DivideResponse divide(DivideRequest divideRequest) throws MalformedURLException, RemoteException {

		AddInteger addInteger = new AddInteger();
		addInteger.setArg1(divideRequest.getA());
		addInteger.setArg2(divideRequest.getB());

		AddIntegerResponse addIntegerResponse = (AddIntegerResponse) SOAPConnector.callWebService(addInteger);

		return new DivideResponse(addIntegerResponse.getAddIntegerResult());

	}

}
