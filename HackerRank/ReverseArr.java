import java.util.*;

public class ReverseArr {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int [] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = s.nextInt();
        }
        s.close(); 
        for(int i = N -1; i > -1; i--){
            System.out.print(A[i] + " ");
        }  
    }
}
