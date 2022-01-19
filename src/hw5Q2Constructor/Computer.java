package hw5Q2Constructor;

public class Computer {
	public String brand;
	public String model;
	public String operatingSystem;
	public String price;
	public char grade;
	public boolean madeInUSA;
	
	public Computer() {
		System.out.println("This is default constructor from Computer class");
	}
	public Computer(String brand) {
		this.brand = brand;
		System.out.println("My Brand : " +brand);
		
	}
	public Computer(String brand,String model) {
		this.model = model;
		System.out.println("Model  : " +model);
		
	}
	public Computer(String brand,String model,String operatingSystem ) {
		this.operatingSystem = operatingSystem;
		System.out.println("operatingSystem  : " +operatingSystem);
		
	}
	public Computer(String brand,String model,String operatingSystem,String price ) {
		this.price = price;
		System.out.println("Price: "+ price);
		
	}
	public Computer(String brand,String model,String operatingSystem,String price,char grade ) {
		this.grade = grade;
		System.out.println("Grade: "+ grade);
		
	}
	public Computer(String brand,String model,String operatingSystem,String price,char grade,boolean madeInUSA ) {
		this.madeInUSA = madeInUSA;
		System.out.println("Made in USA? "+"Ans: " +madeInUSA );
		
	}
	
	
	

}
