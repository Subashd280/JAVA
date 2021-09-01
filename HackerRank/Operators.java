import java.util.*;


class Operators{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double meal_cost = sc.nextDouble();
        int tip_percent = sc.nextInt();
        int tax_percent = sc.nextInt();
        
        double tip = meal_cost * tip_percent/100;
        double tax = meal_cost * tax_percent/100;
        double total = meal_cost + tip + tax;
        
        int totalcost = (int)Math.round(total);
        
        System.out.println(totalcost);
        sc.close();
    }
}
