package hw5Q3Constructor;

public class Student {
	public String stName;
	public int stId;
	public char sex;
	public boolean isProgrammer;
	public float grade;

	public Student() {
		System.out.println("This is Student class default constructor");
	}

	public Student(String stName, int stId, char sex, float grade, boolean isProgrammer) {
		this.stName = stName;
		this.stId = stId;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("Student Name : " + stName +", "+ "Student Id : " + stId+", " + "Student sex : " + sex +", "+ "Grade "
				+ grade+", " +  "And programmer? Ans : " + isProgrammer+".");
	}

}
