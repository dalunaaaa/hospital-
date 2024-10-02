package hospital.view;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.ArrayList;
import hospital.model.Paciente;
import hospital.services.DataPaciente;

public class DoctorView extends JFrame {

    private int[] pantalla = {1300, 800};
    private HashMap<String, String> dat = new HashMap<>();

    public DoctorView(HashMap<String, String> datos) {
        this.dat = datos;

        setTitle("Perfil del doctor");
        setSize(pantalla[0], pantalla[1]);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // header
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

        JLabel doctorNameLabel = new JLabel(datos.get("nombre"));
        doctorNameLabel.setForeground(Color.WHITE);
        doctorNameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        doctorTextPanel.add(doctorNameLabel);

        JLabel doctorSpecialtyLabel = new JLabel(datos.get("especialidad"));
        doctorSpecialtyLabel.setForeground(Color.WHITE);
        doctorSpecialtyLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        doctorTextPanel.add(doctorSpecialtyLabel);

        doctorInfoPanel.add(doctorTextPanel, BorderLayout.CENTER);

        headerPanel.add(doctorInfoPanel, BorderLayout.EAST);

        add(headerPanel, BorderLayout.NORTH);

        // menulateral
        JPanel menuLateral = componentMenuLateral();
        add(menuLateral, BorderLayout.WEST);

        // aqui se muestran los paciemtess
        JPanel pacientePanel = crearPanelPacientes();
        add(new JScrollPane(pacientePanel), BorderLayout.CENTER);
    }

    // los datos de los pacientes
    private JPanel crearPanelPacientes() {
        JPanel panelPacientes = new JPanel();
        panelPacientes.setLayout(new GridLayout(0, 4));


        panelPacientes.add(crearCabecera("NOMBRE"));
        panelPacientes.add(crearCabecera("FECHA NACIMIENTO"));
        panelPacientes.add(crearCabecera("HORA CITA"));
        panelPacientes.add(crearCabecera("VISITA"));


        ArrayList<Paciente> pacientes = DataPaciente.ListaPacientes();

        //datos de los pacientes
        for (Paciente paciente : pacientes) {
            panelPacientes.add(new JLabel(paciente.getNombre()));
            panelPacientes.add(new JLabel(paciente.getFechaNacimiento()));
            panelPacientes.add(new JLabel(paciente.getHorarioCita()));
            panelPacientes.add(new JLabel(paciente.getMotivoVisita()));
        }

        return panelPacientes;
    }

    //  Titulos de la tabla
    private JLabel crearCabecera(String texto) {
        JLabel label = new JLabel(texto);
        label.setFont(new Font("Arial", Font.BOLD, 14));
        label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        return label;
    }

    //  menú lateral
    private JPanel componentMenuLateral() {
        JPanel menuPanel = new JPanel();
        menuPanel.setPreferredSize(new Dimension(250, pantalla[1]));
        menuPanel.setBackground(Color.DARK_GRAY);

        JPanel menu = new JPanel();
        menu.setLayout(new GridLayout(5, 1));
        menu.setOpaque(true);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;

        //op del menu
        menu.add(op("Consultas del dia"), gbc);
        menu.add(op("Salas"), gbc);
        menu.add(op("Farmacia"), gbc);
        menu.add(op("Pacientes Registrados"), gbc);
        menu.add(op("citar en otra area"), gbc);

        menuPanel.add(menu);
        return menuPanel;
    }


    private JButton op(String texto) {
        JButton op = new JButton(texto);

        op.addActionListener(e -> {
            System.out.println("Opción seleccionada: " + texto);
        });

        return op;
    }
}
