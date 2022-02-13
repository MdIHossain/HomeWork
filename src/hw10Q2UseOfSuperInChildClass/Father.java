package hw10Q2UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	// default constractor
	public Father() {
		System.out.println("This is a default constructor from Father class Class");

	}

	// parameterized constructor
	public Father(String name, int age, char sex, boolean usCitizen) {
		// super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		this.familyName = familyName;
		System.out.println(" Name " + name + " age " + age + "Sex " + sex + " USCitizen " + usCitizen + "Family Name "
				+ familyName);
	}

	// void type method
	public void father() {
		System.out.println("This is come from father default method");
	}

	// parameterized method
	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name = "name";
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println(" Name ," + name + "age ," + age + " Sex ," + sex + " USCitizen ," + usCitizen);
	}
}