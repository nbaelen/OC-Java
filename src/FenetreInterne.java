import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FenetreInterne extends JFrame{

    private Panneau pan = new Panneau();
    private JPanel container = new JPanel();
    private JLabel label = new JLabel();
    private JButton bouton = new JButton("On");
    private JButton bouton2 = new JButton("Off");
    private int x, y;
    private boolean backX, backY;
    private boolean animated = true;


    public FenetreInterne(){
        this.setTitle("Animation");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        container.setBackground(Color.white);
        container.setLayout(new BorderLayout());
        container.add(pan, BorderLayout.CENTER);

        //Ce sont maintenant nos classes internes qui écoutent nos boutons
        bouton.addActionListener(new BoutonListener());
        bouton2.addActionListener(new Bouton2Listener());
        bouton.setEnabled(false);

        JPanel south = new JPanel();
        south.add(bouton);
        south.add(bouton2);
        container.add(south, BorderLayout.SOUTH);
        Font police = new Font("Tahoma", Font.BOLD, 16);
        label.setFont(police);
        label.setForeground(Color.blue);
        label.setHorizontalAlignment(JLabel.CENTER);
        container.add(label, BorderLayout.NORTH);
        this.setContentPane(container);
        this.setVisible(true);
        go();
    }

    //Classe écoutant notre premier bouton
    class BoutonListener implements ActionListener{
        //Redéfinition de la méthode actionPerformed()
        public void actionPerformed(ActionEvent e) {
            animated = true;
            bouton.setEnabled(false);
            bouton2.setEnabled(true);
            go();
        }
    }

    //Classe écoutant notre second bouton
    class Bouton2Listener implements ActionListener{
        //Redéfinition de la méthode actionPerformed()
        public void actionPerformed(ActionEvent e) {
            animated = false;
            bouton.setEnabled(true);
            bouton2.setEnabled(false);
        }
    }

    private void go(){
        System.out.println("go");
        x = pan.getPosX();
        y = pan.getPosY();

        while(this.animated){
            System.out.println("go");
            if(x < 1)backX = false;
            if(x > pan.getWidth()-50)backX = true;
            if(y < 1)backY = false;
            if(y > pan.getHeight()-50)backY = true;
            if(!backX)pan.setPosX(++x);
            else pan.setPosX(--x);
            if(!backY) pan.setPosY(++y);
            else pan.setPosY(--y);
            pan.repaint();

            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}