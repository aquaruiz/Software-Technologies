import java.util.Arrays;
import java.util.Scanner;

public class SymmetricNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = arr[0];

        for (int i = 1; i<= n; i++){
            String reverse = new StringBuffer(Integer.toString(i)).reverse().toString();
            if (Integer.toString(i).equals(reverse)){
                System.out.println(i);
            }
        }
    }
}