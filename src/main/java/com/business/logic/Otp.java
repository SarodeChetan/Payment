package com.business.logic;

import java.util.SplittableRandom;

public class Otp {
	  private static final int OTP_LENGTH = 6; 

	    
	    public static String generateOTP() {
	        SplittableRandom splittableRandom = new SplittableRandom();
	        StringBuilder otp = new StringBuilder();

	        for (int i = 0; i < OTP_LENGTH; i++) {
	            int digit = splittableRandom.nextInt(1, 10); // Generates a random digit between 0 and 9
	            otp.append(digit);
	        }

	        return otp.toString();
	    }
}
