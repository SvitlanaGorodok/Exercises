package lambdas;

import lambdas.models.Student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Получить список студентов, отсортировав их по имени
public class Exercise1 {

    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1, "Eric", "Cantona", 31),
                new Student(2, "David", "Beckham", 28),
                new Student(3, "Luis", "Suares", 33),
                new Student(4, "Zinedine", "Zidane", 33));

        List<Student> result = students.stream()
                .sorted(Comparator.comparing(Student::getFirstName))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
