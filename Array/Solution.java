import java.util.Scanner;

public class Solution {
    static long sum = 0;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long [] a = new long[num];
        for(int i = 0; i < num; i++){

            a[i] = sc.nextLong();

            sum+= a[i];
        }
        System.out.println(sum);
    }
}
