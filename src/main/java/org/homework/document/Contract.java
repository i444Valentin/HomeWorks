package org.homework.document;

import org.homework.annotations.RequiredPosition;
import org.homework.base_enum.Position;
import org.homework.document.operations.Deletable;
import org.homework.employee.Employee;

import java.time.LocalDate;

public class Contract implements Deletable {
    private Long id;
    private String position;
    private String level;
    private Long salary;
    private Employee employee;
    private LocalDate attemptDate;
    @RequiredPosition(value = org.homework.base_enum.Position.HIRER)
    private Employee hirer;
    private Boolean isDeleted = false;


    public Contract(Long id, String position, String level, Long salary, Employee employee, LocalDate attemptDate, Employee hirer) throws NoSuchFieldException {
        this.id = id;
        this.position = position;
        this.level = level;
        this.salary = salary;
        this.employee = employee;
        this.attemptDate = attemptDate;
        if (hirer.getPosition().equals(this.getClass().getDeclaredField("hirer").getAnnotation(RequiredPosition.class).value())){
            this.hirer = hirer;
        }else throw new RuntimeException("Для созздания договора работник должен являться работодателем.");

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDate getAttemptDate() {
        return attemptDate;
    }

    public void setAttemptDate(LocalDate attemptDate) {
        this.attemptDate = attemptDate;
    }

    public Employee getHirer() {
        return hirer;
    }

    public void setHirer(Employee hirer) {
        this.hirer = hirer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", position='" + position + '\'' +
                ", level='" + level + '\'' +
                ", salary=" + salary +
                ", employee=" + employee +
                ", attemptDate=" + attemptDate +
                ", hirer=" + hirer.getId() +
                '}';
    }

    @Override
    public void safeDelete() {
    }

    @Override
    public void restore() {
    }

    @Override
    public void delete() {

    }
}
