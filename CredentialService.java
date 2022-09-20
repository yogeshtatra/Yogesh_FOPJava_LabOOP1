package org.greatlearning.service;

import java.util.Random;

import org.greatlearning.oopslab.Employee;

public class CredentialService {
	public String generateEmailAddress(String firstName,String lastName,String department)
	{
		return firstName+lastName+"@"+department+".greatlearning.com";
	}
	public char[] generatePassword()
	{
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="012345678910";
		String specialCharacters="!@#$%^&*<>";
		String value=capitalLetters+smallLetters+specialCharacters+numbers;
		Random random = new Random();
		char[] password = new char[8];
		for (int i = 0; i<8; i++) 
		{
			password[i]=value.charAt(random.nextInt(value.length()));
		}
			return password;	
	}
	public void showCredentials(Employee e, String email, char[]generatedPassword )
	
	
	{
		String testPassword = new String(generatedPassword);
	System.out.println("Dear "+e.getFirstName()+" your generated credential is as follows");
	System.out.println("Email ------>"+ email);
	System.out.println("Password ------>"+testPassword);
	}
}
	