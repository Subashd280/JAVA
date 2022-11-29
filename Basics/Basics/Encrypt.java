package Basics.Basics;

public class Encrypt {
    public static void main(String[] args) {
        int key = 2;
        String  text ="jg{\"K\"co\"fqkpi\"ygnn";
        System.out.println(text);
        char[] chars = text.toCharArray();
        for(char c : chars){
            c -= key;
            System.out.print(c);
        }
    }
}
