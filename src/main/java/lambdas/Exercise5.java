package lambdas;

import java.util.List;
import java.util.stream.Collectors;

//Предоставлен список строк, нужно привести строки к числовому представлению и вернуть список чисел,
// которые больше 10 или равняются 10, отсорированые в натуральном порядке.
public class Exercise5 {
    public static void main(String[] args) {
        List<String> list = List.of("1", "10", "33", "8", "15", "0", "11", "-2");
        List<Integer> result = list.stream()
                .map(Integer::parseInt)
                .filter(number -> number >= 10)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
