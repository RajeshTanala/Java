package simplejavacalculator;

import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.*;

class BufferedImageCustom {
   public Image imageReturn() 
      throws IOException {
      Image image;
      
      InputStream bis = getClass().getResourceAsStream("/resources/icon/icon.png");
      BufferedImage bImage2 = ImageIO.read(bis);
      image = bImage2;
      
      return image;
   }       
}
