package edu.school21.printer.app;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import edu.school21.printer.logic.Convert;
import java.io.File;
import java.io.IOException;

public class Program{
    public static void main(String[] arg) throws IOException {
        char[][] arr;
        char white;
        char black;

        File file = new File("src/resources/image.bmp");
        BufferedImage image = ImageIO.read(file);
        white = arg[0].toCharArray()[0];
        black = arg[1].toCharArray()[0];
        Convert convert = new Convert(image, white, black);
        convert.ConvertImage();
        convert.PrintImage();
    }
}
