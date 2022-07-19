package hw1;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // string method
        String ticket = sc.nextLine();
        if (ticket.length() != 6 || !isNumeric(ticket)) {
            System.out.println("You have to enter six-digit number");
            System.exit(1);
        }
        int start = 0;
        int ticketLength = ticket.length();
        int sum = 0;
        for (int i = start; i < ticketLength / 2; i++) {
            sum += ticket.charAt(i) - ticket.charAt(ticketLength / 2 + i);
        }
        System.out.println(sum == 0 ? "ticket is lucky one" : "ticket isn't lucky one");

        // integer method

        sum = 0;
        int ticket_int = Integer.parseInt(ticket);


        for (int i = start; i < ticketLength; i++) {
            if (i < ticketLength / 2) {
                sum -= ticket_int / pow(10, i) % 10;
                System.out.println(sum);
            }
            else {
                sum += ticket_int / pow (10, i) % 10;
                System.out.println(sum);
            }
        }

        System.out.println(sum == 0 ? "ticket is lucky one" : "ticket isn't lucky one");
    }
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int n = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static int pow(int value, int powValue) {

        return (int) Math.pow(value, powValue);

    }
}
