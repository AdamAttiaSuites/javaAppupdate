package DatabaseDemoJDBCSecondProject.v;

import java.io.NotActiveException;import java.security.cert.CertificateNotYetValidException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter The word you Want to Validate!" );
        
        String str = scanner.nextLine();
        if(str.equals("Atlanta")) {
        	System.out.println("The right Input!! Welcome In!");
        }else if(str.equals("Annaba")) {
        	System.out.println("Wrong Input, State out of USA!!");
        }else {
			System.out.println("Wrong Input, Tru=y Again!!");
		}
        getName();
        getRightAge();
        gitMerge();
        checkFizBuzz();
       
    }
    public static void getAge() {
    	
    	int age = 30;
    	System.out.println("The age for new Employee is " + age);
    	
    }
    public static void getName() {
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("The name of the employee:");
    	String name = scanner.nextLine();
    	if(name.equals("Steve")) {
    		System.out.println(name+" is Correct");
    		getAge();
    	}else {
			System.out.println("Wrong Name!! Try Again");
		}
    	
    }
    public static void getRightAge() {
    	Scanner scanner = new Scanner(System.in);
    	int n = 30;
    	System.out.println("Enter the age you want to validate: ");
    	int age = scanner.nextInt();
    	
    	if(age <= n) {
    		System.out.println("You are legal! Yuou can go in");
    	}else {
		   System.out.println("Its not an Authorized age. Try again!");
		}
    }
    public static void cretaeNewBranche() {
    	System.out.println("I ahve Created a new Branche!!");
    }
    public static void gitMerge() {
    	System.out.println("After Switching to Develp Branche,"
    			+ " we did some changes and know we want to push it to Main Branche!");
    }
    
    public static void checkFizBuzz() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter a number to check the test!");
    	int num = scanner.nextInt();
    	
    	if((num % 3 ==0)&&(num % 5==0)) {
    		System.out.println("FizBuzz!");
    	}else if (num % 3 ==0) {
    		System.out.println("Fizz!");
    	}else if (num % 5 ==0) {
    		System.out.println("Buzz!");
    	}else {
			System.out.println("Not a Valide Number!" );
		}
    }
}
