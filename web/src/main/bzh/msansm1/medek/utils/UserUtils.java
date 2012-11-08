package bzh.msansm1.medek.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import org.apache.log4j.Logger;

/**
 * Class of utilities for users.
 * 
 * @author rbarbot
 *
 */
public class UserUtils {
	
	private static Logger logger = Logger.getLogger(UserUtils.class);

	/**
	 * Generates a 8 characters random password
	 * 
	 * @return
	 */
	public static String generatePassword() {
		SecureRandom random = new SecureRandom();
		String newpass = new BigInteger(130, random).toString(32);
		if (newpass.length() > 8) {
			newpass = newpass.substring(0, 8);
		}
		return newpass;
	}
	
	/**
	 * Returns a SHA-1 hash for saving the password in database.
	 * 
	 * @param password
	 * @return
	 */
	public static String codingPassword(String password) {
		String salt = "$p@ss!!";
		String hash = hashing(password + salt);
        return hash;
	}
	
	private static String hashing(String input) {
		String md5 = null;
		if(null == input) {
			return null;
		}
		try {
			//Create MessageDigest object for MD5
			MessageDigest digest = MessageDigest.getInstance("SHA-1");
			//Update input string in message digest
			digest.update(input.getBytes(), 0, input.length());
			//Converts message digest value in base 16 (hex) 
			md5 = new BigInteger(1, digest.digest()).toString(16);
		} catch (NoSuchAlgorithmException e) {
			logger.error("Error while generating password : ", e);
		}
		return md5;
	}
}
