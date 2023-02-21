import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class thirdSem {
    public static void main(String[] args) {
        Random rnd = new Random();
        double size = 10; //по-другому не придумала, как получить ср арифм в виде double, в остальных случаях округлял до целого
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(10));
        }
        System.out.println(list.toString());
        //1. удаление четных чисел из списка
        //list.removeIf(x -> (x % 2 == 0));
        //System.out.println(list.toString());
        //2.минимальное, максимальное и среднее арифметическое из этого списка.
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        int sum = list.stream().reduce((x, y) -> x + y).get();
        System.out.println(sum);
        double value = sum/size;
        System.out.println(value);
    }
}
