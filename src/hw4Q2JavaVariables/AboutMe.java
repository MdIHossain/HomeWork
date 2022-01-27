package hw4Q2JavaVariables;

public class AboutMe {
	// here just declared variable
	public String infomationAboutMe;
	public String name;
	public byte age;
	public short myYearlyRent;
	public int myYearlySalary;
	public char sex;
	public boolean usCitizen;
	public long myBankBalance;
	public double grade;
	public float height;

	public AboutMe() {
		System.out.println("This is about me");
	}

	public void aboutMe() {
		System.out.println("My Name is: " + name + " My age: " + age + " MyYearlyRent: " + myYearlyRent
				+ " MyYearlySalary: " + myYearlySalary + " My Sex " + sex + " My Result" + usCitizen + " My Bank Balance "
				+ myBankBalance + " My Grade" + grade + " My height " + height);
	}

}
