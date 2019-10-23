import java.util.Scanner;
import java.util.Random;

 public class Matrix61 {
	 
	 public static void main(String [] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 Random rdm = new Random();
		 
		 System.out.print("Enter M  N  and K pls\n");
		 
		 int m = sc.nextInt();
		 int n = sc.nextInt();
		 int k = sc.nextInt();
		 
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
		  
		  for(int i = 0; i < m; i++) {
			  
			  if(i==(k-1)) {
				  continue;
			  }
			  
			  for(int j = 0; j < n; j++) {
				  
				  System.out.print(a[i][j] + " ");
				  
			  }
			  System.out.println();
		  }
		  
	 }
	 
 }