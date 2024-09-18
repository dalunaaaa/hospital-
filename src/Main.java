import hospital.controller.LoginController;
import hospital.view.LoginView;
import backEnde.BackEnde;
import javax.swing.*;

public class Main extends JFrame {

    public static void main(String[] args) {

        LoginView loginView = new LoginView();
        LoginController loginController  = new LoginController(loginView);
        BackEnde backEnde = new BackEnde(loginView.getEmail());

    }
}
