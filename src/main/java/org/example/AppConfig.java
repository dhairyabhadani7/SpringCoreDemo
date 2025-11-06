package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
        @Bean
        public Company companyBean() {
            Company c = new Company();
            c.setCompanyName("Dream Product Based Company");
            return c;
        }

        @Bean
        public Department departmentBean() {
            Department d = new Department();
            d.setDeptId(105);
            d.setDeptName("IT");
            return d;
        }

        @Bean
        public EmployeeService employeeServiceBean() {
            return new EmployeeService(companyBean(), departmentBean());
        }
    }

