package DatabaseDemoJDBCSecondProject.v;

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
       
    }
}
