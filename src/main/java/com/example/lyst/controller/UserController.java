package com.example.lyst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lyst.dao.UserDetails;
import com.example.lyst.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/all")
	public ResponseEntity<List<UserDetails>> getAllUsers() {
		return ResponseEntity.ok(userService.getUserDetails());
	}

	@GetMapping("/{id}")
	public ResponseEntity<UserDetails> getUser(@PathVariable long id) {
		return ResponseEntity.ok(userService.getUserById(id));
	}

	@PostMapping
	public ResponseEntity<Boolean> addUser(@RequestBody UserDetails userDetails) {
		userService.save(userDetails);
		return ResponseEntity.ok(true);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteUser(@PathVariable long id) {
		userService.delete(id);
		return ResponseEntity.ok(true);
	}
}
