package lesson_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("Иван Иванов", "А2", 2, Arrays.asList(4, 2, 4, 5, 3)));
        students.add(new Student("Петр Петров", "А2", 2, Arrays.asList(4, 2, 4, 5, 3)));
        students.add(new Student("Иван Сидоров", "B3", 3, Arrays.asList(3, 2, 1, 2, 3)));
        students.add(new Student("Олег Кузнецов", "B1", 1, Arrays.asList(3, 3, 2, 5, 1)));
        students.add(new Student("Игорь Яковлев", "B4", 4, Arrays.asList(4, 4, 4, 3, 3)));


        for (Student o : students) {
            System.out.println(o);
        }

        StudentManage.printStudents(students, 2);
        StudentManage.removeStudent(students);
        StudentManage.promoteStudents(students);
        for (Student o : students) {
            System.out.println(o);
        }

    }
}
