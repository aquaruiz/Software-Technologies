import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays
                .stream(
                        scanner
                                .nextLine()
                                .split(" ")
                )
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .mapToInt(i -> i)
                .toArray();

        for (Integer item : arr) {
            System.out.println(item);
        }
    }
}