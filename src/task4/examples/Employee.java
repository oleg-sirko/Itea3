package task4.examples;

class Employee extends Person{
    public Employee(String name){
        super(name);    // если базовый класс определяет конструктор
        //  то производный класс должен его вызвать
    }

}
