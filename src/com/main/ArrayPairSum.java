package com.main;
import java.util.*;
public class ArrayPairSum {

	public static void main(String[] args) {
		int[] nums = {1,4,3,6,7,8,2,9};

        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        System.out.println(sum);

	}

}
