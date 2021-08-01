/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor...
 */
package Student;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author DongHyeon Kim <20183188>
 */
public class ResistLecture extends Student {

    //TEST
    /**
     *
     * @param userID
     * @param LectureNum
     * @param LectureName
     * @param LecOverlapCheck
     */
    public boolean resistLecture(String userID, String LectureNum, String LectureName, JLabel LecOverlapCheck) {
        try {

            String SNum = userID;
            String Name = " ";
            String Major = " ";
            String Grade = " ";
            String SQL;
            int Credit = 0;
            int LectureCredit = 0;
            boolean CheckResist = true;
            
            SQL = String.format("SELECT * FROM STUDENTBILL WHERE NUMBER = '%s'", userID);
            rs = st.executeQuery(SQL);
            
            if(rs.next()){
                JOptionPane.showInternalMessageDialog(null, "수강료 청구서가 발급된 이후에는 수강신청이 불가합니다.");
                return false;
            }

            
            //////////////////////////////Lecture Overlap Check///////////////////////////////////////////////
            SQL = String.format("SELECT * FROM STUDENTCOURSELIST WHERE SNUMBER = '%s'", SNum);
            rs = st.executeQuery(SQL);

            while (rs.next()) {
                if (LectureNum.equals(rs.getString("LECTURENUM"))) { //Lecture Overlap Check
                    JOptionPane.showInternalMessageDialog(null, "중복 수강은 불가합니다.");
                    LecOverlapCheck.setText("이미 신청된 강의입니다.");
                    LecOverlapCheck.setForeground(Color.red);
                    CheckResist = false;
                }
            }
            //////////////////////////////////////////////////////////////////////////////////////////////////

            SQL = String.format("SELECT * FROM LECTURE WHERE LECTURENUM='%s'", LectureNum);
            rs = st.executeQuery(SQL);
            int NowPerson = 0;
            int MaxPerson = 0;
            if(rs.next()){
                NowPerson = rs.getInt("NOWPERSON");
                MaxPerson = rs.getInt("MAXPERSON");
                if(NowPerson >= MaxPerson){
                    JOptionPane.showInternalMessageDialog(null, "최대 수강인원이 초과되어 신청할 수 없습니다.");
                    return false;
                }
            }
            
            if (CheckResist) {
                SQL = String.format("SELECT * FROM STUDENTINFO WHERE NUMBER='%s'", SNum);
                rs = st.executeQuery(SQL);

                if (rs.next()) {
                    Credit = rs.getInt("CREDIT");
                    Name = rs.getString("NAME");
                    Major = rs.getString("MAJOR");
                }
                
                SQL = String.format("SELECT * FROM LECTURE WHERE LECTURENUM = '%s'", LectureNum);
                rs = st.executeQuery(SQL);

                if(rs.next()) LectureCredit = rs.getInt("CREDIT");

                Credit += LectureCredit;
                if (Credit > 18) {
                    JOptionPane.showInternalMessageDialog(null, "신청 학점은 18학점을 초과할 수 없습니다.");
                    return false;
                } else {
                    SQL = String.format("UPDATE STUDENTINFO SET CREDIT = '%d' WHERE NUMBER='%s'", Credit, SNum);
                    st.executeUpdate(SQL);

                    SQL = String.format("INSERT INTO STUDENTCOURSELIST VALUES('%s', '%s', '%s', '%s', '%s', '%s')", SNum, Name, Major, LectureNum, LectureName, Grade); //삽입구문 확인필요.
                    st.executeUpdate(SQL);
                    
                    SQL = String.format("UPDATE LECTURE SET NOWPERSON='%d' WHERE LECTURENUM='%s'", NowPerson+1, LectureNum);
                    st.executeUpdate(SQL);
                    return true;
                }
            }

        } catch (SQLException e) {
            System.out.println("ResistLecture : " + e.getMessage());
        }

        return false;
    }
}
