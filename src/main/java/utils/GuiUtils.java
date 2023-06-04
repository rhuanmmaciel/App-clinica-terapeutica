package utils;

import org.kordamp.ikonli.entypo.Entypo;
import org.kordamp.ikonli.swing.FontIcon;
import views.MainView;

import javax.swing.*;

public class GuiUtils {

    public static void putIcons(JButton button, Entypo iconChoice, int size){

        FontIcon icon = FontIcon.of(iconChoice);
        icon.setIconSize(MainView.WIDTH/MainView.HEIGHT * size);
        button.setIcon(icon);

    }

}
