package com.gs.ilp.jpa.jpalearning.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gs.ilp.jpa.jpalearning.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	@Query("select u from User u where u.name= ?1")
	public User findByName(String name);

	public Optional<User> findByNameAndId(String string, long l);
}
