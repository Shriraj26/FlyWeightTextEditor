package com.assignment4.test;

import com.assignment4.editor.FlyWeightEditor;
import com.assignment4.editor.SizeOfUtil;
import com.assignment4.patterns.CustomString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class EditorTest {

    @Test
    public void testObjectSizeCalculation(){

        List<CustomString> list = new ArrayList<>();
        String text1 = """
       CS 635 Advanced Object-Oriented Design & Programming
       Fall Semester, 2018
       Doc 17 Mediator, Flyweight, Facade, Demeter, Active Object
       Nov 19, 2019""";
        String text2 = """
       Copyright ©, All rights reserved. 2019 SDSU & Roger Whitney,
       5500 Campanile Drive, San Diego, CA 92182-7700 USA.
       OpenContent (http://www.opencontent.org/opl.shtml) license
       defines the copyright on this document.""";
        list.add(new CustomString(text1, new Font("TIMES NEW ROMAN",Font.ITALIC,10)));
        list.add(new CustomString(text2, new Font("ARIAL",Font.BOLD,12)));


        double actualSize =  new SizeOfUtil() {
            @Override
            protected int create() {
                FlyWeightEditor flyWeightTextEditor = new FlyWeightEditor();
                flyWeightTextEditor.write(list);
                return 1;
            }
        }.averageBytes();

//      Construction of string having 356 characters with 54 unique characters in it
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0; i < 356; i++){
            sb.append(Character.valueOf( (char)(count+65)));
            if(count < 54){
                count +=1;
            }
        }

        String expectedText1 = sb.toString();
        List<CustomString> customList = new ArrayList<>();
        customList.add(new CustomString(expectedText1.substring(0, 145), new Font("TIMES NEW ROMAN",Font.ITALIC,10)));
        customList.add(new CustomString(expectedText1.substring(145, expectedText1.length()), new Font("ARIAL",Font.BOLD,12)));

        double expectedSize =  new SizeOfUtil() {
            @Override
            protected int create() {
                FlyWeightEditor flyWeightTextEditor = new FlyWeightEditor();
                flyWeightTextEditor.write(customList);
                return 1;
            }
        }.averageBytes();

        Assertions.assertEquals(expectedSize, actualSize);
    }

}
