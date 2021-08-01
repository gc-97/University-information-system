/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Professor;
import DB.DataBase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DongHyeon Kim <20183188>
 */
public class Professor {
    DataBase db = new DataBase();
    Statement st = db.getSt();
    ResultSet rs = db.getRs();
    
    protected String ProfessorID;
    
    public void ViewProfessorLecture(String ProfessorID, DefaultTableModel JTable){
        ArrayList<String> LectureNum = new ArrayList<>();
        
        try{
            String SQL;
            SQL = String.format("SELECT * FROM PROFESSORCOURSELIST WHERE PNUMBER='%s'", ProfessorID);
            rs = st.executeQuery(SQL);
            JTable.setRowCount(0);
           
            while(rs.next()){
                LectureNum.add(rs.getString("LECTURENUM"));
            }
            
            int ListSize = LectureNum.size();
            for(int i = 0; i < ListSize; i++){
                SQL = String.format("SELECT * FROM LECTURE WHERE LECTURENUM='%s'",LectureNum.get(i));
                rs = st.executeQuery(SQL);
                
                while(rs.next()){
                    String LNum = rs.getString("LECTURENUM");
                    String LName = rs.getString("LECTURENAME");
                    String Major = rs.getString("MAJOR");
                    String Credit = rs.getInt("CREDIT") + "";
                    String Professor = rs.getString("PROFESSOR");
                    
                    JTable.insertRow(JTable.getRowCount(),new Object[]{LNum, LName, Major, Credit, Professor});
                }
            }
        }
        catch(SQLException e){
            System.out.println("PRINT ERROR : " + e.getMessage());
        }
    }
}
