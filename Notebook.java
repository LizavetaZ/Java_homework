import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class Notebook{
    public static void main(String[] args) {

        Notebook notebook1 = new Notebook(4, 8);
        Notebook notebook2 = new Notebook(6, 10);
        Notebook notebook3 = new Notebook(5, 7);
        IntComparator intComparator = new IntComparator();
        List<Integer> listCost = new ArrayList<>(); //на List.of выдавал ошибку
        listCost.add(notebook1.cost);
        listCost.add(notebook2.cost);
        listCost.add(notebook3.cost);
        List<Integer> listMemory = new ArrayList<>();
        listMemory.add(notebook1.memory);
        listMemory.add(notebook2.memory);
        listMemory.add(notebook3.memory);
        Collections.sort(listCost, intComparator);
        System.out.println(listCost);
        //по убываянию запуталась через копаратор, сделала так
        Stack<Integer> stackInt = new Stack<>();
        stackInt.addAll(listCost);
        listCost.clear();
        while (!stackInt.empty())
            listCost.add(stackInt.pop());
        System.out.println(listCost);

        Collections.sort(listMemory, intComparator);
        Stack<Integer> stackMemory = new Stack<>();
        stackMemory.addAll(listMemory);
        listMemory.clear();
        while (!stackMemory.empty())
            listMemory.add(stackMemory.pop());
        System.out.println(listMemory);
    }

    private int cost;
    private int memory;

    public Notebook(int cost,
            int memory) {
        this.cost = cost;
        this.memory = memory;
    }

    static class IntComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 > o2) {
                return 1;
            } else if (o1 == o2) {
                return 0;
            }
            return -1;
        }
    }
    
}
