package com.assignment4.editor;
import com.assignment4.patterns.CharactorFactory;
import com.assignment4.patterns.CustomCharacter;
import com.assignment4.patterns.FontFactory;
import com.assignment4.patterns.RunArray;

import java.awt.*;
import java.util.ArrayList;

public class FlyweightEditor {

    private static final String text = "CS 635 Advanced Object-Oriented Design & Programming\n" +
            "Fall Semester, 2018\n" +
            "Doc 17 Mediator, Flyweight, Facade, Demeter, Active Object\n" +
            "Nov 19, 2019\n" +
            "Copyright ©, All rights reserved. 2019 SDSU & Roger Whitney, 5500 Campanile Drive, San\n" +
            "Diego, CA 92182-7700 USA. OpenContent (http://www.opencontent.org/opl.shtml) license de-\nfines the copyright on this document.";

    private RunArray runArray;

    public static void main(String args[]){
        System.out.printf("The average size of TotalSize is %.1f bytes%n", new SizeOfUtil() {

            ArrayList<CustomCharacter> characterList = null;
            char[] textArray = text.toCharArray();

            @Override
            protected int create() {
                characterList = new ArrayList<CustomCharacter>();

                FontFactory aFontFactory = FontFactory.getFontFactory();
                Font fontOne = aFontFactory.getFont("TIMES NEW ROMAN",Font.ITALIC,10);
                Font fontTwo = aFontFactory.getFont("ARIAL",Font.BOLD,12);

                RunArray aRun = new RunArray();
                aRun.addRun(0,115,fontOne ); // 0 -- 114
                aRun.addRun(115, 211, fontTwo); // 114- 325


                for(int i=0 ; i<textArray.length; i++){
                    CharactorFactory aTextCharacterFactory = CharactorFactory.getCharacterMap();
                    CustomCharacter aTextCharacter = aTextCharacterFactory.getCustomCharacter(textArray[i]); //unicode
                    if(! characterList.contains(aTextCharacter))
                        characterList.add(aTextCharacter);
                }
                return 1;
            }
        }.averageBytes());

    }





}
