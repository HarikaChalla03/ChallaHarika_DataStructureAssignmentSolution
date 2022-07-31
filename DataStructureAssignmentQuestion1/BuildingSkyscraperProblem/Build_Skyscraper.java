package com.greatlearing.BuildingSkyscraperProblem ;
import java.util.Stack ;

class Build_Skyscraper{
	public static   Stack< Integer >  sortstack( Stack< Integer > stack )
	{
          Stack< Integer >  tmpStack  =  new  Stack< Integer >() ;
          while( !stack.isEmpty() )
          {
          // pop out the first element
          int tmp = stack.pop() ;
         
          // while temporary stack is not empty and
          // top of stack is greater than temporary
          while( !tmpStack.isEmpty() && tmpStack.peek() < tmp )
          {
          // pop from temporary stack and
          // push it to the input stack
          stack.push( tmpStack.pop() ) ;
          }
          // push temporary in temporary of stack
            tmpStack.push( tmp ) ;
          }
          return tmpStack ;
       }
}




	
	


	
			
		
	 	  

