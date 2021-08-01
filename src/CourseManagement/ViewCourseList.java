/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseManagement;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DongHyeon Kim <20183188>
 */
public class ViewCourseList extends CourseManager {

    public ResultSet ViewCourseList() {
        String SQL;
        SQL = String.format("SELECT * FROM COURSE");
        CourseInfo c = new CourseInfo();

        try {
            rs = st.executeQuery(SQL);
        } catch (SQLException e) {
            System.out.println("Course PrintError : " + e.getMessage());
        }
        return rs;
    }

    public void PrintCourseList(DefaultTableModel JTable) {
        ViewCourseList v = new ViewCourseList();
        rs = v.ViewCourseList();
        JTable.setRowCount(0);
        try {
            while (rs.next()) {
                String courseNum = rs.getString("COURSENUM");
                String courseName = rs.getString("NAME");
                String Major = rs.getString("MAJOR");
                String Credit = rs.getInt("CREDIT") + "";
                String courseInfo = rs.getString("COURSEINFO");

                JTable.insertRow(JTable.getRowCount(), new Object[]{courseNum, courseName, Major, Credit, courseInfo});
            }

        } catch (SQLException e) {
            System.out.println("Course List Print Error : " + e.getMessage());
        }
    }
}
