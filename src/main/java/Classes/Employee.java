package Classes;

public class Employee {
    String firstName;
    String lastName;
    int age;
    String phoneNumber;
    int salary;

    public Employee(String firstName, String lastName, int age, String phoneNumber, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
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

    @Override
    public String toString() {
        return String.format("""
                Имя: %s
                Фамилия: %s
                Возраст: %d
                Номер телефона: %s
                """, getFirstName(), getLastName(), getAge(), getPhoneNumber());
    }
}
