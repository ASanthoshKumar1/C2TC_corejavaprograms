package Assignment01.employees;


	/**
	 * Developer is an Employee who writes code in a primary language.
	 */
	public class Developer extends Employee {
	    // Additional attribute for Developer
	    private String programmingLanguage;

	    /**
	     * Constructor method – creates Developer object with programming language.
	     */
	    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
	        super(name, employeeId, salary); // Calls parent constructor
	        this.programmingLanguage = programmingLanguage;
	    }

	    /** Getter method – returns programming language. */
	    public String getProgrammingLanguage() { return programmingLanguage; }

	    /** Setter method – sets programming language. */
	    public void setProgrammingLanguage(String programmingLanguage) {
	        this.programmingLanguage = programmingLanguage;
	    }
	}


	

}
