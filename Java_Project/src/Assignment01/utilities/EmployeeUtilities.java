package Assignment01.utilities;


	import Assignment01.employees.Employee;

	/**
	 * Utility methods that operate on Employee objects.
	 */
	public class EmployeeUtilities {

	    /**
	     * Method to display details of an Employee object.
	     */
	    public static void displayEmployeeDetails(Employee emp) {
	        System.out.println("Employee Details:");
	        System.out.println("Name: " + emp.getName());
	        System.out.println("ID: " + emp.getEmployeeId());
	        System.out.println("Salary: " + emp.getSalary());
	        System.out.println("--------------------------------");
	    }

	    /**
	     * Method to increase salary of an Employee object by percentage.
	     */
	    public static void giveRaise(Employee emp, double percentage) {
	        double newSalary = emp.getSalary() * (1 + percentage / 100.0);
	        emp.setSalary(newSalary);
	        System.out.println(emp.getName() + " got a raise! New Salary: " + newSalary);
	    }
	}




