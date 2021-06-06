package Array;

import java.util.Arrays;

public class MinSumAbs {
//Function to return minimized sum
    public static int minSumAbs(int[] arr, int n){
        //First we are going to sort the array element
        Arrays.sort(arr);
        // Median of the array
        int x = arr[n/2];
        int sum = 0;

        // Calculate the minimized sum
        for(int i = 0; i < n;i++){
            sum = sum+(Math.abs(arr[i]-x));
        }
        //Return the required sum
     return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        System.out.println(minSumAbs( arr,n));

    }
}


//if we take the array as odd and we take median value
//[1,2,3,4,5]
//(1-3)+(2-3)+(3-3)+(4-3)+(5-3)=2+1+0+1+2=6
//if we take the array as even and we take any as median value
//[1,2,3,4,5,6]
//(1-4)+(2-4)+(3-4)+(4-4)+(5-4)+(6-4)=3+2+1+0+1+2=9