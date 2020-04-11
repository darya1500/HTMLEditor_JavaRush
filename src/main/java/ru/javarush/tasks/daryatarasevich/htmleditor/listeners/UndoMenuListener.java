package com.javarush.task.task32.task3209.listeners;

import com.javarush.task.task32.task3209.View;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class UndoMenuListener implements MenuListener {
    private View view;
    private JMenuItem undoMenuItem;
    private JMenuItem redoMenuItem;


    public UndoMenuListener(View view, JMenuItem undoMenuItem, JMenuItem redoMenuItem) {
        this.view = view;
        this.undoMenuItem = undoMenuItem;
        this.redoMenuItem = redoMenuItem;
    }

    @Override
    public void menuSelected(MenuEvent menuEvent) {
        boolean x = view.canUndo();
        undoMenuItem.setEnabled(x);
        boolean y = view.canRedo();
        redoMenuItem.setEnabled(y);
    }

    @Override
    public void menuDeselected(MenuEvent menuEvent) {
    }

    @Override
    public void menuCanceled(MenuEvent menuEvent) {
    }
}
