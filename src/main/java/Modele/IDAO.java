package Modele;

import java.util.Date;
import java.util.List;

public interface IDAO {
    Customer login(String login, String password);
    boolean updateCustomer(Customer newCustomerData);
    
    List<Purchase> getPurchaseOrders(Customer customer);
    boolean addPurchaseOrder(Purchase order);
    boolean deletePurchaseOrders(Purchase order);
    boolean updatePurchaseOrder(Purchase order);
    
    List<Product> getAllProducts();
    boolean addProduct(Product product);
    boolean deleteProduct(Product product);
    boolean updateProduct(Product product);
    
    List<ProductCodeRevenue> getProductCodesRevenues(Date startDate,
                                                                Date endDate);
    List<MicroMarketRevenue> getMicroMarketsRevenues(Date startDate,
                                                                Date endDate);
    List<CustomerRevenue> getCustomersRevenues(Date startDate, Date endDate);
}
