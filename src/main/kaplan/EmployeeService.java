package main.kaplan;
public class EmployeeService {

    public Employee getEmployeeById(int id) {
        // Simulating a database call
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName("John Doe");
        employee.setDepartment("IT");
        return employee;
    }

    public void saveEmployee(Employee employee) {
        // Simulating a database save operation
        System.out.println("Employee saved: " + employee.toString());
    }

    public void deleteEmployee(int id) {
        // Simulating a database delete operation
        System.out.println("Employee deleted with id: " + id);
    }

    class Employee {
        private int id;
        private String name;
        private String department;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }
    }
}
