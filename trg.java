import java.util.Scanner;
 
 public class trg {
	 
	 public static void main(String [] args) {
	 
	     System.out.print("   Enter triangle size: \n");
		 
		 Scanner s = new Scanner(System.in);
		 
		 int x = s.nextInt();
		 
		 int y = 1;
		 
		 for(int i = 1; i <= x; i++) {
			 
			 for(int f = 1; f <= y; f++) {
				 
				 System.out.print("#");
 
				 
			 }
			 
			 System.out.println();	
             
             y++;			 
 
		 }
	

	 }
	 
 }