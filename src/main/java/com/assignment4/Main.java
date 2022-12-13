package com.assignment4;

import com.assignment4.patterns.FontFactory;
import com.assignment4.patterns.RunArray;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        FontFactory ff = FontFactory.getFontFactory();
        Font fa = ff.getFont("COMIC SANS MS", Font.BOLD, 16);
        Font fb = ff.getFont("TIMES NEW ROMAN", Font.BOLD, 16);
        RunArray ra = new RunArray();
        ra.addRun(0, 10, fa);
        ra.addRun(10, 13, fb);
        ra.appendRun(200, fa);


    }
}