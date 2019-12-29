package com.leetcode;

public class Employee extends Person {
    private String company;

    public Employee(String name) {
        this.setName(name);

    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    public void setCompany(String company, String name) {
        this.setName(name);
        this.company = company;
    }

    public static void main(String[] args) {
        Employee e = new Employee("John");
        e.setCompany("Google","Steve");
        e.setCompany("Google");

        System.out.println(e.getCompany());
    }


}
