package com.assignment4.test;

import com.assignment4.patterns.CharacterFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CharacterFactoryTest {

    CharacterFactory characterFactory;
    @BeforeEach
    void setup(){
        characterFactory = CharacterFactory.getCharacterMap();
    }
    @Test
    void getCharacterMap() {
        CharacterFactory secondCharacterFactory = CharacterFactory.getCharacterMap();
        Assertions.assertEquals(characterFactory, secondCharacterFactory);
    }
    @Test
    void getCustomCharacter() {
        Character expectedCharacter = characterFactory.getCustomCharacter('A');
        Character actualCharacter = characterFactory.getCustomCharacter('A');
        Assertions.assertEquals(expectedCharacter, actualCharacter);
    }
}