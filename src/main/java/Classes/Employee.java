package Classes;

/**
 * Класс сотрудника
 */
public class Employee {
    static int id = 0;

    String firstName;
    String lastName;
    int age;
    String phoneNumber;
    int salary;
    int uid;
    String position;

    public Employee(String firstName, String lastName, int age, String phoneNumber, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.uid += id;
        this.position = "Рядовой работник";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Employee.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Вывод информации о сотруднике
     *
     * @return строка с информацией о сотруднике
     */
    @Override
    public String toString() {
        return String.format("""
                ========================================
                Имя: %s
                Фамилия: %s
                Возраст: %d
                Номер телефона: %s
                Заработная плата: %s
                Должность: %s
                """, getFirstName(), getLastName(), getAge(), getPhoneNumber(), getSalary(), getPosition());
    }
}
