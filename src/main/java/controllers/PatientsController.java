package controllers;

import entities.Patient;

import java.util.ArrayList;
import java.util.List;

public class PatientsController {

    private static final List<Patient> patients = new ArrayList<>();

    public static void addPatient(Patient patient){
        patients.add(patient);
    }

    public static List<Patient> getPatients(){
        return List.copyOf(patients);
    }

}
