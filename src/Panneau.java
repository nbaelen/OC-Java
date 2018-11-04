import javax.swing.*;
import java.awt.*;

public class Panneau extends JPanel {
    public void paintComponent(Graphics g) {
        System.out.println("Je suis éxécutée !");

        /*
        int x1 = this.getWidth()/2 - 75;
        int y1 = this.getHeight()/2 - 75;
        g.fillOval(x1,y1, 75, 75);
        */

        int x1 = this.getWidth()/4;
        int y1 = this.getHeight()/4;
        g.drawOval(x1, y1, this.getWidth()/2, this.getHeight()/2);
    }
}
