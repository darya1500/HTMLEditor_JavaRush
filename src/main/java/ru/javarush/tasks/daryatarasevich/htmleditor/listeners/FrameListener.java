package ru.javarush.tasks.daryatarasevich.htmleditor.listeners;

import ru.javarush.tasks.daryatarasevich.htmleditor.view.View;
import java.awt.event.WindowEvent;

public class FrameListener extends java.awt.event.WindowAdapter {
    private View view;


    public FrameListener(View view) {
        this.view = view;
    }

    public void windowClosing(WindowEvent windowEvent) {
        view.exit();
    }
}
