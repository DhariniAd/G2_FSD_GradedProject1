package www.java.employee.main;

import java.util.Scanner;

import www.java.employee.model.Employee;
import www.java.employee.service.CredentialService;
import www.java.employee.service.CredentialServiceImpl;

public class EmailApp {
	public static void main(String args[]){
		CredentialService service=new CredentialServiceImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name:");
		String fn=sc.next();
		System.out.println("Enter last name:");
		String ln=sc.next();
		
		Employee emp=new Employee(fn,ln);
		
		System.out.println("Please enter the department from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		int option=sc.nextInt();
		String dept="";
		switch(option){
		case 1:
			dept="tech";
			break;
		case 2:
			dept="ad";
			break;
		case 3:
			dept="hr";
			break;
		case 4:
			dept="lg";
			break;
		default:
			 System.out.println("Please select correct choices!!");
			
		}
        emp.setDepartment(dept);
		String password=service.generatePassword();
		emp.setPassword(password);
		String email=service.generateEmailAddress(fn, ln, dept);
		emp.setEmail(email);
		
        service.showCredentials(emp);
	}

}
