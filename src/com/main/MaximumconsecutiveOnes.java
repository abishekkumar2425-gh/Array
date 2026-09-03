package com.main;


public class MaximumconsecutiveOnes {

	public static void main(String[] args) {
		int arr[] = {1,1,0,0,1,0,1,1,0,1,1};
		int c = 0, maxc = 0;
        for( int i = 0 ; i < arr.length ; i++){
        	if(arr[i]==1) {
        	   c++;
        	   maxc = Math.max(c,maxc);
        	}
        	else {
        		c = 0;
        		
        	}
        }
        System.out.println(maxc);


	}

}
