import java.util.Scanner;

public class IndexOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] arr = scanner.nextLine().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char current = arr[i];
            int index = (int)current - 97;

            System.out.println(current + " -> " + index);
        }
    }
}
