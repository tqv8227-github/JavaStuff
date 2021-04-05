package LearningNewJava.classes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintingService {

	public PrintingService() {
		// TODO Auto-generated constructor stub
	}

	public <E> void printList(List<E> objectList){
		objectList.stream().map(a->"Object: "+a).forEach(System.out::println);
	}
	
	public <E> void print(E object) {
		System.out.println("object: "+object);
	}
	
	public <E,V> void printList(List<E> objectList, List<V> anotherObjList){
		objectList.stream().map(a->"Object: "+a).forEach(System.out::println);
		anotherObjList.stream().map(a->"Object: "+a).forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintingService service = new PrintingService();
		String[] arr = new String[] {"1x","2x","3x"};
		Integer[] intArr = new Integer[] {1,2,3};
		
		int[] anotherIntArr = new int[] {5,6,7};
		
		
		service.printList(Arrays.asList(arr));
		service.printList(Arrays.asList(intArr));
		service.printList(Arrays.stream(anotherIntArr).boxed().collect(Collectors.toList())); // need to covert from int to Integer collection

	}

}
