/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DongHyeon Kim <20183188>
 */
public class ViewLectureList extends Student {

    public void ViewLectureList(DefaultTableModel JTable) {
        String SQL;

        try {
            JTable.setRowCount(0);
            SQL = String.format("SELECT * FROM LECTURE");

            rs = st.executeQuery(SQL);

            while(rs.next()){
                String LectureNum = rs.getString("LECTURENUM");
                String LectureName = rs.getString("LECTURENAME");
                String Major = rs.getString("MAJOR");
                String Credit = rs.getString("CREDIT");
                String Professor = rs.getString("PROFESSOR");
                
                JTable.insertRow(JTable.getRowCount(), new Object[]{LectureNum, LectureName, Major, Credit, Professor});
            }
            
        } catch (SQLException e) {
            System.out.println("");
        }
    }
}
