package com.greatlearing.BuildingSkyscraperProblem;

public class Sample {
	
	static int countFloors(int array[], int n ) {
		int count =1;
	
		int curr_max = array[0];
		
		for(int i=1; i<n; i++) {
			if(array[i]>curr_max || array[i]== curr_max) {
				count++;
				curr_max =array[i];
			}
		}
		return count;
	}
	
		public static void main(String []args) {
	    int array[]= {7, 4, 8, 2, 9};
		System.out.println(countFloors(array, array.length));
	
	}
}


	
		     


