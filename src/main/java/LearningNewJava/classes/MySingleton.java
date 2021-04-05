package LearningNewJava.classes;

public class MySingleton {

	private static MySingleton myObj = new MySingleton();
	private String myString = "Default string";
	
	private MySingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public String getMyString() {
		return myString;
	}
	
	public void setMyString(String thisString) {
		myString = thisString.equals("")? "String is empty":thisString;
	}

	public static MySingleton getInstance() {
		return myObj;
	}
	
	public void printString() {
		System.out.println(this.myString);
	}
	
	public static void main(String... args) {
		MySingleton obj = MySingleton.getInstance();
		obj.setMyString("this is a test");
		obj.printString();
	}
}
