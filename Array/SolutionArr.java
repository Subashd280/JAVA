import java.util.Scanner;

public class SolutionArr {
    static long sum = 0;
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
        int Total = num.nextInt();
        long [] a = new long[Total];
        for(int i = 0; i < Total; i++){
            a[i] = num.nextLong();

            sum = sum+a[i];
        }
        System.out.println(sum);
    }
}
