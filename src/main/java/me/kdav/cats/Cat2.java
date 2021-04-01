package me.kdav.cats;


/**
 * Cat2
 */
public class Cat2 {

   // {"breeds":[],"id":"ct5","url":"https://cdn2.thecatapi.com/images/ct5.jpg","width":960,"height":1280} 
   String[] breeds;
   String id = "";
   String url = "";
   int width = 0;
   int height = 0;

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
    * Get width.
    *
    * @return width as int.
    */
   public int getWidth() {
       return width;
   }

   /**
    * Set width.
    *
    * @param width the value to set.
    */
   public void setWidth(int width) {
       this.width = width;
   }

   /**
    * Get height.
    *
    * @return height as int.
    */
   public int getHeight() {
       return height;
   }

   /**
    * Set height.
    *
    * @param height the value to set.
    */
   public void setHeight(int height) {
       this.height = height;
   }

   /**
    * Get breeds.
    *
    * @return breeds as String[].
    */
   public String[] getBreeds() {
       return breeds;
   }

   /**
    * Get breeds element at specified index.
    *
    * @param index the index.
    * @return breeds at index as String.
    */
   public String getBreedsIndex(int index) {
       return breeds[index];
   }

   /**
    * Set breeds.
    *
    * @param breeds the value to set.
    */
   public void setBreeds(String[] breeds) {
       this.breeds = breeds;
   }

   /**
    * Set breeds at the specified index.
    *
    * @param breeds the value to set.
    * @param index the index.
    */
   public void setBreeds(String breeds, int index) {
       this.breeds[index] = breeds;
   }

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
}
