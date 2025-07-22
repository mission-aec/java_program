// Employee class
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

// Manager class
class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + super.getName() + '\'' +
                ", salary=" + super.getSalary() +
                ", department='" + department + '\'' +
                '}';
    }
}

// Executive class
class Executive extends Manager {
    public Executive(String name, double salary, String department) {
        super(name, salary, department);
    }

    @Override
    public String toString() {
        return "Executive{" +
                "name='" + super.getName() + '\'' +
                ", salary=" + super.getSalary() +
                ", department='" + super.getDepartment() + '\'' +
                '}';
    }
}

// Test program
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 50000.0);
        System.out.println(employee.toString());

        Manager manager = new Manager("Jane Doe", 60000.0, "Marketing");
        System.out.println(manager.toString());

        Executive executive = new Executive("Bob Smith", 70000.0, "Finance");
        System.out.println(executive.toString());
    }
}