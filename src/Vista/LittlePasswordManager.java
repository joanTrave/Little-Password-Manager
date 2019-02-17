package Vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LittlePasswordManager {
    private JPanel panel1;
    private JPasswordField passwordField2;
    private JButton logginButton;
    static JFrame frame = new JFrame("LittlePasswordManager");
    private JTextField textField1;
    private String name = "test";
    private String password = "pass";


    public LittlePasswordManager() {
        logginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals(name) && passwordField2.getText().equals(password)) {
                    System.out.println("Loggin succed!");
                    MainView mainView = new MainView();
                    mainView.showForm();
                    frame.setVisible(false);
                } else {
                    System.out.println("Error");
                }
            }
        });
    }

    public static void main(String[] args) {
        initFrame();
    }

    private static void initFrame() {
        System.out.println("Loggin Loaded");
        frame.setContentPane(new LittlePasswordManager().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}