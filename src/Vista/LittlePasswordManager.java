package Vista;

import javax.swing.*;

public class LittlePasswordManager {
    private JPanel panel1;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JButton logginButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("LittlePasswordManager");
        frame.setContentPane(new LittlePasswordManager().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}