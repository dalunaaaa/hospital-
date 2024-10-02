package hospital.view;

import javax.swing.*;
import hospital.services.DataFarmacia;
import hospital.model.Medicamento;
import java.awt.*;
import java.util.List;

public class FarmaciaView extends JFrame {

    private DataFarmacia dataFarmacia;

    public FarmaciaView() {
        setTitle("Farmacia");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        dataFarmacia = new DataFarmacia();

        // Obtener los medicamentos
        List<Medicamento> medicamentos = dataFarmacia.getListaMedicamentos();

        // Crear un JTextArea para mostrar la lista de medicamentos
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        for (Medicamento med : medicamentos) {
            textArea.append(med.getNombre() + " - " + med.getFormaFarmaceutica() + " - " +
                    med.getDosis() + "\n");
        }

        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        FarmaciaView farmaciaView = new FarmaciaView();
        farmaciaView.setVisible(true);
    }
}
