package rvt;

public class AdvancedAstrology {
    
    public static void printSpaces(int number) {
        
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }    

    }

    public static void printStars(int number) {

        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 0; i < size; i++) {
            printSpaces(size - i - 1);
            printStars(i + 1);
            System.out.println();
        }
    }

    public static void christmasTree(int height) {
        for (int i = 0; i < height; i++) {
            printSpaces(height - i - 1);
            printStars(2 * i + 1);
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(4);
        christmasTree(10);
        christmasTree(4);

    }
}