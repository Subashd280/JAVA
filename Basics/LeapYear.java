package Basics;

class LeapYear{
    public static void main(String args[]){
        int year = 1500;
        boolean leap = false;
        //to check whether the given number is leap year or not
        if( year % 4 == 0)
        System.out.println("This year is an leap year:" +year);
        else
        System.out.println("This year is not an leap year:" +year);

        //to check whether the century years are leap year or not
        if(year % 400 == 0)
        System.out.println("This century year is an leap year:" +year);
        else
        System.out.println("This century year is not an leap year:" +year);
    }
}