package io.nms;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainDriver {
	
	private static final Logger LOGGER = Logger.getLogger(MainDriver.class.getClass().getName());

	public static void main(String[] args) throws Exception {
		
		UserRepo userRepo = new UserRepo();
		User myUser = new User();
		myUser.setAge(42);
		myUser.setFirstName("Nils");
		myUser.setName("Müller-Sheffer");
		LOGGER.log(Level.INFO, "Creating user " + myUser);
		
		
		userRepo.createUser(myUser);	
		
		User newUser = userRepo.getUserById(1);


	}

}
