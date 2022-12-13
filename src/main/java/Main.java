import com.assignment4.editor.FlyWeightEditor;
import com.assignment4.editor.NormalEditor;
import com.assignment4.editor.SizeOfUtil;
import com.assignment4.patterns.CustomString;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CustomString> list = new ArrayList<>();
        String text1 = """
       CS 635 Advanced Object-Oriented Design & Programming
       Fall Semester, 2018
       Doc 17 Mediator, Flyweight, Facade, Demeter, Active Object
       Nov 19, 2019""";
        String text2 = """
       Copyright ©, All rights reserved. 2019 SDSU & Roger Whitney,
       5500 Campanile Drive, San Diego, CA 92182-7700 USA.
       OpenContent (http://www.opencontent.org/opl.shtml) license
       defines the copyright on this document.""";
        list.add(new CustomString(text1, new Font("TIMES NEW ROMAN",Font.ITALIC,10)));
        list.add(new CustomString(text2, new Font("ARIAL",Font.BOLD,12)));


        System.out.printf("The total size of Flyweight TextEditor TotalSize is %.1f bytes%n", new SizeOfUtil() {
            @Override
            protected int create() {
                FlyWeightEditor flyWeightTextEditor = new FlyWeightEditor();
                flyWeightTextEditor.write(list);
                return 1;
            }
        }.averageBytes());

        System.out.printf("The total size of Regular TextEditor TotalSize is %.1f bytes%n", new SizeOfUtil() {
            @Override
            protected int create() {
                NormalEditor normalEditor = new NormalEditor();
                normalEditor.write(list);
                return 1;
            }
        }.averageBytes());

    }
}
