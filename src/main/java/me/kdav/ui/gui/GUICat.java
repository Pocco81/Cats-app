package me.kdav.ui.gui;


import me.kdav.pmethods.TmpJOptionPane;
import javax.swing.JOptionPane;

import me.kdav.ui.ui.UICat;
import me.kdav.cats.Cat;
import me.kdav.cats.FavCat;

/**
 * GUICat
 */
public class GUICat {

    public static void showMessage(TmpJOptionPane tmpJOP) {


        String subtitle = "Opciones: \n"
                + " 0. Return \n"
                + " 1. Favorite it \n"
                + " 2. See another image \n"
                + " 3. Delete favourite cat \n";

        int menuOption = 0;
        String[] buttons = {
            "Return",
            "Favorite it",
            "See another image",
            "Delete favourite cat"
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
                        // UICat.processMenuInput(menuOption, null);
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

    public static void showMessage1(TmpJOptionPane tmpJOP, Cat cat) {


        String subtitle = "Options: \n"
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
                    // tmpJOP.getWinTitle(),
                    cat.getId(),
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
                        UICat.processMenuInput1(menuOption, cat);
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

    public static void showMessage2(TmpJOptionPane tmpJOP, FavCat favCat) {


        String subtitle = "Options: \n"
                + " 0. Return \n"
                + " 1. Delete from favourites  \n"
                + " 2. See another image \n";

        int menuOption = 0;
        String[] buttons = {
            "Return",
            "Delete from favourites",
            "See another image"
        };

        do {
            // main menu
            String option = (String) JOptionPane.showInputDialog(
                    null,
                    subtitle,                     // tmpJOP.getSubTitle(),
                    // tmpJOP.getWinTitle(),
                    favCat.getId(),
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
                        UICat.processMenuInput2(menuOption, favCat);
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
