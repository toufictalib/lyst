package com.example.lyst.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lyst.dao.UserDetails;
import com.example.lyst.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<UserDetails> getUserDetails() {
		List<UserDetails> rows = new ArrayList<>();
		userRepository.findAll().forEach(rows::add);
		return rows;
	}

	@Override
	public UserDetails save(UserDetails userDetails) {
		return userRepository.save(userDetails);
	}

	@Override
	public UserDetails update(UserDetails userDetails) {
		return userRepository.save(userDetails);
	}

	@Override
	public void delete(long id) {
		userRepository.deleteById(id);

	}

	@Override
	public UserDetails getUserById(long id) {
		return userRepository.findById(id);
	}

}