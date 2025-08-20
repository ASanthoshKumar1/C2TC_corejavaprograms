package abstract_example;

public class Demo {
	public static void main (String[] args) {
		Trainer t = new TechTrainer();
		
		t.session();
		t.checks();
		
		t=new SoftSkillTrainer();
		
		t.session();
		t.checks();
	}
	

}
