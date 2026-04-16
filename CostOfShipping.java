import java.awt.*;
import java.util.Scanner;
public class CostOfShipping {
    public static void main(String[] args){
        shippingCost();
    }
    static void shippingCost(){
        double cost = 0;
        double weight ;

        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Weight of Package in Pounds");
        weight = sc.nextDouble();

        if(weight>20){
            System.out.println("Package can't be shipped ");
        }
        else if(weight<=0){
            System.out.println("Invalid Input \n Enter Valid Weight");
        }
        else if(weight>10 && weight <=20){
            cost = 10.5;
        }
        else if(weight>3&& weight <=10){
            cost = 8.5;
        }
        else if(weight>1&& weight <=3){
            cost = 5.5;
        }
        else if(weight>0&& weight <=1) {
            cost = 3.5;
        }
        System.out.print("Cost of Shipping: $"+cost);

    }
}
