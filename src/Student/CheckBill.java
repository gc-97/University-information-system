/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author DongHyeon Kim <20183188>
 */
public class CheckBill extends Student {
    
    public void CheckBill(String userID, JLabel SNUMFIELD, JLabel SNAMEFIELD, JLabel MAJORFIELD, JLabel CREDITFIELD, JLabel BILLFIELD){
        try{
            String price = "0";
            String SQL = String.format("SELECT * FROM STUDENTINFO WHERE NUMBER ='%s'", userID);
            rs = st.executeQuery(SQL);
            
            if(rs.next()){
                SNUMFIELD.setText(rs.getString("NUMBER"));
                SNAMEFIELD.setText(rs.getString("NAME"));
                MAJORFIELD.setText(rs.getString("MAJOR"));
                CREDITFIELD.setText(rs.getString("CREDIT"));
                price = rs.getString("PRICE");
                
                BILLFIELD.setText(price);
            }
            if("0".equals(price)) {
                JOptionPane.showInternalMessageDialog(null, "발급 된 수강료 청구서가 없습니다. 수업 담당자에게 문의하세요.");
            }
            
        }
        catch(Exception e){
            System.out.println("CHECK BILL ERROR : " + e.getMessage());
        }
    }
}
