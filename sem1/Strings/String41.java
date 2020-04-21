import java.util.Scanner;

 public class String41 {
	 
	 public static void main(String [] args) {
		 
		Scanner sc = new Scanner(System.in);
   
         String s = sc.nextLine();
		 
		 String s1 = s.concat(" ");
		 
		   int k = 0;
		 
		   for(int i = 0; i < s1.length() - 1; i++) {
			 
			 if((s1.charAt(i) != ' ') & (s1.charAt(i+1) == ' ')) {
				 
				 k++; //System.out.println(s.charAt(i));
				 
			 }
			 
			 
			 
		 }
		
		System.out.println(k + " Words");
		 
	 }
	 
 }