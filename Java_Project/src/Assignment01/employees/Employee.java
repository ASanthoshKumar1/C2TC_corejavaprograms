package Assignment01.employees;

public class Employee {
	/**
	 * Represents a generic employee.
	 * Demonstrates encapsulation with private fields and public/protected members.
	 */
	    // Attributes (private for encapsulation)
	    private String name;
	    private int employeeId;
	    private double salary;

	    /**
	     * Constructor method – used to create an Employee object.
	     */
	    public Employee(String name, int employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    /** Getter method – returns employee name. */
	    public String getName() { return name; }

	    /** Setter method – sets employee name. */
	    public void setName(String name) { this.name = name; }

	    /** Getter method – returns employeeId. */
	    public int getEmployeeId() { return employeeId; }

	    /** Protected Setter method – sets employeeId (only subclasses can access). */
	    protected void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

	    /** Getter method – returns salary. */
	    public double getSalary() { return salary; }

	    /** Setter method – sets salary. */
	    public void setSalary(double salary) { this.salary = salary; }

	    /** Method to return object details as String. */
	    @Override
	    public String toString() {
	        return "Employee{name='" + name + "', id=" + employeeId + ", salary=" + salary + "}";
	    }
	}


}
