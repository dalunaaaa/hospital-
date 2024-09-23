package hospital.controller;

import hospital.view.DoctorView;
import hospital.view.LoginView;

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


        abrirDoctorView();
    }

    private void abrirDoctorView() {

        loginView.dispose();


        HashMap<String, String> datosDoctor = new HashMap<>();
        datosDoctor.put("nombre", "Dania Luna");
        datosDoctor.put("especialidad", "Doctor General");


        DoctorView doctorView = new DoctorView(datosDoctor);
        doctorView.setVisible(true);
    }
}

