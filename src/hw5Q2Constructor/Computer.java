package hw5Q2Constructor;

public class Computer {
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	public Computer() {
		System.out.println("This is default constructor from Computer class");
	}

	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("My Brand " + brand + "\n Model : " + model + "\n operatingSystem : " + operatingSystem
				+ "\n Price: " + price + "\n Grade: " + grade + "\n Made in USA? " + "Ans: " + madeInUSA);
	}
}
