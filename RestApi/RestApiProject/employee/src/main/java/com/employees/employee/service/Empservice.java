package main.java.com.employees.employee.service;

public interface Empservice {
    public List<Employee> getALlEmployees();

    public Employee getEmployeeById(int id);

    public Employee addEmployee();

    public void deleteEmployee(int empId);

    public void updateEmployee();

}
