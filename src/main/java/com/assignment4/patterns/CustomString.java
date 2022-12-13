package com.assignment4.patterns;

import java.awt.*;

public class CustomString {
    private String text;
    private Font font;

    public CustomString(String text, Font font) {
        this.text = text;
        this.font = font;
    }

    public String getText() {
        return text;
    }

    public Font getFont() {
        return font;
    }

}
