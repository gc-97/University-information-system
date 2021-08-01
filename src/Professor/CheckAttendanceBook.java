/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Professor;

import java.sql.SQLException;

/**
 *
 * @author DongHyeon Kim <20183188>
 */
public class CheckAttendanceBook extends Professor{
    public void ViewAttendanceBook(String LectureNum, String LectureName){
        try{
            String SQL;
            SQL = String.format("SELECT * FROM STUDENTCOURSELIST WHERE LECTURENUM='%s' AND LECTURENAME='%s'", LectureNum, LectureName);
            rs = st.executeQuery(SQL);
            
            while(rs.next()){
                String SNum = rs.getString("SNUMBER");
                String SName = rs.getString("SName");
                String Grade = rs.getString("Grade");
                System.out.printf("SNUM [ %s ] SName [ %s ] Grade [ %s ]\n", SNum, SName, Grade); //JTable로 출력
            }
        }
        catch(SQLException e){
            System.out.println("AttendanceBook Print Error : " + e.getMessage());
        }
    }
}