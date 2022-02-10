package task4.homework;

public class Student {
    private String name = "John Doe";
    private int score = 0;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    private void addScore (){
        score = 2;
    }

    public void resolve (){
        addScore();
    }

    final void printScore() {
        System.out.println(name + " has scored " + score + " points for Task 4");
    }
}
