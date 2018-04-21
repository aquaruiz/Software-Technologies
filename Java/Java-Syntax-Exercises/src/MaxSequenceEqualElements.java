import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ArrayList<Integer> maxSequenceOfEqualElements = FindMaxSequence(arr);

        StringBuilder sb = new StringBuilder();
        String delim = "";

        for (int i : maxSequenceOfEqualElements) {
            sb.append(delim).append(i);
            delim = " ";
        }

        System.out.println(sb.toString());
    }
    private static ArrayList<Integer> FindMaxSequence(int[] arr)
    {
        ArrayList<Integer> longestSequenceOfEq = new ArrayList<Integer>();
        ArrayList<Integer> currentSequenceOfEq = new ArrayList<Integer>();

        currentSequenceOfEq.add(arr[0]);

        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i] == arr[i - 1])
            {
                currentSequenceOfEq.add(arr[i]);

                if(i == arr.length - 1 && currentSequenceOfEq.size() > longestSequenceOfEq.size())
                {
                    longestSequenceOfEq = new ArrayList<Integer>(currentSequenceOfEq);
                    currentSequenceOfEq = new ArrayList<Integer>();
                    currentSequenceOfEq.add(arr[i]);
                }
            }
            else
            {
                if(currentSequenceOfEq.size() > longestSequenceOfEq.size())
                {
                    longestSequenceOfEq = new ArrayList<Integer>(currentSequenceOfEq);

                }

                currentSequenceOfEq = new ArrayList<Integer>();
                currentSequenceOfEq.add(arr[i]);
            }
        }

        return longestSequenceOfEq;
    }
}
