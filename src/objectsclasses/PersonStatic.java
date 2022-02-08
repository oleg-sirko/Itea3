package objectsclasses;

//declaring a class
public class PersonStatic { //class body starts here
    //creating the variables of the class
    static String name;
    static int age;

    //creating the methods of the class
    void eat() {
        //methodBody
    }

    void study() {
        //methodBody
    }

    void play() {
        //methodBody
    }

     public static void main(String args[]) {
        name = "Oleg";
        age = 37;

        System.out.println("Name of the person: " + name);
        System.out.println("Age of the person: " + age);
    } 
}