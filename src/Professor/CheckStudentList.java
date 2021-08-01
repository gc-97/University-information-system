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
public class CheckStudentList extends Professor {

    public void ViewStudentListAndGrade(String LectureNum, DefaultTableModel JTable) {
        try {

            String SQL;
            SQL = String.format("SELECT * FROM STUDENTCOURSELIST WHERE LECTURENUM='%s'", LectureNum);
            rs = st.executeQuery(SQL);
            JTable.setRowCount(0);
            while (rs.next()) {
                String SNum = rs.getString("SNUMBER");
                String SName = rs.getString("SName");
                String SMajor = rs.getString("MAJOR");
                String SGrade = rs.getString("GRADE");
               // JOptionPane.showInternalMessageDialog(null, SNum + " " + SName + " " + SMajor);
                JTable.insertRow(JTable.getRowCount(), new Object[]{SNum, SName, SMajor, SGrade});
            }
        } catch (SQLException e) {
            System.out.println("StudentList Print Error : " + e.getMessage());
        }
    }
    
        public void ViewStudentList(String LectureNum, DefaultTableModel JTable) {
        try {

            String SQL;
            SQL = String.format("SELECT * FROM STUDENTCOURSELIST WHERE LECTURENUM='%s'", LectureNum);
            rs = st.executeQuery(SQL);
            JTable.setRowCount(0);
            while (rs.next()) {
                String SNum = rs.getString("SNUMBER");
                String SName = rs.getString("SName");
                String SMajor = rs.getString("MAJOR");
                
               // JOptionPane.showInternalMessageDialog(null, SNum + " " + SName + " " + SMajor);
                JTable.insertRow(JTable.getRowCount(), new Object[]{SNum, SName, SMajor});
            }
        } catch (SQLException e) {
            System.out.println("StudentList Print Error : " + e.getMessage());
        }
    }
}
