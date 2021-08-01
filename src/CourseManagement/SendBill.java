/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseManagement;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DongHyeon Kim <20183188>
 */
public class SendBill extends CourseManager {

    public boolean sendBill(String SNum, String SName, String Major, String SCredit, DefaultTableModel StudentTable) {
        ViewStudentList v= new ViewStudentList();
        try {
            String SQL;
            int Credit = Integer.parseInt(SCredit);
            int Amount = Credit * 500000;
            String price = String.format("%,d", Amount);
            
            if("0".equals(SCredit)){
                JOptionPane.showInternalMessageDialog(null, "수강 신청을 하지않은 학생입니다.");
                return false;
            }
            
            SQL = String.format("UPDATE STUDENTINFO SET PRICE = '%s' WHERE NUMBER='%s' AND NAME = '%s';", price, SNum, SName);
            st.executeUpdate(SQL);

            StudentTable.setRowCount(0);
            
            v.ViewStudentList(StudentTable);
//            int RowCount = StudentTable.getRowCount();
//            
//            for(int i = 0; i < RowCount; i++){
//                String Snumber = (String)StudentTable.getValueAt(i,0);
//                String Sname = (String)StudentTable.getValueAt(i, 1);
//                String Smajor = (String)StudentTable.getValueAt(i, 2);
//                String Scredit = (String)StudentTable.getValueAt(i, 3);
//
//                SQL = String.format("SELECT * FROM STUDENTBILL WHERE NUMBER ='%s'", Snumber);
//                rs = st.executeQuery(SQL);
//                if(rs.next()){
//                    StudentTable.insertRow(i, new Object[]{Snumber, Sname, Smajor, Scredit, rs.getString("BILL")});
//                    StudentTable.removeRow(i + 1);
//                }
//                
//            }
            
            
            return true;
        } catch (NumberFormatException | SQLException e) {
            System.out.println("SENDBILL ERROR : " + e.getMessage());
        }
        return false;
    }
}
