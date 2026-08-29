package com.main;
import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 5,2,7,3,9,8};
		System.out.println("Unsorted Array : " + Arrays.toString(arr)); 
		for(int i = 0; i < arr.length - 1 ; i++) {
			int minPos = i;
			for(int j = i + 1 ; j < arr.length ; j++) {
				if(arr[j] < arr[minPos]) {
					minPos = j;
 				}
			}
			int temp = arr[i];
			arr[i] = arr[minPos];
			arr[minPos] = temp;
		}
		System.out.println("Sorted Array : " + Arrays.toString(arr));
	}

}
