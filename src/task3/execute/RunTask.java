package task3.execute;

import task3.classes.Student;

public class RunTask {
    static String name = "Serhii Matvieiev"; //provide your name as value to variable

    public static void main(String[] args) {
        Student student = new Student();
        String value = student.runTask(name);
        System.out.println(value);
    }
}
