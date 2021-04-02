package me.kdav.cats;


import me.kdav.cats.ImageX;

/**
 * FavCat
 */
public class FavCat {

    private String id = "";
    private String url = "";
    private String apiKey = "ad1cf6a3-252d-48d4-bfed-af7c0e3ee5ec";
    public ImageX image;

    /**
     * Get id.
     *
     * @return id as String.
     */
    public String getId() {
        return id;
    }

    /**
     * Set id.
     *
     * @param id the value to set.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get url.
     *
     * @return url as String.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Set url.
     *
     * @param url the value to set.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Get apiKey.
     *
     * @return apiKey as String.
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * Set apiKey.
     *
     * @param apiKey the value to set.
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * Get image.
     *
     * @return image as ImageX.
     */
    public ImageX getImage() {
        return image;
    }

    /**
     * Set image.
     *
     * @param image the value to set.
     */
    public void setImage(ImageX image) {
        this.image = image;
    }
}
