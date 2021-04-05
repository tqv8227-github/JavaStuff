package LearningNewJava.classes;

public class Factorial {
	
	public int compute(int x) {
		if (x == 0 || x==1)
			return 1;
		
		return compute(x-1)*x;
	}
	
	public static void main(String[] args) {
		Factorial fac = new Factorial();
		
		System.out.println("Factorial(30) is: "+ fac.compute(30));
	}
}
