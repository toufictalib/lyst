package com.example.lyst.controller;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.lyst.dto.DivideRequest;
import com.example.lyst.dto.DivideResponse;
import com.example.lyst.service.CalculatorOperation;

@RestController
public class HomeController {

	@Autowired
	CalculatorOperation calculatorOperat0ion;

	@PostMapping("/divide")
	public ResponseEntity<DivideResponse> divide(@RequestBody DivideRequest divideRequest) {
		try {
			return ResponseEntity.ok(calculatorOperat0ion.divide(divideRequest));
		} catch (MalformedURLException | RemoteException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

}
