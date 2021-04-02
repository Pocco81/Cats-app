package me.kdav.cats;


import java.io.IOException;
import okhttp3.*;
import java.io.IOException;

import me.kdav.cats.Cat;


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

    public static void favouriteCatAPI(Cat cat) {
        try {
            OkHttpClient client = new OkHttpClient().newBuilder()
              .build();
            MediaType mediaType = MediaType.parse("application/json");
            // RequestBody body = RequestBody.create(mediaType, "{\n  \"image_id\": \"MjAxMTU4NQ\"\n}");
            RequestBody body = RequestBody.create(mediaType, "{\n  \"image_id\": \""+cat.getId()+"\"\n}");
            Request request = new Request.Builder()
              .url("https://api.thecatapi.com/v1/favourites")
              .method("POST", body)
              .addHeader("Content-Type", "application/json")
              .addHeader("x-api-key", "ad1cf6a3-252d-48d4-bfed-af7c0e3ee5ec")
              .build();
            Response response = client.newCall(request).execute();
        } catch (IOException e) {
            System.out.println(e);
            //TODO: handle exception
        }

    }

    public static void deleteFavouriteCatAPI(FavCat favCat) {
        try {
            OkHttpClient client = new OkHttpClient().newBuilder()
              .build();
            MediaType mediaType = MediaType.parse("text/plain");
            RequestBody body = RequestBody.create(mediaType, "");
            Request request = new Request.Builder()
              .url("https://api.thecatapi.com/v1/favourites/" + favCat.getId() + "")
              .method("DELETE", body)
              .addHeader("x-api-key", favCat.getApiKey())
              .build();
            Response response = client.newCall(request).execute();
        } catch (IOException e) {
            System.out.println(e);
            //TODO: handle exception
        }

    }


    public static String showFavouriteCatAPI(String apiKey) {

        String catDataJson = "";
        try {
            OkHttpClient client = new OkHttpClient().newBuilder()
              .build();
            Request request = new Request.Builder()
              .url("https://api.thecatapi.com/v1/favourites")
              .method("GET", null)
              .addHeader("x-api-key", apiKey)
              .build();
            Response response = client.newCall(request).execute();

            catDataJson = response.body()
                .string();
        } catch (IOException e) {
            System.out.println(e);
            //TODO: handle exception
        }

        return catDataJson;

    }
}
