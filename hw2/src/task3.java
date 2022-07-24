import java.util.Scanner;
public class task3 {

    // На вход подаётся номер билета, необходимо проверить является ли он счастливым.
    // Билет является счастливым если сумма первой половины чисел равна сумме второй половины чисел.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digital ticket number");
        String ticket = sc.nextLine();
        if (ticket.length() % 2 != 0 || !isNumeric(ticket)) {
            System.out.println("You have to enter even number");
            System.exit(1);
        }

        int start = 0;
        int ticketLength = ticket.length();
        int result = 0;
        for (int i = start; i < ticketLength / 2; i++) {
            result += ticket.charAt(i) - ticket.charAt(ticketLength / 2 + i);
        }
        System.out.println(result == 0 ? "ticket is lucky one" : "ticket isn't lucky one");

    }
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Long.parseLong(strNum, 10);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
