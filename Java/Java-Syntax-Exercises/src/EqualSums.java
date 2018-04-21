import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int currNum = 0; currNum < numArr.length; currNum++)
        {
            int sumLeft = 0;
            int sumRight = 0;

            for (int j = 0; j < currNum; j++)
            {
                sumLeft += numArr[j];
            }

            for (int j = currNum + 1; j < numArr.length; j++)
            {
                sumRight += numArr[j];
            }

            if(sumRight == sumLeft)
            {
                System.out.println(currNum);
                return;
            }
        }

        System.out.println("no");
    }
}
