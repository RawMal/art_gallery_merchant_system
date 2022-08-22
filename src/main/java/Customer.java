import java.util.ArrayList;

public class Customer {
    private String customerName;
    private double wallet;

    private ArrayList<Artwork> custCollection;


    public Customer(String customerName, double wallet) {
        this.customerName = customerName;
        this.wallet = wallet;
        this.custCollection = new ArrayList<>();
    }
    // method to see if customer can afford artwork
    public boolean canBuy(Artwork artwork){
        if ( artwork.getPrice() <= this.wallet) {
            return true;
        }
        return false;
        }

    // method to minus the value of the wallet according to artwork price and add artwork onto their collection
    public void buyArtwork(Artwork artwork){
        this.wallet -= artwork.getPrice();
        this.custCollection.add(artwork);
    }

    //method to show number of artwork purchased by customer
    public int getArtworkCount(){return this.custCollection.size();}


    // Getters and setters
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }


    public double getWallet() {
        return wallet;
    }
    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public ArrayList<Artwork> getCustomerArtwork() {return custCollection;}
    public void setCustomerArtwork(ArrayList<Artwork> customerArtwork){this.custCollection = customerArtwork;}

}