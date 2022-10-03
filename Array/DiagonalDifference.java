import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int n;
        n= s.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
        	for(int j=0;j<n;j++){
        		a[i][j]=s.nextInt();
        	}
        }
        int pd=0,npd=0;
        for(int i=0;i<n;i++){
        	for(int j=0;j<n;j++){
        		if(j==i)
        			pd=pd+a[i][j];
        	}
        }
        for(int i=0;i<n;i++){
        	for(int j=0;j<n;j++){
        		if(i==n-j-1){
        			npd=npd+a[i][j];
        		}
        	}
        }
        int dif=npd-pd;
        dif=Math.abs(dif);
        System.out.println(dif);
    }
}
