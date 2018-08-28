package Zadania_6_9_08;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.Scanner;

public class Processing {

    static Scanner input = new Scanner(System.in);

    public static <T extends Data> void send(T email) {
        System.out.println("Your e-mail has been sent.");
    }

    public static void textEmailInput() {
        System.out.println("-Enter e-mail address:-");
        String emailAddress = input.next();
        boolean valid = EmailValidator.getInstance().isValid(emailAddress);
        if (valid == false) {
            System.out.println("Wrong e-mail address. Please try again.");
            textEmailInput();
            return;
        }
        System.out.println("-Enter e-mail title:-");
        String title = input.next();
        System.out.println("-Enter e-mail content:-");
        String content = input.next();
        System.out.println("-Press C to CONFIRM message sending:-");
        String ignition = input.next();
        if (ignition.equals("C") || ignition.equals("c")) {
            send(new TextEmail(emailAddress, title, content));
            return;
        } else {
            System.out.println("Sorry. Your e-mail has not been sent.");
        }
    }

    public static void inMenu() {

        while (true) {

            System.out.println("===============Choose an option from the list:=====================");
            System.out.println("1. Send a text e-mail.");
            System.out.println("2. Back to main menu.");

            int nav = input.nextInt();

            if (nav != 2) {

                switch (nav) {
                    case 1:
                        textEmailInput();
                        break;
                }
            } else
                break;
        }
    }

    public static void mainMenu() {

        while (true) {

            System.out.println("===============Welcome to *SEND A MESSAGE* programme===============");
            System.out.println("1. Send a message.");
            System.out.println("2. Exit programme.");

            int nav = input.nextInt();

            if (nav != 2) {

                switch (nav) {

                    case 1:
                        inMenu();
                        break;
                }
            } else {
                System.out.println("Thank you. See you next time.");
                System.out.println();
                break;
            }
        }
    }
}
