package hw8Q3Abstraction;

public interface University {
	public void classSize();

	public abstract void playGround();

	public void teacher();
	// public void University() {
	// }
	// An interface doesn't constructor because all data members in interface are
	// public static final by default
}