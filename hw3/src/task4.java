import java.util.Scanner;

public class task4 {

    //https://acmp.ru/index.asp?main=task&id_task=234
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        boolean[][] isMine = new boolean[n + 2][m + 2];
        for (int mine = 0; mine < k; mine++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            isMine[i][j] = true;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (isMine[i][j]) {
                    System.out.print('*');
                } else {
                    int count = 0;
                    // считаем соседение мины
                    for (int di = -1; di<=1; di++) {
                        for (int dj = -1; dj <=1; dj++) {
                            if (isMine[i+di][j+dj]) {
                                count++;
                            }
                        }
                    }
                    if (count == 0) {
                        System.out.print('.');
                    } else {
                        System.out.print(count);
                    }
                }

            }
            System.out.println();
        }

    }
}
