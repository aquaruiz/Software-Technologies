import java.util.Scanner;

public class VowelOrDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals("a")
                || input.equals("o")
                || input.equals("e")
                || input.equals("i")
                || input.equals("u")
                || input.equals("A")
                || input.equals("O")
                || input.equals("E")
                || input.equals("I")
                || input.equals("U")){
            System.out.println("vowel");
        }
        else if (Character.isDigit(input.charAt(0))){
            System.out.println("digit");
        }
        else {
            System.out.println("other");
        }
    }
}
