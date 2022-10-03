public class AdditionArr {
    public static void main(String args[]){
        int arr[] = {2,4,3,6,9};

        // passing array to method
        sum(arr);
    }
    public static void sum( int[] arr){

        //getting sum of array values
        int sum = 0;

        for(int i = 0; i < arr.length; i++ ){
            sum = sum+arr[i];
        }
        System.out.println("sum of array values : " +sum);
    }
}
