package kostky;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class Platno extends JPanel {
    private Prepravka prepravka;
    private BufferedImage image;
    
    public Platno() {
        prepravka = Prepravka.getInstance();
        prepravka.setPlatno(this);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
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
