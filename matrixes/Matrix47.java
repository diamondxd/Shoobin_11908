import java.util.Scanner;
import java.util.Random;

 public class Matrix47 {
	 
	 public static void main(String [] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 Random rdm = new Random();
		 
		 System.out.print("Enter M  N  k1  k2 pls\n");
		 
		 int m = sc.nextInt();
		 int n = sc.nextInt();
		 int k1 = sc.nextInt();
		 int k2 = sc.nextInt();
		 int f = 0;
		 
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
				
				f = a[k1-1][j];
				a[k1-1][j] = a[k2-1][j];
				a[k2-1][j] = f;
				
			}
		  
		  for(int i = 0; i < m; i++) {
			  for(int j = 0; j < n; j++) {
		        
				System.out.print(a[i][j] + " ");
				
			  }
				 System.out.println();
		  }
		  
	 }
	 
 }