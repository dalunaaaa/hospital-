package hospital.services;

import hospital.model.DoctorGeneral;
import java.util.ArrayList;

public class BdDoctores {
    public static ArrayList<DoctorGeneral> ListaDocs() {
        ArrayList<DoctorGeneral> doctores = new ArrayList<>();

        doctores.add(new DoctorGeneral("wilson", "lopez", "cirujano", "Wilsonlp@gmail.com", "12345"));
        doctores.add(new DoctorGeneral("ana", "martínez", "pediatra", "ana.martinez@gmail.com", "54321"));
        doctores.add(new DoctorGeneral("juan", "perez", "cardiólogo", "juan.perez@gmail.com", "67890"));
        doctores.add(new DoctorGeneral("maria", "gómez", "dermatóloga", "maria.gomez@gmail.com", "09876"));
        doctores.add(new DoctorGeneral("carlos", "ramirez", "neurólogo", "carlos.ramirez@gmail.com", "13579"));
        doctores.add(new DoctorGeneral("sofia", "lópez", "ginecóloga", "sofia.lopez@gmail.com", "24680"));
        doctores.add(new DoctorGeneral("andres", "rodríguez", "ortopedista", "andres.rodriguez@gmail.com", "11223"));
        doctores.add(new DoctorGeneral("lucía", "fernández", "endocrinóloga", "lucia.fernandez@gmail.com", "33445"));
        doctores.add(new DoctorGeneral("pedro", "gonzález", "oftalmólogo", "pedro.gonzalez@gmail.com", "55667"));
        doctores.add(new DoctorGeneral("elena", "morales", "psiquiatra", "elena.morales@gmail.com", "77889"));

        return doctores;
    }
}
