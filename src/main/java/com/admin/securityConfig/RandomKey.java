package com.admin.securityConfig;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomKey {
	
	
	//Using Secure random to generate Random Key
	private final Random RANDOM = new SecureRandom();
	private final String key = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	
	
	public String generateUserId(int length) {
		return generateRandomKey(length);
	}
	
	public String generateRandomKey(int length) {
		
		StringBuilder randomString = new StringBuilder(length);
		for(int i = 0; i<length;i++) {
			randomString.append(key.charAt(RANDOM.nextInt(key.length())));
		}
		
		return randomString.toString();
	}

}
