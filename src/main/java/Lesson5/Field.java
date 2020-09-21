package Lesson5;

public class Field {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Andrey Da", "Engineer", "123@mail.ru", "899931245688", 30000, 30);
        employees[1] = new Employee("Andrey DaDa", "Engineer", "12656123@mail.ru", "899931245688", 40000, 42);
        employees[2] = new Employee("Andrey DaDaNet", "Engineer", "1223123@mail.ru", "899931245688", 50000, 22);
        employees[3] = new Employee("Andrey Net", "Engineer", "444123@mail.ru", "899931245688", 60000, 55);
        employees[4] = new Employee("Andrey NetNet", "Engineer", "555123@mail.ru", "899931245688", 70000, 62);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) employees[i].info();
            else continue;
        }
    }

}
