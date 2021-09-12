package com.dime_io.in;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class Plan_to_hash {
	



	protected String hashs(String data2) {
		return (BCrypt.hashpw(data2, BCrypt.gensalt()));
	}


	
	protected boolean checker(String orignal, String hash) {
		return (BCrypt.checkpw(orignal, hash));
	}
	
	
	
	
	
	

}
