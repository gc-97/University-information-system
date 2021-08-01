/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollegeManagement;

import DB.DataBase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DongHyeon Kim <20183188>
 */
public class CollegeManager {
    protected class StudentInfo {

        protected int id;
        protected String name;
        protected String major;
        protected String SSN;
        protected String password;
        protected String grade;
        protected String SNum;
        protected int credit;
    }

    protected class ProfessorInfo {

        protected int id;
        protected String name;
        protected String major;
        protected String securityNum;
        protected String PNum;
        protected String password;
    }
    String ManagerID;
    
    DataBase db = new DataBase();
    Statement st = db.getSt();
    ResultSet rs = db.getRs();
    
    public ResultSet ViewStudent(){
        try{
            String SQL = String.format("SELECT * FROM STUDENTINFO");
            rs = st.executeQuery(SQL);
            
        }catch(SQLException e){
            System.out.println("Student View print Error : " + e.getMessage());
        }
        return rs;
    }
    
    public ResultSet ViewProfessor(){
        try{
            String SQL = String.format("SELECT * FROM PROFESSORINFO");
            rs = st.executeQuery(SQL);
            
        }catch(SQLException e){}
        return rs;
    }
}
