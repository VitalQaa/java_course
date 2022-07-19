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

            double a = inputNumber(sc); // Вводим первый операнд
            double b = inputNumber(sc); // Вводим вторый операнд

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
                        if (a / b == Double.NEGATIVE_INFINITY || a / b == Double.POSITIVE_INFINITY) {
                            throw new ArithmeticException();
                        }
                        System.out.println(a + " / " + b + " = " + (a / b));
                        break;
                    } catch (ArithmeticException ae) {
                        System.out.println("ArithmeticException: division by zero!");
                        break;
                    }
                default:
                    System.out.println("There is no such operation");
                    break;
            }
            System.out.println("_____________________________");
        }
    }
    public static double inputNumber(Scanner sc) {
        System.out.println("Enter a number: ");
        if(sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            sc.next();
            System.out.println("That is not a number");
            return inputNumber(sc);
        }
    }
 }
