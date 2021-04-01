package me.kdav.cats;

// project's classes
import me.kdav.cats.Cat;
import me.kdav.pmethods.TmpJOptionPane;

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

    public static TmpJOptionPane seeCats() {

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

            if(backgroundCat.getIconWidth() > 800){
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

        return tmpJOP;


        // get all the data to creat the JOptionPane
        //  * null                                      type null
        //  * options -- handled by GUICat              handled by the GUI class
        //  * Cat's id                                  cat.getIdCat()
        //  * JOptionPane.INFORMATION_MESSAGE           handled by the GUI class
        //  * cat background                            
        //  * buttons -- handled by GUICat


    }
}