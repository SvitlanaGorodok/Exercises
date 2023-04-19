package lambdas;

import lambdas.models.Student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Получить список студентов, возраст которых больше 30, отсортировав их по фамилии в обратном порядке
public class Exercise2 {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1, "Eric", "Cantona", 31),
                new Student(2, "David", "Beckham", 28),
                new Student(3, "Luis", "Suares", 33),
                new Student(4, "Zinedine", "Zidane", 33));
        List<Student> result = students.stream()
                .filter(student -> student.getAge() > 30)
                .sorted(Comparator.comparing(Student::getLastName).reversed())
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
