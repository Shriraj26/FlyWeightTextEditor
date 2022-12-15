package com.assignment4.editor;
import com.assignment4.patterns.*;

import java.util.ArrayList;
import java.util.List;

/**
 * FlyWeightEditor class is a type of editor which implements the Editor interface.
 * It uses the Flyweight pattern to reduce memory usage by storing only one instance of each character.
 */
public class FlyWeightEditor implements Editor {

    private List<Character> textList;

    private RunArray runArray;

    public FlyWeightEditor() {
        runArray = new RunArray();
        textList = new ArrayList<>();
    }

    /**
     * Calls the write method that accepts CustomString as input.
     * @param text The text to be written to the text editor.
     */
    @Override
    public void write(List<CustomString> text) {
        for(CustomString customString : text) {
            write(customString);
        }
    }

    /**
     * Creates RunArray and stores Characters in a list.
     * CustomString as input.
     * @param text The text to be written to the text editor.
     */
    @Override
    public void write(CustomString text) {
        runArray.appendRun(text.getText().length(), text.getFont());

        for(char c: text.getText().toCharArray()) {
            textList.add(CharacterFactory.getCustomCharacter(c));
        }
    }

}
