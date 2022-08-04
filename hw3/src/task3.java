import java.util.Arrays;
import java.util.Scanner;

public class task3 {

    //�� ���� ��������� ������� ������� ����� � ��������������� ������,
    // ���������� ����������� �������� ��������� ������ ��� �������� ����, ��� ����� ������������ � �������.
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
            System.out.print("������� ����� �������� ��������� �������, ��� ������ � ��������������� �������: ");
        } else {
            System.out.println("������� ����� �� �������� ��������� �������");
        }
        System.out.println(binarySearch(array, desiredNumber));

    }
    public static int binarySearch(int[] arr, int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        // ������� ����������� (������� �� �����������)
        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // ���� ������� ������� - ������� �������, ������� ��� ������
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            // ���� ������� ������� ������
            // ���������� ��� ������ � middle+1, ������ ������ ����� �� ������������
            else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;

                // ���� ������� ������� ������
                // ���������� ��� ������ � middle-1, ������ ������ ����� �� ������������
            else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;

        }
        return -1;
    }
}
