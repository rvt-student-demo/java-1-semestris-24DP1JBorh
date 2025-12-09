package rvt;
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first_num = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int second_num = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");
        int third_num = Integer.valueOf(scanner.nextLine());

        System.out.println("The average is " + (first_num + second_num + third_num) / 3.0);

        scanner.close();
    }
    
}

