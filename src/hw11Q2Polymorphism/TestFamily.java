package hw11Q2Polymorphism;


public class TestFamily {
	public static void main(String[] args) {
		Sister sister = new Sister();
		sister.sister();
		sister.sister(10, 04);
		sister.sister(20, 30, 10);
		sister.sister(5, 4, "10");
		sister.sister(20, 10, "5", 10, 10);
		sister.sister(2, "2", 3, 4);
		System.out.println("\n*******************\n");
		
		Niece nc = new Niece();
		nc.sister();
		nc.sister(3, 2);
		nc.sister(4, 5, 6);
		nc.sister(10, 2, "2", 1, 3);
		
	}
	

	


}
