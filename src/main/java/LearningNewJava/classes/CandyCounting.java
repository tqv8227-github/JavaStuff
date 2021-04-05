package LearningNewJava.classes;

public class CandyCounting {
    // this story is from CodeSignal website. https://app.codesignal.com/
	public int countCandies(int n, int m) {
		if ((n < 1 || n > 10) || (m < 2 || m > 100) || m < n)
		{
			return 0;
		}
		
		int result = n;
		
		while ((result+n) <= m){
			result += n;
		}
		
		return result;
	}
	///////////////////////////////////////////////////////////////////
	public static void main(String[] args[]) {
		CandyCounting counting = new CandyCounting();
		int result = counting.countCandies(10,10);
		System.out.println("result: "+result);
		
	}
}
