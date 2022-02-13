package hw9Q3Abstraction;

public interface Hospital {
	public void emergencyRoom();

	public abstract void surgeryRoom();

	public void cafeteria();

	default void morgue() {

	}

	public static void pharmacy() {

	}
}