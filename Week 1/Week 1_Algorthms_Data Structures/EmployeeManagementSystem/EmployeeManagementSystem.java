import java.util.ArrayList;

public class EmployeeManagementSystem {
    private ArrayList<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
    }

    // Add Employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Search Employee
    public Employee searchEmployee(int employeeId) {
        for (Employee emp : employees) {
            if (emp.getEmployeeId() == employeeId) {
                return emp;
            }
        }
        return null;
    }

    // Traverse Employees
    public void traverseEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    // Delete Employee
    public void deleteEmployee(int employeeId) {
        Employee toRemove = null;
        for (Employee emp : employees) {
            if (emp.getEmployeeId() == employeeId) {
                toRemove = emp;
                break;
            }
        }
        if (toRemove != null) {
            employees.remove(toRemove);
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        
        // Adding employees
        ems.addEmployee(new Employee(1, "Alice", "Developer", 50000));
        ems.addEmployee(new Employee(2, "Bob", "Manager", 60000));

        // Traversing employees
        ems.traverseEmployees();

        // Searching for an employee
        Employee emp = ems.searchEmployee(1);
        if (emp != null) {
            System.out.println("Found Employee: " + emp);
        } else {
            System.out.println("Employee not found.");
        }

        // Deleting an employee
        ems.deleteEmployee(1);
        ems.traverseEmployees();
    }
}
