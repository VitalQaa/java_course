import java.util.Arrays;
import java.util.Scanner;

public class task2 {

    //На вход программы подаётся массив из чисел, необходимо вывести его в отсортированном виде с помощью метода пузырька.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arrayLength = sc.nextInt();
        int[] array =  new int[arrayLength];

        for (int index = 0; index < arrayLength; index++) {
            array[index] = sc.nextInt();
        }
        System.out.println(Arrays.toString(bubbleSort(array, arrayLength)));

    }
    public static int[] bubbleSort(int[] arr, int arrayLength) {
        for (int i = 0; i < arrayLength - 1; i++)
            for (int j = 0; j < arrayLength - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        return arr;
    }
}
