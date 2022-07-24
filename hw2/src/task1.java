import java.util.*;

public class task1 {

    // ������� �� �������� �
    // https://metaschool.ru/pub/games/bulls-and-cows/bulls.php.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cows = 0;
        int bulls = 0;
        StringBuilder rndStr = getRandomNumber();
        System.out.println("Enter a sequence of 4 digits without repetition");
        String str = sc.nextLine();
        // �������� ��������� ������������������ �� �������
        for (int j = 0; j < 3; j++ ){
            for (int k = j+1; k < 4; k++) {
                if (str.charAt(j) == str.charAt(k)) {
                    System.out.println("You have to enter a digit without repetition\nTry again");
                    System.exit(1);
                }
            }
        }
        // ���� ����� �� ���������� ������������������ � �������� ����� � ����� � ��� �� �������
        // ����������� ����� ����� �� 1 � ����������� ������
        for (int i = 0; i < 4; i++) {
            if (str.charAt(i) == rndStr.charAt(i)) {
                cows++;
                continue;
            }
            // ���� ����� ������������ � ����� �������������������, �� ���������� ��������
            // ����������� ����� ����� �� 1
            if (rndStr.indexOf(String.valueOf(str.charAt(i))) > -1) {
                bulls++;
            }
        }

        System.out.println("computer number = " + rndStr + " my number = " + str);
        System.out.println("cows = " + cows + " bulls = " + bulls);



    }
    public static StringBuilder getRandomNumber() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            result.append(numbers.get(i).toString());
        }
        return result;
    }
}
