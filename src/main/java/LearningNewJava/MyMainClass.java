package LearningNewJava;

import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import LearningNewJava.classes.Animal;
import LearningNewJava.classes.AnotherClass;

/*import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage;*/

import LearningNewJava.classes.Car;
import LearningNewJava.classes.Cat;
import LearningNewJava.classes.Dog;
import LearningNewJava.classes.MathFuncInterface;
import LearningNewJava.classes.MySingleton;
import LearningNewJava.classes.SwitchExpression;
//import LearningNewJava.classes.Vehicle;

public class MyMainClass {
	
	public static Logger logger = Logger.getLogger("MyMainClass.class");
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		SwitchExpression se = new SwitchExpression();
		System.out.printf("you have entered: %s \n",se.covertToString(10));
		
		logger.info("put something in the logger");
		
		Car car = new Car();
		car.setLicensePlate("ABCDEFG");
		car.printLicensePlate();	
		
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		
		// test singleton
		MySingleton mySingleton = MySingleton.getInstance();
		//MySingleton singleton2 = MySingleton.getInstance();
		
		System.out.printf("mysingleton text without setting: %s\n",mySingleton.getMyString());
		
		mySingleton.setMyString("");
		System.out.printf("mysingleton text after setting: %s\n",mySingleton.getMyString());
		
		AnotherClass myClass = new AnotherClass();
		myClass.setMyAnimalList(Arrays.asList(myDog, myCat));
		myClass.setMyCarList(Arrays.asList(car));
		
		for (Car thisCar : myClass.getMyCarList()) {
			System.out.printf("this car's license Plate: %s \n", thisCar.getLicensePlate());
		}
		
		String myStr = "abcdefg";
		String myOtherString = myStr.concat("hijkl");
		System.out.printf("My new String %s\n",myOtherString);
		
		// using Lamda and static method reference
		myClass.getMyAnimalList().stream()
			 .filter(a->a.getAnimalType().equals("Dog"))
		     .map(a->"I'm a "+a.getAnimalType()+" and I have "+a.getNumOfEyes()+" eyes. From Lamda")
		     .forEach(System.out::println);   // method referrence by static method
		
		String[] strList = {"one","two","three","four"};
		//Arrays.sort(strList, (a,b)->a.compareTo(b));  // lamda
		Arrays.sort(strList, String::compareTo);   // method reference from arbitrary object
		
		System.out.println("print sorted array:");
		Arrays.asList(strList).forEach(System.out::println);;
		
		// using custom Functional interface...
		MathFuncInterface addTwoNumbers = (a,b)->a+b;
		MathFuncInterface subtractTwoNumbers = (int a, int b)->a-b;
		
		Integer result1 = addTwoNumbers.calculate(3,4);
		Integer result2 = subtractTwoNumbers.calculate(10,5);
		
		int compareNum = result1.compareTo(result2);
		System.out.printf("result1: %d, result2: %d, compareNum: %s, default method: %s\n", result1, result2, compareNum > 0? "greater":"Less than", addTwoNumbers.message());
		
		// using stream and flatMap
		Map<String, List<String>> people = new HashMap<>();
		people.put("John", Arrays.asList("555-1123", "555-3389"));
		people.put("Mary", Arrays.asList("555-2243", "555-5264"));
		people.put("Steve", Arrays.asList("555-6654", "555-3242"));

		List<String> phones = people.values().stream()
		  .flatMap(Collection::stream)
		    .collect(Collectors.toList());
		
		System.out.println("people's HashMap: "+people);
		System.out.println("people's HashMap.values(): "+people.values());
		phones.forEach(System.out::println);
		
	
		// Java 8 Date, datetime, time
		LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDate localDate = LocalDate.now();
		LocalDate customDate = LocalDate.of(2021, Month.MARCH, 28);
		
		System.out.printf("localTime: %s \n",localTime.format(DateTimeFormatter.ofPattern("hh:mm")));
		System.out.printf("localDateTime: %s \n",localDateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss")));
		System.out.printf("localDate: %s \n",localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.printf("customDate: %s \n",customDate.format(DateTimeFormatter.ISO_DATE));
		
		// Encode using basic encoder
        String base64encodedString = Base64.getEncoder().encodeToString("TutorialsPoint?java8".getBytes("utf-8"));
        System.out.println("Base64 Encoded String (Basic) :" + base64encodedString);
		
        // Decode
        byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
        System.out.println("Original String: " + new String(base64decodedBytes, "utf-8"));
        
		// using lamda expression
        
        // multi-dimensional array
//        int[][] multiArry = new int[3][3];
//        
//        for (int i=0; i < 3; i++) {
//        	for (int j=0; j<3; j++) {
//        		multiArry[i][j] = i+j;
//        	}
//        }
//        
//        for (int i=0; i < 3; i++) {
//        	for (int j=0; j<3; j++) {
//        		System.out.printf("numbermultiArry[%d][%d] is %d \n", i, j, multiArry[i][j]);
//        	}
//        }
        
        //System.out.println("10 ^ 2: "+Math.pow(10, 2));
        String str1 = "bbbb";
        String str2 = new StringBuilder(str1).reverse().toString();
        
        if (str1.equals(str2)) {
        	System.out.printf("string %s is palindrome.\n",str1);
        } else{
        	System.out.printf("string %s is NOT palindrome.\n",str1);
        }
        
        //System.out.println("string 'hi there', and the reverse is: "+new StringBuilder("hi there").reverse().toString());
        int inputArray[] = new int[] {1,7,10};
        
        for (int myStr1 : inputArray) {
        	System.out.printf("Number %d\n", myStr1);
        }
        
        int max = 0;
        for (int i=0; i < (inputArray.length -1); i++){
        	int newSum = inputArray[i]*inputArray[i+1];
            if (max < newSum) {
            	max = newSum;
            }
        } 
        
        System.out.println("Largest sum: "+ max);
        
        int numOfPolygons = 6;
        int sides=4;
        //int polygon =(int) Math.pow((2*n - 1),2) - 2 * n * (n - 1);
        
        int area = 1;
        for (int i=1; i <= numOfPolygons; i++) {
        	area = area + sides*(numOfPolygons-i);
        }
        
        System.out.println("Polygon area: "+ area);
        
        int[] arr = {6,5,10,4};
        int itemNeeded=0;
        
        Arrays.sort(arr);
        for (int i=0; i < arr.length-1; i++) {
        	int diff = arr[i+1]-arr[i];
        	itemNeeded = itemNeeded + (diff > 1? diff-1:0 );
        }
        
        System.out.printf("number of element needed: %d\n", itemNeeded);
        System.out.printf("Modified arr[] : %s", Arrays.toString(arr));
        		
/*		
		//send mail
		 // Recipient's email ID needs to be mentioned.
	      String to = "tuyenqvu2002@yahoo.com";

	      // Sender's email ID needs to be mentioned
	      String from = "testmail@yahoo.com";
	      final String username = "tuyenqvu2002@gmail.com";//your Gmail username 
	      final String password = "xxxxxxxxxx";//your Gmail password

	      // Assuming you are sending email from localhost
	      String host = "smtp.gmail.com";

	      // Get system properties
	      Properties props = new Properties();
	      props.put("mail.smtp.auth", "true");
	      props.put("mail.smtp.starttls.enable", "true"); 
	      props.put("mail.smtp.host", host);
	      props.put("mail.smtp.port", "587");

	      // Get the default Session object.
	      Session session = Session.getInstance(props,
	    		  new javax.mail.Authenticator() {
	    	  protected PasswordAuthentication getPasswordAuthentication() {
	    	  return new PasswordAuthentication(username, password);
	    	  }
	    	  });

	      try {
	         // Create a default MimeMessage object.
	         //Message message = new MimeMessage(session);
	    	  Message message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

	         // Set Subject: header field
	         message.setSubject("This is the Subject Line!");

	         // Now set the actual message
	         message.setText("This is a test from java.mail");

	         // Send message
	         Transport.send(message);
	         System.out.println("Sent message successfully....");
	      } catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	      */
	   }
}
