package objectsclasses;

public class Person {

    public String name;
    public int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void printData() {
        System.out.println("Name of the person: " + name);
        System.out.println("Age of the person: " + age);
    }
}