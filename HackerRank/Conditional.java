import java.io.*;

public class Conditional  {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        String ans = "";
        
        if( N%2 == 1 ){
            ans="Weird";
        }    else {
               if( N > 2 && N <= 5 ){
                   ans = "Not Weird";
               }
               if( N > 5 && N <= 20 ) {
                   ans = "Weird";
               } else {
                   ans = "Not Weird";
               }
        }
        System.out.println(ans);
        bufferedReader.close();
    }
}
