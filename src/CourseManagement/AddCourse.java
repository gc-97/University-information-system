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
public class AddCourse extends CourseManager {

    public boolean AddCourse(String CourseNum, String CourseName, String CourseMajor, String CourseCredit, String CourseInfo,
            JLabel CreditCheckText, JLabel CourseNumCheckText, JLabel CourseMajorCheck) {
        boolean History = false;
        boolean Addable = true;

        if (!CourseNum.matches("^[0-9]{6}$")) {
            CourseNumCheckText.setText("강의 번호는 6자리 숫자여야합니다.");
            CourseNumCheckText.setForeground(Color.red);
            Addable = false;
        }

        if (!(CourseMajor.equals("전산학과") || CourseMajor.equals("전자공학과") || CourseMajor.equals("화학공학과") || CourseMajor.equals("기계공학과") || CourseMajor.equals("항공우주공학과"))) {
            CourseMajorCheck.setText("개설된 학과만 등록 가능합니다.");
            CourseMajorCheck.setForeground(Color.red);
            Addable = false;
        }
        if (CourseNum.equals("") || CourseName.equals("") || CourseMajor.equals("") || CourseInfo.equals("") || CourseCredit.equals("")) {
            JOptionPane.showInternalMessageDialog(null, "빈 칸 없이 입력하세요");
            Addable = false;
        }
        if (!CourseCredit.matches("^[1-4]{1}$")) {
            CreditCheckText.setText("학점은 최소 1 학점, 최대 4 학점이어야 합니다.");
            CreditCheckText.setForeground(Color.red);
            Addable = false;
        }
        try {
            String SQL = String.format("SELECT * FROM COURSE WHERE COURSENUM='%s'", CourseNum); //강좌 번호 중복체크
            rs = st.executeQuery(SQL);

            if (rs.next()) {
                CourseNumCheckText.setText("이미 등록 된 강좌번호입니다.");
                CourseNumCheckText.setForeground(Color.red);
                Addable = false;
            }

            if (Addable) {
                SQL = String.format("INSERT INTO COURSE VALUES('%s', '%s', '%s', %s, '%s', %b)",
                        CourseNum, CourseName, CourseMajor, CourseCredit, CourseInfo, History);
                st.executeUpdate(SQL);
                return true;
            }
        } catch (SQLException e) {
            System.out.println("DB Insert Error : " + e.getMessage());
        }
        return false;
    }
}
