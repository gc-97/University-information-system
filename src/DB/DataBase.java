/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DongHyeon Kim <20183188>
 */
public class DataBase {
    protected Connection con;
    protected Statement st;
    protected ResultSet rs;
    
    public DataBase(){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://124.59.155.131:3306/JAVATeam?serverTimezone=Asia/Seoul&useSSL=false&allowPublicKeyRetrieval=true&useSSL=false&validationQuery=\"select 1\"", "dong", "blue795132486");
                st = con.createStatement();

            }
            catch(ClassNotFoundException | SQLException e){
                System.out.println("DB Connection Error : " + e.getMessage());
            }
        }

    public Statement getSt() {
        return st;
    }

    public ResultSet getRs() {
        return rs;
    }
}
