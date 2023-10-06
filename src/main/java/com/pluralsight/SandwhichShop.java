package com.pluralsight;

import java.util.Scanner;

public class SandwhichShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What do you want Regular or Large? ");
        String food = scanner.nextLine();
        double foodprice = 0;
        if (food.equals("Regular")) {
            System.out.println("$" + 5.45);
            foodprice = 5.45;
        }
        else if (food.equals("Large")) {
            System.out.println("$" + 8.95);
            foodprice = 8.95;
        }

        System.out.print("whats your age?: ");
        int age = scanner.nextInt();

        if (age >= 65){
            foodprice = foodprice -(foodprice *.20);
        }
        else if (age <= 17){
            foodprice = foodprice -(foodprice *.10);
        }
        System.out.printf("Your total is $ " + "%.2f", foodprice);
    }
}