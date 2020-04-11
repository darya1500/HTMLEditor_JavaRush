package ru.javarush.tasks.daryatarasevich.htmleditor.listeners;

import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;

public class UndoListener implements UndoableEditListener {
    private UndoManager undoManager;

    public UndoManager getUndoManager() {
        return undoManager;
    }

    public UndoListener(UndoManager undoManager) {
        this.undoManager = undoManager;
    }

    @Override
    public void undoableEditHappened(UndoableEditEvent undoableEditEvent) {
        undoManager.addEdit(undoableEditEvent.getEdit());

    }
}
