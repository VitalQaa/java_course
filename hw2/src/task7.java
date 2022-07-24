import java.util.HashMap;
import java.util.Scanner;

public class task7 {

    // На вход подаётся текст, слова отделяются пробелами, для каждого слова необходимо вывести количество его повторений.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        String[] item = str.split(" ");

        HashMap<String, Integer> HashMapNumberOfWords = new HashMap<>();

        for (String t : item) {
            if (HashMapNumberOfWords.containsKey(t)) {
                HashMapNumberOfWords.put(t, HashMapNumberOfWords.get(t) + 1);

            } else {
                HashMapNumberOfWords.put(t, 1);
            }
        }

        System.out.println(HashMapNumberOfWords);


    }
}
