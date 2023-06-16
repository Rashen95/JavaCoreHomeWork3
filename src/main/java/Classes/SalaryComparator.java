package Classes;

import java.util.Comparator;

/**
 * Компаратор по заработной плате
 */
public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}