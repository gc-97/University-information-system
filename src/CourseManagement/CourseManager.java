/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseManagement;

import DB.DataBase;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author DongHyeon Kim <20183188>
 */
public class CourseManager {

    DataBase db = new DataBase();
    
    Statement st = db.getSt();
    ResultSet rs = db.getRs();
    String userID;
    
    protected class CourseInfo {

        protected String CourseNumber;
        protected String CourseName;
        protected String Major;
        protected int CourseCredit;
        protected String CourseInfo;
        protected boolean History;
    }

    protected class LectureInfo {

        protected String LectureNum;
        protected String LectureName;
        protected String Major;
        protected String Professor;
        protected int MinPerson;
        protected int MaxPerson;
        protected int NowPerson;
        protected int Credit;
        protected String LectureInfo;
    }

    public Statement getSt() {
        return st;
    }

    public ResultSet getRs() {
        return rs;
    }
    
}
