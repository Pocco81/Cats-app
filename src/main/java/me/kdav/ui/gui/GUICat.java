package me.kdav.ui.gui;


import me.kdav.pmethods.TmpJOptionPane;
import javax.swing.JOptionPane;

import me.kdav.ui.ui.UICat;

/**
 * GUICat
 */
public class GUICat {

    public static void showMessage(TmpJOptionPane tmpJOP) {


        String subtitle = "Opciones: \n"
                + " 0. Return \n"
                + " 1. Favorite it \n"
                + " 2. See another image \n";

        int menuOption = 0;
        String[] buttons = {
            "Return",
            "Favorite it",
            "See another image"
        };

        do {
            // main menu
            String option = (String) JOptionPane.showInputDialog(
                    null,
                    subtitle,                     // tmpJOP.getSubTitle(),
                    tmpJOP.getWinTitle(),
                    JOptionPane.INFORMATION_MESSAGE,
                    tmpJOP.getImgIcon(),
                    buttons,
                    buttons[0]
                );

            // get option

            // System.out.println("Option = " + option);
            for (byte i = 0; i < buttons.length; i++) {
                try {
                    if (option.equals(buttons[i])) {
                        menuOption = i;
                        // System.out.println("You typed: " + menuOption);
                        UICat.processMenuInput(menuOption);
                        break;
                    }
                } catch (NullPointerException e) {
                    //TODO: handle exception
                    // System.out.println("");
                    // option.setVisible(false);
                    // JOptionPane.getRootFrame().dispose();
                    break;
                }
            }
            break;
        } while (menuOption != 0);
    }
}
