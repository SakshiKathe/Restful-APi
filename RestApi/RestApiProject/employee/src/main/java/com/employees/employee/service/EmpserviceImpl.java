package main.java.com.employees.employee.service;

import java.util.List;

import main.java.com.employees.employee.dao.EmpRepsitory;
import main.java.com.employees.employee.entity.Employee;

@Service
public class EmpserviceImpl implements Empservice{

    @Autowired
    private EmpRepsitory empRepsitory;
    
    //get All Employees
    public List<Employee> getALlEmployees(){
        List<Employee> list = (List<Employee>) this.findAll();
        return list;
    }

    //get single employee by id
    public Employee getEmployeeById
}
