import java.util.Scanner;

public class task5 {

    // �� ���� ������� ���� ����� n = ������� ���������� �������,
    // �� ������ ������ ���������� ������ �� ����� �� 1 �� n ���������� �� �������.
    public static void main(String[] args) {

        // ������� ������ ������� �������
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // �����, ������� ����� ��������� �������
        int el = 1;

        //��������� � �������������� ������
        int[][] array = new int[n][n];

        // ��������� �������� �������
        // 1 �������; ��������� ������, ��������� ������, 1 ������

        // ������ �������
        for (int row = 0; row < n; row++) {
            array[row][0] = el;
            el++;
        }

        // ��������� ������
        for (int column = 1; column < n; column++) {
            array[n - 1][column] = el;
            el++;
        }

        // ��������� �������
        for (int x = n - 2; x >= 0; x--) {
            array[x][n - 1] = el;
            el++;
        }

        // ������ ������
        for (int y = n - 2; y >= 1; y--) {
            array[0][y] = el;
            el++;
        }

        //�������� ��������. ���������� ��������� ������ � �����
        //���������� ������, ������� ���������� ��������� ���������.
        int dRow = 1;
        int dColumn = 1;

        while (el < n * n) {
            // �������� ����
            while (array[dRow + 1][dColumn] == 0) {
                array[dRow][dColumn] = el;
                el++;
                dRow++;
            }
            // �������� ������
            while (array[dRow][dColumn + 1] == 0) {
                array[dRow][dColumn] = el;
                el++;
                dColumn++;
            }

            // �������� �����
            while (array[dRow - 1][dColumn] == 0) {
                array[dRow][dColumn] = el;
                el++;
                dRow--;
            }

            // �������� �����
            while (array[dRow][dColumn - 1] == 0) {
                array[dRow][dColumn] = el;
                el++;
                dColumn--;
            }

        }

        // ����������� �������
        if (n > 2) {
            if (n % 2 == 0) {
                array[n / 2 - 1][n / 2] = el;
            } else {
                array[n / 2][n / 2] = el;
            }
        }


        // ������� ������ � �������.
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                if (array[row][column] < 10) {
                    System.out.print(array[row][column] + "  ");
                } else {
                    System.out.print(array[row][column] + " ");
                }
            }
            System.out.println();
        }
    }
}

