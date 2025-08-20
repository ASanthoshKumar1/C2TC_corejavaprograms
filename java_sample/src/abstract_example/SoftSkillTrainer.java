package abstract_example;

public class SoftSkillTrainer extends Trainer {
	@Override
	public void session() {
		System.out.println("Resume");
	}
	@Override
	public void checks() {
		System.out.println("CV");
	}


}
