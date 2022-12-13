package com.assignment4.test;

import com.assignment4.patterns.CharactorFactory;
import com.assignment4.patterns.CustomCharacter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CharactorFactoryTest {

    CharactorFactory charactorFactory;

    @BeforeEach
    void setup(){
        charactorFactory = CharactorFactory.getCharacterMap();
    }

    @Test
    void getCharacterMap() {
        CharactorFactory secondCharactorFactory = CharactorFactory.getCharacterMap();
        Assertions.assertEquals(charactorFactory, secondCharactorFactory);
    }

    @Test
    void getCustomCharacter() {
        CustomCharacter expectedCharacter = charactorFactory.getCustomCharacter('A');
        CustomCharacter actualCharacter = charactorFactory.getCustomCharacter('A');
        Assertions.assertEquals(expectedCharacter, actualCharacter);
    }
}