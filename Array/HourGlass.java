package Array;

public class HourGlass {
    static int R = 5;
    static int c = 5;

    static int findMaxSum(int [][]mat){
      if(R < 3 || c < 3)
          return -1;

      int max_sum = Integer.MIN_VALUE;
      for(int i = 0; i < R - 2; i++){
          for( int j = 0; j < c -2; j++){
              int sum = (mat[i][j] + mat[i][j+1] + mat[i][j+2] + mat[i+1][j+1] + mat[i+2][j] + mat[i+2][j+1] + mat[i+2][j+2]);
              max_sum = Math.max(max_sum, sum);
          }
      }
      return max_sum;
    }

    public static void main(String[] args) {
           int [][]mat = {{1,2,3,0,0},
                          {0,0,0,0,0},
                          {2,1,4,0,0},
                          {0,0,0,0,0},
                          {1,1,0,1,0}};
           int res = findMaxSum(mat);
           if(res == -1){
               System.out.println("not possible");
           }else{
               System.out.println("Maximum sum of hour glass ="+res);
           }
    }
}
