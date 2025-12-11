package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();


        while (true) { 
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.equals(""))
                break;

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int publication_year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, publication_year));
        }

        System.out.print("What information will be printed? ");
        String information = scanner.nextLine();

        if (information.equals("everything")) {
            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i));
            }
        } else if (information.equals("title")) {
            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i).title);
            }
        }
    }
}
