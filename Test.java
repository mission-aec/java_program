// Employee.java


class Employee {

    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{"
                + "name='" + name + '\''
                + ", id=" + id
                + ", salary=" + salary
                + '}';
    }
}
// Manager.java

class Manager extends Employee {

    private String department;

    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Manager{"
                + "name='" + getName() + '\''
                + ", id=" + getId()
                + ", salary=" + getSalary()
                + ", department='" + department + '\''
                + '}';
    }
}
// Executive.java
class Executive extends Manager {

    private double bonus;

    public Executive(String name, int id, double salary, String department, double bonus) {
        super(name, id, salary, department);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Executive{"
                + "name='" + getName() + '\''
                + ", id=" + getId()
                + ", salary=" + getSalary()
                + ", department='" + getDepartment() + '\''
                + ", bonus=" + bonus
                + '}';
    }
}
// Test.java

public class Test {

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 1, 50000.0);
        Manager manager = new Manager("Jane Doe", 2, 60000.0, "HR");
        Executive executive = new Executive("Bob Smith", 3, 70000.0, "Finance", 10000.0);

        System.out.println(employee.toString());
        System.out.println(manager.toString());
        System.out.println(executive.toString());
    }
}
