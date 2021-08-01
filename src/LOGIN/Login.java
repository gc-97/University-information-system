/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGIN;

import DB.DataBase;
import java.sql.Statement;
import java.sql.ResultSet;
import StudentJFrame.StudentFrame;
import CollegeManagerJFrame.*;
import CourseManagerJFrame.CourseManager;
import ProfessorJFrame.ProfessorFrame;
import java.sql.SQLException;

/**
 *
 * @author DongHyeon Kim <20183188>
 */

public class Login {

    private String userID;
    private String userPassword;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean LoginSystem() {
        try {

            DataBase db = new DataBase();
            Statement st = db.getSt();
            ResultSet rs;// = db.getRs();

            String SQL;
            SQL = String.format("SELECT USERID, PASSWORD FROM ACCOUNT WHERE USERID='%s'", userID);

            rs = st.executeQuery(SQL);

            //userID.equals(rs.getString("USERID")) && userPassword.equals(rs.getString("PASSWORD"))
            while (rs.next()) {
                
                if (rs.getString("USERID").equals(userID) && rs.getString("PASSWORD").equals(userPassword)) {
                    if (userID.matches("^[S]\\d{3}$")) {

                        StudentFrame s = new StudentFrame(userID);
                        s.setVisible(true);
                        return true;
                    } else if (userID.matches("^[P]\\d{3}$")) {

                        System.out.println("Professor Login Success");

                        ProfessorFrame p = new ProfessorFrame(userID);
                        p.setVisible(true);
                        return true;
                    } else if (userID.matches("^[H]\\d{3}$")) {

                        System.out.println("CollegeManager Login Success");
                        
                        CollegeManagerFrame c = new CollegeManagerFrame(userID);
                        c.setVisible(true);

                        return true;
                    } else if (userID.matches("^[G]\\d{3}$")) {
 
                        System.out.println("CourseManager Login Success");
                        
                        CourseManager cs = new CourseManager(userID);
                        cs.setVisible(true);
                        
                        return true;
                    }
                }
            }

        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }

        return false;
    }
}
