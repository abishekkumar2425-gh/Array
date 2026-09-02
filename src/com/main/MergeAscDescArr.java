package com.main;

import java.util.Arrays;

public class MergeAscDescArr {
	public static int[] merged(int arr1[],int arr2[]) {
		int result[]= new int[arr1.length +arr2.length];
		int i = 0;
		int j = arr2.length-1;
		int k = 0;
		while(k < result.length) {
			if(i >= arr1.length) {
				result[k] = arr2[j];
				j--;
			}
			else if(j < 0) {
				result[k] = arr1[i];
				i++;
			}
			else if(arr1[i]<arr2[j]) {
				result[k] = arr1[i];
				i++;
			}
			else {
				result[k]= arr2[j];
				j--;
			}
			k++;
			
		}
		
		return result;
	}

	public static void main(String[] args) {
		int arr1[] = {2,5,7,10,12,14};
		int arr2[] = {15,13,11,9,6,3,1};
		int res[]=merged(arr1,arr2);
		System.out.println(Arrays.toString(res));

	}

}
