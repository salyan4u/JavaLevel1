package Lesson5;

public class Employee {
    private String name;
    private String pos;
    private String email;
    private String telephone;
    private int salary;
    public int age;

    public Employee(String name, String pos, String email, String telephone, int salary, int age) {
        this.name = name;
        this.pos = pos;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {
        name = "Иванов Иван Иванович";
        pos = "Стажер";
        email = "gmail@gmail.com";
        telephone = "8(111)111-11-11";
        salary = 40000;
        age = 40;
    }

    public void info() {
        System.out.println("Имя: " + name + "; " + "должность: " + pos + "; " + "email: " + email + "; " + "телефон: " + telephone + "; " + "з/п: " + salary + "; " + "возраст: " + age + ".");
    }

}
