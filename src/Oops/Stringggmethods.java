package Oops;
import java.util.Scanner;
public class Stringggmethods {

	public static void main(String[] args) {

		
//		String s = "rishabh";
//		 String a=s.concat("Upadhyay");  //concat methods ( Rishabh Upadhyay)
//		System.out.println(a);		
//		
//		int c = s.compareTo("rishabh");    //compareto if both string is ame it return 0 if not thenreturn 1
//		System.out.println(c);		
//
//		
//		int d =s.length();   //find length of string
//		System.out.println(d);	
		
		
		
		
		
		Scanner num = new Scanner(System.in);
		
		
		int a = num.nextInt();
//		
//		int rev=0 , rem;
//		
//		while(a!=0) {
//			
//			rem = a%10;
//			rev = rev*10+rem;
//			a= a/10;
//			
//		}
//		
//		System.out.println(rev);
	
//	 if(a%2!=0) {
//		 System.out.println("odd");
//		 
//	 }else {
//		 System.out.println("even");
//	 }
//		
//		
		if(a%2==0) {
			
			 System.out.println("even");
			 
		 }else {
			 System.out.println("odd");
		 }
		
		
		
		
		
		
		
		
		Scanner sc  = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		s.toLowerCase();
		int count=0;
		
		for(int i=0; i<s.length(); i++) {
			
			char ch = s.charAt(i);
		
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
			
			count++;
		}
		}
		System.out.println(count);
		
	}

}
