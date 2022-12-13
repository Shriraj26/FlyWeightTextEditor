package com.assignment4.test;

import com.assignment4.patterns.FontFactory;
import com.assignment4.exceptions.FontNotFound;
import com.assignment4.patterns.RunArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class RunArrayTest {

    private FontFactory fontFactory;
    private RunArray runArray;

    @BeforeEach
    void setup(){
        fontFactory = FontFactory.getFontFactory();
        runArray = new RunArray();

    }

    @Test
    void addRun() throws FontNotFound {

        Font fontArial =  fontFactory.getFont("Arial", Font.PLAIN, 12);
        runArray.addRun(0, 5, fontArial);

        Font actualFont = runArray.getFont(3);
        Assertions.assertEquals("Arial", actualFont.getFamily());
    }

    @Test
    void appendRun() throws FontNotFound {

        Font fontArial =  fontFactory.getFont("Arial", Font.BOLD, 16);
        Font fontComicSans = fontFactory.getFont("Comic Sans MS", Font.ITALIC, 12);

        runArray.addRun(0, 100, fontArial);
        runArray.appendRun(100, fontComicSans);
        Font actualFont = runArray.getFont(150);
        Assertions.assertEquals("Comic Sans MS", actualFont.getFamily());


    }

    @Test
    void getFontAtIndex() {

        Exception exception = assertThrows(FontNotFound.class, () -> {
            runArray.getFont(1000);
        });
        String expectedMessage = "Font does not exist at index";
        String actualMessage = exception.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));

    }
}