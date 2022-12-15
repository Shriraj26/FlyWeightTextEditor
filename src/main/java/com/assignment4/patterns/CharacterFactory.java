package com.assignment4.patterns;
import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static CharacterFactory characterFactory;
    private static Map<Character, Character> characterMap = new HashMap<Character, Character>();
    public static CharacterFactory getCharacterMap() {
        if(characterFactory == null)
            characterFactory = new CharacterFactory();
        return characterFactory;
    }
    public static Character getCustomCharacter(char unicode) {
        Character customCharacter = characterMap.get(unicode);
        if(customCharacter == null){
            customCharacter= new Character(unicode);
            characterMap.put(unicode, customCharacter);
        }
        return customCharacter;
    }


}
