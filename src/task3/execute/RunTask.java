package task3.execute;

import task3.classes.Student;

public class RunTask {

    public String runMethod() {
        String name = "Abror";
        return name;
    }


    public static void main(String[] args) {
        Student person1 = new Student();
        String messageOut = person1.runTask("Abror");
        System.out.println(messageOut);
    }
}
