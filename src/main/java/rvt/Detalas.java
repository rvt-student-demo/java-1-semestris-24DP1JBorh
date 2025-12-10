package rvt;
import java.util.Scanner;

public class Detalas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int price_skruvi = 5;
        final int price_uzgriezni = 3;
        final int price_paplaksni = 1;

        System.out.println("skruvju skaits:");
        int skruvi = Integer.valueOf(scanner.nextLine());

        System.out.println("uzgrieznu skaits:");
        int uzgriezni = Integer.valueOf(scanner.nextLine());

        System.out.println("paplaksnu skaits:");
        int paplaksni = Integer.valueOf(scanner.nextLine());

        if (uzgriezni < skruvi) {
            System.out.println("Parbaudi pasutijumu: par maz uzgrieznu");
        } 
        if (paplaksni < skruvi * 2) {
            System.out.println("Parbaudi pasutijumu: par maz paplaksnu");
        }

        if (uzgriezni >= skruvi && paplaksni >= skruvi * 2) {
            System.out.println("Pasutijuma ir kartiba");
        }
        
        System.out.println("Kopeja cena: " + (price_skruvi * skruvi + price_uzgriezni * uzgriezni + price_paplaksni * paplaksni));

        scanner.close();
    }
    
}
