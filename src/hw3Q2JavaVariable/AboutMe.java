package hw3Q2JavaVariable;

public class AboutMe {
	// here just declared variable
	public String name1;
	// here initialized variable, i assign value in the variable
	public String name = "ismail";
	public byte b = 38;
	public short s = 1000;
	public int i = 2000;
	public char sex = 'M';
	public boolean result = true;
	public long cardNumber = 123456789;
	public double grade = 4.90;
	public float height = 5.7f;

//here main method implement
	public static void main(String[] args) {
		// AboutMe is class aboutMe is an objector reference variable
		// This action(when an object is created from class)is called instantiation
		// its called instantiated
		AboutMe aboutMe = new AboutMe();
		System.out.println(aboutMe.name);
		System.out.println(aboutMe.b);
		System.out.println(aboutMe.sex);
		System.out.println(aboutMe.name + aboutMe.b + aboutMe.sex);
		System.out.println("My Name: " + aboutMe.name + "  My Age " + aboutMe.b + "  My Height " + aboutMe.height);

	}

}
