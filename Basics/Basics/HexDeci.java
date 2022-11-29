package Basics.Basics;
import java.util.Scanner;

class HexDeci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int count = 0;

            int l = sc.nextInt();

            int r = sc.nextInt();

            for(int j = l; j <= r; j++){

                if(gcd(j,func(j))>1)

                count++;
            }
            System.out.println(count);
        }
        
    }

    public static int gcd(int x, int sum) {
        if(sum == 0){
            return x;
        }else{
            return gcd(sum, x%sum);
        }

    }

    public static int func(int num){
        String str = Integer.toHexString(num);

        int sum = 0;

        for(int i = 0; i<str.length(); i++) {
            if(Character.isLetter((str.charAt(i)))){
                sum = sum + Integer.parseInt(String.valueOf(str.charAt(i)),16);
            } else {
                sum = sum + Character.getNumericValue(str.charAt(i));
            }
        }
        return sum;
    }
}