package hospital.controller;

import hospital.view.LoginView;

public class LoginController {
    private LoginView loginView;

    public LoginController(LoginView loginView) {
        this.loginView = loginView;

        this.loginView.addLoginListener(e -> {
            iniciarSesion();
        });
    }


    public void iniciarSesion() {
        System.out.println("Hola mundo");
    }
}
