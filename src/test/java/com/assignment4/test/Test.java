package com.assignment4.test;

import com.assignment4.editor.SizeOfUtil;
import com.assignment4.patterns.CharactorFactory;
import com.assignment4.patterns.CustomCharacter;

public class Test {

//    private final static String test = "This is a temp text that has length of 41";
//    private final static char[] textArray = test.toCharArray();
//
//    public static void calSizeOfStringWithFont(){
//        System.out.printf("charlist string with font has - %.1f bytes%n", new SizeOfUtil(){
//            List<CharacterWithFont> charList;
//            @Override
//            protected int create() {
//                charList = new ArrayList<CharacterWithFont>();
//                for(int i=0; i< textArray.length; i++){
//                    Font f = new Font("TIMES NEW ROMAN", Font.BOLD, 12);
//                    CharacterWithFont testChar = new CharacterWithFont(f,textArray[i]);
//                    charList.add(testChar);
//                }
//                return 1;
//            }
//        }.averageBytes());
//    }
//
//
//    public static void calSizeOfStringWithoutFont(){
//        System.out.printf("charlist string with font has - %.1f bytes%n", new SizeOfUtil(){
//            List<CustomCharacter> charList;
//            @Override
//            protected int create() {
//                charList = new ArrayList<CustomCharacter>();
//                FontFactory fontFactory = FontFactory.getFontFactory();
//                Font f = fontFactory.getFont("TIMES NEW ROMAN", Font.BOLD, 12);
//
//                RunArray runArray = new RunArray();
//                runArray.addRun(0, textArray.length, f);
//
//                for(int i=0; i< textArray.length; i++){
//                    CharactorFactory charactorFactory = CharactorFactory.getCharacterMap();
//                    CustomCharacter c = charactorFactory.getCustomCharacter(textArray[i]);
//                    if(!charList.contains(c)){
//                        charList.add(c);
//                    }
//
//                }
//                return 1;
//            }
//        }.averageBytes());
//
//
//    }
//
//    public static void testRunArr(){
//        System.out.printf("RunArray and font has - %.1f bytes%n", new SizeOfUtil(){
//            @Override
//            protected int create() {
//                Font f = new Font("TIMES NEW ROMAN", Font.BOLD, 12);
//                RunArray runArray = new RunArray();
//                runArray.addRun(0, 1, f);
//                return 1;
//            }
//        }.averageBytes());
//    }
//
//    public static void testSingleCharList(){
//
//        System.out.printf("SingleChar list - %.1f bytes%n", new SizeOfUtil(){
//            List<CustomCharacter> charListTemp;
//            @Override
//            protected int create() {
//                charListTemp = new ArrayList<CustomCharacter>();
//                CharactorFactory charactorFactory = CharactorFactory.getCharacterMap();
//                CustomCharacter c = charactorFactory.getCustomCharacter('T');
//                charListTemp.add(c);
//                return 1;
//            }
//        }.averageBytes());
//    }
//
//    public static void testMultipleCharListWithout(){
//
//        System.out.printf("charlist string with font has - %.1f bytes%n", new SizeOfUtil(){
//            List<CustomCharacter> charList;
//            @Override
//            protected int create() {
//                charList = new ArrayList<CustomCharacter>();
//                for(int i=0; i< textArray.length; i++){
//                    CharactorFactory charactorFactory = CharactorFactory.getCharacterMap();
//                    CustomCharacter c = charactorFactory.getCustomCharacter(textArray[i]);
//                    if(!charList.contains(c)){
//                        charList.add(c);
//                    }
//
//                }
//                return 1;
//            }
//        }.averageBytes());
//    }
//
//
//    public static void temp(){
//        System.out.printf("single char without font - %.1f bytes%n", new SizeOfUtil(){
//
//            @Override
//            protected int create() {
//                CharactorFactory c = CharactorFactory.getCharacterMap();
//                CustomCharacter ch =  c.getCustomCharacter('C');
//                return 1;
//            }
//        }.averageBytes());
//    }


    public static void main(String[] args) {
        String text = "";
        System.out.printf("single char without font - %.1f bytes%n", new SizeOfUtil(){

            @Override
            protected int create() {
//                System.out.println("show");
                CharactorFactory c = CharactorFactory.getCharacterMap();
                CustomCharacter ch =  c.getCustomCharacter('C');
                return 1;
            }
        }.averageBytes());
    }



}
