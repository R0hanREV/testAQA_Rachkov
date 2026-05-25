package lesson_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Student {
    private String name;
    private String groupe;
    private int course;
    private ArrayList<Integer> grades;

    public Student(String name, String groupe, int course, List<Integer> grades) {
        this.name = name;
        this.groupe = groupe;
        this.course = course;
        this.grades = new ArrayList<>(grades);
    }

    public String getName() {
        return name;
    }

    public String getGroupe() {
        return groupe;
    }

    public int getCourse() {
        return course;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    double getAverageGrade() {
        int sum = 0;
        for (int o : grades) {
            sum += o;
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", groupe='" + groupe + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }
}
