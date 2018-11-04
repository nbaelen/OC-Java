import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;


public class Bouton extends JButton implements MouseListener {
    private String name;
    private Image img;

    public Bouton(String str){
        super(str);
        this.addMouseListener(this);
        this.name = str;
        try {
            img = ImageIO.read(new File("vert.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
        g2d.drawString(this.name, this.getWidth() / 2 - (this.getWidth()/ 2 /4), (this.getHeight() / 2) + 5);
    }

    public void mouseExited(MouseEvent event) {
        try {
            img = ImageIO.read(new File("jaune.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void mouseClicked (MouseEvent event) {
        try {
            img = ImageIO.read(new File("orange.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void mouseReleased (MouseEvent event) {
        try {
            img = ImageIO.read(new File("vert.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void mouseEntered (MouseEvent event) {

    }

    public void mousePressed (MouseEvent event) {

    }
}