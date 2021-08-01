/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Professor;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DongHyeon Kim <20183188>
 */
public class InputGrade extends Professor{
    public boolean InputGrade(String SNum, String Grade, String NowSelectedLecture){
        
        try{
            String SQL;
            SQL = String.format("UPDATE STUDENTCOURSELIST SET GRADE = '%s' WHERE SNUMBER='%s' AND LECTURENUM = '%s'", Grade, SNum, NowSelectedLecture);
            st.executeUpdate(SQL);
            return true;
        }
        catch(SQLException e){
            System.out.println("Input Grade Error : " + e.getMessage());
           
        }
        return false;
    }
}
