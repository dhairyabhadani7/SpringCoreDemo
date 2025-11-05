package org.example;

import java.sql.SQLOutput;

public class EmployeeService {
    private String employeeName;
    private Company company;
    private Department dept;

    // Constructor Injection
    public EmployeeService(Company company, Department dept) {
        this.company = company;
        this.dept=dept;
    }

    // Setter Injection for name
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void showDetails() {
        System.out.println("Employee: " + employeeName);
        System.out.println("Company: " + company.getCompanyName());
        System.out.println("Department Name: "+ dept.getDeptName());
        System.out.println("Department Id: "+ dept.getDeptId());
    }
}
