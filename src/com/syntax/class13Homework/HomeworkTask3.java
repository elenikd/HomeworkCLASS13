package com.syntax.class13Homework;

public class HomeworkTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Create a String and print it in reverse order 
		 * (Sunday → yadnuS).
		 * 
		 * 
		 */
				
				
				String reverse= "Sunday";
				String reverseorder="  ";
			
				for(int i=reverse.length()-1; i>=0; i--) {
					reverseorder = reverseorder + reverse.charAt(i);
				}
				System.out.print("The reversed string of the '" +reverse+ "'is:");
			    System.out.print(reverseorder);
			}
		
	}


