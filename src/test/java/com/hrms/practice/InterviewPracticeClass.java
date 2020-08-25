package com.hrms.practice;

public class InterviewPracticeClass {

	
	public static void main(String[] arg) {
		
		String all= "akdhy35562*(";
		String alls= all.replaceAll("[^A-Za-z]", "");
	
		System.out.println(alls.length());
		
		
		
		
	
		String letter = "Hello I am fine";
	String wrr="";
		String [] word=letter.split(" ");
		
		for (int x=word.length-1; x>=0; x--) {
			wrr=wrr+word[x]+" ";
		
		}System.out.println("word by word rev :: "+wrr);
		
		
		for (int w=0; w<word.length-1; w++) {
			
			System.out.print(word[w]+" ");
			
		}
		System.out.println();
		
//		for (int x=0; x<word.length; x++) {
//			wrr=wrr+word[x];
//			
//			//System.out.println(word[x]+" ");
//		}System.out.println("word by word rev"+wrr);
//		
		
		// 1. getting reversed letter
		// 2. getting reversed sentence
		
		
		String rev="";
		
		for (int i=letter.length()-1; i>=0; i--) {
			rev=rev+letter.charAt(i);
			
			
			
			
		}System.out.println("PPPPP"+rev);
		
		System.out.println("--------------------");
		
		int sum=0;
		
		for(int u=0; u<=10; u++) {
			
			//sum=sum+u;
			sum+=u;
		}
		System.out.println(sum);
		
		
		
		for (int o=20; o<50; o++) {
			
			//if (o%2==0) {
			
				if (o%2!=0) {
				
				System.out.print(o+" ");
			}
		}

		
		String n="Jawid";
		String u="Popal";
		n=n+u;
		u= n.substring(0,(n).length()-u.length());
		n=n.substring(u.length());
		System.out.println();
				System.out.println("n was Jawid:: "+n);
		System.out.println("u was Popla:: "+u);
		
}
	
		
	}

