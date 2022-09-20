package org.greatlearning.service;

import java.util.Scanner;

import org.greatlearning.oopslab.Employee;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee e=new Employee("yogesh", "Tatra");
		CredentialService credentialService= new CredentialService();
		int ch;
		do
		{
			String email;
			System.out.println(" Please enter the department from the following");
			System.out.println("1. Technical ");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal"); 
			ch=sc.nextInt();
			
			switch (ch) {
			case 1:
				email = credentialService.generateEmailAddress(e.getFirstName(),e.getLastName(),"Technical");
				
				char[] password=credentialService.generatePassword();
				credentialService.showCredentials(e,email,password);
				
				break;
			
			case 2:
				email = credentialService.generateEmailAddress(e.getFirstName(),e.getLastName(),"Admin");
				
				char[] password2=credentialService.generatePassword();
				credentialService.showCredentials(e,email,password2);
				
			case 3:
				email = credentialService.generateEmailAddress(e.getFirstName(),e.getLastName(),"Human Resource");
				
				char[] password3=credentialService.generatePassword();
				credentialService.showCredentials(e,email,password3);
			case 4:
				email = credentialService.generateEmailAddress(e.getFirstName(),e.getLastName(),"Admin");
				
				char[] password4=credentialService.generatePassword();
				credentialService.showCredentials(e,email,password4);

			default:
			       System.out.println("Please enter correct department");
			       
			}
		}while(ch<=4);
	}

}
