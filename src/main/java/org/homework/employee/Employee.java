package org.homework.employee;

import org.homework.base_enum.Gender;
import org.homework.base_enum.Position;
import org.homework.document.Contract;
import org.homework.document.Passport;
import org.homework.person.Person;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee extends Person {
    private Integer employeeNumber;
    private LocalDateTime startWork;
    private Contract contract;
    private Position position;

    public Employee(Long id, String firstName, String lastName, Gender gender, LocalDate birthDate,
                    Passport passport, Integer employeeNumber, LocalDateTime startWork, Contract contract, Position position) {
        super(id, firstName, lastName, gender, birthDate, passport);
        this.employeeNumber = employeeNumber;
        this.startWork = startWork;
        this.contract = contract;
        this.position = position;
    }

    public Employee() {
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public LocalDateTime getStartWork() {
        return startWork;
    }

    public void setStartWork(LocalDateTime startWork) {
        this.startWork = startWork;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                "employeeNumber=" + employeeNumber +
                ", startWork=" + startWork +
                ", contract=" + contract +
                ", position=" + position +
                '}';
    }
}
