package hw11Q2Polymorphism;

public class Niece extends Sister {
	@Override
	public void sister() {
		System.out.println("This is default method from Niece class");
	}

	// void type parameterized method
	@Override
	public void sister(int age1, int age2) {
		int total1 =age1+age2 +10;
		System.out.println("This is parameterized method:" + total1);
		
	}

	@Override
	public int sister(int age1, int age2, int age3) {
		int total2 = age1 + age2 + age3 -5;
		System.out.println("This is return type paramiterized :" + total2);
		return total2;
	}

	@Override
	public int sister(int age2, int age5, String age4) {
		int total3 = age2 + age5 + Integer.parseInt(age4)/2;
		System.out.println("This is the return type paramerized " + total3);
		return total3;
	}
//	ststic and final can not override
	/*
	 * @Override
	 * 
	 * public static int sister(int age3, String age4, int age5, int age6 ) { int
	 * total4 = age3 +Integer.parseInt(age4) +age5 +age6;
	 * System.out.println("This is ststic type method:" + total4); return total4; }
	 * // @Override public final int sister(int age2 ,int age3, String age4, int
	 * age5, int age6 ) { int total5 = age2 +age3 +Integer.parseInt(age4) +age5
	 * +age6; System.out.println("This is final type method:" + total5); return
	 * total5;
	 * 
	 * }
	 */

}
