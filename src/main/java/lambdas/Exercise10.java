package lambdas;

import lambdas.models.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Сгрупировать студентов по возрасту и получить коллекцию Map<Integer, Optional<Student>>, где Student - студент с самым
//коротким именем
public class Exercise10 {
    public static void main(String[] args) {
        List<Student> students =  Arrays.asList(new Student(1, "Eric", "Cantona", 31),
                new Student(2, "David", "Beckham", 28),
                new Student(3, "Luis", "Suares", 33),
                new Student(4, "Zinedine", "Zidane", 28),
                new Student(5, "Cristiano", "Ronaldo", 31),
                null,
                new Student(6, "Zlatan", "Ibrahimovich", 31),
                new Student(7, "Ronaldinho", "Gaucho", 33));

        Map<Integer, Optional<Student>> result = students.stream()
                .flatMap(Stream::ofNullable)
                .collect(Collectors.groupingBy(Student::getAge,
                        Collectors.minBy(Comparator.comparing(student -> student.getFirstName().length()))));
        System.out.println(result);
    }
}
