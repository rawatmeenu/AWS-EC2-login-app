package com.awsproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.awsproject.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	//User getUserbyUsername(String username);
//	
//	@Query("Select u from User u where u.email =: email")
//	public User getUserbyUsername(@Param("email")String email);
//	

}
