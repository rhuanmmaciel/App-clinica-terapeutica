package controllers;

import entities.Patient;
import entities.aux.RG;
import entities.aux.Sex;
import views.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class MainController extends MainView implements ActionListener {

    private JPanel actualPane = new HomeView();

    public MainController(){

        super();
        listenerButtons();
        mainPane.add(actualPane, BorderLayout.CENTER);
        PatientsController.addPatient(new Patient("Fernanda de Souza Farias", "04033528008", Sex.FEMALE, LocalDate.of(2001, 1, 4), new RG("5123178881", "SSP", LocalDate.now())));
        PatientsController.addPatient(new Patient("Maicon", "04033528008", Sex.MALE,  LocalDate.of(2001, 1, 4), new RG("5123178881", "SSP", LocalDate.now())));
        PatientsController.addPatient(new Patient("Josué", "04033528008", Sex.MALE,  LocalDate.of(2001, 1, 4), new RG("5123178881", "SSP", LocalDate.now())));
        PatientsController.addPatient(new Patient("Maria", "04033528008", Sex.FEMALE, LocalDate.of(2001, 1, 4) , new RG("5123178881", "SSP", LocalDate.now())));
        PatientsController.addPatient(new Patient("Teresa", "04033528008", Sex.FEMALE,  LocalDate.of(2001, 1, 4), new RG("5123178881", "SSP", LocalDate.now())));
        PatientsController.addPatient(new Patient("Fabio", "04033528008", Sex.MALE, LocalDate.of(2001, 1, 4), new RG("5123178881", "SSP", LocalDate.now())));
        PatientsController.addPatient(new Patient("Moisés", "04033528008", Sex.MALE,  LocalDate.of(2001, 1, 4), new RG("5123178881", "SSP", LocalDate.now())));
        PatientsController.addPatient(new Patient("Vanessa", "04033528008", Sex.FEMALE,  LocalDate.of(2001, 1, 4), new RG("5123178881", "SSP", LocalDate.now())));

    }

    private void listenerButtons(){

        btnHome.addActionListener(this);
        btnPatients.addActionListener(this);
        btnResponsibles.addActionListener(this);
        btnEvolutions.addActionListener(this);

    }

    private void changeScreen(JPanel pane){

        mainPane.remove(actualPane);
        actualPane = pane;
        mainPane.add(actualPane, BorderLayout.CENTER);
        revalidate();

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if(actionEvent.getSource() == btnHome)
            changeScreen(new HomeView());
        if(actionEvent.getSource() == btnEvolutions)
            changeScreen(new EvolutionsView());
        if(actionEvent.getSource() == btnPatients)
            changeScreen(new PatientsView());
        if(actionEvent.getSource() == btnResponsibles)
            changeScreen(new ResponsiblesView());

    }
}
