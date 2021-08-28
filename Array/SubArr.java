public class SubArr {
     
    public static void main(String args[]){
         int arr[] = {8,-5,3,-6,-7,10};

         sub(arr);
    } 
    public static void sub(int arr[]){
        int sub = 0;

        for(int i = 0; i < arr.length; i++){
            sub = sub-arr[i];
        }
        System.out.println("elements Subtraction is : "+sub);
    }
}
