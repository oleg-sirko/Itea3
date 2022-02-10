package task3.execute;
import task3.classes.Student;

public class RunTask {
    static String name = "Anna Vysoyskya"; //provide your name as value to variable


    public static void main(String[] args) {
        Student sourse = new Student();
        String value = sourse.runTask();
        System.out.println(name + value);/* print result of runTask() method from Student class providing name as input
        Expected output in Console im my case: "Oleg Sirko has scored 3 points for Task3"*/;
    }
}
