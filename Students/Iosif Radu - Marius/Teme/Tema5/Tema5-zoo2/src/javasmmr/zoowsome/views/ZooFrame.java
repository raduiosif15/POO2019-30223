package javasmmr.zoowsome.views;

import javasmmr.zoowsome.views.utilities.FrameStack;
import javasmmr.zoowsome.controllers.Constants.FRAMES;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionListener;

import static jdk.internal.net.http.common.Log.FRAMES;

public class ZooFrame extends JFrame implements ZooFrame_I {

    protected JPanel contentPanel;

    public ZooFrame(String title){
        FrameStack.getInstance().push(this);
        setTitle(title);
        setSize(WIDTH, HEIGHT);
        setLayout(new BorderLayout());
        setLocationRelativeTo(JFrame.EXIT_ON_CLOSE);
        contentPanel = new JPanel();
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPanel.setBackground(Color.red);
        add(contentPanel, BorderLayout.CENTER)
    }

    private void setLocationRelativeTo(int exitOnClose) {
    }

    public void setBackButtonActionListener(ActionListener a) {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JButton backButton = new JButton("Back");
        buttonPanel.add(backButton);
        this.add(buttonPanel, BorderLayout.NORTH);
        backButton.addActionListener(a);
    }

    @Override
    public void goBack() {

    }
}
