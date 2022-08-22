import java.util.ArrayList;

public class Gallery {

    private double till;
    private String galleryName;
    private ArrayList<Artwork> galleryCollection;




    public Gallery(String galleryName) {
        this.till = 0;
        this.galleryName = galleryName;
        //Need to make the collection an array list so it can hold the stock
        this.galleryCollection = new ArrayList<>();
    }

    //getters and setters
    public double gettill(){
        return till;
    }

    public void settill(double till){
        this.till = till;
    }

    public String getgalleryName(String galleryName){
        return galleryName;
    }

    public void setGalleryName(String galleryName){
        this.galleryName = galleryName;
    }

    public ArrayList<Artwork> getGalleryCollection(){return galleryCollection;}

    public void setGalleryCollection(ArrayList<Artwork> artworks){
        this.galleryCollection = artworks;
    }




}
