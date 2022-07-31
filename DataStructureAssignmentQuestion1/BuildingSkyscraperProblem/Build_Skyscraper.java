package com.greatlearing.BuildingSkyscraperProblem;

import java.util.Scanner;
import java.util.Stack;

public class Build_Skyscraper{
    int number=5;
	int current_pointer;
	int array[]= new int[number];
	
	Build_Skyscraper() {
		current_pointer = -1;
	}
	boolean push(int x) {
		if(current_pointer >= (number-1)) {
			System.out.println("Stack overflow");
			return false;
		}
		else {
			array[++current_pointer]= x;
			System.out.println(x);
	
			return true;
		}
	}
	
	int pop() {
		if(current_pointer <0) {
			System.out.println("stack underflow");
			return 0;
		}
		else {
			int x = array[current_pointer--];
			return x;
		}
	}
	
 
	public static void PrintStack(Stack<Integer> stack) 
	{ 
	      
	    // If stack is empty 
	    if (stack.empty()) 
	        return; 
	    
	    // Extract top of the stack 
	    int x = stack.peek(); 
	    
	    // Pop the top element 
	    stack.pop(); 
	    
	    // Print the current top 
	    // of the stack i.e., x 
	    System.out.print(x + " ");
	    
	    // Proceed to print 
	    // remaining stack 
	    PrintStack(stack); 
	    
	    // Push the element back 
	    stack.push(x); 
	} 
 
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
	    	System.out.print("Enter the total number of floors in the building");
			int number = sc.nextInt();
	        @SuppressWarnings("unused")
			int[] array = new int[number];
            Stack<Integer> stack = new Stack<Integer>();
				 System.out.println("Enter the size of floors given on day1:");
				 int day1 = sc.nextInt(); 
				 stack.push(day1);
		         System.out.println("Enter the size of floors given on day2:");
		         int day2 = sc.nextInt(); 
		         stack.push(day2);
		         System.out.println("Enter the size of floors given on day3:");
		         int day3 = sc.nextInt(); 
		         stack.push(day3);
		         System.out.println("Enter the size of floors given on day4:");
		         int day4 = sc.nextInt(); 
		         stack.push(day4);
		         System.out.println("Enter the size of floors given on day5:");
		         int day5 = sc.nextInt(); 
		         stack.push(day5);
		        
              System.out.println("The order of construction is as follows");
              System.out.println("day1 :") ;
              System.out.println(stack.pop());
             
                            
              System.out.println("day2 :") ;
	          System.out.println("day3 :") ;
	          System.out.println(stack.push(6));
	          System.out.println("day4 :") ;
	          System.out.println("day5 :") ;
              
	      }
}
}

	
	


	
			
		
	 	  

