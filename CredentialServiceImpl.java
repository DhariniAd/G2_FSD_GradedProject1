package www.java.employee.service;

import java.util.Random;

import www.java.employee.model.Employee;

public class CredentialServiceImpl implements CredentialService {
	String cap_chars= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String small_chars="abcdefghijklmnopqrstuvwxyz";
	String numbers="0123456789";
	String symbols="!@#$%^&*()_+";
	/*
	 *This method is used to generate random passwords
	 */
	
	public String generatePassword(){
		String values=cap_chars+small_chars+numbers+symbols;
		
		//Using random method
		Random rn=new Random();
		char[] password=new char[8];
		
		for(int i=0;i<password.length;i++){
			password[i]=values.charAt(rn.nextInt(values.length()));
		}
		return String.valueOf(password);
		
	}
	
	public String generateEmailAddress(String firstName,String lastName,String department){
		return firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+".gl.com";
	}
	
	public void showCredentials(Employee emp){
		System.out.println("Dear "+ emp.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email-->"+emp.getFirstName().toLowerCase()+emp.getLastName().toLowerCase()+"@"+emp.getDepartment()+".gl.com");
		System.out.println("password-->"+emp.getPassword());
	}

}
