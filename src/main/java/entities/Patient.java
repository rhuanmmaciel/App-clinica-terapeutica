package entities;

import controllers.PatientsController;
import entities.aux.RG;
import entities.aux.Sex;
;import java.time.LocalDate;

public class Patient {

    private int id = PatientsController.getPatients().size();
    private String name;
    private Sex sex;
    private LocalDate birthDate;
    private String cpf;
    private RG rg;

    public Patient(String name, String cpf, Sex sex, LocalDate birthDate, RG rg){

        this.name = name;
        this.cpf = cpf;
        this.sex = sex;
        this.birthDate = birthDate;
        this.rg = rg;

    }

    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public RG getRg() {
        return rg;
    }
}
