/*
12. Implement a function to find the minimum number of steps required to reach the end of an array of non-negative integers, where each element of the array represents the maximum number of steps that can be taken forward from that position. 
Example: Input: nums = [2,3,1,1,4] Output: 2
*/
import java.io.*;
import java.util.*;
 
class solution {
    static int minJumps(int arr[], int l, int h)
    {
        if (h == l)
            return 0;
            return Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = l + 1; i <= h && i <= l + arr[l];
             i++) {
            int jumps = minJumps(arr, i, h);
            if (jumps != Integer.MAX_VALUE
                && jumps + 1 < min)
                min = jumps + 1;
        }
        return min;
    }
