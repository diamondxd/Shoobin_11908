import java.util.Scanner;

 public class MultTable {
	 
	 public static void main(String [] args) {
		 
		 System.out.print("    Enter table size: ");
		 
		 Scanner ss = new Scanner(System.in);
		 
		 int x = ss.nextInt();
		 
		 System.out.printf("%4s","*");
		 System.out.printf("%4s","|");
		 
		 
		  for(int i = 1; i <= x; i++) {
			 
			  System.out.printf("%4d", i);
			 
		  }
		  
		  System.out.println();
		 
		  for(int i = 1; i <= 4*(x+2); i++) {
			 
			  System.out.print("-");
			 
		  }
		  
		  System.out.println();
		  
		  for(int i = 1; i <= x; i++) {
			  
			  System.out.printf("%4d", i);
		      System.out.printf("%4s","|");
			  
			   for(int j = 1; j <= x; j++) {
				  
				  System.out.printf("%4d", i*j);
				  
				  
				  
			   }
			  
			  System.out.println();
			  
		  }
		 
		
		 
	 }
 }
