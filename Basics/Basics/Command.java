package Basics.Basics;

public class Command {
    // java 1 2 3
    //we want to run program through command prompt
    //we can run this through IDE but we cannot get output
    public static void main(String[] args) {
        for(String elem :args){
            System.out.println(elem);
        }
    }
}
