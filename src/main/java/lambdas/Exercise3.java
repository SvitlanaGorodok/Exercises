package lambdas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Сгруппировать студентов по возрасту Map<Integer, List<Student>>
public class Exercise3 {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1, "Eric", "Cantona", 31),
                new Student(2, "David", "Beckham", 28),
                new Student(3, "Luis", "Suares", 33),
                new Student(4, "Zinedine", "Zidane", 28),
                new Student(4, "Zinedine", "Zidane", 31),
                new Student(4, "Zinedine", "Zidane", 33));
        Map<Integer, List<Student>> result = students.stream()
                .collect(Collectors.groupingBy(Student::getAge));
        System.out.println(result);
    }
}
