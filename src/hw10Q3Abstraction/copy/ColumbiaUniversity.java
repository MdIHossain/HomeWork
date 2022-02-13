package hw10Q3Abstraction.copy;

public class ColumbiaUniversity extends MedicalSchool {
	// Regular class or non abstract class does not take abstract method
	// public abstract void chemistry();
	public void biology() {
		System.out.println("This is ColumbiaUniversity class");
	}

	public void ColumbiaUniversity() {

	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}

}