package com.main;

public class Monotic {

	public static void main(String[] args) {
		int nums[]={5,4,3,2};
		System.out.println(isMonotic(nums));}
    public static boolean isMonotic(int arr[]){
		boolean isInc = true ;
		boolean isDec = true ;
		for(int i = 0 ; i < arr.length-1 ; i++) {
			if(arr[i]>arr[i+1]){
				isInc = false;
			}
			if(arr[i]<arr[i+1]){
				isDec = false;
			}
			if(!isInc && !isDec) {
				return false;
			}
		}
		return isInc || isDec ;
	  }
}


