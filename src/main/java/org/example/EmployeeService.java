package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

@Service
public class EmployeeService {
    private String employeeName="Dhairya Bhadani";
    private final Company company;
    private final Department dept;

    @Autowired
    public EmployeeService(Company company, Department dept) {
        this.company = company;
        this.dept=dept;
    }

    public void showDetails() {
        System.out.println("Employee: " + employeeName);
        System.out.println("Company: " + company.getCompanyName());
        System.out.println("Department Name: "+ dept.getDeptName());
        System.out.println("Department Id: "+ dept.getDeptId());
    }
}
