package hw11Q3Abstraction;

public class TestInstitute {

	public static void main(String[] args) {
		ColumbiaUniversity colum = new ColumbiaUniversity();
		colum.aeronauticalInfo();
		colum.anatomyLab();
		colum.anthropology();
		colum.biochemistryLab();
		colum.biology();
		colum.cafeteria();
		colum.caring();
		colum.classSize();
		colum.ColumbiaUniversity();
		colum.commonRoom();
		colum.computerLab();
		colum.dorm();
		colum.emergencyRoom();
		colum.hygiene();
		colum.gymnasium();
		colum.laboratory();
		colum.languageClub();
		colum.maths();
		colum.student();

		System.out.println("\n**************\n");

		University uni = new ColumbiaUniversity();
		uni.cafeteria();
		uni.classSize();
		uni.commonRoom();
		uni.dorm();
		uni.emergencyRoom();
		uni.gymnasium();
		uni.laboratory();
		uni.languageClub();
		uni.morgue();
		uni.playGround();
		uni.surgeryRoom();
		uni.teacher();

		System.out.println("\n**************\n");
		MedicalSchool medical = new MedicalSchool() {

			@Override
			public void lawInfo() {

			}

			@Override
			public void hygiene() {

			}

			@Override
			public void anatomyLab() {

			}
		};

	}

}