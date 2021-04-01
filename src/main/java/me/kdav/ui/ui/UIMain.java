package me.kdav.ui.ui;


// import me.kdav.cats.CatService;
// import me.kdav.pmethods.TmpJOptionPane;
import me.kdav.ui.gui.GUICat;
import me.kdav.ui.gui.GUIMain;
import me.kdav.ui.ui.UICat;

import javax.swing.JOptionPane;

/**
 * UIMain
 */
public class UIMain {

    public static void processMenuInput(int uInput, JOptionPane JOP, int action) {

        switch (uInput) {
            case 0:
                // System.out.println("Exiting the program...");
                if (action == 0) {
                    JOP.getRootFrame().dispose();
                } else if (action == 1) {
                    ;
                } else {
                    ;
                }
                break;
            case 1:
                // GUICat.showMessage(tmpJOP);
                // JOP.getRootFrame().dispose();
                // JOptionPane.getRootFrame().dispose();
                UICat.showCat();
                // GUIMain.showMenu();
            default:
                // System.out.printf("ERROR (❌): command not recognized\ntry again ↓\n");
                break;
        }
    }
}
