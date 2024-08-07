/*We define the following:

A subarray of an n-element array is an array composed from a contiguous block of the original array's elements. 
For example, if array = [1,2,3], then the subarrays are [1], [2], [3], [1,2], [2,3], and [1,2,3]. 
Something like [1,3] would not be a subarray as it's not a contiguous subsection of the original array.
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.
Given an array of  integers, find and print its number of negative subarrays on a new line.

Input Format

The first line contains a single integer,n , denoting the length of array A = [a0, a1,..., an-1].
The second line contains n space-separated integers describing each respective element, ai, in array A.

Constraints
1 <= n <= 100
-104 <= ai <= 10^4

Output Format

Print the number of subarrays of A having negative sums. */


import java.io.*;
import java.util.*;

public class JavaSubarray {
    
    public static int subarray(int n, int[] array){
        int count = 0;
        for(int i = 0; i < n;i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += array[j];
               if(sum < 0){
                   count++; }
            }
        }
        return count;
    }

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       int[] array = new int[n];
       for (int i = 0; i < array.length; i++) {
           array[i]=scan.nextInt();
       }
      int count = subarray(n, array);
        System.out.println(count);
}
}
