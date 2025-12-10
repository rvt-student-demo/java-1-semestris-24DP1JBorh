package rvt;
import java.util.Scanner;

public class Swap {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        System.out.println("Give two indices to swap:");
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        System.out.println();
        
        int helper = numbers[first];
        numbers[first] = numbers[second];
        numbers[second] = helper;

        for (int index = 0; index < 5; index++) {
            System.out.println(numbers[index]);
        }
    }
}
