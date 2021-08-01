/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseManagement;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DongHyeon Kim <20183188>
 */
public class ChangePassword extends CourseManager {
        public boolean changePassword(String userID, String NowPW, String AfterPW){
        
        if("".equals(userID) ||"".equals(NowPW) || "".equals(AfterPW)){
            JOptionPane.showInternalMessageDialog(null, "빈칸 없이 기재해주세요.");
            return false;
        }
        
        try{
            String SQL = String.format("SELECT * FROM ACCOUNT WHERE USERID = '%s'", userID);
            rs = st.executeQuery(SQL);
            
            if(rs.next()){
                if(userID.equals(rs.getString("USERID")) && NowPW.equals(rs.getString("PASSWORD"))){
                    SQL = String.format("UPDATE ACCOUNT SET PASSWORD = '%s' WHERE USERID = '%s'", AfterPW, userID);
                    st.executeUpdate(SQL);

                    return true;
                }
                else{
                    JOptionPane.showInternalMessageDialog(null, "아이디 또는 패스워드가 일치하지 않습니다.");
                    return false;
                }
            }
            else return false;
        }
        catch(SQLException e){
            System.out.println("PASSWORD CHANGE ERROR : " + e.getMessage());
        }
        return false;
    }
}
