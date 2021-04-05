package LearningNewJava.classes;

public class SwitchExpression {
	
	public String covertToString(int num) {
		String result = switch (num) {
		case 1 -> "this is number 1";
		case 2 -> "this is number 2";
		default -> "this is not 1 or 2 but "+Integer.toString(num);
		};
		
		switch (num) {
		 case 1: System.out.println("this is num 1");
		 case 2:  System.out.println("this is num 2");
		 default: System.out.println("this is num "+Integer.toString(num));
		};
		
		return result;
	}

}