import java.util.Arrays;
import java.util.Scanner;

public class CompareCharArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] firstArr = scanner.nextLine().replaceAll(" ", "").toCharArray();
        char[] secondArr = scanner.nextLine().replaceAll(" ", "").toCharArray();


        if (firstArr[0] > secondArr[0]) {
            System.out.println(secondArr);
            System.out.println(firstArr);
        } else if (secondArr[0] > firstArr[0]) {
            System.out.println(firstArr);
            System.out.println(secondArr);
        } else {
            int irrNum = firstArr.length > secondArr.length ? secondArr.length : firstArr.length;

            for (int i = 1; i < irrNum; i++) {
                if (firstArr[i] > secondArr[i]) {
                    System.out.println(secondArr);
                    System.out.println(firstArr);
                    return;
                } else if (firstArr[i] < secondArr[i]) {
                    System.out.println(firstArr);
                    System.out.println(secondArr);
                    return;
                } else {
                    if (i == irrNum - 1) {
                        if (firstArr.length > secondArr.length) {
                            System.out.println(secondArr);
                            System.out.println(firstArr);
                            return;
                        } else if (firstArr.length <= secondArr[i]) {
                            System.out.println(firstArr);
                            System.out.println(secondArr);
                            return;
                        }
                    }
                    continue;
                }
            }
        }

    }
}
