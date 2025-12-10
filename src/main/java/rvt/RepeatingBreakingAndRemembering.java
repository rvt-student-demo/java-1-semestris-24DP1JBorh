package rvt;
import java.util.Scanner;
public class RepeatingBreakingAndRemembering {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers: ");

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == -1) {
                break;
            }

        }

        System.out.println("Thx! Bye!");
    }
}
