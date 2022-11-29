package Basics.Basics;

public class Encrypt {
    public static void main(String[] args) {
        int key = 2;
        String  text ="Hey whatsup man";
        System.out.println(text);
        char[] chars = text.toCharArray();
        for(char c : chars){
            c += key;
            System.out.print(c);
        }
    }
}
