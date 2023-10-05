package org.example;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Prints out the price associations | Price to Delivery Fee
        // \t is something you can use to create tabbed spaces (tab key on your keyboard) it can align some things.
        System.out.println("Distance\t\tFee\n0-5 Miles\t\t$2\n6-15 Miles\t\t$5\n16-25 Miles \t$10\n26-50 Miles\t\t$15\n>50 Miles \t\t$20");
        String rice="Rice";
        double ricePrice = 5.0;
        System.out.println("Input the amount of rice you wanna buy");
        //These next two lines initiates a scanner and then reading the input value into riceAmount
        Scanner e = new Scanner(System.in);
        int riceAmount =  e.nextInt();
        // If the amount of rice is less than 1, the user isn't buying anything
        if(riceAmount<1){
            System.out.println("Invalid Amount of Rice");
            System.exit(0);
        }
        System.out.println("Input how far the delivery is");
        //You can reuse a scanner object to get different types of values, but in this instance we're using it for getting another integer
        int howFar = e.nextInt();
        double howFarPrice=0;
        //This has a checker, we're converting the miles into the delivery fee
        if(howFar<0){
            System.out.println("Invalid Price");
            System.exit(0);
        }
        else if(howFar<6 ){
            howFarPrice=2;
        }else if(howFar<16){
            howFarPrice=5;
        }else if(howFar<26){
            howFarPrice=10;
        }else if (howFar<51){
            howFarPrice=15;
        }else {
            howFarPrice=20;
        }
        double total=(riceAmount*ricePrice)+howFarPrice;
        //The string format is something you can use to bypass the "...." + variablename + "...."
        //%d is for decimal format %f is for float numbers %s is for String , you put it in place of where you wanna put it
        //Ordering matters, they will align of where you put things
        String output=String.format("Product\tQty\tPrice\tMiles\tTotal\n%s\t%d\t%.2f\t%d\t\t%.2f", rice,riceAmount,ricePrice,howFar,total);
        System.out.println(output);
    }
}