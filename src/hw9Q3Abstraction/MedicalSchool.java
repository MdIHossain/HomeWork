package hw9Q3Abstraction;
//how many keywords are used for the inheritance in Java for Abstract Class?--one extends keyword

//Can an Abstract Class inherit other Abstract Class or a regular class by extends keyword?--yes
// but interface --no
//How many inheritances is possible by an Abstract Class?--one

public abstract class MedicalSchool extends NursingSchool {
	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is from MedicalSchool class");
	}

	// create default Constructor
	public void MedicalSchool() {

	}
}