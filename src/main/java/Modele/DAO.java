/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;

/**
 *
 * @author pedago
 */
public class DAO {
    
	protected final DataSource myDataSource;

	/**
	 *
	 * @param dataSource la source de données à utiliser
	 */
	public DAO(DataSource dataSource)
    {
        this.myDataSource = dataSource;
	}
        
        public List<PurchaseOrder> getPurchaseOrders(Customer customer) throws DAOException
        {
            List<PurchaseOrder> result = new LinkedList<>();

            String sql = "SELECT * FROM PURCHASE_ORDER WHERE CUSTOMER_ID = ?";
            try (Connection connection = myDataSource.getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql))
            {
                stmt.setInt(1, customer.getId());
                try (ResultSet rs = stmt.executeQuery())
                {
                    while (rs.next())
                    {
                        PurchaseOrder purchase = new PurchaseOrder(rs.getInt("ORDER_NUM"), rs.getInt("CUSTOMER_ID"), rs.getInt("PRODUCT_ID"),
                                                                    rs.getInt("QUANTITY"), rs.getDouble("SHIPPING_COST"), rs.getDate("SALES_DATE"), rs.getDate("SHIPPING_DATE"), rs.getString("FREIGHT_COMPANY"));
                        result.add(purchase);
                    }
                }
            } catch (SQLException ex)
            {
		Logger.getLogger("DAO").log(Level.SEVERE, null, ex);
		throw new DAOException(ex.getMessage());
            }
            return result;
	}

	public void addPurchaseOrder(PurchaseOrder order) throws Exception
        {
            String insertPurchaseOrder = "INSERT INTO PURCHASE_ORDER VALUES (?, ?, ?, ?, ?, ?, ?, ?,)";

            try (Connection myConnection = myDataSource.getConnection();
                PreparedStatement purchaseStatement = myConnection.prepareStatement(insertPurchaseOrder, Statement.RETURN_GENERATED_KEYS))
            {
                myConnection.setAutoCommit(false);

                ResultSet generatedKeys = purchaseStatement.getGeneratedKeys();
                generatedKeys.next();
                int purchaseID = generatedKeys.getInt("ID");
                System.out.println("Nouvelle clé générée pour PURCHASE_ORDER : " + purchaseID);

                purchaseStatement.setInt(1, purchaseID);
                purchaseStatement.setInt(2, order.getCustomerId());
                purchaseStatement.setInt(3, order.getProductId());
                purchaseStatement.setInt(4, order.getQuantity());
                purchaseStatement.setDouble(5, order.getShippingCost());
                purchaseStatement.setDate(6, order.getSalesDate());
                purchaseStatement.setDate(7, order.getShippingDate());
                purchaseStatement.setString(8, order.getFreightCompany());
                try
                {
                    purchaseStatement.executeUpdate();
                    myConnection.commit();
		} catch (Exception ex)
                {
                    System.out.println(ex);
                    myConnection.rollback();
                    throw(ex);
		} finally
                {
                    myConnection.setAutoCommit(true);
                }
            }
	}
        
        
}

/*
    Customer login(String login, String password);
    boolean updateCustomer(Customer newCustomerData);
    
        List<PurchaseOrder> getPurchaseOrders(Customer customer);
        boolean addPurchaseOrder(PurchaseOrder order);
    boolean deletePurchaseOrders(PurchaseOrder order);
    boolean updatePurchaseOrder(PurchaseOrder order);
    
    List<Product> getAllProducts();
    boolean addProduct(Product product);
    boolean deleteProduct(Product product);
    boolean updateProduct(Product product);
    
    List<ProductCodeRevenue> getProductCodesRevenues(Date startDate, Date endDate);
    List<MicroMarketRevenue> getMicroMarketsRevenues(Date startDate, Date endDate);
    List<CustomerRevenue> getCustomersRevenues(Date startDate, Date endDate);
*/
