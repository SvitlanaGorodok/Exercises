package lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


//Предоставлен список студентов, отсортировать студентов сначала по имени, потом по фамилии
public class Exercise7 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student(1, "Eric", "Cantona", 31),
                new Student(2, "David", "Beckham", 28),
                new Student(3, "Luis", "Suares", 33),
                new Student(4, "Zinedine", "Zidane", 28),
                new Student(5, "Cristiano", "Ronaldo", 31),
                null,
                new Student(6, "Zlatan", "Ibrahimovich", 31),
                new Student(7, "Ronaldinho", "Gaucho", 33));
        List<Student> result = students.stream()
                .sorted(Comparator.nullsLast(Comparator.comparing(Student::getFirstName)))
                .sorted(Comparator.nullsLast(Comparator.comparing(Student::getLastName)))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
