package com.main;
import java.util.*;
public class longestconsecutive {
      public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array : ");
		int n = sc.nextInt();
		int arr [] = new int[n];
		System.out.print("Enter the elements of the array : ");
		
		for(int i=0; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("The longest consecutive length is : ");
		System.out.println(funlongestConsecutive(arr));
		sc.close();

	}
      public static int funlongestConsecutive(int[] nums) {

          if (nums.length == 0)
              return 0;
          Arrays.sort(nums);
          int count = 1;
          int max = 1;
          for (int i = 1; i < nums.length; i++) {
              // Skip duplicates
              if (nums[i] == nums[i - 1]) {
                  continue;
              }
              // Consecutive number
              if (nums[i] == nums[i - 1] + 1) {
                  count++;
              }
              // Sequence broken
              else {
                  max = Math.max(max, count);
                  count = 1;
              }
          }
          max = Math.max(max, count);
          return max;
      }

}
