/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor...
 */
package Student;
import DB.DataBase;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author DongHyeon Kim <20183188>
 */
public class Student {
    DataBase db = new DataBase();
    Statement st = db.getSt();
    ResultSet rs = db.getRs();

     protected class StudentInfo{
        protected String Id;
        protected String Course;
        protected int Credit;
    }
}
