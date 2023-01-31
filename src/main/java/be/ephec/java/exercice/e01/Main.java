package be.ephec.java.exercice.e01;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Person person = new Person();
        System.out.println("What is your first name?");
        person.firstName = keyboard.next();
        System.out.println("What is your name");
        person.lastName = keyboard.next();
        System.out.println("What is your birth year?");
        person.yearOfBirth = keyboard.nextInt();
        // J'utilise ici l'année actuelle comme int:
        person.computeAge(LocalDate.now().getYear());
        person.display();
    }
}