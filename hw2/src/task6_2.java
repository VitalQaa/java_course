import java.util.Scanner;


public class task6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        StringBuilder str = new StringBuilder(sc.nextLine());
        StringBuilder newStr = new StringBuilder();
        int offset = 0;
        int n = 0;
        int newLine = 0;
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                newStr.append(str.charAt(i));
                counter++;
                if (counter > 1) {
                    newStr.insert(i+offset, "1");
                    offset++;
                }
            } else {
                newStr.append(str.charAt(i));
                counter = 0;
            }
        }

        String[] strings = newStr.toString().split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        for (int index = 1; index < strings.length; index+=2) {
            n = Integer.parseInt(strings[index-1]);
            System.out.print(strings[index].repeat(n));
            newLine+=n;
            if (newLine > 40) {
                System.out.println();
                newLine = 0;
            }
        }
    }

}

