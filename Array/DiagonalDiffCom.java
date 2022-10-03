public class DiagonalDiffCom {

    public static int difference(int arr[][], int n){
        //Initialize sums of diagonals
        int d1 = 0, d2 = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){

                //for primary diagonals
                if(i == j){
                    d1 = d1+arr[i][j];
                }

                //for secondary diagonals
                if(i == n-j-1){
                    d2 = d2 + arr[i][j];
                }
            }
        }
        return Math.abs(d1-d2);
    }
    public static void main(String args[]){
       int n = 3;
       int arr[][] = {
           {2,6,8},
           {1,13,4},
           {10,8,-16}
       };
       System.out.println(difference(arr, n));
    }
}


