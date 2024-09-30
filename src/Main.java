import hospital.controller.LoginController;
import hospital.view.LoginView;


public class Main {
    public static void main(String[] args) {
        LoginView loginView = new LoginView();
        new LoginController(loginView);

    }
}
