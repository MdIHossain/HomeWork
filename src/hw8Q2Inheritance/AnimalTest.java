package hw8Q2Inheritance;

import hw8Q2Inheritance.Animal;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();
		// Bird, Mammal,Reptile extends inherit Animal class is an exampleof
		// Hierarchical inheritance

		System.out.println("\n**************\n");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();

		System.out.println("\n**************\n");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();

		System.out.println("\n**************\n");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();

		System.out.println("\n**************\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();// Dog extends Mammal this is of single inheritance
		dog.animalInfo();

		System.out.println("\n**************\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		System.out.println("\n**************\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();

		System.out.println("\n**************\n");
		BullDog bullDog = new BullDog();
		bullDog.bullDog();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();// BULLDOG extends Mammal extends Animal is an example of Muli-level inheritance

		System.out.println("\n**************\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
	}
}