package www.java.employee.service;

import www.java.employee.model.Employee;

public interface CredentialService {
	
	String generateEmailAddress(String firstName, String lastName,
			String department);

	String generatePassword();
	public void showCredentials(Employee emp);
	

}
