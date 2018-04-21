import java.util.Arrays;
import java.util.Scanner;


public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int mostFrequent = 0;
        int repetitions = 0;

        for (int i = 0; i < arr.length; i++)
        {
            int currNum = arr[i];
            int counter = 0;

            for (int j = 0; j < arr.length; j++)
            {
                if (currNum == arr[j])
                {
                    counter++;
                }
            }

            if(counter > repetitions)
            {
                mostFrequent = currNum;
                repetitions = counter;
            }
        }

        System.out.println(mostFrequent);
    }
}
