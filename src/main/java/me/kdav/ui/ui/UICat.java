package me.kdav.ui.ui;


import me.kdav.cats.CatService;
import me.kdav.pmethods.TmpJOptionPane;
import me.kdav.ui.gui.GUICat;
import javax.swing.JOptionPane;

import me.kdav.cats.Cat;
import me.kdav.cats.FavCat;


/**
 * UICat
 */
public class UICat {

    public static void processMenuInput1(int uInput, Cat cat) {

        switch (uInput) {
            case 0: // return
                break;
            case 1: // favorite it
                CatService.favouriteCat(cat);
                break;
            case 2: // See another image
                showCat1();
                break;
            case 3: // Show favorite cats
                break;
            default:
                // System.out.printf("ERROR (❌): command not recognized\ntry again ↓\n");
                break;
        }
    }

    public static void processMenuInput2(int uInput, FavCat favCat) {

        switch (uInput) {
            case 0: // return
                break;
            case 1: // Delete from favorites
                deleteFavCat(favCat);
                break;
            case 2: // See another image
                showFavCat();
                break;
            default:
                // System.out.printf("ERROR (❌): command not recognized\ntry again ↓\n");
                break;
        }
    }

    public static void showCat1() {
        Object objects[] = CatService.seeCats1();

        // casting
        TmpJOptionPane tmpJOP = (TmpJOptionPane) objects[0];    // data is retrieved as Object, so should be casted
        Cat cat = (Cat) objects[1];
        GUICat.showMessage1(tmpJOP, cat);
        // TmpJOptionPane tmpJOP = objects[1];
    }

    public static void showFavCat() {
        Cat cat = new Cat();
        Object objects[] = CatService.showFavouriteCat(cat.getApiKey());

        // casting
        TmpJOptionPane tmpJOP = (TmpJOptionPane) objects[0];    // data is retrieved as Object, so should be casted
        FavCat favCat = (FavCat) objects[1];

        // start gui
        GUICat.showMessage2(tmpJOP, favCat);
    }

    public static void deleteFavCat(FavCat favCat) {
        CatService.deleteFavouriteCat(favCat);
    }
}
