package Basics;
//to check command line arguments
public class Hello {
    public static void main(String[] args) {
        //to check whether the arguments length is greater than 0
        if(args.length > 0){
            System.out.println("the given command line"+"arguments are");
            for(String val:args)
                System.out.println(val);
        }else {
            System.out.println("Command line"+"arguments not Found");
        }
    }
}
