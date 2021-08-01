/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseManagement;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DongHyeon Kim <20183188>
 */
public class ViewStudentList extends CourseManager {

    public void ViewStudentList(DefaultTableModel JTable) {
        try {
            JTable.setRowCount(0);
            
            String SQL = String.format("SELECT * FROM STUDENTINFO");
            rs = st.executeQuery(SQL);
            
            while(rs.next()){
                JTable.insertRow(JTable.getRowCount(), new Object[]{rs.getString("NUMBER"), rs.getString("NAME"), rs.getString("MAJOR"), (rs.getInt("CREDIT") + ""), rs.getString("PRICE")});
            }

        } catch (SQLException e) {
            System.out.println("STUDENT PRINT ERROR : " + e.getMessage());
        }
    }
}
