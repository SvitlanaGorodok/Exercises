package lambdas;

import lambdas.models.Student;

import java.util.Comparator;
import java.util.List;

//Найти студента с самой длинной фамилией.
public class Exercise9 {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1, "Eric", "Cantona", 31),
                new Student(2, "David", "Beckham", 28),
                new Student(3, "Luis", "Suares", 33),
                new Student(4, "Zinedine", "Zidane", 28),
                new Student(5, "Cristiano", "Ronaldo", 31),
                new Student(6, "Zlatan", "Ibrahimovich", 31),
                new Student(7, "Ronaldinho", "Gaucho", 33));
        Student result = students.stream()
                .max(Comparator.comparing(student -> student.getLastName().length()))
                .get();
        System.out.println(result);
    }
}
