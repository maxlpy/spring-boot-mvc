package com.platform.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.platform.entity.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	// Note: The function name 
	public List<User> findByFirstNameContainingIgnoreCase(String firstName);
	public List<User> findById(long id);
}
