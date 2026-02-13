package org.example;

import org.springframework.stereotype.Component;

@Component
public class Company {
    private String companyName = "Dream Product based Company";

    public String getCompanyName() {
        return companyName;
    }
}
