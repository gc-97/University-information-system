/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollegeManagement;

import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DongHyeon Kim <20183188>
 */
public class DeleteInfo extends CollegeManager {


    public boolean DeleteInfo(String selectedNum, String selectedName) {
        try {
            String targetTable = selectedNum.matches("^[S]\\d{3}$") ? "STUDENTINFO" : "PROFESSORINFO";

            String SQL;
            SQL = String.format("SELECT * FROM %s WHERE NUMBER ='%s' AND NAME='%s'", targetTable, selectedNum, selectedName);
            rs = st.executeQuery(SQL);
            if (!rs.next()) {
                return false;
            }

            if ("STUDENTINFO".equals(targetTable)) {
                SQL = String.format("DELETE FROM %s WHERE NUMBER='%s' AND NAME='%s'", targetTable, selectedNum, selectedName);
                st.executeUpdate(SQL);
                SQL = String.format("DELETE FROM ACCOUNT WHERE USERID='%s'", selectedNum);
                st.executeUpdate(SQL);
                
                SQL = String.format("DELETE FROM STUDENTCOURSELIST WHERE SNUMBER ='%s' AND SNAME='%s'", selectedNum, selectedName);
                st.executeUpdate(SQL);

            } else if ("PROFESSORINFO".equals(targetTable)) {
                SQL = String.format("SELECT * FROM PROFESSORCOURSELIST WHERE PNUMBER ='%s' AND PNAME='%s'", selectedNum, selectedName);
                rs = st.executeQuery(SQL);
                if (rs.next()) {
                    JOptionPane.showInternalMessageDialog(null, "강의를 담당 중인 교수는 삭제할 수 없습니다.");
                    return false;
                }
                SQL = String.format("DELETE FROM %s WHERE NUMBER='%s' AND NAME='%s'", targetTable, selectedNum, selectedName);
                st.executeUpdate(SQL);
                SQL = String.format("DELETE FROM ACCOUNT WHERE USERID='%s'", selectedNum);
                st.executeUpdate(SQL);
            }

            return true;
        } catch (SQLException e) {
            System.out.println("Delete Error : " + e.getMessage());
        }

        return false;
    }
}
