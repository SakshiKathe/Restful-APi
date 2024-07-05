package main.java.com.employees.employee.dao;

public interface EmpRepsitory extends CrudRepository<Employee, Integer>{
    public Employee findById(int id);
}
