import java.util.Scanner;
public class task2 {

    // На вход программы подаётся строка, в результате должно быть выведено является ли входная строка палиндромом

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine().toLowerCase();
        String reverseString = "";
        int startOfString = inputString.length() - 1;
        int endOfString = 0;
        int step = 1;

        // loop way (Видимо, плохой метод)
        for (int i = startOfString; i >= endOfString; i -= step) {
            reverseString += inputString.charAt(i);
        }
        System.out.print("First method: ");
        System.out.println(reverseString.equals(inputString) ? "string is palindrome" : "string isn't palindrome");

        // StringBuilder
        // loop way (append)

        StringBuilder reverseStringSb = new StringBuilder();

        for (int i = startOfString; i >= endOfString; i -= step) {
            reverseStringSb.append(inputString.charAt(i));
        }

        System.out.print("Second method: ");
        System.out.println(reverseStringSb.toString().equals(inputString) ? "string is palindrome" : "string isn't palindrome");

        // reverse function

        StringBuilder reverseStringSbAnother = new StringBuilder(inputString);
        String reverseSbString = reverseStringSbAnother.reverse().toString();

        System.out.print("Third method: ");
        System.out.println(reverseSbString.equals(inputString) ? "string is palindrome" : "string isn't palindrome");

    }
}
