/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollegeManagement;

import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JLabel;

/**
 *
 * @author DongHyeon Kim <20183188>
 */
public class ModifyInfo extends CollegeManager {


    public boolean ModifyInfo(String selectedNum, String changeName, String changeMajor, JLabel MajorCheckLabel) {

        if (!(changeMajor.equals("전산학과") || changeMajor.equals("전자공학과") || changeMajor.equals("화학공학과") || changeMajor.equals("기계공학과") || changeMajor.equals("항공우주공학과"))) {
            MajorCheckLabel.setText("개설 된 학과만 입력가능합니다.");
            MajorCheckLabel.setForeground(Color.red);
            return false;
        }

        try {
            String targetTable;
            targetTable = selectedNum.matches("^[S]\\d{3}$") ? "STUDENTINFO" : "PROFESSORINFO";

            String SQL;

            SQL = String.format("SELECT * FROM %s WHERE NUMBER='%s'", targetTable, selectedNum);
            rs = st.executeQuery(SQL);

            if (!rs.next()) {
                return false;
            }

            ///////////UPDATE INFO TABLE////////////
            SQL = String.format("UPDATE %s SET NAME='%s', MAJOR='%s' WHERE NUMBER='%s'", targetTable, changeName, changeMajor, selectedNum);
            st.executeUpdate(SQL);
            
            if ("STUDENTINFO".equals(targetTable)) {
                SQL = String.format("UPDATE STUDENTCOURSELIST SET SNAME='%s', MAJOR ='%s' WHERE SNUMBER='%s'", changeName, changeMajor, selectedNum);
                st.executeUpdate(SQL);
            }
            if ("PROFESSORINFO".equals(targetTable)) {
                SQL = String.format("UPDATE PROFESSORCOURSELIST SET PNAME='%s' WHERE PNUMBER='%s'", changeName, selectedNum);
                st.executeUpdate(SQL);
                SQL = String.format("UPDATE LECTURE SET PROFESSOR ='%s' WHERE PNUMBER = '%s'", changeName, selectedNum);
                st.executeUpdate(SQL);
            }
            
            return true;
        } catch (SQLException e) {
            System.out.println("UPDATE ERROR : " + e.getMessage());
        }
        return false;
    }

}
