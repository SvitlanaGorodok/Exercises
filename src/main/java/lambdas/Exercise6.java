package lambdas;

import lambdas.models.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Сгрупировать студентов по идентификатору и вывести имя и фамилию студента Map<Integer, String>
public class Exercise6 {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1, "Eric", "Cantona", 31),
                new Student(2, "David", "Beckham", 28),
                new Student(3, "Luis", "Suares", 33),
                new Student(3, "Zinedine", "Zidane", 28),
                new Student(4, "Cristiano", "Ronaldo", 31),
                new Student(4, "Ronaldinho", "Gaucho", 33));
        Map<Integer, String> result = students.stream()
                .collect(Collectors.groupingBy(Student::getId,
                        Collectors.mapping(s -> s.getFirstName() + " " + s.getLastName(), Collectors.joining(", "))));
        System.out.println(result);
    }
}
