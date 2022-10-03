import java.util.*;

public class Wordcount {
    public static void main(String args[]){
        int vCount=0, cCount=0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        str = str.toLowerCase();
        for (int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vCount++;
                return;
            }else if(str.charAt(i) >= 'a'&&str.charAt(i)<='z'){
                cCount++;
            }
        }
        System.out.println("Number of the Vowels: "+vCount);
        System.out.println("Number of the Consonants: "+cCount);
    }
}