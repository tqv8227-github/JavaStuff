package LearningNewJava.classes;

public class Cat implements Animal {
	
	private int numberOfEyes = 2;
	
	@Override
	public int getNumOfEyes() {
		return this.numberOfEyes;
	}
	
	@Override
	public String getAnimalType() {
		return "Cat";
	}
	
	@Override 
	public void eat() {
		System.out.println("Cat eats cat food");
	}

	@Override
	public void move() {
		System.out.println("Cat moves using its four feet");
		
	}
	
	

}
