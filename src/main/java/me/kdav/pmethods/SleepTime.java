package me.kdav.pmethods;


/**
 * SleepTime
 */
public abstract class SleepTime {

    public static void sleepFor(int time) {

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            //TODO: handle exception
            ;
        }
    }

    public static void sleepText(String str, int time) {

        try {
            System.out.println(str);
            Thread.sleep(time);
        } catch (InterruptedException e) {
            //TODO: handle exception
            ;
        }
    }
}

