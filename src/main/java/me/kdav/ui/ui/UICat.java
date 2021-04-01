package me.kdav.ui.ui;


import me.kdav.cats.CatService;
import me.kdav.pmethods.TmpJOptionPane;
import me.kdav.ui.gui.GUICat;
import javax.swing.JOptionPane;

/**
 * UICat
 */
public class UICat {

    public static void processMenuInput(int uInput) {

        switch (uInput) {
            case 0: // return
                break;
            case 1: // favorite it

                break;
            case 2: // See another image
                showCat();
                break;
            default:
                // System.out.printf("ERROR (❌): command not recognized\ntry again ↓\n");
                break;
        }
    }

    public static void showCat() {
        // System.out.println("Showing cats...");
        TmpJOptionPane tmpJOP = CatService.seeCats();
        GUICat.showMessage(tmpJOP);
    }
}