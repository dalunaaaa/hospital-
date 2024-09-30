package hospital.view;

import hospital.model.Paciente;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PacienteView extends JPanel {
    private ArrayList<Paciente> pacientes;

    public PacienteView(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        inicializarPanel();
    }

    private void inicializarPanel() {
        JLabel titleLabel = new JLabel("Listado de pacientes.");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(titleLabel);

        String[] campos = {"NOMBRE", "FECHA_NACIMIENTO", "HORARIO_CITA", "VISITA"};
        JPanel headerPanel = new JPanel(new GridLayout(1, campos.length));
        for (String campo : campos) {
            headerPanel.add(new JLabel(campo));
        }
        add(headerPanel);

        for (Paciente paciente : pacientes) {
            add(crearFila(paciente));
        }
    }

    private JPanel crearFila(Paciente paciente) {
        JPanel fila = new JPanel(new GridLayout(1, 4));
        fila.add(new JLabel(paciente.getNombre()));
        fila.add(new JLabel(paciente.getFechaNacimiento()));
        fila.add(new JLabel(paciente.getHorarioCita()));
        fila.add(new JLabel(paciente.getMotivoVisita()));
        return fila;
    }
}
