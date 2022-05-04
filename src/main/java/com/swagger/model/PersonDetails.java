package com.swagger.model;

public class PersonDetails {

    private String firstName;
    private String lastName;
    private String department;
    private Long salary;
    private Integer id;

    public PersonDetails (Integer id, String firstName, String lastName, String department, Long salary) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public PersonDetails (PersonDetails  person ) {
        super();
        this.id =  person.id;
        this.firstName =  person.firstName;
        this.lastName =  person.lastName;
        this.department =  person.department;
        this.salary = person.salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

}