package kostky;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;

public class Metody {
    private Prepravka prepravka;

    public Metody() {
        prepravka = Prepravka.getInstance();
    }
    public BufferedImage[] sestObr(){
        BufferedImage images[] = new BufferedImage[6];
        for (int i = 0; i < 6; i++) {
            Random rand = new Random();
            short x = (short) rand.nextInt(6); 
            x++;
            String path = "./src/images/Kostka-"+x+".png";
            BufferedImage image;
            try { image = ImageIO.read(new File(path)); } catch (IOException err) { image = null; System.out.println(err); }
            images[i] = image;
            prepravka.setPocet(x);
            prepravka.setDocPoc(x);
        }
        return images;
    }
    
    public void dalsiObrazek(){
        Random rand = new Random();
        short x = (short) rand.nextInt(6); 
        x++;
        String path = "./src/images/Kostka-"+x+".png";
        BufferedImage image;
        try { image = ImageIO.read(new File(path)); } catch (IOException err) { image = null; System.out.println(err); }
        prepravka.getPlatno().setImage(image);
        prepravka.setPocet(x);
    }
}
