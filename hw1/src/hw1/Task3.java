package hw1;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int count = 0;

        for (int i = 0; i < w / x +1; i++) {
            int residual = w - x * i;
            for (int j = 0; j < residual / y + 1; j++) {
                if ((residual - y * j) % z == 0) {
                    count++;
                }
            }
        }
        System.out.println("The number of ways to make a gift is " + count);

    }
}
