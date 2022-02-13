package hw9Q2Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setName("Ismail");
		employee.setAge(38);
		employee.setSex('M');
		employee.setUsCitizen(true);

		System.out.println("Employee Name: " + employee.getName() + ", \nAge: " + employee.getAge() + ",\nSex: "
				+ employee.getSex() + ", \nUsCitizen: " + employee.isUsCitizen());
	}

}
