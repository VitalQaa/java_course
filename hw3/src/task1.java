import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class task1 {

    // На вход программы подаётся массив чисел, необходимо сделать вывод массива в обратном порядке.
    //было: 1 0 4 5
    //станет: 5 4 0 1

    public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] array =  new int[arrayLength];
        int[] reverseArray = new int[arrayLength];
        for (int index = 0; index < arrayLength; index++) {
            array[index] = sc.nextInt();
        }
        //first method
        System.out.println("the first method with loop");
        for (int indexReverse = 0; indexReverse < arrayLength; indexReverse++) {
            reverseArray[indexReverse] = array[arrayLength-1-indexReverse];
        }
        System.out.println(Arrays.toString(reverseArray));
        // without initialize new array
        String space = "";
        for (int index = arrayLength-1; index >= 0; index--) {
            System.out.print(space + array[index]);
            space = " ";
        }
        System.out.println();

        // The second method using ArrayList & collections
        Integer[] integerArray = new Integer[arrayLength];
        int integerIndex = 0;
        for (int value : array) {
            integerArray[integerIndex++] = value;
        }
        System.out.println("the second method with ArrayList");
        System.out.println(reverse(integerArray));



    }
    public static List<Integer> reverse(Integer[] myArray)
    {
        Collections.reverse(Arrays.asList(myArray));
        return Arrays.asList(myArray);
    }
}
