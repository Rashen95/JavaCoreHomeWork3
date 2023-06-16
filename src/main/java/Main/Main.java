/**
 * 1.
 * Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты
 * (сделать статическим) в класс руководителя, модифицируйте метод таким образом, чтобы он мог поднять
 * заработную плату всем, кроме руководителей. В основной программе создайте руководителя и поместите его
 * в общий массив сотрудников. Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя
 * не повысилась.
 * 2*.
 * Сделать компараторы для Сотрудников на основе ЗП и Возраста
 **/

package Main;

import Classes.AgeComparator;
import Classes.Employee;
import Classes.SalaryComparator;
import Classes.Supervisor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Инициализация работников
        Employee e1 = new Employee("Сергей", "Акентьев", 45, "+79381154496", 45000);
        Employee e2 = new Employee("Артем", "Афанасьев", 35, "+79381154596", 47000);
        Employee e3 = new Employee("Павел", "Плетнев", 28, "+79381154696", 33000);
        Employee e4 = new Employee("Алексей", "Какадуев", 30, "+79381154796", 22000);
        Employee e5 = new Employee("Пётр", "Замасков", 25, "+79381154896", 10000);
        Employee e6 = new Supervisor("Николай", "Федоров", 50, "+79381554896", 100000);
        Employee e7 = new Supervisor("Артем", "Привалов", 28, "+79381134495", 170000);

        // Инициализация ArrayList и заполнение работниками
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);

        // Поднять всем не руководителям ЗП на 5000
        Supervisor.salaryUpAll(employees, 5000);

        // Вывести информацию о всех сотрудниках после повышения
        System.out.println("Информация о всех сотрудниках:");
        for (Employee e : employees) {
            System.out.println(e.toString());
        }

        // Сортировка сотрудников по ЗП
        employees.sort(new SalaryComparator());
        System.out.println("========================================");
        System.out.println("Сортировка по ЗП:");
        for (Employee e : employees) {
            System.out.printf("""
                    Имя: %s
                    Фамилия: %s
                    ЗП: %d\n
                    """, e.getFirstName(), e.getLastName(), e.getSalary());
        }

        // Сортировка сотрудников по Возрасту
        employees.sort(new AgeComparator());
        System.out.println("========================================");
        System.out.println("Сортировка по Возрасту:");
        for (Employee e : employees) {
            System.out.printf("""
                    Имя: %s
                    Фамилия: %s
                    ЗП: %d\n
                    """, e.getFirstName(), e.getLastName(), e.getAge());
        }
    }
}
