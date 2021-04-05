package LearningNewJava.classes;

public class AnotherSingleton {

	private String myStr = "default string";
	//private static AnotherSingleton obj = new AnotherSingleton();
	
	private AnotherSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static AnotherSingleton getInstance() {
		return new AnotherSingleton();
	}
	
	private void printHelloWorld() {
		System.out.println("Hello World!");
	}
	///////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		AnotherSingleton singleton = AnotherSingleton.getInstance();
		singleton.printHelloWorld();

	}

}
