package hw6Q21IfElseCondition;

public class Voter {

	public static void main(String[] args) {
		// here define a variable
		int age;
		// initialize a variable
		int age1 = 38;
		if (age1 == 18) {
			System.out.println(" I am a voter" + age1);
		} else if (age1 < 18) {
			System.out.println(" I am not a voter " + age1);
		} else if (age1 >= 18) {
			System.out.println(" I am a voter " + age1);
		} else {
			System.out.println(age1 + "My age is 38");
		}

	}

}
