import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> registry = new HashMap<>();

        String input = scanner.nextLine();
        while(!input.equals("END")){
            String[] arr = input.split(" ");

            if(arr.length == 3){
                String name = arr[1];
                String number = arr[2];

                registry.put(name, number);
            }

            if(arr.length == 2){
                String searchName = arr[1];

                if(registry.containsKey(searchName)){
                    for (Map.Entry<String, String> s : registry.entrySet()) {
                        if(s.getKey().equals(searchName)){
                            System.out.println(s.getKey() + " -> " + s.getValue());
                        }
                    }
                }
                else{
                    System.out.println("Contact " + searchName + " does not exist.");
                }
            }

            input = scanner.nextLine();
        }
    }
}