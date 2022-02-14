package task4.homework;

import javax.naming.Name;

public class Task4 {

    public static void main(String[] args) {
        // Expected output in Console: <your name> has scored 2 points for Task 4
        // add or update code after this line
        String name = "Anna Vysotskaya";
        Student student = new Student(name);
        student.resolve();


        // end of edit area
        student.printScore();
    }

}
