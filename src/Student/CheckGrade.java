/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor...
 */
package Student;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DongHyeon Kim <20183188>
 */
public class CheckGrade extends Student {

    public void viewStudentGrade(String SNum, DefaultTableModel JTable,
        JTextField GradeFField, JTextField GradeField) {
        ArrayList<String> Grades = new ArrayList<>();
        try {
            JTable.setRowCount(0);
            String SQL;
            int LectureCount = 0;
            int FCount = 0;
            SQL = String.format("SELECT * FROM STUDENTCOURSELIST WHERE SNumber='%s'", SNum);     // /////1차수정.
            rs = st.executeQuery(SQL);
            
            while (rs.next()) {
                String LectureNum = rs.getString("LECTURENUM");
                String LectureName = rs.getString("LectureName");       // getString()부분 1차 확인.
                String StudentGrade = rs.getString("Grade");
                
                LectureCount++;
                Grades.add(StudentGrade);
                JTable.insertRow(JTable.getRowCount(), new Object[]{LectureNum, LectureName, StudentGrade});
            }
            
            double GradeF = 0;
            double Grade = 0;
            
            for(int i = 0; i < Grades.size(); i++){
                if("A".equals(Grades.get(i))){
                    GradeF += 4.0;
                    Grade += 4.0;
                }
                else if("B".equals(Grades.get(i))){
                    GradeF += 3.0;
                    Grade += 3.0;
                }
                else if ("C".equals(Grades.get(i))){
                    GradeF += 2.0;
                    Grade += 2.0;
                }
                else if ("D".equals(Grades.get(i))){
                    GradeF += 1.0;
                    Grade += 1.0;
                }
                else if ("F".equals(Grades.get(i))){
                    FCount++;
                }
                else LectureCount--;
            }
            
            String GradeFResult = String.format("%.2f", GradeF / (double)(LectureCount));
            String GradeResult = String.format("%.2f", GradeF / (double)(LectureCount - FCount));
            
            GradeFField.setText(GradeFResult);
            GradeField.setText(GradeResult);
        } catch (SQLException e) {
            System.out.println("StudentGrade Print Error : " + e.getMessage());
        }
    }
}
