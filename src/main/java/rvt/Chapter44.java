package rvt;

import java.util.Scanner;

public class Chapter44 {
    
    public static void main(String[] args) {
    }

    public static void ex1() {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Write a name: ");

            String[] names = scanner.nextLine().trim().split(" ");

            if (names.length != 2) {
                System.out.println("Invalid name, please write again");

                continue;
            }

            System.out.println(names[0] + " " + names[1].toUpperCase());
            break;
        
        }

        scanner.close();
    }

    public static void ex2() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String message = scanner.nextLine();
        System.out.println();

        for (int i = 0; i < message.length(); i++) {
            System.out.println(message.charAt(i));
        }

        scanner.close();

    }

    public static void ex3() {
        
        Scanner scanner = new Scanner(System.in);

        String[] female = {"Amy", "Buffy", "Cathy"};
        String[] male = {"Elroy", "Fred", "Graham"};
        
        
        while (true) {
            System.out.println("\nEnter a name:");
            String name = scanner.nextLine();

            if (name.equals("")) {
                break;
            }

            for (int i = 0; i < female.length; i++) {

                if (name.startsWith(female[i])) {
                    System.out.println("Ms. " + name);
                    break;
                }

                if (name.startsWith(male[i])) {
                    System.out.println("Mr. " + name);
                    break;
                }

                if (i == 2) {
                    System.out.println(name);
                }
            }
        scanner.close(); 
        }
    }
    
    public static void ex4() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cook time-> ");
        int time = Integer.valueOf(scanner.nextLine());

        System.out.println("Your time-> " + time / 100 + ":" + time % 100);

        scanner.close();
    
    }
}



