import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceIncreasingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ArrayList<Integer> maxSequenceOfIncreasingElements = FindMaxSequence(arr);

        StringBuilder sb = new StringBuilder();
        String delim = "";

        for (int i : maxSequenceOfIncreasingElements) {
            sb.append(delim).append(i);
            delim = " ";
        }

        System.out.println(sb.toString());
    }
    private static ArrayList<Integer> FindMaxSequence(int[] arr)
    {
        ArrayList<Integer> longestSequenceOfIncr = new ArrayList<Integer>();
        ArrayList<Integer> currentSequenceOfIncr = new ArrayList<Integer>();

        currentSequenceOfIncr.add(arr[0]);

        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i] > arr[i - 1])
            {
                currentSequenceOfIncr.add(arr[i]);

                if(i == arr.length - 1 && currentSequenceOfIncr.size() > longestSequenceOfIncr.size())
                {
                    longestSequenceOfIncr = new ArrayList<Integer>(currentSequenceOfIncr);
                    currentSequenceOfIncr = new ArrayList<Integer>();
                    currentSequenceOfIncr.add(arr[i]);
                }
            }
            else
            {
                if(currentSequenceOfIncr.size() > longestSequenceOfIncr.size())
                {
                    longestSequenceOfIncr = new ArrayList<Integer>(currentSequenceOfIncr);

                }

                currentSequenceOfIncr = new ArrayList<Integer>();
                currentSequenceOfIncr.add(arr[i]);
            }
        }

        return longestSequenceOfIncr;
    }
}
