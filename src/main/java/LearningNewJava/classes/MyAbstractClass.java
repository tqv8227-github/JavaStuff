package LearningNewJava.classes;

import java.util.Comparator;

public abstract class MyAbstractClass{
	private String myStr = "Hello world %s";
	
	public String getString() {
		return String.format(myStr, "!!!");
	}
	
	public String getString2() {
		return String.format(myStr, "####");	
	}
	
	abstract void printString();
}
