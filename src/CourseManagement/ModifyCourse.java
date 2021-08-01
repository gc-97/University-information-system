/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseManagement;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author DongHyeon Kim <20183188>
 */
public class ModifyCourse extends CourseManager {

    public boolean CourseModify(String CourseNumber, String ModifyName, String ModifyMajor, String ModifyCredit, String ModifyInfo, JLabel checkCredit, JLabel CheckMajor) {
        try {
            boolean History = false;
            boolean Addable = true;
            String SQL;
            if (!ModifyCredit.matches("^[1-4]$")) {
                checkCredit.setText("WRONG INPUT");
                checkCredit.setForeground(Color.red);
                Addable = false;
            }

            if (!(ModifyMajor.equals("전산학과") || ModifyMajor.equals("전자공학과") || ModifyMajor.equals("화학공학과") || ModifyMajor.equals("기계공학과") || ModifyMajor.equals("항공우주공학과"))) {
                CheckMajor.setText("개설된 학과만 등록 가능합니다.");
                CheckMajor.setForeground(Color.red);
                Addable = false;
            }
            SQL = String.format("SELECT * FROM COURSE WHERE COURSENUM='%s'", CourseNumber);
            rs = st.executeQuery(SQL);

            if (rs.next()) {
                History = rs.getBoolean("HISTORY");
            }

            if (History) {
                JOptionPane.showInternalMessageDialog(null, "개설이력이 있는 강좌는 수정할 수 없습니다.");
                return false;
            } else if (Addable) {
                SQL = String.format("UPDATE COURSE SET NAME='%s', MAJOR='%s', Credit='%s', CourseInfo='%s'  WHERE CourseNum='%s'", ModifyName, ModifyMajor, ModifyCredit, ModifyInfo, CourseNumber); ///SQL
                st.executeUpdate(SQL);
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Update Error : " + e.getMessage());
        }
        return false;
    }
}
