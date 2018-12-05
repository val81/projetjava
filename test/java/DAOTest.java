
import Modele.Customer;
import Modele.DAO;
import Modele.DAOException;
import Modele.DataSourceFactory;
import Modele.PurchaseOrder;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;


public class DAOTest
{
    private DAO myDAO; // L'objet à tester
    private DataSource myDataSource; // La source de données à utiliser
	

    @Before
    public void setUp() throws SQLException
    {
    	myDataSource = DataSourceFactory.getDataSource();
	myDAO = new DAO(myDataSource);
    }
	
    @Test
    public void testGetPurchaseOrders() throws DAOException
    {
        Customer customer = new Customer(1);
        List<PurchaseOrder> result = myDAO.getPurchaseOrders(customer);
        assertEquals(2, result.size());
    }

    @Test
    public void testAddPurchaseOrder() throws DAOException
    {
/*
        Customer customer = new Customer(1);
        List<PurchaseOrder> result = myDAO.getPurchaseOrders(customer);
        int save = result.size();
        
        PurchaseOrder purchaseOrder = new PurchaseOrder(1);
        myDAO.addPurchaseOrder(purchaseOrder);
        result = myDAO.getPurchaseOrders(customer);
        assertEquals(save + 1, result.size());
*/
        PurchaseOrder purchaseOrder = new PurchaseOrder(1);        
        assertEquals(true, myDAO.addPurchaseOrder(purchaseOrder));

    }
    
}
