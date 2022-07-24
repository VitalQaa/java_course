import java.util.Scanner;
public class task4 {

    // На вход подаётся строка из нулей и единиц, необходимо посчитать максимальное количество подряд идущих нулей.


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary string");
        String str = sc.nextLine();

        if (!str.replace("1", "").replace("0", "").equals("")){
            System.out.println("You have to enter a binary string");
            System.exit(1);
        }

        int maximum = 0;
        int counter = 0;
        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                flag = false;
                counter++;
            } else {
                flag = true;
                if (counter > maximum) {
                    maximum = counter;
                }
                counter = 0;
            }
        }
        System.out.print("Максимальная последовательность = ");
        System.out.println(flag ? maximum : counter);



        // another method
        maximum = 0;
        String [] seq = str.split("1");

        for (String el : seq) {
            if (el.length() > maximum) {
                maximum = el.length();
            }
        }
        System.out.println("Максимальная последовательность = " + maximum);

    }
}
