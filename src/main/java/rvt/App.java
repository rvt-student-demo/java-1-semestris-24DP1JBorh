package rvt;
import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();


        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == -1) {
                break;
            }

            if (num % 2 == 0) {
                statisticsEven.addNumber(num);
            } else {
                statisticsOdd.addNumber(num);
            }

            statistics.addNumber(num);
        }

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());

    }

}