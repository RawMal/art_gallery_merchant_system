public class Gallery {

    double till;
    String galleryName;
    String artCollection;

    String


    public Gallery(double till, String galleryName, String artCollection){
        this.till = till;
        this.galleryName = galleryName;
        this.artCollection = artCollection;
    }

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

    public String getArtCollection(){
        return artCollection;
    }

    public void setArtCollection(String artCollection){
        this.artCollection = artCollection;
    }




}
