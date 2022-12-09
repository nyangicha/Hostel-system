/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Project;
import java.sql.*;
/**
 *
 * @author Collins Chacha
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try{
            Class.forName("con.msql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:msql://localhost:3306","root","2018@KB");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
}
