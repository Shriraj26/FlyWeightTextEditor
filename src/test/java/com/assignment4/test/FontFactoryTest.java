package com.assignment4.test;

import com.assignment4.patterns.FontFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
class FontFactoryTest {
    FontFactory fontFactory;
    @BeforeEach
    void setup(){
        fontFactory = FontFactory.getFontFactory();
    }
    @Test
    void getFontFactory() {
        FontFactory secondFontFactory = FontFactory.getFontFactory();
        Assertions.assertEquals(fontFactory, secondFontFactory);
    }
    @Test
    void getFont() {
        Font font = fontFactory.getFont("Arial", Font.BOLD, 16);
        Assertions.assertEquals("Arial", font.getFamily());
    }
}