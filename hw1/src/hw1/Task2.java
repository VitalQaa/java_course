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
        int ticketLength = ticket.length() / 2;
        int sum = 0;
        for (int i = 0; i < ticketLength; i++) {
            sum += ticket.charAt(i) - ticket.charAt(ticketLength + i);
        }
        System.out.println(sum == 0 ? "ticket is lucky one" : "ticket isn't lucky one");

        // integer method
        sum = 0;
        int ticket_int = Integer.parseInt(ticket);
        int digit1 = ticket_int / 100000;
        int digit2 = (ticket_int / 10000) % 10;
        int digit3 = (ticket_int / 1000) % 10;
        int digit4 = (ticket_int / 100) % 10;
        int digit5 = (ticket_int / 10) % 10;
        int digit6 = ticket_int%10;
        sum = digit1 + digit2 + digit3 - digit4 - digit5 - digit6;
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
}
