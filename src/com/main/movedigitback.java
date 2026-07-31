package com.main;
import java.util.*;
public class movedigitback {

		 public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
				int arr[] = {3,7,5,8,10,4,6};
				System.out.print("The initial array is :");
				System.out.println(Arrays.toString(arr));
				System.out.print("Enter the digits to move backward:");
				int movedigits = sc.nextInt();
				for(int i = 0; i<movedigits; i++) {
					int a = arr[0];
					
					for(int j=0; j<arr.length-1 ; j++) {
						arr[j]=arr[j+1];
					}
					arr[arr.length-1] = a;
				}
                sc.close();
                System.out.print("The final array is :");
                System.out.println(Arrays.toString(arr));

		 }
}
