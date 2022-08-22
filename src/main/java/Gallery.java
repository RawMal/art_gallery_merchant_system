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

    //Add method for gallery to sell artwork to customer and remove artwork from collection and intake money paid
    public void sellArtwork(Customer customer, Artwork artwork){
        if(customer.canBuy(artwork) == true){
            customer.buyArtwork(artwork);
            this.galleryCollection.remove(artwork);
            setTill(this.till + artwork.getPrice());
        }
    }

    //getters and setters
    public double getTill(){
        return till;
    }

    public void setTill(double till){
        this.till = till;
    }

    public String getGalleryName(String galleryName){
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
