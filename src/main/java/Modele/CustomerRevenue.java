package Modele;

public class CustomerRevenue {
    private Customer customer;
    private long revenue;
    
    CustomerRevenue(Customer customer, long revenue) {
        this.customer = customer;
        this.revenue = revenue;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public long getRevenue() {
        return revenue;
    }
}
