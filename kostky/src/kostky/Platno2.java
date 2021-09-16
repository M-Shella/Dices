package kostky;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class Platno2 extends JPanel{

    private BufferedImage image;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(0, 0, 43053, 52345);
        if(image == null){
            return;
        }
        g.drawImage(image, 0, 0, null);
    }
    public void setImage(BufferedImage image){
        this.image = image;
        repaint();
    }
}
