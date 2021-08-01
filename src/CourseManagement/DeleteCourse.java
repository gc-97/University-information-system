/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseManagement;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DongHyeon Kim <20183188>
 */
public class DeleteCourse extends CourseManager {

    public boolean DeleteCourse(String courseNumber) {
        try {
            boolean History = false;
            String SQL;
            SQL = String.format("SELECT * FROM COURSE WHERE COURSENUM='%s'", courseNumber);
            rs = st.executeQuery(SQL);

            if (rs.next()) {
                History = rs.getBoolean("HISTORY");
            }
            if (!History) {
                SQL = String.format("DELETE FROM COURSE WHERE COURSENUM='%s'", courseNumber);

                st.executeUpdate(SQL);
                return true;
            }
            else JOptionPane.showInternalMessageDialog(null,"개설 이력이 있는 강좌는 삭제가 불가능 합니다.");
        } catch (SQLException e) {
            System.out.println("Course Delete Error : " + e.getMessage());
        }
        return false;
    }
}
