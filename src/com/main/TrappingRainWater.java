package com.main;
public class TrappingRainWater {
    public static int trapping(int arr[]) {
    	int l = 0;
    	int r = arr.length - 1;
    	int lmax = 0,rmax = 0,ans = 0;
    	while(l<r) {
    		lmax=Math.max(lmax,arr[l]);
    		rmax=Math.max(rmax,arr[r]);
    		if(lmax < rmax) {
    			ans += (lmax - arr[l]);
    			l++;
    		}
    		else {
    			ans += (rmax - arr[r]);
    			r--;
    		}
    	}
    	return ans;
    }
	public static void main(String[] args) {
	   int arr[] = {5,1,3,1,2,5};
	   System.out.println(trapping(arr));

	}

}
