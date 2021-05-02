public class SumNatural{
    public static void main(String args[]){
        //here n means num
        //how to sum of n numbers
        //1 + 2+ ......+ n numbers
        int sum = 0,num =100;
        
        for(int i = 1; i <= num; ++i)
        {
          // sum = sum + i;
          sum += i;
        }
        System.out.println("sum = " + sum);
    }
}