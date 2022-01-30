package hw6Q21IfElseCondition;

public class Voter {

	public static void main(String[] args) {
		// initialize a variable
		int age = 38;
		
		if (age == 18) {
			System.out.println(" I am a voter");
		} else if (age < 18) {
			System.out.println(" I am not a voter");
		} else if (age > 18) {
			System.out.println(" I am a voter");
		} else {
			System.out.println("Please add a valid age");
		}

	}

}
