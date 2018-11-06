import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame implements ActionListener {
    private Panneau pan = new Panneau();
    private Bouton bouton = new Bouton("mon bouton");
    private JPanel container = new JPanel();
    private JLabel label = new JLabel();
    private int compteur = 0;

    public Fenetre(){
        this.setTitle("Animation");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        container.setBackground(Color.white);
        container.setLayout(new BorderLayout());
        label.setFont(new Font("Tahoma", Font.BOLD, 16));
        label.setHorizontalAlignment(JLabel.CENTER);
        container.add(pan, BorderLayout.CENTER);
        container.add(bouton, BorderLayout.SOUTH);
        container.add(label, BorderLayout.NORTH);
        bouton.addActionListener(this);


        this.setContentPane(container);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent arg0) {
        ++this.compteur;
        label.setText("Vous avez cliqué " + compteur + " fois");
    }
}
