package LearningNewJava.classes;

public class Palindrome {
	
	public boolean compare(String str) {
		
		// need to check for null
		if (str == null)
			return false;
		
		if (str.equals("")) {
			return true;
		}
		
		// first create a reverse String then compare it with the original
		String newStr = new StringBuilder(str).reverse().toString();
		if (str.contentEquals(newStr)) {
			return true;
		}else {
			return false;
		}				
	}
	/////////////////////////////////////////////////////////////////
	public boolean compare2(String str) {
		// need to check for null
		if (str == null)
			return false;
		// check for empty string
		if (str.equals("")) {
			return true;
		}
		
		boolean result = true;
		char[] charArray = str.toCharArray();
		
		for (int i=0; i < (charArray.length)/2; i++) {
			if (charArray[i] != charArray[(charArray.length-1)-i]) {
				return false;
			}
		}
		return result;
	}
	/////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		String str="abbbba";
		Palindrome palindrome = new Palindrome();		
		boolean result = palindrome.compare(str);
		
		System.out.println("result is: "+result);
		System.out.println("result from compare2: "+palindrome.compare2(str));
	}
}
