package com.example.lyst.service;

import java.util.List;

import com.example.lyst.dao.UserDetails;

public interface UserService {

	List<UserDetails> getUserDetails();

	UserDetails save(UserDetails userDetails);

	UserDetails update(UserDetails userDetails);

	void delete(long id);

}
