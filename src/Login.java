import javax.swing.*;

public class Login  extends JFrame {
    public Login (){
        //mi ventana
        this.setLayout(null);
        this.setBounds(0,0,800,500);
        this.setVisible(true);

        //credencial
        JTextField usuario = new JTextField();
        usuario.setBounds(300,20,200,50);



        this.add(usuario);
        this.setVisible(true);
    }
}
