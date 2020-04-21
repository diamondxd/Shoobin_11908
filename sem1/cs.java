import java.util.Scanner;

 class cs {
	 
	 public static void main(String [] args) {
		 
		 Scanner d = new Scanner(System.in);
		 
		 System.out.println("  Enter ur word");
		 
		 String w = d.nextLine();
		 
		 w = w.toLowerCase();
		 
		 System.out.println(" Enter N");
		 
		 int n = d.nextInt();
		 
		 char x;
		 
		 
		 
		  for(int i = 0; i <= (w.length() - 1); i++) {
			  
			  x = (char) ((int)w.charAt(i) + n);
			  
			   if ((int)x > 122) {
			 
			 x = (char) ((int)x - 122);
				   
				   while((int)x > 26) {
					   
					   x = (char) ((int)x - 26);
					   
				   }
				   
				   x = (char) ((int)x + 96);
				   
				   
			   }
			   
			  
			  System.out.print(x);
			  
			  
		  }
		 
		 
		 
		 
		 
	 }
	 
 }