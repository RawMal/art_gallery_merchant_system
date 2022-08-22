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

    public String getcustomerName() {
        return customerName;
    }
    public void setcustomerName(String customerName){
        this.customerName = customerName;
    }


    public double getwallet() {
        return wallet;
    }
    public void setwallet(double wallet) {
        this.wallet = wallet;
    }

}