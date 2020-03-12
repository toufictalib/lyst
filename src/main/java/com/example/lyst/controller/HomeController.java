package com.example.lyst.controller;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.lyst.dao.UserDetails;
import com.example.lyst.dto.DivideRequest;
import com.example.lyst.dto.DivideResponse;
import com.example.lyst.service.CalculatorOperation;
import com.example.lyst.service.UserService;

@RestController
public class HomeController {

	@Autowired
	CalculatorOperation calculatorOperat0ion;

	@Autowired
	UserService userService;

	@PostMapping("/divide")
	public ResponseEntity<DivideResponse> divide(@RequestBody DivideRequest divideRequest) {
		try {
			return ResponseEntity.ok(calculatorOperat0ion.divide(divideRequest));
		} catch (MalformedURLException | RemoteException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	@GetMapping("/list")
	public ResponseEntity<List<UserDetails>> getAllUsers() {
		return ResponseEntity.ok(userService.getUserDetails());
	}

	@PostMapping("/add")
	public ResponseEntity<Boolean> addUser(@RequestBody UserDetails userDetails) {
		userService.save(userDetails);
		return ResponseEntity.ok(true);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> deleteUser(@PathVariable long id) {
		userService.delete(id);
		return ResponseEntity.ok(true);
	}
	

}
