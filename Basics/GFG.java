package Basics;

import java.util.*;

class GFG{
    static int xorPairCount(int arr[],int n,int x){
        int result =0;

        //create empty set that stores the visiting
        // element of array.
        HashSet<Integer> s= new HashSet<Integer>();

        for (int i = 0; i < n; i++){
            if(s.contains(x ^ arr[i]) && (x ^ arr[i]) == (int) s.toArray()[s.size() - 1])
            {
                result++;
            }
            s.add(arr[i]);
        }
        return result;
    }
    public static void main(String[] args){
        int arr[] = {5,4,10,15,7,6,2};
        int n = arr.length;
        int x = 5;
        System.out.print("Count of pairs of with given XOR = "
        + xorPairCount(arr, n,x));
    }
}