package org.homework.document;

import org.homework.annotations.RequiredPosition;
import org.homework.base_enum.Position;
import org.homework.document.operations.Deletable;
import org.homework.employee.Employee;

import java.time.LocalDate;

public class Contract implements Deletable {
    private Long id;
    private Position position;
    private String level;
    private Long salary;
    private Employee employee;
    private LocalDate attemptDate;
    @RequiredPosition(value = org.homework.base_enum.Position.HIRER)
    private Employee hirer;
    private Boolean isDeleted = false;


    public Contract() {
    }

    public Contract(Long id, Position position, String level, Long salary, LocalDate attemptDate) {
        this.id = id;
        this.position = position;
        this.level = level;
        this.salary = salary;
        this.attemptDate = attemptDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
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
        try {
            if (hirer.getPosition().equals(this.getClass().getDeclaredField("hirer").getAnnotation(RequiredPosition.class).value())) {
                this.hirer = hirer;
            } else throw new RuntimeException("Для создания договора работник должен являться работодателем.");
        }catch (NoSuchFieldException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", position='" + position + '\'' +
                ", level='" + level + '\'' +
                ", salary=" + salary +
                ", employee=" + employee.getId() +
                ", attemptDate=" + attemptDate +
                ", hirer=" + hirer.getId() +
                '}';
    }

    @Override
    public void delete() {
        if (isDeleted) throw new RuntimeException("Документ уже удален!");
        else isDeleted = true;
    }

    @Override
    public void restore() {
        if (isDeleted) isDeleted = false;
        else throw new RuntimeException("Документ не был удален!");

    }

}
