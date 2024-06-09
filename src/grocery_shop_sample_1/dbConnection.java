/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package grocery_shop_sample_1;
import java.sql.*;

/**
 *
 * @author DILUSHA LAKSHAN
 */
public class dbConnection {
    public static Connection connection;
    
    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_db_1", "root", "project#123");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static ResultSet execute(String query) throws Exception{
        Statement statement = connection.createStatement();
        
        if(query.startsWith("SELECT")){
            ResultSet rs = statement.executeQuery(query);
            return rs;
        }else{
            statement.executeUpdate(query);
            return null;
        }
    }
}
