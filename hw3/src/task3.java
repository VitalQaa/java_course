import java.util.Arrays;
import java.util.Scanner;

public class task3 {

    //На вход программы подаётся искомое число и отсортированный массив,
    // необходимо реализовать алгоритм бинарного поиска для проверки того, что число присутствует в массиве.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int desiredNumber = sc.nextInt();
        int arrayLength = sc.nextInt();

        int[] array = new int[arrayLength];

        for (int index = 0; index < arrayLength; index++) {
            array[index] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        if (binarySearch(array, desiredNumber) != -1) {
            System.out.print("Искомое число является элементом массива, его индекс в отсортированном массиве: ");
        } else {
            System.out.println("Искомое число не является элементом массива");
        }
        System.out.println(binarySearch(array, desiredNumber));

    }
    public static int binarySearch(int[] arr, int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        // условие прекращения (элемент не представлен)
        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;

                // если средний элемент больше
                // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;

        }
        return -1;
    }
}
