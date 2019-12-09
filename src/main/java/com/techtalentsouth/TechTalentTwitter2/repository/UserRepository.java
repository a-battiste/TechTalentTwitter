package com.techtalentsouth.TechTalentTwitter2.repository;

import org.springframework.data.repository.CrudRepository;

import com.techtalentsouth.TechTalentTwitter2.model.User;

public interface UserRepository extends CrudRepository <User, Long> {
	
	User findByUsername(String Username);
}
