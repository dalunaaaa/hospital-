import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame miVentana = new JFrame("dmLuna");
        miVentana.setSize(1800, 1000);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridLayout(1, 2));
        mainPanel.setBackground(Color.black);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.gray);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.PINK);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

        mainPanel.add(panel1);
        mainPanel.add(panel2);

        // Crear y centrar el formulario de login en panel2
        crearFormularioLogin(panel2);

        miVentana.add(mainPanel);
        miVentana.setVisible(true);
    }

    private static void crearFormularioLogin(JPanel panel) {
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // correo electrónico
        JTextField correo = new JTextField(20);
        correo.setMaximumSize(correo.getPreferredSize());
        panel.add(Box.createVerticalStrut(300));
        panel.add(correo);
        panel.add(Box.createVerticalStrut(25));

        // contraseña
        JPasswordField contraseña = new JPasswordField(20);
        contraseña.setMaximumSize(contraseña.getPreferredSize());
        panel.add(contraseña);
        panel.add(Box.createVerticalStrut(20));

        // Botón de iniciar sesión

        JButton iniciarSesion = new JButton("Iniciar sesión");
        iniciarSesion.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(iniciarSesion);
        panel.add(Box.createVerticalStrut(100));
    }
}
