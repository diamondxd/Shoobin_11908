import java.util.Scanner;
import java.util.Random;

public class arM {

  public static void main(String [] args) {
 
   System.out.println("                              Welcome to random 2D array multiplication program!");
       
 
 
 Scanner lol = new Scanner(System.in);
 
 Random xd = new Random();
 
  System.out.println(" Enter first array size");
 
  int a = lol.nextInt();
  int b = lol.nextInt();
  
  System.out.println();
  
   int[][] ar = new int[a][b];
     
	 for(int i = 0; i < a; i++) {
		 
	  for(int j = 0; j < b; j++) {
		  
		  ar[i][j] = xd.nextInt(10);
		  
		  System.out.print(ar[i][j] + " ");
		  
		  
		  
		  
	  }
		 
		 System.out.println();
		 
	 }
	  
	  System.out.println();
	  System.out.println(" Enter second array size");
 
  int a1 = lol.nextInt();
  int b1 = lol.nextInt();
  
  System.out.println();
  
   int[][] ar1 = new int[a1][b1];
     
	 for(int i = 0; i < a1; i++) {
		 
	  for(int j = 0; j < b1; j++) {
		  
		  ar1[i][j] = xd.nextInt(10);
		  
		  System.out.print(ar1[i][j] + " ");
		  
		  
		  
		  
	  }
		 
		 System.out.println();
		 
	 }
	
  System.out.println();
  
  int[][] ar2 = new int[a][b1];

  int sd = 0;
	 
  if(b==a1) {
	  
	System.out.println("here's ur result:");
    System.out.println();
	  
    for(int i = 0; i < a; i++) {
  
      for(int j = 0; j < b1; j++) {
           
           for(int h = 0; h < b; h++) {
		  
		  ar2[i][j] += ar[i][h] * ar1[h][j];
		  
		 
		  
		  }

                     

		    System.out.printf("%4d", ar2[i][j]);

                    

	  }
	  
	  System.out.println();
	  System.out.println();
		
	  }
  
  }
    else { 
	
	System.out.print("arrays are unappropriate");
	
	}
  }
}