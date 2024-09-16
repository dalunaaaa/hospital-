package hospital.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    // Objetos globales
    private JLabel lEmail;
    private JTextField tEmail;
    private JLabel lPass;
    private JPasswordField tPass;
    private JButton bAcceder;

    public LoginView() {
        setTitle("Acceso");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel p = new JPanel();
        p.setLayout(new GridBagLayout());
        p.setBackground(new Color(245, 245, 245));
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 10, 10, 10);
        c.fill = GridBagConstraints.HORIZONTAL;

        // Correo
        lEmail = new JLabel("Correo:");
        lEmail.setForeground(new Color(0, 102, 204));
        c.gridx = 0;
        c.gridy = 0;
        p.add(lEmail, c);

        tEmail = new JTextField(20);
        c.gridx = 1;
        p.add(tEmail, c);

        // Contraseña
        lPass = new JLabel("Contraseña:");
        lPass.setForeground(new Color(0, 102, 204));
        c.gridx = 0;
        c.gridy = 1;
        p.add(lPass, c);

        tPass = new JPasswordField(20);
        c.gridx = 1;
        p.add(tPass, c);

        // Botón "Acceder"
        bAcceder = new JButton("Acceder");
        bAcceder.setBackground(new Color(0, 153, 76));
        bAcceder.setForeground(Color.WHITE);
        c.gridx = 1;
        c.gridy = 2;
        p.add(bAcceder, c);

        add(p);
        setVisible(true);
    }


    public String getEmail() {
        return tEmail.getText(); // Cambiado para obtener el texto de tEmail
    }


    public void addLoginListener(ActionListener listener) {
        bAcceder.addActionListener(listener);
    }
}
