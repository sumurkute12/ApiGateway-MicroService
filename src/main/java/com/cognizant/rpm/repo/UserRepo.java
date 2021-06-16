package com.cognizant.rpm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.rpm.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, String> {
	User findByUsername(String username);

	@Query(value = "select userid from user where username=?1", nativeQuery = true)
	int getUserID(String username);
}
