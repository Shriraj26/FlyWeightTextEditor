package com.assignment4.texteditor;
import java.awt.*;
import java.util.ArrayList;

public class NormalTextEditorSize {

    public static void main(String args[]){

        System.out.printf("The average size of NormalCharacterWithFont is %.1f bytes%n", new SizeOfUtil() {

            String text = "CS 635 Advanced Object-Oriented Design & Programming\n" +
                    "Fall Semester, 2018\n" +
                    "Doc 17 Mediator, Flyweight, Facade, Demeter, Active Object\n" +
                    "Nov 19, 2019\n" +
                    "Copyright ©, All rights reserved. 2019 SDSU & Roger Whitney, 5500 Campanile Drive, San\n" +
                    "Diego, CA 92182-7700 USA. OpenContent (http://www.opencontent.org/opl.shtml) license de-\nfines the copyright on this document.";

            char[] textArray = text.toCharArray();

            ArrayList<CharacterWithFont> characterList = null;

            // Here, unicode of the character is the character itself..

            @Override
            protected int create() {
                characterList = new ArrayList<CharacterWithFont>();
                for(int i=0; i<textArray.length; i++){
                    Font fontA = new Font("Arial", Font.BOLD,12);
                    CharacterWithFont aCharacter = new CharacterWithFont(textArray[i],fontA);
                    characterList.add(aCharacter);
                }
                return 1;
            }
        }.averageBytes());

    }

    // Class to create character objects which contains both font and unicode within itself.
    static class CharacterWithFont{

        char unicode;
        Font font;

        public CharacterWithFont(char unicode, Font font){
            this.unicode = unicode;
            this.font = font;
        }
    }
}


