package org.homework.employee;

import org.homework.base_enum.Gender;
import org.homework.base_enum.Position;
import org.homework.document.Contract;
import org.homework.document.Passport;
import org.homework.locate.Locate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;


class EmployeeTest {

    Locate locate1;
    Locate locate2;
    Passport passport;
    Employee employeeHirer;
    Contract contract1;
    Contract contract2;
    Employee employee;

    @BeforeEach
    void setUp() {
        locate1 = new Locate(1L,"Moscow","Pushkina","Moscow Region",20,40);
        locate2 = new Locate(2L,"Moscow","Leonova","Moscow Region",124,4);
        passport = new Passport(1L,5615L,229945L,locate1,locate2);
        contract1 = new Contract(1L,Position.DEVELOPER,"Junior",55000L,LocalDate.parse("2022-12-03"));
        contract2 = new Contract(2L,Position.HIRER,"Senior",200000L,LocalDate.parse("2010-11-09"));

        employeeHirer = new Employee(12L,
                "Иванов",
                "Иван",
                Gender.MALE,
                LocalDate.parse("1990-12-24"),
                passport,
                990,
                LocalDateTime.parse("2022-12-04T12:00"),
                contract2,
                Position.HIRER);
        employee = new Employee(12L,
                "Иванов",
                "Иван",
                Gender.MALE,
                LocalDate.parse("1990-12-24"),
                passport,
                932,
                LocalDateTime.parse("2022-12-04T12:00"),
                contract1,
                Position.BACKEND_DEVELOPER);

        contract1.setHirer(employeeHirer);
        contract2.setHirer(employeeHirer);
        passport.setPerson(employee);
        contract1.setEmployee(employee);
        contract2.setEmployee(employeeHirer);
    }
    @Test
    void try_print_info_about_employee(){
        System.out.println(employee);
    }

    @Test
    void try_print_employee_hirer(){
        System.out.println(employeeHirer);
    }

    @Test
    void try_id_is_non_hirer(){
        Exception exception = Assertions.assertThrows(RuntimeException.class, () -> {
            employeeHirer.setPosition(Position.DEVELOPER);
            contract1.setHirer(employeeHirer);
        });

        String actual = "Для создания договора работник должен являться работодателем.";
        Assertions.assertTrue(actual.contains(exception.getMessage()));

    }

    @Test
    void try_delete_passport(){
        Exception exception = Assertions.assertThrows(RuntimeException.class, () -> {
            passport.delete();
            passport.delete();
        });

        String actual = "Документ уже удален!";
        Assertions.assertTrue(actual.contains(exception.getMessage()));
    }

    @Test
    void try_delete_contract(){
        Exception exception = Assertions.assertThrows(RuntimeException.class, () -> {
            passport.delete();
            passport.delete();
        });

        String actual = "Документ уже удален!";
        Assertions.assertTrue(actual.contains(exception.getMessage()));
    }

    @Test
    void try_restore_passport(){
            passport.delete();
            passport.restore();
    }

    @Test
    void try_restore_contract(){
            contract1.delete();
            contract1.restore();
    }

}