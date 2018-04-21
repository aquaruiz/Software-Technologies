import java.util.*;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] bombInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ArrayList<Integer> numList = new ArrayList<Integer>();

        for (int i = 0; i < numArr.length; i++) {
            numList.add(numArr[i]);
        }

        int bombNum = bombInput[0];
        int powerNum = bombInput[1];
        int indexOfBomb;

        while (numList.indexOf(bombNum) >= 0) {
            indexOfBomb = numList.indexOf(bombNum);
            int leftSide = Math.max(0, (indexOfBomb - powerNum));
            int rightSide = Math.min(numList.size() - 1, (indexOfBomb + powerNum));
            int diff = rightSide - leftSide;
            int topBorderdiff = numList.size() - leftSide;

            if (rightSide < numList.size() && leftSide >= 0) {
                for (int i = 0; i <= diff; i++) {
                    numList.remove(leftSide);
                }
            }
            else if (rightSide >= numList.size() && leftSide < 0) {
                for (int i = 0; i <= numList.size() + 1; i++) {
                    numList.remove(0);
                }
            }
            else if (rightSide >= numList.size() && leftSide >= 0) {
                for (int i = 0; i < topBorderdiff; i++) {
                    numList.remove(leftSide);
                }
            }
            else if (rightSide < numList.size() && leftSide < 0) {
                for (int i = 0; i <= rightSide; i++) {
                    numList.remove(0);
                }
            }
        }

        int sum = numList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}