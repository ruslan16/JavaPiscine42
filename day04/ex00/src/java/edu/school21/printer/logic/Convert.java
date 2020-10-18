package edu.school21.printer.logic;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Convert {
    private BufferedImage image;
    private char arr[][];
    private char black;
    private char white;

    public Convert(BufferedImage image, char white, char black){
        this.black = black;
        this.white = white;
        this.image = image;
    }

    public void ConvertImage() {
        arr = new char[image.getHeight()][image.getWidth()];

        for (int y = 0; y < image.getHeight(); y++) {

            for (int x = 0; x < image.getWidth(); x++) {
                Color color = new Color(image.getRGB(x, y));

                int blue = color.getBlue();
                int red = color.getRed();
                int green = color.getGreen();

                int grey = (int) (red * 0.299 + green * 0.587 + blue * 0.114);

                if (grey == 255) {
                    arr[y][x] = white;
                }

                else if (grey == 0) {
                    arr[y][x] = black;
                }
            }
        }
    }

    public void PrintImage() {
        for (int i = 0; i < arr.length; i++){

            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]);
            }

            System.out.println();
        }
    }
}
