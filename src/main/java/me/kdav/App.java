package me.kdav;


import me.kdav.ui.gui.GUIMain;
import me.kdav.ui.cli.CLIMain;

/**
 * App
 * @author kdav5758
 */
public class App {

    public static void main(String args[]) {

        if (args.length != 0) {
            if (args[0].equals("-gui") || args.equals("-GUI")) {
                GUIMain.showMenu();
                System.exit(0);
            } else if (args[0].equals("-cli") || args.equals("-CLI")) {
                CLIMain.showMenu();
                System.exit(0);
            } else {
                System.out.println("Command was not recognized...");
            }
        } else {
            // show GUI menu as default menu
            GUIMain.showMenu();
        }
    }
}
