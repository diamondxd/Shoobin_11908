import java.util.Scanner;
import java.util.Random;

 public class Matrix20 {
	 
	 public static void main(String [] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 Random rdm = new Random();
		 
		 System.out.print("Enter M x N pls\n");
		 
		 int m = sc.nextInt();
		 int n = sc.nextInt();
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
		  
		  for(int i = 0; i < n; i++) {
			  for(int j = 0; j < m; j++) {
				  
				  r = r * a[j][i];
				  
			  }
			  
			  System.out.print(r + " ");
			  r = 1;
		  }
		  
	 }
	 
 }