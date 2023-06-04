package views;

import controllers.PatientsController;
import entities.Patient;
import org.kordamp.ikonli.entypo.Entypo;
import utils.GuiUtils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;;

public class PatientsView extends JPanel {

    private final List<Patient> patients = PatientsController.getPatients();

    public PatientsView() {

        initGUI();

    }

    private void initGUI(){

        setLayout(new BorderLayout());

        initCenter();
        initBottom();

    }

    private void initCenter() {
        JPanel centerPane = new JPanel(new GridBagLayout());
        centerPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        add(centerPane, BorderLayout.CENTER);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(10, 10, 10, 10);

        centerPane.add(createStyledLabel("Id"), gbc);
        gbc.gridx++;
        centerPane.add(createStyledLabel("Nome"), gbc);
        gbc.gridx++;
        centerPane.add(createStyledLabel("CPF"), gbc);
        gbc.gridx++;
        centerPane.add(createStyledLabel("Ações"), gbc);

        for (int i = 0; i < 10 && i < patients.size(); i++) {

            gbc.gridx = 0;
            gbc.gridy++;

            String id, name, cpf;

            Patient patient = patients.get(i);
            name = patient.getName();
            id = String.valueOf(patient.getId());
            cpf = patient.getCpf();

            centerPane.add(createPatientPanel(id), gbc);
            gbc.gridx++;
            centerPane.add(createPatientPanel(name), gbc);
            gbc.gridx++;
            centerPane.add(createPatientPanel(cpf), gbc);
            gbc.gridx++;
            centerPane.add(createPatientActionsPanel(), gbc);

        }
    }

    private JPanel createPatientActionsPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(240, 240, 240));
        panel.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(Color.GRAY, 2),
                new EmptyBorder(5, 5, 5, 5)
        ));
        panel.setLayout(new GridLayout(1, 3, 5, 0));

        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        GuiUtils.putIcons(button1, Entypo.EYE, 20);
        GuiUtils.putIcons(button2, Entypo.PENCIL, 20);
        GuiUtils.putIcons(button3, Entypo.CROSS, 20);

        return panel;
    }

    private void initBottom(){

        JPanel buttonPanel = new JPanel();
        add(buttonPanel, BorderLayout.SOUTH);

        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        JButton previousButton = new JButton();
        previousButton.setFont(previousButton.getFont().deriveFont(Font.BOLD, 18));
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ação do botão "<"
            }
        });
        buttonPanel.add(previousButton);

        JButton nextButton = new JButton();
        nextButton.setFont(nextButton.getFont().deriveFont(Font.BOLD, 18));
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ação do botão ">"
            }
        });
        buttonPanel.add(nextButton);

        GuiUtils.putIcons(previousButton, Entypo.ARROW_BOLD_LEFT, 30);
        GuiUtils.putIcons(nextButton, Entypo.ARROW_BOLD_RIGHT, 30);

    }

    private JPanel createPatientPanel(String text) {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(240, 240, 240));
        panel.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(Color.GRAY, 2),
                new EmptyBorder(10, 10, 10, 10)
        ));
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel(text);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(label.getFont().deriveFont(Font.BOLD, 16));
        panel.add(label, BorderLayout.CENTER);

        return panel;
    }

    private JLabel createStyledLabel(String text) {
        JLabel label = new JLabel(text);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(label.getFont().deriveFont(Font.BOLD, 18));
        label.setBackground(new Color(200, 200, 200));
        label.setOpaque(true);
        label.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(Color.GRAY, 2),
                new EmptyBorder(10, 10, 10, 10)
        ));
        return label;
    }

}