package hospital.controller;

import hospital.model.DoctorGeneral;
import hospital.view.DoctorView;
import hospital.view.LoginView;
import hospital.services.DataDoctores;

import javax.swing.*;
import java.util.HashMap;

public class LoginController {
    private LoginView loginView;

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        this.loginView.addLoginListener(e -> iniciarSesion());
    }

    public void iniciarSesion() {
        String email = loginView.getEmail();
        String password = loginView.getPassword();

        // Verificamos las credenciales del doctor
        DoctorGeneral doctor = verificarCredenciales(email, password);
        if (doctor != null) {
            abrirDoctorView(doctor);
        } else {
            JOptionPane.showMessageDialog(loginView, "Credenciales incorrectas. Intente de nuevo.");
        }
    }

    private DoctorGeneral verificarCredenciales(String email, String password) {
        for (DoctorGeneral doctor : DataDoctores.ListaDocs()) {
            if (doctor.getEmail().equals(email) && doctor.getPassword().equals(password)) {
                return doctor;
            }
        }
        return null;
    }

    private void abrirDoctorView(DoctorGeneral doctor) {
        loginView.dispose();

        HashMap<String, String> datosDoctor = new HashMap<>();
        datosDoctor.put("nombre", doctor.getNombre() + " " + doctor.getApellido());
        datosDoctor.put("especialidad", doctor.getEspecialidad());

        DoctorView doctorView = new DoctorView(datosDoctor);
        doctorView.setVisible(true);
    }
}
