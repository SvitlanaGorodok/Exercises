package lambdas;

import lambdas.models.Student;

import java.util.List;
import java.util.stream.Collectors;

//вывести в консоль сообщение "Hello firstName lastName" по каждому студенту
public class Exercise8 {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1, "Eric", "Cantona", 31),
                new Student(2, "David", "Beckham", 28),
                new Student(3, "Luis", "Suares", 33),
                new Student(4, "Zinedine", "Zidane", 28),
                new Student(4, "Cristiano", "Ronaldo", 31),
                new Student(4, "Ronaldinho", "Gaucho", 33));

        String result = students.stream()
                .map(student -> student.getFirstName() + " " + student.getLastName())
                .collect(Collectors.joining(", Hello ","Hello ",""));
        System.out.println(result);
    }
}
