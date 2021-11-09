package com.syntax.class13Homework;

import java.util.Scanner;

public class HomeworkTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* Write a program that reads two people's 
		 * first names and if they expecting boy or girl? 
		 * Based on the input suggests a name for a baby:
		 * 
		 * Example Output: Mom’s first name? Mary
		 * Dad’s first name? Daniel
		 * Boy or Girl? boy
		 * Suggested baby name: DANRY
		 *  
		 *  
		 * Example Output:
		   Mom’s first name? Mary
		   Dad’s first name? Daniel
		   Boy or Girl? girl
		   Suggested baby name: MAIEL
		 */
		
	    Scanner scan=new Scanner(System.in);
	    System.out.println("What is your Mom's first name? ");
	    
	    String MomsFirstName=scan.next();
	    System.out.println("What is your Dad's first name? "); 
	    String DadsFirstName=scan.next();
	    System.out.println("Who are they planing to have boy or girl? ");
	    String planingToHaveBoyOrGirl=scan.next();
	    System.out.println("Did they come up with a name for their baby? ");
	    String boyFirstName=scan.next();
	    
	   if(planingToHaveBoyOrGirl.equals("boy")) {
		   System.out.println(DadsFirstName.toUpperCase().substring(0,10) +MomsFirstName.toUpperCase().substring(6));
		   
	   }else {
		   planingToHaveBoyOrGirl.equals("girl");
		   System.out.println(MomsFirstName.toUpperCase().substring(0,4) +DadsFirstName.substring(5));
		   
	   }
	   
		   
		   
	   }
	   
	    
	}


