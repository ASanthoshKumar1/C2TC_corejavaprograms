package Singleinheritance;

public class Trainer extends Person {
	private int eid;
	private String designation;
	private String location;
	//parameterized constructor 
	public Trainer(int pid, String name, String city, int eid, String designation, String location) {
		super(pid,name,city);//calling person class constructor 
		this.eid = eid;
		this.designation = designation;
		this.location = location;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Trainer [personid:" + super.getPid() + " Person name:" + super.getName() + " City:" + super.getCity() + " eid=" + eid + ", designation=" + designation + ", location=" + location + "]"; 
	
	}
}
	