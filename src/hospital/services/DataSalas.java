package hospital.services;

import hospital.model.Sala;
import java.util.ArrayList;

public class DataSalas {
    public static ArrayList<Sala> ListaSalas() {
        ArrayList<Sala> salas = new ArrayList<>();

        salas.add(new Sala("Sala de Emergencias", "En uso"));
        salas.add(new Sala("Sala de Cirugía 1", "Disponible"));
        salas.add(new Sala("Sala de Cirugía 2", "Fuera de servicio"));
        salas.add(new Sala("Sala de Cuidados Intensivos", "En uso"));
        salas.add(new Sala("Sala de Radiología", "Disponible"));
        salas.add(new Sala("Sala de Maternidad", "En uso"));
        salas.add(new Sala("Sala de Pediatría", "Disponible"));
        salas.add(new Sala("Sala de Cardiología", "En uso"));
        salas.add(new Sala("Sala de Recuperación", "Disponible"));
        salas.add(new Sala("Sala de Oncología", "Fuera de servicio"));
        salas.add(new Sala("Sala de Neurología", "Disponible"));
        salas.add(new Sala("Sala de Terapia Física", "En uso"));

        return salas;
    }
}
