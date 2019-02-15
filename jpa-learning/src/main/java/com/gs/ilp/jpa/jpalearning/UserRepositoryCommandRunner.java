package com.gs.ilp.jpa.jpalearning;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.gs.ilp.jpa.jpalearning.entities.User;
import com.gs.ilp.jpa.jpalearning.service.UserRepository;

@Component
public class UserRepositoryCommandRunner implements CommandLineRunner {

	Logger log  = LoggerFactory.getLogger(UserRepositoryCommandRunner.class);
	
	@Autowired
	private UserRepository  userRepository;
	@Override
	public void run(String... args) throws Exception {
		User user  = new User("Rohit", "Admin");
		userRepository.save(user);
		log.info("New user detail "+ user);
		
		Optional<User> userReturned = userRepository.findById(1L);
		log.info("User received "+userReturned);
		
		User userReturnedByName = userRepository.findByName("Rohit");
		log.info("User received "+userReturnedByName);
		
		Optional<User> userReturnedByNameAndId = 
				userRepository.findByNameAndId("Rohit",2L);
		log.info("User received "+userReturnedByNameAndId);		
	}

}
