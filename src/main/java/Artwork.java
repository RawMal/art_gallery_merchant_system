public class Artwork {

    private String title;
    //Artist is another package you need to link so no need to start with String
    private Artist artist;
    private double price;
    private int nft;


    public Artwork(String title, Artist artist, double price, int nft) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = (int) (Math.random()*10000 +1);
    }

    //Only need to get there is nothing to set
    public String getTitle() {
        return title;
    }

    //public void setTitle(String title) {
        //this.title = title;
    //}

    public Artist getArtist() {
        return artist;
    }

    //public void setartist(String artist) {
        //this.artist = artist;
    //}

    public double getPrice() {
        return price;
    }

    //public void setprice(double price) {
       // this.price = price;
   // }

    public int getNft() {
        return nft;
    }

    //public void setnft() {
        //this.nft = nft;
    //}

}
