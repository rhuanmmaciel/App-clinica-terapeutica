package application;

import controllers.MainController;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        try {

            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                 | UnsupportedLookAndFeelException e) {

            e.printStackTrace();

        }

        new MainController();

    }
}