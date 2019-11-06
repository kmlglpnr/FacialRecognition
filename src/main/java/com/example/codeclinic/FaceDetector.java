package com.example.codeclinic;


import org.openimaj.image.processing.face.detection.HaarCascadeDetector;

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class FaceDetector extends JFrame {

    private static final long serialVersionUID = 1L;
    private static final HaarCascadeDetector detector = new HaarCascadeDetector();

    public BufferedImage readImage (String fn,
                                    int x,
                                    int y) throws IOException{

    }

    public FaceDetector(String[] a) throws IOException{

    }
}
