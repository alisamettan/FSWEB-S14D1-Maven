package com.workintech.developers;

public enum Salaries {
    JUNIOR(40000),
    MID(60000),
    SENIOR(80000),
    HRMANAGER(120000);

    private int salary;

    Salaries(int i) {
    }


    public int getSalary() {
        return salary;
    }
}
