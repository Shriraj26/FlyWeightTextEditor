package com.assignment4.patterns;
import java.awt.Font;
import java.util.*;

public class RunArray {
    private List<Integer> startIndices;
    private List<Integer> lengths;
    private List<Font> fonts;

    public RunArray() {
        this.startIndices = new ArrayList<>();
        this.lengths = new ArrayList<>();
        this.fonts = new ArrayList<>();
    }

    public void addRun(int startIndex, int length, Font font) {
        startIndices.add(startIndex);
        lengths.add(length);
        fonts.add(font);
    }

    public void appendRun(int length, Font font) {
        int startIndex = startIndices.isEmpty() ? 0 : startIndices.get(startIndices.size() - 1) + lengths.get(lengths.size() - 1);
        addRun(startIndex, length, font);
    }

    public Font getFont(int index) throws FontNotFound {
        for (int i = 0; i < startIndices.size(); i++) {
            int startIndex = startIndices.get(i);
            int length = lengths.get(i);
            if (index >= startIndex && index < startIndex + length) {
                return fonts.get(i);
            }
        }
        throw new FontNotFound("Font not found at given index");
    }
}
