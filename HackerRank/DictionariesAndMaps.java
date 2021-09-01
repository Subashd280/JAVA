import java.util.*;

public class DictionariesAndMaps {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map <String, Integer> myMap = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            myMap.put(name, phone);
        }
        while(in.hasNext()){
    
            String name = in.next();
                if(myMap.containsKey(name)) {
                    int phone = myMap.get(name);
                    System.out.println(name + "=" + phone);
                } else System.out.println("not found");
        }
        in.close();
    } 
}
