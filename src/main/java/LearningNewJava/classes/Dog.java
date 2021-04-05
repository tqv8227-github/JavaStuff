package LearningNewJava.classes;

public class Dog implements Animal {

	private int numberOfEyes = 5;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getAnimalType() {
		return "Dog";
	}

	@Override
	public int getNumOfEyes() {
		// TODO Auto-generated method stub
		return numberOfEyes;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Dog uses 4 feet to move around");

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog eats dog food");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
