package atmfinal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Connector {
	protected Connection conn = null;
	private String db_user = "root";
	private String db_password = "";
	private String db_url = "jdbc:mysql://localhost:3306/atm"; 
	private String db_driver = "com.mysql.jdbc.Driver";
	
        public static void main(String args[]){
        Connector con = new Connector();
        con.initConnection();
    }
	public Connector() {
		// TODO Auto-generated constructor stub
	}
	
	public void initConnection()
	{
		try{
			Class.forName(db_driver).newInstance();
			conn = DriverManager.getConnection(db_url,db_user,db_password);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try {
			if(!conn.isClosed())
			{
				System.out.println("Connected");
			}else{
				System.out.println("Disconnected");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void closeConn(){
		try{
			if(conn!=null){
				conn.close();
				conn = null;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
