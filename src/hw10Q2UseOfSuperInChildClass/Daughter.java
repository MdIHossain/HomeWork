package hw10Q2UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMounth;
	public int age;

	// default constructor
	public Daughter() {
		super();
		super.father();
		// super keyword is used to call (initialize) the variables of Parent class
		super.familyName = "Hossain";
		System.out.println("The family name " + familyName);

		System.out.println("This is from default Doughter constrator ");
	}

	// parameterized constructor
	public Daughter(String birthMounth, int age) {
		super();
		this.birthMounth = birthMounth;
		this.age = age;
		System.out.println(" BirthMounth " + birthMounth + "Age " + age);
	}

	// void type method
	public void daughter() {
		System.out.println("This is come from daughter class");
	}

	// parameterized method
	public void daughterInfo(String birthMounth, int age) {
		this.birthMounth = "May";
		this.age = 35;
		System.out.println(" BirthMounth " + birthMounth + " Age " + age);
	}

}
