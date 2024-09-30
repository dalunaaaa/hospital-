package backEnde;

import hospital.services.DataDoctores;
import hospital.model.DoctorGeneral;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class BackEnde {
    public BackEnde(String email) {}


    public Map<String, String> validarDatos(String usuario, String contrasena) {
        Map<String, String> resultado = new HashMap<>();
        ArrayList<DoctorGeneral> doctores = DataDoctores.ListaDocs();

        Optional<DoctorGeneral> doctorEncontrado = doctores.stream()
                .filter(doctor -> doctor.getEmail().equals(usuario))
                .findFirst();

        if (doctorEncontrado.isPresent()) {
            DoctorGeneral doctor = doctorEncontrado.get();
            resultado.put("Usuario", doctor.getNombre() + " " + doctor.getApellido());
            resultado.put("Especialidad", doctor.getEspecialidad());
            resultado.put("Email", doctor.getEmail());
        } else {
            resultado.put("Error", "Usuario no encontrado");
        }

        return resultado;
    }

}
