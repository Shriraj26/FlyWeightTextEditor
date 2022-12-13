package com.assignment4.patterns;
import java.util.HashMap;
import java.util.Map;

public class CharactorFactory {
    private static CharactorFactory charactorFactory;
    private Map<Character, CustomCharacter> characterMap = new HashMap<Character, CustomCharacter>();

    public static CharactorFactory getCharacterMap() {
        if(charactorFactory == null)
            charactorFactory = new CharactorFactory();
        return charactorFactory;
    }

    public CustomCharacter getCustomCharacter(char unicode){
        CustomCharacter customCharacter = characterMap.get(unicode);
        if(customCharacter == null){
            customCharacter= new CustomCharacter(unicode);
            characterMap.put(unicode, customCharacter);
        }
        return customCharacter;
    }


}
