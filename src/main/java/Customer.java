public class Customer {
    String customerName;
    double wallet;

    public Customer(String customerName, double wallet) {
        this.customerName = customerName;
        this.wallet = wallet;
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