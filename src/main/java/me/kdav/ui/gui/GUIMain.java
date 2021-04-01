package me.kdav.ui.gui;


import javax.swing.JOptionPane;
import me.kdav.ui.ui.UIMain;

import java.awt.event.*;
import javax.swing.JButton;


/**
 * GUIMain
 */
public class GUIMain {

    public static void showMenu() {
        JButton jbtExit = new JButton("Exit");
        JButton jbtSeeCats = new JButton("See Cats!");

        final JOptionPane pane = new JOptionPane();

        // pane.setDefaultCloseOperation(JOptionPane.EXIT_ON_CLOSE);
        // String jbtExitName = jbtExit.getName();

        jbtExit.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("'Exit' was clicked");
                UIMain.processMenuInput(0, pane, 0);
                // sendPane(0, pane);
                // System.exit(0);
            }
        });

        jbtSeeCats.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("'See cats!' was clicked");
                UIMain.processMenuInput(1, pane, 0);
            }
        });

        Object[] options = {jbtExit, jbtSeeCats};

        do {
            pane.showOptionDialog(
                    null,
                    "What do you wanna do?",
                    "Cats-App",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]
                );
        } while (!jbtExit.isEnabled());     // run while jbtExit JButton it not pressed
    }
}
