package com.assignment4.editor;

import com.assignment4.patterns.CustomString;

import java.util.List;

/**
 * This interface provides methods for writing text.
 */
public interface Editor {

    void write(List<CustomString> text);
    void write(CustomString text);

}