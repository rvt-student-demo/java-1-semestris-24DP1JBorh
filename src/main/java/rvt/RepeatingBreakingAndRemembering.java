package rvt;
import java.util.Scanner;
public class RepeatingBreakingAndRemembering {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int counter = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Give numbers:");

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == -1) {
                break;
            }

            sum += num;
            counter++;

            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + ((double)sum / counter));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        scanner.close();
    }
}
