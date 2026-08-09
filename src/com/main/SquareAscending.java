package com.main;

import java.util.Arrays;

public class SquareAscending {

	public static void main(String[] args) {
		int arr[] = {-4,-3,-2,0,1,4,6,7};
		int i = 0, j = arr.length-1, k = arr.length-1;
		int arrf[]= new int [arr.length];
        while(k >= 0){
        	int a = (arr[j])*(arr[j]);
        	int b = (arr[i])*(arr[i]);
        	if(a > b) {
        		arrf[k]=a;
        		j--;
        		k--;
        	}
        	else {
        		arrf[k]=b;
        		i++;
        		k--;
        	}
        }
        System.out.println(Arrays.toString(arrf));

	}

}
