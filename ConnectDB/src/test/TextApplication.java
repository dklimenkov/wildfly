package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;



//import java.util.Hashtable;
import java.util.Properties;

public class TextApplication {
  
	
	
    public static Connection con() {
		
    	 InitialContext ctx;
         DataSource dataSource;
         Connection pripoj = null;
         Properties props;

        try {
      
        	
         	props = new Properties();
            props.put(Context.SECURITY_PRINCIPAL, "root");
            props.put(Context.SECURITY_CREDENTIALS, "1234");
                        
        	ctx = new InitialContext(props);
        	dataSource = (DataSource) ctx.lookup("java:jboss/datasources/MySqlDS"); // JNDI lookup
        	
        	pripoj = dataSource.getConnection();
	
        	
        }
        catch (SQLException se) {
        	 System.out.println(se);
        }
        catch (NamingException ne) {
        	 System.out.println(ne);
        }
        
		return pripoj;
   
    }
}
