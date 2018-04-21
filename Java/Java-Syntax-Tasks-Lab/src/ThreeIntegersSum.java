import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ThreeIntegersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int[] arr = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        int num1 = arr[0];
        int num2 = arr[1];
        int num3 = arr[2];

        if (num1 + num2 == num3){
            if (num1 <= num2){
                System.out.println(num1 + " + " + num2 + " = " + num3);
            }
            else {
                System.out.println(num2 + " + " + num1 + " = " + num3);
            }
        }
        else if(num2 + num3 == num1){
            if (num2 <= num3){
                System.out.println(num2 + " + " + num3 + " = " + num1);
            }
            else {
                System.out.println(num3 + " + " + num2 + " = " + num1);
            }
        }
        else if (num3 + num1 == num2){
            if (num3 <= num1){
                System.out.println(num3 + " + " + num1 + " = " + num2);
            }
            else {
                System.out.println(num1 + " + " + num3 + " = " + num2);
            }
        }
        else {
            System.out.println("No");
        }

    }
}
