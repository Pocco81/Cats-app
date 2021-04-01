package me.kdav.ui.cli;


import me.kdav.ui.ui.UIMain;
import static me.kdav.pmethods.SleepTime.*;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 * CLIMain
 */
public class CLIMain {

    public static void showMenu() {

        Scanner keyboard = new Scanner(System.in);

        int time = 50;
        int menuResponse = 0;
        String test = "";
        // final JOptionPane JOP = new JOptionPane();

        do {
            System.out.printf("\t----Menu----\n\n");
            sleepText("1) See cats", time);
            sleepText("0) Exit", time);


            System.out.print("\nType here 👉 ");

            try {
                try {
                    test = keyboard.nextLine();

                    if (test.isEmpty()) {
                        throw new NullPointerException("'menuResponse' var is empty");
                    } else {
                        menuResponse = Integer.parseInt(test);
                    }

                } catch (NullPointerException e) {
                    //TODO: handle exception
                    System.out.printf("\nRemember you must type at least ony number from 0-4\n"); showMenu();
                }
            } catch (NumberFormatException e) {
                //TODO: handle exception
                System.out.println("You typed'" + menuResponse + "', but this program only receives integers...\nTry again!");
                showMenu();
            }
            UIMain.processMenuInput(menuResponse, null, 1);
        } while (menuResponse != 0);

    }
}
