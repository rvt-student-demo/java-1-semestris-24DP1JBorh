package rvt;
import java.util.Scanner;

public class Delikatese {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadi preci: ");
        String prece = scanner.nextLine();

        System.out.print("Ievadi cenu: ");
        double cena = Double.valueOf(scanner.nextLine());

        System.out.print("Ekspress piegāde (0==nē, 1==jā): ");
        int ekspress = Integer.valueOf(scanner.nextLine());

        double piegade = 0;

        if (ekspress == 1) {
            piegade += 3;
        }
        if (cena < 10) {
            piegade += 2;
        }

        System.out.println("\nRekins:");
        System.out.println("  " + prece + "\t" + cena);
        System.out.println("  " + "piegade\t" + piegade);
        System.out.println("  " + "kopa\t\t" + (cena + piegade));

        scanner.close();
    }
}
