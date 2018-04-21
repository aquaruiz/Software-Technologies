import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);

        double sum = num1 + num2;

        System.out.println(sum);
    }
}
