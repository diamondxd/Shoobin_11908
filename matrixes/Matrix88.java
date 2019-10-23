import java.util.Scanner;
import java.util.Random;
 
 public class Matrix88 {
	 
	 public static void main(String [] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 Random rdm = new Random();
		 
		 System.out.println("Enter M pls");
		 
		 int m = sc.nextInt();
		 
		 System.out.println();
		 
		 int a[][] = new int[m][m];
		 
		  for(int i = 0; i < m; i++) {
			  for(int j = 0; j < m; j++) {
				  
				  a[i][j] = rdm.nextInt(9) + 1;
				System.out.print(a[i][j] + " ");
				  
			  }
			  System.out.println();
		  }
		  
		  System.out.println(" Result\n");
		  
		  
		  for(int i = 1; i < m; i++) {
			  for(int j = 0; j < i; j++) {
				  
				  a[i][j] = 0;
				  
			  }
		  }
		 
		 for(int i = 0; i < m; i++) {
			  for(int j = 0; j < m; j++) {
				  
		          System.out.print(a[i][j] + " ");
				  
			  }
			  System.out.println();
		  }
	 }
	 
 } 
 
 //2*m^2 + (m-1)^2/2