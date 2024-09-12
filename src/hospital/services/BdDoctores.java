package hospital.services;

import hospital.model.DoctorGeneral;

import java.util.ArrayList;

public class BdDoctores {
    public static ArrayList ListaDocs()  {
        ArrayList<DoctorGeneral> doctores = new ArrayList<>();
        doctores.add(new DoctorGeneral(
                "wilson","lopez", "cirujano", "Wilsonlp@gmail.com", "12345"));
        return doctores;

}

}
