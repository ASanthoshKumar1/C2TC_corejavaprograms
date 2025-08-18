package Assignment01.employees;


	/**
	 * Manager is an Employee who manages a team.
	 */
	public class Manager extends Employee {
	    // Additional attribute for Manager
	    private int teamSize;

	    /**
	     * Constructor method – creates Manager object with team size.
	     */
	    public Manager(String name, int employeeId, double salary, int teamSize) {
	        super(name, employeeId, salary); // Calls parent constructor
	        this.teamSize = teamSize;
	    }

	    /** Getter method – returns team size. */
	    public int getTeamSize() { return teamSize; }

	    /** Setter method – sets team size. */
	    public void setTeamSize(int teamSize) { this.teamSize = teamSize; }
	}

