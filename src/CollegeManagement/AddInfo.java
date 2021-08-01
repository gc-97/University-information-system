/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollegeManagement;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author DongHyeon Kim <20183188>
 */
public class AddInfo extends CollegeManager {


    public boolean AddInfo(String name, String major, String SSN, String Num, JLabel NumberLabel, JLabel SecurityLabel, JLabel MajorLabel) {
        boolean Addable = true;
        String password = " ";
        String Grade = " ";
        int Credit = 0;

        if (name.equals("") || major.equals("") || SSN.equals("") || Num.equals("")) {
            JOptionPane.showMessageDialog(null, "빈 칸 없이 입력하세요."); //PLAESE ENTER WITHOUT ANY BLANKS
            Addable = false;
        }
        if (!Num.matches("^[SP]\\d{3}$")) {
            NumberLabel.setText("WRONG INPUT NUMBER");
            NumberLabel.setForeground(Color.red);
            Addable = false;
        }
        if (!(major.equals("전산학과") || major.equals("전자공학과") || major.equals("화학공학과") || major.equals("기계공학과") || major.equals("항공우주공학과"))) {
            MajorLabel.setText("개설 된 학과만 입력가능합니다.");
            MajorLabel.setForeground(Color.red);
            Addable = false;
        }
        if (!SSN.matches("^\\d{6}-\\d{7}$")) {
            SecurityLabel.setText("WRONG INPUT SECURITYNUMBER");
            SecurityLabel.setForeground(Color.red);
            Addable = false;
        } else {
            password = SSN.substring(7, 14);
        }
        String SQL;
        String targetTable;
        targetTable = Num.matches("^[S]\\d{3}$") ? "STUDENTINFO" : "PROFESSORINFO";

        try {
            SQL = String.format("SELECT * FROM %s WHERE SECURITYNUM='%s'", targetTable, SSN);
            rs = st.executeQuery(SQL);
            if (rs.next()) {
                SecurityLabel.setText("이미 등록된 주민등록번호입니다.");
                SecurityLabel.setForeground(Color.red);
                Addable = false;
            }

            SQL = String.format("SELECT * FROM %s WHERE NUMBER='%s'", targetTable, Num);
            rs = st.executeQuery(SQL);
            if (rs.next()) {
                NumberLabel.setText("이미 등록된 학생/교수 번호입니다.");
                NumberLabel.setForeground(Color.red);
                Addable = false;
            }

        } catch (SQLException e) {
            System.out.println("OVERLAP CHECK ERROR : " + e.getMessage());
        }

        if (Addable) {
            try {
                String price = "0";
                if (targetTable.equals("STUDENTINFO")) {
                    SQL = String.format("INSERT INTO %s VALUES('%s', '%s', '%s', '%s', '%s', '%s', %d, %s)", targetTable, Num, name, major, SSN, password, Grade, Credit, price);
                } else {
                    SQL = String.format("INSERT INTO %s VALUES('%s', '%s', '%s', '%s', '%s')", targetTable, Num, name, major, SSN, password);
                }
                st.executeUpdate(SQL);

                SQL = String.format("INSERT INTO ACCOUNT VALUES('%s', '%s')", Num, password);
                st.executeUpdate(SQL);

                return true;
            } catch (SQLException e) {
                System.out.println("INSERT ERROR : " + e.getMessage());
            }
        }

        return false;
    }
}
