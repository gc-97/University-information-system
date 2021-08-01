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
public class AddLecture extends CourseManager {

    public boolean AddLecture(String courseNum, String courseName, String Major, int Credit, String courseInfo,
            String Professor, String PNum, String Min, String Max, JLabel CourseCheck, JLabel ProfessorCheck, JLabel MinMaxCheck) {

        if (!Min.matches("^[0-9]*$") || !Max.matches("^[0-9]*$")) {
            MinMaxCheck.setText("숫자를 입력해주세요.");
            MinMaxCheck.setForeground(Color.red);
            return false;
        }
        
        LectureInfo lc = new LectureInfo();
        lc.LectureNum = courseNum;
        lc.LectureName = courseName;
        lc.Major = Major;

        lc.Credit = Credit;
        lc.LectureInfo = courseInfo;

        lc.Professor = Professor;
        lc.MinPerson = Integer.parseInt(Min);
        lc.MaxPerson = Integer.parseInt(Max);
        lc.NowPerson = 0;

        String SQL;
        boolean Addable = true;
        try {
            if (Integer.parseInt(Min) > Integer.parseInt(Max)) {
                MinMaxCheck.setText("최소 수강 인원은 최대 수강 인원보다 많을 수 없습니다.");
                MinMaxCheck.setForeground(Color.red);
                Addable = false;
            }

            if (!PNum.matches("^[P]\\d{3}$") || !Min.matches("^[0-9]*$") || !Max.matches("^[0-9]*$")) {
                JOptionPane.showInternalMessageDialog(null, "올바른 입력 형식이 아닙니다.");
                Addable = false;
            }

            if (PNum.equals("") || Min.equals("") || Max.equals("") || Professor.equals("")) {
                JOptionPane.showInternalMessageDialog(null, "빈 칸 없이 기재해주세요.");
                Addable = false;
            }

            SQL = String.format("SELECT * FROM LECTURE WHERE LECTURENUM='%s'", courseNum);
            rs = st.executeQuery(SQL);

            if (rs.next()) {
                CourseCheck.setText("이미 개설 된 강좌입니다.");
                CourseCheck.setForeground(Color.red);
                Addable = false;
            }

            SQL = String.format("SELECT * FROM PROFESSORINFO WHERE NUMBER='%s' AND NAME='%s'", PNum, Professor);
            rs = st.executeQuery(SQL);

            if (!rs.next()) {
                ProfessorCheck.setText("등록되지 않은 교수입니다.");
                ProfessorCheck.setForeground(Color.red);
                Addable = false;
            }

            if (Addable) {
                SQL = String.format("INSERT INTO LECTURE VALUES('%s', '%s', '%s','%s', '%s', '%d', '%d', '%d', '%d', '%s');", lc.LectureNum, lc.LectureName,
                        lc.Major, PNum, lc.Professor, lc.MinPerson, lc.MaxPerson, lc.NowPerson, lc.Credit, lc.LectureInfo);

                st.executeUpdate(SQL);

                SQL = String.format("UPDATE COURSE SET HISTORY=TRUE WHERE COURSENUM='%s' AND NAME='%s';", courseNum, courseName);
                st.executeUpdate(SQL);

                SQL = String.format("INSERT INTO PROFESSORCOURSELIST VALUES('%s', '%s', '%s', '%s')", PNum, lc.Professor, lc.LectureNum, lc.LectureName);
                st.executeUpdate(SQL);
                return true;
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println("Lecture insert Error : " + e.getMessage());
        }
        return false;
    }

}
