package com.assignment4.editor;
import com.assignment4.patterns.CustomString;

import java.util.ArrayList;
import java.util.List;

/**
 * The NormalEditor class implements an editor that can write text using a specific font.
 */
public class NormalEditor implements Editor {
    private List<CharacterWithFont> textList;

    public NormalEditor() {
        textList = new ArrayList<>();
    }

    /**
     * Calls the write method that accepts CustomString as input.
     * @param text the list of strings to be written
     */
    @Override
    public void write(List<CustomString> text) {
        for(CustomString customString : text) {
            write(customString);
        }
    }

    /**
     * Stores the Characters with Font and addes it to textList.
     * @param text the string to be written
     */
    @Override
    public void write(CustomString text) {
        for(char c: text.getText().toCharArray()) {
            textList.add(new CharacterWithFont(text.getFont(), c));
        }
    }
}


