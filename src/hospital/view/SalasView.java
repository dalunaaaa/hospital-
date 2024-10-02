package hospital.view;

import hospital.model.Sala;
import hospital.services.DataSalas;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SalasView extends JFrame {

    private String nombre;
    private String estado;
    private ArrayList<String> estados = new ArrayList<>();

    public SalasView() {
        estados.add("En uso");
        estados.add("Fuera de servicio");
        estados.add("Disponible");

        setTitle("Salas");
        setSize(700, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelSalas = new JPanel();
        panelSalas.setLayout(new GridLayout(3, 4, 29, 29)); // Distribución de la grilla de las salas

        // Salas y agg al panel
        ArrayList<Sala> salas = DataSalas.ListaSalas();
        for (Sala sala : salas) {
            panelSalas.add(crearPanelSala(sala.getNombre(), sala.getEstado()));
        }

        add(panelSalas, BorderLayout.CENTER);
    }


    private JPanel crearPanelSala(String nombre, String estado) {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        JLabel labelNombre = new JLabel(nombre, SwingConstants.CENTER);
        panel.add(labelNombre);

        switch (estado) {
            case "En uso":
                panel.setBackground(Color.PINK);
                break;
            case "Fuera de servicio":
                panel.setBackground(Color.MAGENTA);
                break;
            case "Disponible":
                panel.setBackground(Color.LIGHT_GRAY);
                break;
            default:
                panel.setBackground(Color.ORANGE);
                break;
        }

        return panel;
    }

    public static void main(String[] args) {
        SalasView salasView = new SalasView();
        salasView.setVisible(true);
    }
}
