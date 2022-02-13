package hw10Q2UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {

		System.out.println("---------- default constructor initialized for Daughter Class ----------");
		Daughter doughter01 = new Daughter();

		System.out.println("\n---------- parameterized constructor initialized for  Daughter Class ----------");
		Daughter doughter02 = new Daughter("April ", 40);
		System.out.println("\n---------- parameterized type method initialized for Doughter Class ----------");
		doughter02.daughterInfo("Iyaad", 4);

		System.out.println("\n---------- defauld constructor initialized for Father  Class ----------");
		Father father = new Father();

		System.out.println("\n---------- parameterized constructor initialized for Father  Class ----------");
		Father father01 = new Father();
		father01.fatherInfo("karim ", 90, 'M', false);
		System.out.println("\n---------- void type method initialized for Father Class ----------");
		father01.father();

		System.out.println("\n---------- parameterized type method initialized for Father Class ----------");
		father01.fatherInfo("Ismail ", 40, 'M', true);

	}
}
