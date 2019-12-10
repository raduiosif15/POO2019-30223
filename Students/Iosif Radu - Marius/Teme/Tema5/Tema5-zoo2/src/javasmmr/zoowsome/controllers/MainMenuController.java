package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.views.MainMenuFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuController extends AbstractController {

    public MainMenuController(MainMenuFrame frame, boolean hasBackButton){
        super(frame, hasBackButton);
        frame.setAddButtonActionListener(new AddButtonActionListener());
    }

    private class AddButtonActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            new AddController(new AddFrame("Add"), true);
        }
    }
}
