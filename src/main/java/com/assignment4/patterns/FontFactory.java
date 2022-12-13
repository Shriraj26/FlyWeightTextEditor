package com.assignment4.patterns;

import java.awt.Font;
import java.util.HashMap;
import java.util.Map;

/**
 * The FontFactory class is a factory class that creates and manages
 * Font objects. The FontFactory uses the flyweight pattern to minimize
 * memory usage by sharing common Font objects among multiple clients.
 */
public class FontFactory {
    private static FontFactory fontFactory;
    private Map<String, Font> fontFactoryMap = new HashMap<String, Font>();

    /**
     * Returns the singleton instance of the FontFactory.
     * @return the singleton instance of the FontFactory
     */
    public static FontFactory getFontFactory() {
        if(fontFactory == null)
            fontFactory = new FontFactory();
        return fontFactory;
    }

    /**
     * Returns a Font object if already exists. Otherwise, a new Font object is created and returned.
     * @param fontName the font name
     * @param fontSize the font size
     * @param fontStyle the font style
     * @return a Font object with the specified font name, size, and style
     */
    public Font getFont(String fontName, int fontSize, int fontStyle){
        String fontKey = fontName+"#"+fontSize+"#"+fontStyle;
        Font font = fontFactoryMap.get(fontKey);
        if(font == null){
            font = new Font(fontName, fontSize, fontStyle);
            fontFactoryMap.put(fontKey, font);
        }
        return font;
    }
}
