package encapulation_example;

public class StudentDemo {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.setSid(101);
		s.setSname("raja");
		s.setAvg(89.5f);
		Student s1= new Student();
		s1.setSid(101);
		s1.setSname("raja");
		s1.setAvg(89.5f);
		
	
		System.out.println(s1);

	}

	
	


	
	
	
	}


