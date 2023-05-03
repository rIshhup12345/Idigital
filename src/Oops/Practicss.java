package Oops;

import java.util.Scanner;

public class Practicss {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s= sc.nextLine();
		
		
		s= s.toLowerCase();
		
		int count=0;
		
		for(int i=0; i<s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ) {
				count++;
		}
		
		}
			System.out.println(count);
		
		
			
			int a[]= {1,2,3,4,5,6,7,9};
			
			for(int i=0; i<a.length; i++) {
				if(a[i]%2==0) {
					System.out.println(a[i]);
				}
				
				
				
			}
			System.out.println("evev");
			
			
			for(int i=0; i<a.length; i++) {
				
				if(a[i]%2!=0) {
					System.out.println(a[i]);
				}
			}
			
			
			System.out.println("odd");
			
		
	}}	
		
		
		//String s,rev = " ";
		
//		Scanner sc = new Scanner(System.in);
		
//		 s = sc.nextLine();
		
//		int leng = s.length();
//		
//		for(int i=leng-1; i>=0; i--) {
//			
//			rev = rev+s.charAt(i);
//		
//		}
//		
//		System.out.println(rev);		
//	

	
//     int num, count=0;
//		
//		Scanner sc = new Scanner(System.in);
//		num = sc.nextInt();
//		
//		for(int i=2; i<num; i++) {
//			if(num%i==0) {
//				count++;
//				break;
//			}
//		}
//
//		if(count==0) {
//			System.out.println("Prime number");
//		}
//		else {System.out.println("not prime number");
//		
//	}


