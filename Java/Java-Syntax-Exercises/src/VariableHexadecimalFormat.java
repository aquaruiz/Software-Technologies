import java.util.Scanner;

public class VariableHexadecimalFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int output = Integer.parseInt(input, 16);
        System.out.println(output);
    }
}
