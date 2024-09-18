package hospital.view;

import javax.swing.*;
import java.awt.*;

public class DoctorView extends JFrame {

    private int[] pantalla = {1300, 800};

    public DoctorView() {

        setTitle("Perfil del doctor");
        setSize(pantalla[0], pantalla[1]);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(1300, 60));
        headerPanel.setBackground(Color.DARK_GRAY);
        headerPanel.setLayout(new BorderLayout());


        JLabel hospitalNameLabel = new JLabel("Hospital Santa Catalina");
        hospitalNameLabel.setForeground(Color.WHITE);
        hospitalNameLabel.setFont(new Font("Arial", Font.BOLD, 18));
        headerPanel.add(hospitalNameLabel, BorderLayout.WEST);


        JPanel doctorInfoPanel = new JPanel();
        doctorInfoPanel.setLayout(new BorderLayout());
        doctorInfoPanel.setOpaque(false);


        JPanel logoPanel = new JPanel();
        logoPanel.setPreferredSize(new Dimension(50, 50));
        logoPanel.setBackground(Color.YELLOW); // Color del "logo"
        doctorInfoPanel.add(logoPanel, BorderLayout.WEST);


        JPanel doctorTextPanel = new JPanel();
        doctorTextPanel.setLayout(new GridLayout(2, 1));
        doctorTextPanel.setOpaque(false);

        JLabel doctorNameLabel = new JLabel("Dania Luna");
        doctorNameLabel.setForeground(Color.WHITE);
        doctorNameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        doctorTextPanel.add(doctorNameLabel);

        JLabel doctorSpecialtyLabel = new JLabel("Doctor General");
        doctorSpecialtyLabel.setForeground(Color.WHITE);
        doctorSpecialtyLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        doctorTextPanel.add(doctorSpecialtyLabel);


        doctorInfoPanel.add(doctorTextPanel, BorderLayout.CENTER);


        headerPanel.add(doctorInfoPanel, BorderLayout.EAST);


        add(headerPanel, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        DoctorView doctorView = new DoctorView();
        doctorView.setVisible(true);
    }
}

