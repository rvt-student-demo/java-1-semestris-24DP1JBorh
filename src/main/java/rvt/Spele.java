package rvt;
import java.util.Scanner;
import java.util.Random;

public class Spele {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int attempts = 3;
        int num = random.nextInt(10) + 1;

        System.out.println("Es domaju par skaitli no 1 lidz 10.\nTev tas jauzmin tris meginajumos.");
        System.out.println("Ievadi minejumu:");

        while (attempts != 0) {
            
            int guess = Integer.valueOf(scanner.nextLine());
            if (guess == num) {
                System.out.println("PAREIZI!\nTu esi uzvarejis speli.");
                break;
            }

            System.out.println("nepareizi");
            attempts--;

        }

        if (attempts == 0) {
            System.out.println("Pareizais skaitlis bija " + num + ".\nTu esi zaudejis speli.");
        }

        scanner.close();
    }
}
