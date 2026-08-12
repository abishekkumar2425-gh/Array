package com.main;

public class CanPlaceFlowers {

	public static void main(String[] args) {
		int arr[]={1,0,0,0,0,1};
		int n = 1;
		int count = 0 ;
		int size = arr.length ;
		for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                boolean left = (i == 0 || arr[i - 1] == 0);
                boolean right = (i == size - 1 || arr[i + 1] == 0);

                if (left && right) {
                    arr[i] = 1;
                    count++;
                }
            }
        }
		if(count >= n)
			System.out.println("Yes, you can place the flower");
		else
			System.out.println("Sorry , no space to place the flower");
	}

}
