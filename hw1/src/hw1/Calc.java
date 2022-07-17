package hw1;
import java.util.Scanner;
public class Calc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter math operation or 'stop' to quit");
            String operator = sc.next(); // Вводим арифметическсий оператор или останавливаем работу калькулятора
            if (operator.equals("stop")) {
                System.exit(1);
            }
            System.out.println("enter first number");
            double a = sc.nextDouble(); // вводим первый операнд
            System.out.println("enter second number");
            double b = sc.nextDouble(); // вводим второй операнд
            switch (operator) {
                case ("+"):
                    System.out.println(a + " + " + b + " = " + (a + b));
                    break;
                case ("-"):
                    System.out.println(a + " - " + b + " = " + (a - b));
                    break;
                case ("*"):
                    System.out.println(a + " * " + b + " = " + (a * b));
                    break;
                case ("/"):
                    try {
                        System.out.println(a + " / " + b + " = " + (a / b));
                        break;
                    } catch (ArithmeticException e) {
                        System.out.println("Division by zero");
                        break;
                    }
                default:
                    System.out.println("There is no such operation");
                    break;
            }
            System.out.println("_____________________________");
        }
    }
}
