package com.greatlearing.BuildingSkyscraperProblem;

import java.util.Scanner;
import java.util.Stack;

public class DriverClass{
	
      public static void main( String[] args ) {
              try ( Scanner sc = new Scanner( System.in ) ) 
		        {
			  System.out.print( " Enter the total number of floors in the building " ) ;
				int number = sc.nextInt() ;
			        @SuppressWarnings( "unused" )
				int[] array = new int[number] ;
	                        Stack < Integer >  stack  =  new  Stack< Integer >();
				
		          System.out.println( " Enter the size of floors given on day1: " );
				int day1 = sc.nextInt() ; 
				stack.push( day1 ) ;
				System.out.println( " Enter the size of floors given on day2: " ) ;
				int day2 = sc.nextInt() ; 
				stack.push( day2 ) ;
				System.out.println( " Enter the size of floors given on day3: " );
				int day3 = sc.nextInt() ; 
				stack.push( day3 ) ;
				System.out.println( " Enter the size of floors given on day4: " ) ;
				int day4 = sc.nextInt() ; 
				stack.push( day4 ) ;
				System.out.println( " Enter the size of floors given on day5: " ) ;
				int day5 = sc.nextInt() ; 
				stack.push( day5 ) ;
				        
	                  System.out.println( " The order of construction is as follows " ) ;
	                
	                        if( stack.peek() < day1 ) 
	                        stack.pop() ;
	                        stack.pop() ;
	                        stack.pop() ;
	                        System.out.println( " day1 : ") ;
	                        System.out.println( " day2 : ") ;
	                        System.out.println( Build_Skyscraper.sortstack(stack) );
	                        System.out.println( " day3 : " ) ;
	                        System.out.println( " day4 : ") ;
	                        System.out.println( " day5 : ") ;
	                        stack.push( day3 ) ;
	                        stack.push( day4 ) ;
	                        stack.push( day5 ) ;
	                        System.out.println(Build_Skyscraper.sortstack(stack) ) ;
	                       }
	             }
}
		
				  
				 
	

			
			         

			    
