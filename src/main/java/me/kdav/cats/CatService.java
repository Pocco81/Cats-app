package me.kdav.cats;

// project's classes
import me.kdav.cats.Cat;
import me.kdav.pmethods.TmpJOptionPane;
import me.kdav.cats.Cat2;

// data parsing
import com.google.gson.Gson;

// image processing
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.util.Arrays;


/**
 * CatService
 */
public class CatService {

    // public Cat cat = new Cat();

    public static Object[] seeCats1() {

        Object[] objects = new Object[2];
        String jsonData = CatDAO.seeCatsAPI();

        //cut curly braces
        jsonData = jsonData.substring(1, jsonData.length());
        jsonData = jsonData.substring(0, jsonData.length()-1);

        // create Gson object and crete cat
        Gson gson = new Gson();
        Cat cat = gson.fromJson(jsonData, Cat.class);

        // resize the image if needed
        Image img = null;
        TmpJOptionPane tmpJOP = new TmpJOptionPane();
        try {
            URL url = new URL(cat.getUrl());
            img = ImageIO.read(url);

            ImageIcon backgroundCat = new ImageIcon(img);

            if (backgroundCat.getIconWidth() > 800){
                // resize
                Image bkg = backgroundCat.getImage();
                Image modified = bkg.getScaledInstance(800, 600, java.awt.Image.SCALE_SMOOTH);
                backgroundCat = new ImageIcon(modified);
            }

            tmpJOP.setSubTitle("Cats");
            tmpJOP.setWinTitle("API Interaction");
            tmpJOP.setImgIcon(backgroundCat);

        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e);
        }

        objects[0] = tmpJOP;
        objects[1] = cat;

        return objects;

        // get all the data to create the JOptionPane
        //  * null                                      type null
        //  * options -- handled by GUICat              handled by the GUI class
        //  * Cat's id                                  cat.getIdCat()
        //  * JOptionPane.INFORMATION_MESSAGE           handled by the GUI class
        //  * cat background                            
        //  * buttons -- handled by GUICat


    }

    public static void favouriteCat(Cat cat) {
        CatDAO.favouriteCatAPI(cat);
    }

    public static void deleteFavouriteCat(FavCat favCat) {
        CatDAO.deleteFavouriteCatAPI(favCat);
    }

    public static Object[] showFavouriteCat(String apiKey) {

        Object[] objects = new Object[2];
        String jsonData = CatDAO.showFavouriteCatAPI(apiKey);

        // parse the string we just received
        Gson gson = new Gson();
        FavCat[] catsArray = gson.fromJson(jsonData, FavCat[].class);

        if (catsArray.length > 0) {
            int min = 1;
            int max = catsArray.length;
            int randInt = (int) (Math.random() * ((max-min) + 1)) + min;
            int index = randInt - 1;

            FavCat favCat = catsArray[index];

            // resize the image if needed
            Image img = null;
            TmpJOptionPane tmpJOP = new TmpJOptionPane();
            try {
                URL url = new URL(favCat.image.getUrl());
                img = ImageIO.read(url);

                ImageIcon backgroundCat = new ImageIcon(img);

                if (backgroundCat.getIconWidth() > 800){
                    // resize
                    Image bkg = backgroundCat.getImage();
                    Image modified = bkg.getScaledInstance(800, 600, java.awt.Image.SCALE_SMOOTH);
                    backgroundCat = new ImageIcon(modified);
                }

                tmpJOP.setSubTitle("Cats");
                tmpJOP.setWinTitle("API Interaction");
                tmpJOP.setImgIcon(backgroundCat);

                objects[0] = tmpJOP;
                objects[1] = favCat;


            } catch (IOException e) {
                //TODO: handle exception
                System.out.println(e);
            }
        }

        return objects;
    }
}
