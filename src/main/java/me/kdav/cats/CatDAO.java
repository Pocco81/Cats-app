package me.kdav.cats;


// import com.squareup.okhttp.Request;
// import com.squareup.okhttp.OkHttpClient;
// import com.squareup.okhttp.Response;
import java.io.IOException;

// working
// import com.squareup.okhttp.*;
// import okhttp3.OkHttpClient;


// import com.squareup.okhttp.*;
import okhttp3.*;

// import com.squareup.okhttp.OkHttpClient;
// import com.squareup.okhttp.Request;
// import com.squareup.okhttp.Response;
import java.io.IOException;

// import java.awt.Image;
// import java.io.IOException;
// import java.net.URL;
// import javax.imageio.ImageIO;
// import javax.swing.ImageIcon;
// import javax.swing.JOptionPane;


/**
 * CatDAO
 */
public class CatDAO {

    public static String seeCatsAPI() {
        // bring data from the API
        // OkHttpClient client = new OkHttpClient().newBuilder()
        //     .build();
        // Request request = new Request.Builder()
        //     .url("https://api.thecatapi.com/v1/images/search")
        //     .method("GET", null)
        //     .build();
        // Response response = client.newCall(request).execute();


        String catDataJson = "";

        try {
            // // bring data from the API
             // OkHttpClient client = new OkHttpClient();

             // Request request = new Request.Builder()
             //     .url("https://api.thecatapi.com/v1/images/search")
             //     .get()
             //     .build();

             // Response response = client.newCall(request)
             //     .execute();
            

            // OkHttpClient client = new OkHttpClient().newBuilder()
            //     .build();
            // Request request = new Request.Builder()
            //     .url("https://api.thecatapi.com/v1/images/search")
            //     .method("GET", null)
            //     .build();
            // Response response = client.newCall(request).execute();

            OkHttpClient client = new OkHttpClient().newBuilder()
              .build();
            Request request = new Request.Builder()
              .url("https://api.thecatapi.com/v1/images/search")
              .method("GET", null)
              .build();
            Response response = client.newCall(request).execute();

            catDataJson = response.body()
                .string();
        } catch (IOException e) {
            //TODO: handle exception
        }

        return catDataJson;
    }
}
