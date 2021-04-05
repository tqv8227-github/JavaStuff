package LearningNewJava.classes;

@FunctionalInterface  // allows only 1 abstract method
public interface MathFuncInterface {

	public int calculate(int x, int y);
	
	// interface default methods
	default String message() {
		return "Interface default method";
	};
	
	default String message2() {
		return "Interface default method 2";
	}
}
