package hw11Q3Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University,VocationalSchool {
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

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}
	public static void student() {
		System.out.println("This is student static method from ColumbiaUniversity");
	}
}