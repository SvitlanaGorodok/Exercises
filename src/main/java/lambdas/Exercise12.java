package lambdas;

import java.util.List;
import java.util.stream.Collectors;

//Створити один список з двох
public class Exercise12 {
    public static void main(String[] args) {
        List<List<String>> lists = List.of(List.of("Element 1.1","Element 1.2"), List.of("Element 2.1","Element 2.2"));
        System.out.println(lists);
        List<String> result = lists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
