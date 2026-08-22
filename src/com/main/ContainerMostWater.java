package com.main;
public class ContainerMostWater {
    public static int storeWater(int arr[]) {
    	int maxWater = 0;
    	int le = 0;
    	int ri = arr.length-1;
    	while(le < ri) {
    		int ht = Math.min(arr[le],arr[ri]);
    		int wd = ri - le;
    		int currWater = ht * wd;
    		maxWater = Math.max(maxWater, currWater);
    		if(arr[le]<arr[ri]) {
    			le++;
    		}
    		else {
    			ri--;
    		}
    	}
    	return maxWater;
    }
	public static void main(String[] args) {
		int[] arr = {1,8,6,2,5,4,8,7};
        System.out.println(storeWater(arr));
	}

}
