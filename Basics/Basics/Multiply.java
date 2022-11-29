package Basics.Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiply{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i = 1; i <= 10; i++)
            System.out.printf("%d*%d = %d",n,i,n*i);
        bufferedReader.close();
    }
}