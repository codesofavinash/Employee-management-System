

import java.util.Scanner;
public class main {
	
	EmployeeService service=new EmployeeService();
	static boolean ordering= true;
	public static void menu() {
		System.out.println("**********Employee Management System**********"
				+ "\n1. To Add Emp"
				+ "\n2. To View Emp"
				+ "\n3. To Update Emp"
				+ "\n4. To Delete Emp"
				+ "\n5. To View All Emp"
				+ "\n6. To Exit ");
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		EmployeeService service=new EmployeeService();
		
		do {
			menu();
			System.out.println("What would you like to have");
			int choice=sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Add Employee");
				service.addEmp();
				break;
			case 2:
				System.out.println("View Employee");
				service.viewEmp();
				break;
			case 3:
				System.out.println("Update Employee");
				service.updateEmployee();
				break;
			case 4:
				System.out.println("Delete Employee");
				service.deleteEmp();
				break;
			case 5:
				System.out.println("view All Employee");
				service.viewAllEmps();
				break;
			case 6:
				System.out.println("Thank you for using application!!");
				System.exit(0);
				
			default:
				System.out.println("Add Employee");
				break;
			
			}
			
		}while(ordering);
	}

	
}
