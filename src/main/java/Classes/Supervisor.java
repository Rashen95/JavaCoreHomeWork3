package Classes;

import java.util.ArrayList;

/**
 * Класс руководителя наследованый от сотрудника
 */
public class Supervisor extends Employee {
    public Supervisor(String firstName, String lastName, int age, String phoneNumber, int salary) {
        super(firstName, lastName, age, phoneNumber, salary);
        this.position = "Руководитель";
    }

    public static void salaryUpAll(ArrayList<Employee> employees, int increaseSize) {
        for (Employee employee : employees) {
            if (!(employee instanceof Supervisor)) {
                employee.setSalary(employee.getSalary() + increaseSize);
            }
        }
    }
}