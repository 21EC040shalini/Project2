import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
    private static final String URL = "jdbc:mysql://localhost:3306/student";
    private static final String USER = "root"; 
    private static final String PASSWORD = "Shalu@2004";
    public static void main(String[] upd) {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            String updateSQL = "UPDATE Employee SET PRODUCT_NAME = ? WHERE CUSTOMER_NAME = ?";
            PreparedStatement updateStatement = con.prepareStatement(updateSQL);
            updateStatement.setString(1, "Product D"); 
                updateStatement.setString(2, "John Doe");
            int rowsUpdated = updateStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Update operation completed. Rows updated: " + rowsUpdated);
            } else {
                System.out.println("No rows updated. Check the provided names.");
            }

        } catch (SQLException e) {
            System.out.println("Error during update: " + e.getMessage());
        }
    }
}

