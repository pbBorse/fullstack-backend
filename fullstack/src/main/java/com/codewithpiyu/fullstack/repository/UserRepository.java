package com.codewithpiyu.fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithpiyu.fullstack.model.User;


public interface UserRepository extends JpaRepository<User, Long> {

	
	
}

