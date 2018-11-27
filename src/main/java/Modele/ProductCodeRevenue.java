package Modele;


public class ProductCodeRevenue {
    private ProductCode productCode;
    private long revenue;
    
    ProductCodeRevenue(ProductCode productCode, long revenue) {
        this.productCode = productCode;
        this.revenue = revenue;
    }
    
    public ProductCode getProductCode() {
        return productCode;
    }
    
    public long getRevenue() {
        return revenue;
    }
}
