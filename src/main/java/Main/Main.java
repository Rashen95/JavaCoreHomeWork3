package Main;

import Classes.Employee;
import Classes.Supervisor;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Сергей", "Акентьев", 45, "+79381154496", 45000);
        if (e1 instanceof Supervisor) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
