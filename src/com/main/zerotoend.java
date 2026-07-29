package com.main;
import java.util.Arrays;
public class zerotoend {

	public static void main(String[] args) {
		int arr[] = {0,3,0,5,6};
		int pos = 0 ;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i]!=0) {
				int temp = arr[pos];
			    arr[pos] = arr[i];
				arr[i] = temp;
				pos++;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
