package hw4Q2JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
	//	MyInfo class is instantiated, always inside main method, not in other method
		AboutMe aboutMe1 = new AboutMe(); // Constructor is initialized, when an object is created
//		aboutMe1.aboutMe();
		aboutMe1.name = " Jhon";
		aboutMe1.age = 38;
		aboutMe1.sex = 'M';
		aboutMe1.myYearlySalary = 50000;
		aboutMe1.myYearlyRent = 12000;
		aboutMe1.usCitizen = true;
		aboutMe1.aboutMe();

		System.out.println("\n******************\n");
		// AboutMe class is instantiated here
		AboutMe aboutMe2 = new AboutMe();

		aboutMe2.name = "Alex";
		aboutMe2.age = 60;
		aboutMe2.sex = 'M';
		aboutMe2.myYearlySalary = 30000;
		aboutMe2.myYearlyRent = 3000;
		aboutMe2.usCitizen = false;
		aboutMe2.aboutMe();

	}

}