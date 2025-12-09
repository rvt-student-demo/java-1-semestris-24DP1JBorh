package rvt;
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        
        int first_num = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        
        int second_num = Integer.valueOf(scanner.nextLine());
        
        System.out.println(first_num + " + " + second_num + " = " + (first_num + second_num));

        scanner.close();
    }
}