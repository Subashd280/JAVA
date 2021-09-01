import java.util.Scanner;


public class Factorial {
    public static int factorial(int n){
        return (n > 1) ? n * factorial( n - 1 ) : 1;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(factorial(n));
    }
}


//another type of method we can read read input using bufferedReader method
// { BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//     BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//     int n = Integer.parseInt(bufferedReader.readLine().trim());

//     int result = Result.factorial(n);

//     bufferedWriter.write(String.valueOf(result));
//     bufferedWriter.newLine();

//     bufferedReader.close();
//     bufferedWriter.close();}
