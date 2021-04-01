package me.kdav.cats;


import java.io.IOException;
import okhttp3.*;
import java.io.IOException;

/**
 * CatDAO
 */
public class CatDAO {

    public static String seeCatsAPI() {

        String catDataJson = "";

        try {
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
