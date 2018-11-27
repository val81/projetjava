package Modele;


public class MicroMarketRevenue {
    private MicroMarket microMarket;
    private long revenue;
    
    MicroMarketRevenue(MicroMarket microMarket, long revenue) {
        this.microMarket = microMarket;
        this.revenue = revenue;
    }
    
    public MicroMarket getMicroMarket() {
        return microMarket;
    }
    
    public long getRevenue() {
        return revenue;
    }
}
