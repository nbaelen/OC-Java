import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Fenetre extends JFrame {
    private Panneau pan = new Panneau();

    public Fenetre() {
        //Propriétés de la fenêtre
        this.setTitle("Fenêtre Java");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new BorderLayout());
        this.getContentPane().add(new Bouton("Appliquer"), BorderLayout.SOUTH);

        //Afficher la fenetre
        this.setVisible(true);
    }
}
