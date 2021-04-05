package LearningNewJava.classes;

public class MyTest extends MyAbstractClass2{
	
	//@Override
	public void printString() {
		System.out.println("Override abstract method");
	}
	
	public static void main(String... arg) {
		MyTest test = new MyTest();
		System.out.println(test.getString());
		System.out.println(test.getString2());
		System.out.println(test.getString3());
		System.out.println(test.getString4());
		test.printString();
	}
}
