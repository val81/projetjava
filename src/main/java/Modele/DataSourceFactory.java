package Modele;

import javax.sql.DataSource;
/**
 *
 * @author pedago
 */
public class DataSourceFactory {
    
    	public static DataSource getDataSource() {
		org.apache.derby.jdbc.ClientDataSource ds = new org.apache.derby.jdbc.ClientDataSource();
		ds.setDatabaseName("sample");
		ds.setUser("app");
		ds.setPassword("app");
		ds.setServerName("localhost");
		ds.setPortNumber(1527);
		return ds;
	}	
    
}
