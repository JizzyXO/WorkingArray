import task_one.DoubleArray;
import task_two.Academy;
import task_two.Group;
import task_two.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        double[] doubleArray = {1.5, 2.7, 3.2, 4.9, 5.1, 6.4, 7.3, 8.6, 9.9, 10.2};
        DoubleArray array = new DoubleArray(doubleArray);

        int[] integerArrayWithoutRounding = array.getIntegerArrayWithoutRounding();
        int[] integerArrayWithRounding = array.getIntegerArrayWithRounding();

        System.out.println("Integer array without rounding:");
        for (int number : integerArrayWithoutRounding) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Integer array with rounding:");
        for (int number : integerArrayWithRounding) {
            System.out.print(number + " ");
        }
        System.out.println();

        array.sortArrayAscending();

        System.out.println("Sorted array:");
        for (double number : doubleArray) {
            System.out.print(number + " ");
        }
        System.out.println();

        double sumOfPositiveNumbers = array.getSumOfPositiveNumbers();
        System.out.println("Sum of positive numbers: " + sumOfPositiveNumbers);

        Academy academy = new Academy();

        Group group1 = new Group();
        Group group2 = new Group();
        Group group3 = new Group();

        academy.addGroup(group1);
        academy.addGroup(group2);
        academy.addGroup(group3);

        for (int i = 1; i <= 5; i++) {
            Student student = new Student("Name " + i, "Surname " + i, 20 + i, i);
            group1.addStudent(student);
        }

        for (int i = 6; i <= 10; i++) {
            Student student = new Student("Name " + i, "Surname " + i, 20 + i, i);
            group2.addStudent(student);
        }

        for (int i = 11; i <= 15; i++) {
            Student student = new Student("Name " + i, "Surname " + i, 20 + i, i);
            group3.addStudent(student);
        }

        System.out.println("Students in Group 1:");
        List<Student> studentsInGroup1 = group1.getStudents();
        for (Student student : studentsInGroup1) {
            System.out.println(student.getName() + " " + student.getSurname());
        }
        System.out.println();

        System.out.println("Students in Group 2:");
        List<Student> studentsInGroup2 = group2.getStudents();
        for (Student student : studentsInGroup2) {
            System.out.println(student.getName() + " " + student.getSurname());
        }
        System.out.println();

        System.out.println("Students in Group 3:");
        List<Student> studentsInGroup3 = group3.getStudents();
        for (Student student : studentsInGroup3) {
            System.out.println(student.getName() + " " + student.getSurname());
        }
        System.out.println();

        Student specificStudent = group1.getStudents().get(0);
        System.out.println("Information for student " + specificStudent.getName() + " " + specificStudent.getSurname());
        System.out.println("Age: " + specificStudent.getAge());
        System.out.println("Student ID: " + specificStudent.getStudentID());
    }
}
