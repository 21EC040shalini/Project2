import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] ags){
        String URL="jdbc:mysql://localhost:3306/student";
        String USER="root";
        String PASSWORD="Shalu@2004";
        try {
            Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
            String insertSQL="INSERT INTO Employee(CUSTOMER_NAME, PRODUCT_NAME, PURCHASE_DATE, BILLING_TYPE)VALUES(?,?,?,?)";
            PreparedStatement insertStatement=con.prepareStatement(insertSQL);
            insertStatement.setString(1, "John Doe");
            insertStatement.setString(2, "Product A");
            insertStatement.setDate(3, java.sql.Date.valueOf("2024-08-20"));
            insertStatement.setString(4, "Credit Card");
            int rowsInserted = insertStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Insert operation completed");
            }

        } 
        catch(SQLException e){
            System.out.println(e);

        }
    }
}
