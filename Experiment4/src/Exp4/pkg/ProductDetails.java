package Exp4.pkg;

    import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;

	public class ProductDetails {

	    public static void main(String[] args) {
	        try {

	            Class.forName("com.mysql.cj.jdbc.Driver");

	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/productdb",
	                    "root",
	                    "root");

	            Statement st = con.createStatement();

	            ResultSet rs = st.executeQuery("SELECT * FROM product");

	            while(rs.next()) {
	                System.out.println(
	                        rs.getInt(1) + " " +
	                        rs.getString(2) + " " +
	                        rs.getDouble(3));
	            }

	            con.close();
	            System.out.println("Connection Closed");

	        } catch(Exception e) {
	            System.out.println(e);
	        }
	    }
	}

