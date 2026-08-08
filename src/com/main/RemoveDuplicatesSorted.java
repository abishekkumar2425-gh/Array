package com.main;

import java.util.Arrays;

public class RemoveDuplicatesSorted {

	public static void main(String[] args) {
		int arr[] = {0,0,1,1,1,,2,3,4,4,4,5,5,6};
		int i = 0, j = 1, k = 1;
        while(j < arr.length){
        	if(arr[i] == arr[j]) {
        		j++;
        	}
        	else {
        		i++;
        		int temp = arr[i];
        		arr[i] = arr[j];
        		arr[j] = temp;
        		k++;
        		j++;
        		
        	}
        }
        System.out.println(Arrays.toString(Arrays.copyOf(arr,k)));

	}

}
