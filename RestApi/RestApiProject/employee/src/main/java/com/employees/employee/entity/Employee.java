package main.java.com.employees.employee.entity;

public class Employee {
    private int empId;
    private String empName;
    private String empDesignation;
    private Double empSalary;

    public Employee(int empId, String empName, String empDesignation, Double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
    }

    public Employee(){
    }

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getEmpDesignation() {
        return empDesignation;
    }
    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }
    public Double getEmpSalary() {
        return empSalary;
    }
    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", empDesignation=" + empDesignation
                + ", empSalary=" + empSalary + "]";
    }
    
}
