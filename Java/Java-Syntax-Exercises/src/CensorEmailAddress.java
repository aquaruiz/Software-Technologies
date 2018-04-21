import java.util.Scanner;

public class CensorEmailAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String myMail = scanner.nextLine();
        String[] bannMail = myMail.split("@");
        String mail = bannMail[0];
        String bgOrNot = bannMail[1];
        char[] arr = mail.toCharArray();
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        String stars = "";

        for (int i = 0; i < arr.length; i++) {
            sb.append("*");
        }

        stars = sb.toString();
        String result = stars + "@" + bgOrNot;

        if(input.contains(mail))
        {
            input = input.replaceAll(myMail, result);
        }

        System.out.println(input);
    }
}