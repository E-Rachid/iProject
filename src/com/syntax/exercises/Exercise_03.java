package com.syntax.exercises;

public class Exercise_03 {

	public static void main(String[] args) {

		
		
		int [][] numbers= { 
				{1,2,3,4,5,6,7,8,9},
				{10,11,12,13,14,15,16,17,18,19},
				{100,200,300,400,500,600,700,800,900},
				{1001,2002,3003,4004,5005,6006,7007,8008,9009},
		};
	       int sum=0;
				
				for(int[] arr:numbers ) { 
					for( int n:arr) { 
						sum +=n;
						System.out.println(sum);
						
					}
				}
				
				
				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
	}

}
