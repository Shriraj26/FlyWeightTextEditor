package com.assignment4.editor;
import java.awt.*;
import java.util.ArrayList;

public class NormalEditor {

    private static final String text = "CS 635 Advanced Object-Oriented Design & Programming\n" +
            "Fall Semester, 2018\n" +
            "Doc 17 Mediator, Flyweight, Facade, Demeter, Active Object\n" +
            "Nov 19, 2019\n" +
            "Copyright ©, All rights reserved. 2019 SDSU & Roger Whitney, 5500 Campanile Drive, San\n" +
            "Diego, CA 92182-7700 USA. OpenContent (http://www.opencontent.org/opl.shtml) license de-\nfines the copyright on this document.";

    public static void main(String args[]){

        System.out.printf("The average size of NormalCharacterWithFont is %.1f bytes%n", new SizeOfUtil() {
            char[] textArray = text.toCharArray();

            ArrayList<CharacterWithFont> characterList = null;

            // Here, unicode of the character is the character itself..

            @Override
            protected int create() {
                characterList = new ArrayList<CharacterWithFont>();
                for(int i=0; i<textArray.length; i++){
                    Font fontA = new Font("Arial", Font.BOLD,12);
                    CharacterWithFont aCharacter = new CharacterWithFont(fontA, textArray[i]);
                    characterList.add(aCharacter);
                }
                return 1;
            }
        }.averageBytes());

    }
}


