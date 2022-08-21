public class Artwork {

    private String title;
    private String artist;
    private double price;
    private int nft;


    public String Artwork(String title, String artist, double price, int nft) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;
        return title;
    }

    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public String getartist() {
        return artist;
    }

    public void setartist(String artist) {
        this.artist = artist;
    }

    public double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public int getnft() {
        return nft;
    }

    public void setnft() {
        this.nft = nft;
    }

}
