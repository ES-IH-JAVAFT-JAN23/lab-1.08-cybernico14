package com.ironhack.lab_108.classes;

import java.math.BigDecimal;

public class Employee {
    String name;
    BigDecimal salary;
    Employee supervisor;

    public Employee (String name, BigDecimal salary, Employee supervisor){
        this.name = name;
        this.salary = salary;
        this.supervisor = supervisor;
    }

}
