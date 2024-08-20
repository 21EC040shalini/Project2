import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Project1{
    public static void main(String[] ags){
        String URL="jdbc:mysql://localhost:3306/student";
        String USER="root";
        String PASSWORD="Shalu@2004";
        try{
            Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Success");
            Statement selectStatement=con.createStatement();
            String createTableSQL="CREATE TABLE Employee("
            +"BILLING_ID INT AUTO_INCREMENT PRIMARY KEY,"
            +"CUSTOMER_NAME VARCHAR(10) NOT NULL,"
            +"PRODUCT_NAME VARCHAR(18) NOT NULL,"
            +"PURCHASE_DATE DATE NOT NULL,"
            +"BILLING_TYPE VARCHAR(20) NOT NULL"+")";
            selectStatement.executeUpdate(createTableSQL);
            System.out.println("Table created successfully");

        }
        catch(SQLException e){
            System.out.println(e);
        }
            
        
    }
}