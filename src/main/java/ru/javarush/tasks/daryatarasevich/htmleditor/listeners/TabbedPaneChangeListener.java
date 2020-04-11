package ru.javarush.tasks.daryatarasevich.htmleditor.listeners;

import ru.javarush.tasks.daryatarasevich.htmleditor.view.View;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TabbedPaneChangeListener implements ChangeListener {
    private View view;
    @Override
    public void stateChanged(ChangeEvent changeEvent) {
view.selectedTabChanged();
    }

    public TabbedPaneChangeListener(View view) {
        this.view = view;
    }

}
