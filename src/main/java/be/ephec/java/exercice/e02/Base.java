package be.ephec.java.exercice.e02;

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {

     BaseNested.display();

    }

    //E02 -> BASE (J'ai créé une classe Base nested statique):
    static class BaseNested {
        static Scanner keyboard = new Scanner(System.in);
        static int base = 1;
        static String number = "a";
        public static void display(){
            while(base !=0 && !number.equals("0"))
            {
                do{System.out.println("Base should be higher than " + Character.MIN_RADIX
                        + " and lower than " + Character.MAX_RADIX + ".\nPlease type in the base (radix).\nor type 0 to exit.");
                    base = keyboard.nextInt();}
                while(base !=0 && (base < Character.MIN_RADIX || base>Character.MAX_RADIX));
                System.out.println("Please type in the number.\n Type 0 again to exit.");
                number = keyboard.next();


                if(Integer.parseInt(number) !=0){
                    //TRY CATCH not working!!! Why?
                    try{
                        System.out.println("Number " + number + " in base " + base + " is: "+ Integer.parseInt(number, base) + ".\n");
                    } catch(NumberFormatException e){
                        System.out.println("Cannot convert string containing letters.");
                    }

                } else {
                    System.out.println("Exit.");
                }

            }
        }
    }

}
