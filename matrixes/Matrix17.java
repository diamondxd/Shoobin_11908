import java.util.Scanner;
import java.util.Random;

 public class Matrix17 {
	 
	 public static void main(String [] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 Random rdm = new Random();
		 
		 System.out.print("Enter M  N and K pls\n");
		 
		 int m = sc.nextInt();
		 int n = sc.nextInt();
		 int k = sc.nextInt();
		 int r = 1;
		 int[][] a = new int[m][n];
		 
		 System.out.println();
		 
		  for(int i = 0; i < m; i++) {
			  for(int j = 0; j < n; j++) {
		        
				a[i][j] = rdm.nextInt(9) + 1;
				System.out.print(a[i][j] + " ");
				
			  }
				 System.out.println();
		  }
		  
		  System.out.println();
		  
		  System.out.println(" Result:");
		  
		  for(int j = 0; j < n; j++) {
			  
			  r = r * a[k-1][j];
			  
		  }
		  
		  
		  
		  System.out.println("Mult. = " + r);
		  
		  r = 0;
		  
		  for(int j = 0; j < n; j++) {
			  
			  r = r + a[k-1][j];
			  
		  }
		  
		  System.out.println("Sum. = " + r);
		  
	 }
	 
 }