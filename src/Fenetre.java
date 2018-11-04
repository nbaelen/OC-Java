import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
    public Fenetre() {
        //Propriétés de la fenêtre
        this.setTitle("Fenêtre Java");
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setAlwaysOnTop(false);
        this.setUndecorated(false);

        //Instanciation d'un objet JPanel
        /*JPanel pan = new JPanel();
        pan.setBackground(Color.red);*/

        this.setContentPane(new Panneau());

        //Affiche la fenêtre
        this.setVisible(true);
    }
}
