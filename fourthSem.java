import java.util.ArrayList;
import java.util.Scanner;

public class fourthSem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {

            String input = in.nextLine();
            String word;
            int number;

            if (!input.equalsIgnoreCase("exit")) {
                String[] split = input.split("~");
                word = split[0];
                String numberString = split[1];
                number = Integer.parseInt(numberString);
                if (word.equalsIgnoreCase("print")) {
                    try {
                        System.out.println(list.get(number));
                        list.remove(number);
                    } catch (Exception e) {
                        System.out.println("Такого индекса вы еще не вводили");
                    }
                } else {
                    if (number > list.size()) {
                        for (int i = list.size(); i < number; i++) {
                            list.add(i, null);
                        }
                        list.add(number, word);
                    } else {
                        list.add(number, word);
                    }
                }
            } else {
                break;
            }
        }
        System.out.println(list);
    }
}
