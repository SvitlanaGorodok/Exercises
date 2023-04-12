package lambdas;

import java.util.List;

//Зсумувати всі елементи колекції
public class Exercise13 {
    public static void main(String[] args) {
        List<Integer> input = List.of(1,2,3,4,5);
        Integer result = input.stream()
                .reduce(0, Integer::sum);
        System.out.println(result);
    }
}
