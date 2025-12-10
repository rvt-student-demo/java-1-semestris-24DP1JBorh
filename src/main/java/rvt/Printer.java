package rvt;

public class Printer {
    
    public static void main(String[] args) {
        
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {

        for (int index = 0; index < array.length; index++) {
            for (int i = 0; i < array[index]; i++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
