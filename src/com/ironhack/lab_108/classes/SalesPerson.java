package com.ironhack.lab_108.classes;

import com.ironhack.lab_108.classes.Employee;

import java.math.BigDecimal;

public class SalesPerson extends Employee {
    private double commissionRate;

    public SalesPerson(String name, BigDecimal salary, Employee supervisor, double commissionRate) {
        super(name, salary, supervisor);
        this.commissionRate = commissionRate;
    }

    public SalesPerson(String name, BigDecimal salary, Employee supervisor) {
        super(name, salary, supervisor);
    }


    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
}
