package lambdas;

import lambdas.models.Student;

import java.util.IntSummaryStatistics;
import java.util.List;

//Отримати статистику по студентах
public class Exercise14 {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1, "Eric", "Cantona", 31),
                new Student(2, "David", "Beckham", 28),
                new Student(3, "Luis", "Suares", 33),
                new Student(4, "Zinedine", "Zidane", 28),
                new Student(5, "Cristiano", "Ronaldo", 31),
                new Student(6, "Zlatan", "Ibrahimovich", 31),
                new Student(7, "Ronaldinho", "Gaucho", 33));
        IntSummaryStatistics statistics = students.stream()
                .mapToInt(Student::getAge)
                .summaryStatistics();
        System.out.println("Max: " + statistics.getMax());
        System.out.println("Avg: " + statistics.getAverage());
        System.out.println("Amount: " + statistics.getCount());
        System.out.println("Total sum: " + statistics.getSum());
    }
}
