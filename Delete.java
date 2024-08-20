import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    // Static variables for database connection
    private static final String URL = "jdbc:mysql://localhost:3306/student";
    private static final String USER = "root"; 
    private static final String PASSWORD = "Shalu@2004";

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            String deleteSQL = "DELETE FROM Employee WHERE CUSTOMER_NAME = ?";
            PreparedStatement deleteStatement = con.prepareStatement(deleteSQL);
            deleteStatement.setString(1, "John Doe"); 

            // Execute the delete operation
            int rowsDeleted = deleteStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Delete operation completed. Rows deleted: " + rowsDeleted);
            } else {
                System.out.println("No rows deleted. Check the provided last name.");
            }

        } catch (SQLException e) {
            System.out.println("Error during delete: " + e.getMessage());
        }
    }
}

