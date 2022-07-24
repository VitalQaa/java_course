import java.util.Scanner;
public class task5 {

    // https://acmp.ru/index.asp?main=task&id_task=70

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = sc.nextLine();
        String temp;


        int n = 0;


        System.out.println("Enter a degree");
        try {
            n = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException nfe) {
            System.out.println("Enter a non-zero integer value, not string");
            System.exit(1);
        }


        if (n == 0) {
            System.out.println("Enter a non-zero value \nTry again");
            System.exit(1);
        }



        // если степень > 0 (возводим строку в степень n)
        if (n > 0) {

            if (str.repeat(n).length() <= 1023) {
                System.out.println(str.repeat(n));
            } else {
                System.out.println(str.repeat(n).substring(0, 1023));
            }
        // если степень < 0 (берём корень n-ной степени из строки)
        } else {
            n *= -1;
            // если строка не делится на n равных по длине подстрок
            if (str.length() % n != 0) {
                System.out.println("NO SOLUTION");
                System.exit(1);
            }
            // инициализируем одну подстроку
            temp = str.substring(0, str.length() / n);
            // если в исходной строке заменить подстроку на пустоту, то на выходе должны получить пустую строку
            if (str.replace(temp, "").equals("")) {
                if (temp.length() <= 1023) {
                    System.out.println(temp);
                } else {
                    System.out.println(temp.substring(0, 1023));
                }
            } else {
                System.out.println("NO SOLUTION");
            }

        }

    }
}
