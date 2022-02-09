package task3.execute;
import task3.classes.Student;

public class RunTask {
    static String name = "Konstantin";
    public static void main(String[] args) {
        Student stu = new Student();
        //String name;// = "Konstantin";
        String ans = stu.runTask(name);
        System.out.println(ans);
    }
}
