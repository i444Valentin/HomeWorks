package org.homework.document;

import org.homework.document.operations.Deletable;
import org.homework.locate.Locate;
import org.homework.person.Person;

public class Passport implements Deletable {
    private Long id;
    private Long serial;
    private Long number;
    private Locate locateBirth;
    private Locate locateRegistration;
    private Person person;
    private Boolean isDeleted = false;

    public Passport(Long id, Long serial, Long number, Locate locateBirth, Locate locateRegistration) {
        this.id = id;
        this.serial = serial;
        this.number = number;
        this.locateBirth = locateBirth;
        this.locateRegistration = locateRegistration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSerial() {
        return serial;
    }

    public void setSerial(Long serial) {
        this.serial = serial;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Locate getLocateBirth() {
        return locateBirth;
    }

    public void setLocateBirth(Locate locateBirth) {
        this.locateBirth = locateBirth;
    }

    public Locate getLocateRegistration() {
        return locateRegistration;
    }

    public void setLocateRegistration(Locate locateRegistration) {
        this.locateRegistration = locateRegistration;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", serial=" + serial +
                ", number=" + number +
                ", locateBirth=" + locateBirth +
                ", locateRegistration=" + locateRegistration +
                ", person ID=" + person.getId() +
                '}';
    }

    @Override
    public void delete() {
        isDeleted = true;
    }

    @Override
    public void restore() {
        isDeleted=false;
    }

}
