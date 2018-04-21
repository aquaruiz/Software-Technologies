import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SumsByTown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        TreeMap<String,Double> incomeByTowns = new TreeMap<>();

        for (int i = 0; i < n; i++){
            String[] arr = scanner.nextLine().split(" \\| ");
            String town = arr[0].trim();
            double income = Double.parseDouble(arr[1]);

            if (!incomeByTowns.containsKey(town)) {
                incomeByTowns.put(town, income);
            }
            else {
                incomeByTowns.put(town, incomeByTowns.get(town) + income);
            }
        }

        for (Map.Entry<String, Double> townIncome: incomeByTowns.entrySet()){
            System.out.println(townIncome.getKey() + " -> " + townIncome.getValue());
        }
    }
}