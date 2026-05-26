package lesson_6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
      //  HashSet<Student> students = new HashSet<>();
      //  students.add(new Student("Иван Иванов", "А2", 2, Arrays.asList(4, 2, 4, 5, 3)));
      //  students.add(new Student("Петр Петров", "А2", 2, Arrays.asList(4, 2, 4, 5, 3)));
      //  students.add(new Student("Иван Сидоров", "B3", 3, Arrays.asList(3, 2, 1, 2, 3)));
      //  students.add(new Student("Олег Кузнецов", "B1", 1, Arrays.asList(3, 3, 2, 5, 1)));
      //  students.add(new Student("Игорь Яковлев", "B4", 4, Arrays.asList(4, 4, 4, 3, 3)));
//
      //  for (Student o : students) {
      //      System.out.println(o);
      //  }
      //  StudentManage.printStudents(students, 2);
      //  StudentManage.removeStudent(students);
      //  StudentManage.promoteStudents(students);
      //  for (Student o : students) {
      //      System.out.println(o);
      //  }
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "8-901-111-11-11");
    //  phoneBook.add("Иванов", "8-902-222-22-22");
    //  phoneBook.add("Иванов", "8-903-333-33-33");
    //  phoneBook.add("Петров", "8-904-444-44-44");
    //  phoneBook.add("Петров", "8-905-555-55-55");
    //  phoneBook.add("Сидоров", "8-906-666-66-66");

        phoneBook.get("Петров");
        phoneBook.printAll();
    }
}
