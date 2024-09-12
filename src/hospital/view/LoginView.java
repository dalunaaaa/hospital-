package hospital.view;

import javax.swing.*;
import java.awt.*;

class Login extends JFrame {

    public Login() {
        
        setTitle("Acceso");
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Ocupa toda la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana

        JPanel p = new JPanel();
        p.setLayout(new GridBagLayout());
        p.setBackground(new Color(245, 245, 245)); // Gris claro
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 10, 10, 10); // Espaciado
        c.fill = GridBagConstraints.HORIZONTAL;

        // Crear etiquetas y campos
        JLabel lEmail = new JLabel("Correo:");
        lEmail.setForeground(new Color(0, 102, 204)); // Azul
        JTextField tEmail = new JTextField(20);
        JLabel lPass = new JLabel("Contraseña:");
        lPass.setForeground(new Color(0, 102, 204)); // Azul
        JPasswordField tPass = new JPasswordField(20);
        JButton bAcceder = new JButton("Acceder");
        bAcceder.setBackground(new Color(0, 153, 76));
        bAcceder.setForeground(Color.WHITE);


        c.gridx = 0;
        c.gridy = 0;
        p.add(lEmail, c);

        c.gridx = 1;
        p.add(tEmail, c);

        c.gridx = 0;
        c.gridy = 1;
        p.add(lPass, c);

        c.gridx = 1;
        p.add(tPass, c);

        c.gridx = 1;
        c.gridy = 2;
        p.add(bAcceder, c);

        // Añadir el panel al marco
        add(p);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Login::new);
    }
}


