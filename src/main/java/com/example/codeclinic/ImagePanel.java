package com.example.codeclinic;

import org.openimaj.image.processing.face.d

import javax.swing.*;
import java.awt.*;


// is used to display our input image
public class ImagePanel extends JPanel {
    private Image img;

    public ImagePanel(String img){
        this(new ImageIcon(img).getImage());
    }

    public ImagePanel(Image img){
        this.img = img;
        Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setLayout(null);
    }
    public void paintComponent(Graphics g) {
        g.drawImage(this.img, 0, 0, null);
    }
}
