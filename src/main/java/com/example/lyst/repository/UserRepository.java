package com.example.lyst.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.lyst.dao.UserDetails;

public interface UserRepository extends CrudRepository<UserDetails, Long> {

	List<UserDetails> findByLastName(String lastName);

	UserDetails findById(long id);
}