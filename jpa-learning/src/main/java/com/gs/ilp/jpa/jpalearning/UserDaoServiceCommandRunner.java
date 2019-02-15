package com.gs.ilp.jpa.jpalearning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.gs.ilp.jpa.jpalearning.entities.User;
import com.gs.ilp.jpa.jpalearning.service.UserDAOService;

@Component
public class UserDaoServiceCommandRunner implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserDAOService userDAOService ;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Mohi", "Sr. developer");
		long id = userDAOService.insert(user);
		logger.info("New created user is "+ user);
	}

}
