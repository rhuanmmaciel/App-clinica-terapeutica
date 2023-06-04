package views;

import org.kordamp.ikonli.entypo.Entypo;
import utils.GuiUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainView extends JFrame {

    public static final int WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
    public static final int HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
    public static final Dimension SCREEN_DIMENSION = new Dimension(WIDTH, HEIGHT);

    protected final JPanel mainPane = new JPanel();

    private final JToolBar toolBar = new JToolBar();
    protected final JButton btnHome = new JButton();
    protected final JButton btnPatients = new JButton();
    protected final JButton btnEvolutions = new JButton();
    protected final JButton btnResponsibles = new JButton();

    {
        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {

                System.exit(0);

            }

        });
    }

    public MainView() {

        super("Sítio Luz do Sol");
        initGUI();

    }

    private void initGUI(){

        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);

        setContentPane(mainPane);
        mainPane.setLayout(new BorderLayout());

        initHeader();

        setVisible(true);

    }

    private void initHeader(){

        mainPane.add(toolBar, BorderLayout.NORTH);

        toolBar.setFloatable(false);

        toolBar.add(btnHome);
        toolBar.add(btnPatients);
        toolBar.add(btnEvolutions);
        toolBar.add(btnResponsibles);

        GuiUtils.putIcons(btnHome, Entypo.HOME, 50);
        GuiUtils.putIcons(btnEvolutions, Entypo.CLIPBOARD, 50);
        GuiUtils.putIcons(btnPatients, Entypo.USER, 50);
        GuiUtils.putIcons(btnResponsibles, Entypo.USERS, 50);

    }

}
