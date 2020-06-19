package pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class min_max_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] nums = new long[5];

        long max = 0, min= 0 , sum =0;
        nums[0] = max = min = sum = in.nextLong();


        for (int i = 1; i < 5; i++)
        {
            nums[i] = in.nextLong();
            if(nums[i]>max)
                max = nums[i];
            if(nums[i]<min)
                min = nums[i];
            sum += nums[i];
        }
        System.out.println( (sum - max) + " " + (sum - min));

    }
}
