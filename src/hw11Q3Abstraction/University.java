package hw11Q3Abstraction;

//how many keywords are used for the inheritance in Interface? ans: Zero
//Can an interface inherit other Interfaces, or a regular class or abstract class by extends key word? How many inheritance is possible?
//interface inherit other interface--yes, a regular class or abstract class by extends key word?---no
//How many inheritance is possible?--interface to interface more then one
public interface University extends Collage, Hospital {
	public void classSize();

	public abstract void playGround();

	public void teacher();

	// public void University() {
	// }
	// An interface doesn't constructor because all data members in interface are
	// public static final by default
	default void gymnasium() {

	}

	public static void library() {

	}

}