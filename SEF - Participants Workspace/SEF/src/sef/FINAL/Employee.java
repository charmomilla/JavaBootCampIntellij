package com.company;

public class Employee {
    private String companyName;
    private int id;

    public Employee(String companyName, int id){
        this.companyName = companyName;
        this.id=id;
    }

    public Employee(String companyName) {
        this.companyName = companyName;
    }

    public Employee() {

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String introduce(Person p) {
        return "My name is " + p.getName() + " and I am " + p.getAge() + " years old. I work for company " + companyName;
    }
}
