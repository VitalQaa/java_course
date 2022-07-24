import java.util.Scanner;
public class task6 {

    // https://acmp.ru/index.asp?main=task&id_task=231

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        // развернутая строка (expr = 3A; newStr = AAA)
        StringBuilder newStr = new StringBuilder();
        // цифра/число перед буквенным символом (expr = 3A; n = 3)
        StringBuilder n = new StringBuilder();

        //вычленяем цифру/число перед буквенным символом
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                n.append(str.charAt(i));
            } else {
                // если буквенный символ представлен из последовательности в один символ (expr = 3A4BD; кейс для символа D)
                if (n.toString().equals("")) {
                    //n = new StringBuilder("1");
                    newStr.append(str.charAt(i));
                } else {
                    // иначе если n > 1, прогоняем цикл от 0 до n (expr = 3A; n = 3; newStr = AAA)
                    for (int j = 0; j < Integer.parseInt(n.toString()); j++) {
                        newStr.append(str.charAt(i));
                    }
                }
                // обнуляем n для новых буквенных символов
                n = new StringBuilder();
            }
        }
        System.out.println(newStr);
    }
}
