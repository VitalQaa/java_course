import java.util.Scanner;
public class task6 {

    // https://acmp.ru/index.asp?main=task&id_task=231

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        // ����������� ������ (expr = 3A; newStr = AAA)
        StringBuilder newStr = new StringBuilder();
        // �����/����� ����� ��������� �������� (expr = 3A; n = 3)
        StringBuilder n = new StringBuilder();

        //��������� �����/����� ����� ��������� ��������
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                n.append(str.charAt(i));
            } else {
                // ���� ��������� ������ ����������� �� ������������������ � ���� ������ (expr = 3A4BD; ���� ��� ������� D)
                if (n.toString().equals("")) {
                    //n = new StringBuilder("1");
                    newStr.append(str.charAt(i));
                } else {
                    // ����� ���� n > 1, ��������� ���� �� 0 �� n (expr = 3A; n = 3; newStr = AAA)
                    for (int j = 0; j < Integer.parseInt(n.toString()); j++) {
                        newStr.append(str.charAt(i));
                    }
                }
                // �������� n ��� ����� ��������� ��������
                n = new StringBuilder();
            }
        }
        System.out.println(newStr);
    }
}
