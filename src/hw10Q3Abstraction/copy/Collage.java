package hw10Q3Abstraction.copy;

public interface Collage {
	public void commonRoom();

	public void laboratory();

	public void languageClub();

	default void dorm() {

	}

	public static void studyRoom() {

	}

}