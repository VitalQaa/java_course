package hw1;

public class Task1 {
    public static void main(String[] args) {
        int start = 1000;
        int end = 1;
        int step = 2;

        // for loop
        for (int i = start; i > end; i -= step) {
            System.out.print(i + " ");
        }
        System.out.println();

        // while loop
        while (start > end) {
            System.out.print(start + " ");
            start -= step;
        }
    }
}
