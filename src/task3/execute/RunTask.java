package task3.execute;
import task3.classes.Student;
public class RunTask {
    static String name = "Andriy";
    public static void main(String[] args) {
      Student source = new Student();
        String value = source.runTask(name);
        System.out.println(value);
    }
}
