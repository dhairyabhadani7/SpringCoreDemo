package org.example;

import org.springframework.stereotype.Component;

@Component
public class Department {
    private String deptName="IT";
    private int deptId=105;

    public String getDeptName() {
        return deptName;
    }
    public int getDeptId() {
        return deptId;
    }

}
