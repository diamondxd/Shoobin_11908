import java.util.Scanner;
public class PI {
	
	public static void main(String [] args) {
	
	 double pi = 0;
	 
	 Scanner ko = new Scanner(System.in);
	 
	 System.out.println("Enter N");
	 
	 long n = ko.nextInt();
	 
	  for(int i = 1; i <= n; i = i+4) {
		  
		  pi = pi + 1.0/i - 1.0/(i+2);		  
		  
		  
		  
		  
	  }
	  
	  System.out.println(4*pi + "  <--- My PI");
	  System.out.println(Math.PI);
	 
	}
	
}