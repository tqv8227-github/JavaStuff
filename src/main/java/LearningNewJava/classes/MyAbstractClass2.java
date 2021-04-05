package LearningNewJava.classes;

import java.util.Comparator;

public abstract class MyAbstractClass2 extends MyAbstractClass{
	private String myStr = "Hello world %s";
	
	public String getString3() {
		return String.format(myStr, "XXX");
	}
	
	public String getString4() {
		return String.format(myStr, "ZZZ");	
	}
	
	abstract void printString();
}
