package com.example.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class ExampleTable {
    private Integer id;

    private String name;

    private String position;

    private String office;

    private Integer age;

    private Date startDate;

    private BigDecimal salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getStartDateOne() {
        return startDate;
    }

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    public Date getStartDateTwo() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {

        return "ExampleTable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", office='" + office + '\'' +
                ", age=" + age +
                ", startDate=" + startDate +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        ExampleTable that = (ExampleTable) o;

        if (!this.id.equals(that.id)) return false;
        if (!this.name.equals(that.name)) return false;
        if (!this.position.equals(that.position)) return false;
        if (!this.office.equals(that.office)) return false;
        if (!this.age.equals(that.age)) return false;
        if (!this.startDate.equals(that.startDate)) return false;
        return this.salary.equals(that.salary);
    }

    @Override
    public int hashCode() {
        int result = this.id.hashCode();
        result = 31 * result + this.name.hashCode();
        result = 31 * result + this.position.hashCode();
        result = 31 * result + this.office.hashCode();
        result = 31 * result + this.age.hashCode();
        result = 31 * result + this.startDate.hashCode();
        result = 31 * result + this.salary.hashCode();
        return result;
    }
}