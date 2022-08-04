import java.util.Scanner;

public class task5 {

    // На вход подаётся одно число n = размеру квадратной матрицы,
    // На выходе должен получиться массив из чисел от 1 до n выведенный по спирали.
    public static void main(String[] args) {

        // Спираль против часовой стрелки
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Число, которым будем заполнять матрицу
        int el = 1;

        //Объявляем и инициализируем массив
        int[][] array = new int[n][n];

        // Заполняем периметр массива
        // 1 столбец; последнюю строку, последнюю строку, 1 строку

        // Первый столбец
        for (int row = 0; row < n; row++) {
            array[row][0] = el;
            el++;
        }

        // Последнюю строку
        for (int column = 1; column < n; column++) {
            array[n - 1][column] = el;
            el++;
        }

        // Последний столбец
        for (int x = n - 2; x >= 0; x--) {
            array[x][n - 1] = el;
            el++;
        }

        // Первую строку
        for (int y = n - 2; y >= 1; y--) {
            array[0][y] = el;
            el++;
        }

        //Периметр заполнен. Продолжаем заполнять массив и задаём
        //координаты ячейки, которую необходимо заполнить следующей.
        int dRow = 1;
        int dColumn = 1;

        while (el < n * n) {
            // Движемся вниз
            while (array[dRow + 1][dColumn] == 0) {
                array[dRow][dColumn] = el;
                el++;
                dRow++;
            }
            // Движемся вправо
            while (array[dRow][dColumn + 1] == 0) {
                array[dRow][dColumn] = el;
                el++;
                dColumn++;
            }

            // Движемся вверх
            while (array[dRow - 1][dColumn] == 0) {
                array[dRow][dColumn] = el;
                el++;
                dRow--;
            }

            // Движемся влево
            while (array[dRow][dColumn - 1] == 0) {
                array[dRow][dColumn] = el;
                el++;
                dColumn--;
            }

        }

        // центральный элемент
        if (n > 2) {
            if (n % 2 == 0) {
                array[n / 2 - 1][n / 2] = el;
            } else {
                array[n / 2][n / 2] = el;
            }
        }


        // Выводим массив в консоль.
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

