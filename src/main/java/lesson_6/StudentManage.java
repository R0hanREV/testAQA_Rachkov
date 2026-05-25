package lesson_6;

import java.util.Set;

 class StudentManage {
    static void removeStudent(Set<Student> students) {
        students.removeIf(student -> student.getAverageGrade() < 3.0);
    }

     static void promoteStudents(Set<Student> students) {
        for (Student o : students) {
            if (o.getAverageGrade() >= 3.0) {
                o.setCourse(o.getCourse() + 1);
            }
        }
    }
    static void printStudents(Set<Student> students, int course) {
        boolean hasStudent = false;
        for (Student o : students) {
            if (o.getCourse() == course){
                System.out.println("На " + course + " курсе обучается: " + o.getName());
                hasStudent = true;
            }
        }
        if (!hasStudent) {
            System.out.println("На " + course + " курсче нет студентов.");
        }
    }
}
