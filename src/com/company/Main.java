package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceUp20 = Double.parseDouble(scanner.nextLine());
        double kilogramBag = Double.parseDouble(scanner.nextLine());
        int dayToTraveling=Integer.parseInt(scanner.nextLine());
        int countBag=Integer.parseInt(scanner.nextLine());
        double totalPrice=0;

        if(kilogramBag<10){
            totalPrice=priceUp20 * 0.20;

            if(dayToTraveling > 30){
                totalPrice=totalPrice * 1.10;
            }
            else  if(dayToTraveling <= 30 && dayToTraveling>=7){
                totalPrice=totalPrice * 1.15;
            }
            else {
                totalPrice = totalPrice*1.40;
            }
            totalPrice = totalPrice * countBag;
        }
        else if(kilogramBag >= 10 && kilogramBag <= 20){

            totalPrice = priceUp20 / 2;

            if(dayToTraveling > 30){
                totalPrice = totalPrice * 1.10;
            }
            else  if(dayToTraveling <= 30 && dayToTraveling>=7){
                totalPrice = totalPrice * 1.15;
            }
            else {
                totalPrice = totalPrice*1.40;
            }
             totalPrice = totalPrice * countBag;
        }
        else {

            totalPrice=priceUp20;

            if(dayToTraveling > 30){
                totalPrice=totalPrice * 1.10;
            }
            else  if(dayToTraveling <= 30 && dayToTraveling >= 7){
                totalPrice=totalPrice * 1.15;
            }
            else {
                totalPrice = totalPrice*1.40;
            }

            totalPrice = totalPrice * countBag;
        }

          System.out.printf("The total price of bags is: %.2f lv.",totalPrice);
    }
}
