package com.kg.matrix.theory.awt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;

public class JFrameMatrix {
    public static void main(String... args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Accounts");
        jFrame.setSize(400, 400);
        Container cp = jFrame.getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(new JButton("Gmail"));
        cp.add(new JButton("Yahooo"));
        cp.add(new JButton() {

        });
        cp.add(new ActionButton());
        jFrame.setVisible(true);
    }

    private static class ActionButton extends JButton implements ActionListener {
        ActionButton() {
            super("actionGoogle");
        this.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Desktop.getDesktop().browse(URI.create("https://google.com"));
                System.out.println("Test");
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}
