/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollegeManagement;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DongHyeon Kim <20183188>
 */
public class SearchInfo extends CollegeManager {

    public ResultSet StudentSearch(String searchTarget) { //Student Search
        try {
            int select;
            String target = null;
            String TargetTable = null;

            //////////////////////////////////////////////////////////////////////////////////////
            if (searchTarget.matches("^[가-힣]*$")) { //Name Check to Regex
                target = String.format("STUDENTINFO WHERE Name='%s'", searchTarget);
            } else if (searchTarget.matches("^[SP]\\d{3}$")) {//Number Check to Regex
                target = String.format("STUDENTINFO WHERE Number='%s'", searchTarget);
            }

            //System.out.println(target);
            String SQL;
            SQL = String.format("SELECT * FROM %s", target);

            rs = st.executeQuery(SQL);
            return rs;

            //////////////////////////////////////////////////////////////////////////////////////// 이 부분 안지우면 rs가 null이 될 수 있음 
        } catch (SQLException e) {
            System.out.println("DB Search Error : " + e.getMessage());
        }

        return rs;
    }

    public ResultSet ProffesorSearch(String searchTarget) {
        try {
            int select;
            String target = null;

            if (searchTarget.matches("^[가-힣]*$")) { //Name Check to Regex
                target = String.format("PROFESSORINFO WHERE Name='%s'", searchTarget);
            } else if (searchTarget.matches("^[SP]\\d{3}$")) {//Number Check to Regex
                target = String.format("PROFESSORINFO WHERE Number='%s'", searchTarget);
            }

            // System.out.println(target);
            String SQL;
            SQL = String.format("SELECT * FROM %s", target);

            rs = st.executeQuery(SQL);

        } catch (SQLException e) {
            System.out.println("DB Search Error : " + e.getMessage());
        }

        return rs;
    }

    public void Search(String searchTarget, boolean whoSelected, DefaultTableModel JTable) {
        try {
            String targetTable = whoSelected ? "STUDENTINFO" : "PROFESSORINFO";
            String target = searchTarget.matches("^[가-힣]*$") ? "NAME" : searchTarget.matches("^[SP]\\d{3}$") ? "NUMBER" : null;

            if (target != null) {
                JTable.setRowCount(0);
                String SQL = String.format("SELECT * FROM %s WHERE %s ='%s'", targetTable, target, searchTarget);
                rs = st.executeQuery(SQL);
                
                while(rs.next()){
                    String name = rs.getString("NAME");
                    String number = rs.getString("NUMBER");
                    String major = rs.getString("MAJOR");
                    JTable.insertRow(JTable.getRowCount(), new Object[]{number, name, major});
                }
            }
            else{
                JOptionPane.showInternalMessageDialog(null, "잘못된 입력 형식입니다.");
            }
        } catch (SQLException e) {
            System.out.println("Search Error : " + e.getMessage());
        }
    }
}
