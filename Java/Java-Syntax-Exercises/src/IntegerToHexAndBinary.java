import java.util.Scanner;

public class IntegerToHexAndBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decNum = Integer.parseInt(scanner.nextLine());

        String hexNum = Integer.toHexString(decNum).toUpperCase();
        String binaryNum = Integer.toBinaryString(decNum);

        System.out.println(hexNum);
        System.out.println(binaryNum);
    }
}
