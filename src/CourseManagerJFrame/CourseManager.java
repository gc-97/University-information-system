/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseManagerJFrame;

import java.awt.Cursor;
import javax.swing.ImageIcon;
import MainLoginJFrame.MainLoginFrame;
import java.awt.Color;
import CourseManagement.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DongHyeon Kim <20183188>
 */
public class CourseManager extends javax.swing.JFrame {

    DefaultTableModel CourseTableModel;
    DefaultTableModel CourseTableModel_view;
    DefaultTableModel ModifyTable;
    DefaultTableModel DeleteTable;
    DefaultTableModel StudentListTableModel;
    int mouseX;
    int mouseY;
    String userID = "";

    /**
     * Creates new form CourseManager
     */
    public CourseManager() {
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        CourseInfoInput.setBackground(new Color(0, 0, 0, 1));
        CourseNameInput.setBackground(new Color(0, 0, 0, 1));
        CourseNumInput.setBackground(new Color(0, 0, 0, 1));
        CourseMajorInput.setBackground(new Color(0, 0, 0, 0));
        CreditInput.setBackground(new Color(0, 0, 0, 1));
        ModifyCourseNum.setBackground(new Color(0, 0, 0, 1));
        ModifyCourseName.setBackground(new Color(0, 0, 0, 1));
        ModifyCourseMajor.setBackground(new Color(0, 0, 0, 0));
        ModifyCourseCredit.setBackground(new Color(0, 0, 0, 1));
        ModifyCourseInfo.setBackground(new Color(0, 0, 0, 1));
        DeleteCourseNum.setBackground(new Color(0, 0, 0, 1));
        DeleteCourseName.setBackground(new Color(0, 0, 0, 1));
        DeleteCourseMajor.setBackground(new Color(0, 0, 0, 1));
        DeleteCourseCredit.setBackground(new Color(0, 0, 0, 1));
        DeleteCourseInfo.setBackground(new Color(0, 0, 0, 1));

        CourseTableModel = (DefaultTableModel) CourseTable.getModel();
        ModifyTable = (DefaultTableModel) ModifyCourseTable.getModel();
        DeleteTable = (DefaultTableModel) DeleteCourseTable.getModel();
        StudentListTableModel = (DefaultTableModel) StudentListTable.getModel();

        CourseNumField.setBackground(new Color(0, 0, 0, 1));
        InfoField.setBackground(new Color(0, 0, 0, 1));
        MajorField.setBackground(new Color(0, 0, 0, 1));
        CreditField.setBackground(new Color(0, 0, 0, 1));
        CourseNameField.setBackground(new Color(0, 0, 0, 1));

        InputProfessor.setBackground(new Color(0, 0, 0, 1));
        InputMinimum.setBackground(new Color(0, 0, 0, 1));
        InputMaximum.setBackground(new Color(0, 0, 0, 1));
        InputPNum.setBackground(new Color(0, 0, 0, 1));

        ADDPanel.setVisible(true);
        OPENPanel.setVisible(false);
        MODIFYPanel.setVisible(false);
        DELETEPanel.setVisible(false);
        SENDBILLPanel.setVisible(false);
        PASSWORDPanel.setVisible(false);

        ADDPanel.setEnabled(true);
        OPENPanel.setEnabled(false);
        MODIFYPanel.setEnabled(false);
        DELETEPanel.setEnabled(false);
        SENDBILLPanel.setEnabled(false);
        PASSWORDPanel.setEnabled(false);
        NowPW.setBackground(new Color(0, 0, 0, 1));
        AfterPW.setBackground(new Color(0, 0, 0, 1));
    }

    public CourseManager(String userID) {
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        CourseInfoInput.setBackground(new Color(0, 0, 0, 1));
        CourseNameInput.setBackground(new Color(0, 0, 0, 1));
        CourseNumInput.setBackground(new Color(0, 0, 0, 1));
        CourseMajorInput.setBackground(new Color(0, 0, 0, 0));
        CreditInput.setBackground(new Color(0, 0, 0, 1));
        ModifyCourseNum.setBackground(new Color(0, 0, 0, 1));
        ModifyCourseName.setBackground(new Color(0, 0, 0, 1));
        ModifyCourseMajor.setBackground(new Color(0, 0, 0, 0));
        ModifyCourseCredit.setBackground(new Color(0, 0, 0, 1));
        ModifyCourseInfo.setBackground(new Color(0, 0, 0, 1));
        DeleteCourseNum.setBackground(new Color(0, 0, 0, 1));
        DeleteCourseName.setBackground(new Color(0, 0, 0, 1));
        DeleteCourseMajor.setBackground(new Color(0, 0, 0, 1));
        DeleteCourseCredit.setBackground(new Color(0, 0, 0, 1));
        DeleteCourseInfo.setBackground(new Color(0, 0, 0, 1));

        CourseTableModel = (DefaultTableModel) CourseTable.getModel();
        ModifyTable = (DefaultTableModel) ModifyCourseTable.getModel();
        DeleteTable = (DefaultTableModel) DeleteCourseTable.getModel();
        StudentListTableModel = (DefaultTableModel) StudentListTable.getModel();

        CourseNumField.setBackground(new Color(0, 0, 0, 1));
        InfoField.setBackground(new Color(0, 0, 0, 1));
        MajorField.setBackground(new Color(0, 0, 0, 1));
        CreditField.setBackground(new Color(0, 0, 0, 1));
        CourseNameField.setBackground(new Color(0, 0, 0, 1));

        InputProfessor.setBackground(new Color(0, 0, 0, 1));
        InputMinimum.setBackground(new Color(0, 0, 0, 1));
        InputMaximum.setBackground(new Color(0, 0, 0, 1));
        InputPNum.setBackground(new Color(0, 0, 0, 1));

        ADDPanel.setVisible(true);
        OPENPanel.setVisible(false);
        MODIFYPanel.setVisible(false);
        DELETEPanel.setVisible(false);
        SENDBILLPanel.setVisible(false);
        PASSWORDPanel.setVisible(false);

        ADDPanel.setEnabled(true);
        OPENPanel.setEnabled(false);
        MODIFYPanel.setEnabled(false);
        DELETEPanel.setEnabled(false);
        SENDBILLPanel.setEnabled(false);
        PASSWORDPanel.setEnabled(false);

        NowPW.setBackground(new Color(0, 0, 0, 1));
        AfterPW.setBackground(new Color(0, 0, 0, 1));

        this.userID = userID;
        userIDLabel.setText(userID);
        userIDLabel.setForeground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OPENPanel = new javax.swing.JPanel();
        InfoLabel = new javax.swing.JLabel();
        CreditLabel = new javax.swing.JLabel();
        MajorLabel = new javax.swing.JLabel();
        CourseNameLabel = new javax.swing.JLabel();
        CourseNumLabel = new javax.swing.JLabel();
        CourseNumField = new javax.swing.JTextField();
        InfoField = new javax.swing.JTextField();
        MajorField = new javax.swing.JTextField();
        CreditField = new javax.swing.JTextField();
        CourseNameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CourseTable = new javax.swing.JTable();
        OPEN_LECTURE_TEXT = new javax.swing.JLabel();
        ADDButt = new javax.swing.JButton();
        InputPNum = new javax.swing.JTextField();
        InputProfessorNumField = new javax.swing.JLabel();
        InputProfessor = new javax.swing.JTextField();
        InputMinimum = new javax.swing.JTextField();
        InputMaximum = new javax.swing.JTextField();
        InputFieldLong = new javax.swing.JLabel();
        InputProfessorField = new javax.swing.JLabel();
        Professor_Text = new javax.swing.JLabel();
        MaximumField = new javax.swing.JLabel();
        MinimumField = new javax.swing.JLabel();
        Min_Text1 = new javax.swing.JLabel();
        Min_Text = new javax.swing.JLabel();
        ProfessorNum_Text = new javax.swing.JLabel();
        ProfessorCheck = new javax.swing.JLabel();
        CourseCheck = new javax.swing.JLabel();
        MinMaxCheck = new javax.swing.JLabel();
        ADDPanel = new javax.swing.JPanel();
        ADDCOURSE_TEXT = new javax.swing.JLabel();
        CourseMajorInput = new javax.swing.JComboBox<>();
        CourseInfoInput = new javax.swing.JTextField();
        CourseNumInput = new javax.swing.JTextField();
        CreditInput = new javax.swing.JTextField();
        CourseNameInput = new javax.swing.JTextField();
        CouserName_Text = new javax.swing.JLabel();
        inputField = new javax.swing.JLabel();
        inputField1 = new javax.swing.JLabel();
        inputField2 = new javax.swing.JLabel();
        inputField3 = new javax.swing.JLabel();
        inputField4 = new javax.swing.JLabel();
        CouserNumber_Text = new javax.swing.JLabel();
        CourseMajor_Text = new javax.swing.JLabel();
        Credit_Text = new javax.swing.JLabel();
        CourseInfo_Text = new javax.swing.JLabel();
        AddCourseButt = new javax.swing.JButton();
        CourseNumCheckText = new javax.swing.JLabel();
        CreditCheckText = new javax.swing.JLabel();
        CourseMajorCheck = new javax.swing.JLabel();
        MODIFYPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ModifyCourseTable = new javax.swing.JTable();
        ModifyCourseNum = new javax.swing.JTextField();
        ModifyCourseName = new javax.swing.JTextField();
        ModifyCourseCredit = new javax.swing.JTextField();
        ModifyCourseInfo = new javax.swing.JTextField();
        ModifyCourseMajor = new javax.swing.JComboBox<>();
        NumberFieldBG = new javax.swing.JLabel();
        NameFieldBG = new javax.swing.JLabel();
        MajorFieldBG = new javax.swing.JLabel();
        CreditFieldBG = new javax.swing.JLabel();
        CreditText = new javax.swing.JLabel();
        MajorText = new javax.swing.JLabel();
        NameText = new javax.swing.JLabel();
        NumberText = new javax.swing.JLabel();
        InfoFieldBG = new javax.swing.JLabel();
        InfoText = new javax.swing.JLabel();
        CourseModifyButt = new javax.swing.JButton();
        CheckCredit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CheckMajor = new javax.swing.JLabel();
        DELETEPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DeleteCourseTable = new javax.swing.JTable();
        DeleteCourseButt = new javax.swing.JButton();
        DeleteCourseNum = new javax.swing.JTextField();
        DeleteCourseName = new javax.swing.JTextField();
        DeleteCourseMajor = new javax.swing.JTextField();
        DeleteCourseCredit = new javax.swing.JTextField();
        DeleteCourseInfo = new javax.swing.JTextField();
        NumberFieldBG1 = new javax.swing.JLabel();
        NameFieldBG1 = new javax.swing.JLabel();
        MajorFieldBG1 = new javax.swing.JLabel();
        CreditFieldBG1 = new javax.swing.JLabel();
        CreditText1 = new javax.swing.JLabel();
        MajorText1 = new javax.swing.JLabel();
        NameText1 = new javax.swing.JLabel();
        NumberText1 = new javax.swing.JLabel();
        InfoFieldBG1 = new javax.swing.JLabel();
        InfoText1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PASSWORDPanel = new javax.swing.JPanel();
        NowPW = new javax.swing.JTextField();
        AfterPW = new javax.swing.JPasswordField();
        ChangePassword = new javax.swing.JLabel();
        NowPasswordText = new javax.swing.JLabel();
        NowPasswordField = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ChagePasswordField = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        SENDBILLPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        StudentListTable = new javax.swing.JTable();
        SENDButt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BasePanel = new javax.swing.JPanel();
        ChangePW = new javax.swing.JLabel();
        SENDBILL = new javax.swing.JLabel();
        userIDLabel = new javax.swing.JLabel();
        DELETE_COURSE = new javax.swing.JLabel();
        MODIFY_COURSE = new javax.swing.JLabel();
        OPEN_LECTURE = new javax.swing.JLabel();
        ADD_COURSE = new javax.swing.JLabel();
        LogoutButt = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        BackGround = new javax.swing.JLabel();
        DragBar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OPENPanel.setBackground(new java.awt.Color(250, 250, 250));
        OPENPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InfoLabel.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        InfoLabel.setText("CourseInfo");
        OPENPanel.add(InfoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 70, -1));

        CreditLabel.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        CreditLabel.setText("Credit");
        OPENPanel.add(CreditLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 70, -1));

        MajorLabel.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        MajorLabel.setText("Major");
        OPENPanel.add(MajorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 70, -1));

        CourseNameLabel.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        CourseNameLabel.setText("CourseName");
        OPENPanel.add(CourseNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 70, -1));

        CourseNumLabel.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        CourseNumLabel.setText("CourseNum");
        OPENPanel.add(CourseNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 70, -1));

        CourseNumField.setEditable(false);
        CourseNumField.setBorder(null);
        OPENPanel.add(CourseNumField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 70, 30));

        InfoField.setEditable(false);
        InfoField.setBorder(null);
        OPENPanel.add(InfoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 230, 30));

        MajorField.setEditable(false);
        MajorField.setAutoscrolls(false);
        MajorField.setBorder(null);
        OPENPanel.add(MajorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 110, 30));

        CreditField.setEditable(false);
        CreditField.setBorder(null);
        OPENPanel.add(CreditField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 20, 30));

        CourseNameField.setEditable(false);
        CourseNameField.setBorder(null);
        OPENPanel.add(CourseNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 100, 30));

        CourseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "강좌 번호", "강좌명", "담당 학과", "학점", "강좌 정보"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CourseTable.setRowHeight(25);
        CourseTable.setSelectionBackground(new java.awt.Color(0, 204, 255));
        CourseTable.setShowVerticalLines(false);
        CourseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CourseTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CourseTable);
        if (CourseTable.getColumnModel().getColumnCount() > 0) {
            CourseTable.getColumnModel().getColumn(0).setPreferredWidth(5);
            CourseTable.getColumnModel().getColumn(1).setPreferredWidth(40);
            CourseTable.getColumnModel().getColumn(2).setPreferredWidth(30);
            CourseTable.getColumnModel().getColumn(3).setPreferredWidth(5);
            CourseTable.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        OPENPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 590, 230));

        OPEN_LECTURE_TEXT.setFont(new java.awt.Font("Source Code Pro", 1, 24)); // NOI18N
        OPEN_LECTURE_TEXT.setText("OPEN LECTURE");
        OPENPanel.add(OPEN_LECTURE_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 190, 40));

        ADDButt.setText("강의 등록");
        ADDButt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADDButtMouseClicked(evt);
            }
        });
        OPENPanel.add(ADDButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 130, 40));

        InputPNum.setBorder(null);
        OPENPanel.add(InputPNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 80, 30));

        InputProfessorNumField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/MiddleInputField.png"))); // NOI18N
        InputProfessorNumField.setText("jLabel2");
        OPENPanel.add(InputProfessorNumField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 90, 30));

        InputProfessor.setBorder(null);
        OPENPanel.add(InputProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 80, 30));

        InputMinimum.setBorder(null);
        OPENPanel.add(InputMinimum, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 50, 30));

        InputMaximum.setBorder(null);
        OPENPanel.add(InputMaximum, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 50, 30));

        InputFieldLong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/LongField.png"))); // NOI18N
        OPENPanel.add(InputFieldLong, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 590, 30));

        InputProfessorField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/MiddleInputField.png"))); // NOI18N
        InputProfessorField.setText("jLabel2");
        OPENPanel.add(InputProfessorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 90, 30));

        Professor_Text.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        Professor_Text.setText("Professor");
        OPENPanel.add(Professor_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        MaximumField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/ShortInputField.png"))); // NOI18N
        MaximumField.setText("jLabel1");
        OPENPanel.add(MaximumField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 60, 30));

        MinimumField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/ShortInputField.png"))); // NOI18N
        MinimumField.setText("jLabel1");
        OPENPanel.add(MinimumField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 60, 30));

        Min_Text1.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        Min_Text1.setText("Max");
        OPENPanel.add(Min_Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, -1, -1));

        Min_Text.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        Min_Text.setText("Min");
        OPENPanel.add(Min_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        ProfessorNum_Text.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        ProfessorNum_Text.setText("Professor Number");
        OPENPanel.add(ProfessorNum_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));
        OPENPanel.add(ProfessorCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 250, 20));
        OPENPanel.add(CourseCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 590, 20));
        OPENPanel.add(MinMaxCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 370, 20));

        getContentPane().add(OPENPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 670, 470));

        ADDPanel.setBackground(new java.awt.Color(250, 250, 250));
        ADDPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ADDCOURSE_TEXT.setFont(new java.awt.Font("Source Code Pro", 1, 24)); // NOI18N
        ADDCOURSE_TEXT.setText("ADD COURSE");
        ADDPanel.add(ADDCOURSE_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 160, 40));

        CourseMajorInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "전산학과", "전자공학과", "화학공학과", "기계공학과", "항공우주공학과" }));
        CourseMajorInput.setBorder(null);
        ADDPanel.add(CourseMajorInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 150, 40));

        CourseInfoInput.setBorder(null);
        ADDPanel.add(CourseInfoInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 470, 40));

        CourseNumInput.setBorder(null);
        ADDPanel.add(CourseNumInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 150, 40));

        CreditInput.setBorder(null);
        ADDPanel.add(CreditInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 150, 40));

        CourseNameInput.setBorder(null);
        ADDPanel.add(CourseNameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 150, 40));

        CouserName_Text.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        CouserName_Text.setText("강좌 이름");
        ADDPanel.add(CouserName_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        inputField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/LongInputField.png"))); // NOI18N
        ADDPanel.add(inputField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 480, 40));

        inputField1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/InputField.png"))); // NOI18N
        ADDPanel.add(inputField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 160, 40));

        inputField2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/InputField.png"))); // NOI18N
        ADDPanel.add(inputField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 160, 40));

        inputField3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/InputField.png"))); // NOI18N
        ADDPanel.add(inputField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 160, 40));

        inputField4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/InputField.png"))); // NOI18N
        ADDPanel.add(inputField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 160, 40));

        CouserNumber_Text.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        CouserNumber_Text.setText("강좌 번호");
        ADDPanel.add(CouserNumber_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        CourseMajor_Text.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        CourseMajor_Text.setText("담당 학과");
        ADDPanel.add(CourseMajor_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        Credit_Text.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        Credit_Text.setText("학점");
        ADDPanel.add(Credit_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        CourseInfo_Text.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        CourseInfo_Text.setText("강좌 정보");
        ADDPanel.add(CourseInfo_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        AddCourseButt.setText("등록");
        AddCourseButt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddCourseButtMouseClicked(evt);
            }
        });
        ADDPanel.add(AddCourseButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 140, 40));
        ADDPanel.add(CourseNumCheckText, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 240, 20));
        ADDPanel.add(CreditCheckText, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 270, 20));
        ADDPanel.add(CourseMajorCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 250, 20));

        getContentPane().add(ADDPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 670, 470));

        MODIFYPanel.setBackground(new java.awt.Color(250, 250, 250));
        MODIFYPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ModifyCourseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "강좌 번호", "강좌명", "담당 학과", "학점", "강좌 정보"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ModifyCourseTable.setRowHeight(25);
        ModifyCourseTable.setSelectionBackground(new java.awt.Color(0, 204, 255));
        ModifyCourseTable.setShowVerticalLines(false);
        ModifyCourseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModifyCourseTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ModifyCourseTable);
        if (ModifyCourseTable.getColumnModel().getColumnCount() > 0) {
            ModifyCourseTable.getColumnModel().getColumn(0).setPreferredWidth(5);
            ModifyCourseTable.getColumnModel().getColumn(1).setPreferredWidth(20);
            ModifyCourseTable.getColumnModel().getColumn(2).setPreferredWidth(30);
            ModifyCourseTable.getColumnModel().getColumn(3).setPreferredWidth(5);
            ModifyCourseTable.getColumnModel().getColumn(4).setPreferredWidth(80);
        }

        MODIFYPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 590, 230));

        ModifyCourseNum.setEditable(false);
        ModifyCourseNum.setBorder(null);
        MODIFYPanel.add(ModifyCourseNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 80, 30));

        ModifyCourseName.setBorder(null);
        MODIFYPanel.add(ModifyCourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 150, 30));

        ModifyCourseCredit.setBorder(null);
        MODIFYPanel.add(ModifyCourseCredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 50, 30));

        ModifyCourseInfo.setBorder(null);
        MODIFYPanel.add(ModifyCourseInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 580, 40));

        ModifyCourseMajor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "전산학과", "전자공학과", "화학공학과", "기계공학과", "항공우주공학과" }));
        MODIFYPanel.add(ModifyCourseMajor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 150, 30));

        NumberFieldBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/MiddleInputField.png"))); // NOI18N
        MODIFYPanel.add(NumberFieldBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 90, 30));

        NameFieldBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/InputField.png"))); // NOI18N
        MODIFYPanel.add(NameFieldBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 160, 30));

        MajorFieldBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/InputField.png"))); // NOI18N
        MODIFYPanel.add(MajorFieldBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, 30));

        CreditFieldBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/ShortInputField.png"))); // NOI18N
        MODIFYPanel.add(CreditFieldBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 60, 30));

        CreditText.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        CreditText.setText("Credit");
        MODIFYPanel.add(CreditText, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, -1));

        MajorText.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        MajorText.setText("Major");
        MODIFYPanel.add(MajorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        NameText.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        NameText.setText("CourseName");
        MODIFYPanel.add(NameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        NumberText.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        NumberText.setText("CourseNum");
        MODIFYPanel.add(NumberText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        InfoFieldBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/LongField.png"))); // NOI18N
        MODIFYPanel.add(InfoFieldBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 590, 40));

        InfoText.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        InfoText.setText("CourseInfo");
        MODIFYPanel.add(InfoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        CourseModifyButt.setText("수정");
        CourseModifyButt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CourseModifyButtMouseClicked(evt);
            }
        });
        MODIFYPanel.add(CourseModifyButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 140, 40));
        MODIFYPanel.add(CheckCredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 90, 20));

        jLabel1.setFont(new java.awt.Font("Source Code Pro", 1, 24)); // NOI18N
        jLabel1.setText("MODIFY COURSE");
        MODIFYPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 200, 40));
        MODIFYPanel.add(CheckMajor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 190, 20));

        getContentPane().add(MODIFYPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 670, 470));

        DELETEPanel.setBackground(new java.awt.Color(250, 250, 250));
        DELETEPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeleteCourseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "강좌 번호", "강좌명", "담당 학과", "학점", "강좌 정보"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DeleteCourseTable.setRowHeight(25);
        DeleteCourseTable.setSelectionBackground(new java.awt.Color(0, 204, 255));
        DeleteCourseTable.setShowVerticalLines(false);
        DeleteCourseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteCourseTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(DeleteCourseTable);
        if (DeleteCourseTable.getColumnModel().getColumnCount() > 0) {
            DeleteCourseTable.getColumnModel().getColumn(0).setPreferredWidth(5);
            DeleteCourseTable.getColumnModel().getColumn(1).setPreferredWidth(40);
            DeleteCourseTable.getColumnModel().getColumn(2).setPreferredWidth(30);
            DeleteCourseTable.getColumnModel().getColumn(3).setPreferredWidth(5);
            DeleteCourseTable.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        DELETEPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 590, 230));

        DeleteCourseButt.setText("삭제");
        DeleteCourseButt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteCourseButtMouseClicked(evt);
            }
        });
        DELETEPanel.add(DeleteCourseButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 140, 40));

        DeleteCourseNum.setEditable(false);
        DeleteCourseNum.setBorder(null);
        DELETEPanel.add(DeleteCourseNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 80, 30));

        DeleteCourseName.setEditable(false);
        DeleteCourseName.setBorder(null);
        DELETEPanel.add(DeleteCourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 150, 30));

        DeleteCourseMajor.setEditable(false);
        DeleteCourseMajor.setBorder(null);
        DELETEPanel.add(DeleteCourseMajor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 150, 30));

        DeleteCourseCredit.setEditable(false);
        DeleteCourseCredit.setBorder(null);
        DELETEPanel.add(DeleteCourseCredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 50, 30));

        DeleteCourseInfo.setEditable(false);
        DeleteCourseInfo.setBorder(null);
        DELETEPanel.add(DeleteCourseInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 580, 40));

        NumberFieldBG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/MiddleInputField.png"))); // NOI18N
        DELETEPanel.add(NumberFieldBG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 90, 30));

        NameFieldBG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/InputField.png"))); // NOI18N
        DELETEPanel.add(NameFieldBG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 160, 30));

        MajorFieldBG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/InputField.png"))); // NOI18N
        DELETEPanel.add(MajorFieldBG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, 30));

        CreditFieldBG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/ShortInputField.png"))); // NOI18N
        DELETEPanel.add(CreditFieldBG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 60, 30));

        CreditText1.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        CreditText1.setText("Credit");
        DELETEPanel.add(CreditText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, -1));

        MajorText1.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        MajorText1.setText("Major");
        DELETEPanel.add(MajorText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        NameText1.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        NameText1.setText("CourseName");
        DELETEPanel.add(NameText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        NumberText1.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        NumberText1.setText("CourseNum");
        DELETEPanel.add(NumberText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        InfoFieldBG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/LongField.png"))); // NOI18N
        DELETEPanel.add(InfoFieldBG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 590, 40));

        InfoText1.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        InfoText1.setText("CourseInfo");
        DELETEPanel.add(InfoText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel2.setFont(new java.awt.Font("Source Code Pro", 1, 24)); // NOI18N
        jLabel2.setText("DELETE COURSE");
        DELETEPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 200, 40));

        getContentPane().add(DELETEPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 670, 470));

        PASSWORDPanel.setBackground(new java.awt.Color(250, 250, 250));
        PASSWORDPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NowPW.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        NowPW.setBorder(null);
        PASSWORDPanel.add(NowPW, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 150, 30));

        AfterPW.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        AfterPW.setBorder(null);
        PASSWORDPanel.add(AfterPW, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 150, 30));

        ChangePassword.setFont(new java.awt.Font("Source Code Pro", 1, 24)); // NOI18N
        ChangePassword.setText("CHANGE PASSWORD");
        PASSWORDPanel.add(ChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 240, 50));

        NowPasswordText.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        NowPasswordText.setText("현재 비밀번호          :   ");
        PASSWORDPanel.add(NowPasswordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 200, 30));

        NowPasswordField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfessorJFrame/InputField.png"))); // NOI18N
        PASSWORDPanel.add(NowPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 160, 30));

        jLabel8.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        jLabel8.setText("변경할 비밀번호       : ");
        PASSWORDPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 180, -1));

        ChagePasswordField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfessorJFrame/InputField.png"))); // NOI18N
        PASSWORDPanel.add(ChagePasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, 30));

        jButton1.setText("비밀번호 변경");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        PASSWORDPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 130, 40));

        getContentPane().add(PASSWORDPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 670, 470));

        SENDBILLPanel.setBackground(new java.awt.Color(250, 250, 250));
        SENDBILLPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StudentListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "학번", "학생명", "학과", "신청 학점", "수강료"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StudentListTable.setRowHeight(25);
        StudentListTable.setSelectionBackground(new java.awt.Color(0, 204, 255));
        StudentListTable.setShowVerticalLines(false);
        StudentListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentListTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(StudentListTable);
        if (StudentListTable.getColumnModel().getColumnCount() > 0) {
            StudentListTable.getColumnModel().getColumn(0).setPreferredWidth(5);
            StudentListTable.getColumnModel().getColumn(1).setPreferredWidth(20);
            StudentListTable.getColumnModel().getColumn(2).setPreferredWidth(30);
            StudentListTable.getColumnModel().getColumn(3).setPreferredWidth(5);
            StudentListTable.getColumnModel().getColumn(4).setPreferredWidth(80);
        }

        SENDBILLPanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 590, 250));

        SENDButt.setText("청구서 발급");
        SENDButt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SENDButtMouseClicked(evt);
            }
        });
        SENDBILLPanel.add(SENDButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 150, 50));

        jLabel3.setFont(new java.awt.Font("Source Code Pro", 1, 24)); // NOI18N
        jLabel3.setText("SEND BILL");
        SENDBILLPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        getContentPane().add(SENDBILLPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 670, 470));

        BasePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ChangePW.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N
        ChangePW.setForeground(new java.awt.Color(255, 255, 255));
        ChangePW.setText("비밀번호 변경");
        ChangePW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangePWMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ChangePWMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ChangePWMouseExited(evt);
            }
        });
        BasePanel.add(ChangePW, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 90, 20));

        SENDBILL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/SEND BILL Clicked.png"))); // NOI18N
        SENDBILL.setText("jLabel3");
        SENDBILL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SENDBILLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SENDBILLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SENDBILLMouseExited(evt);
            }
        });
        BasePanel.add(SENDBILL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 220, 50));
        BasePanel.add(userIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 120, 20));

        DELETE_COURSE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/DELETE COURSE.png"))); // NOI18N
        DELETE_COURSE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DELETE_COURSEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DELETE_COURSEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DELETE_COURSEMouseExited(evt);
            }
        });
        BasePanel.add(DELETE_COURSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, 50));

        MODIFY_COURSE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/MODIFY COURSE.png"))); // NOI18N
        MODIFY_COURSE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MODIFY_COURSEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MODIFY_COURSEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MODIFY_COURSEMouseExited(evt);
            }
        });
        BasePanel.add(MODIFY_COURSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, 50));

        OPEN_LECTURE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/OPEN LECTURE .png"))); // NOI18N
        OPEN_LECTURE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OPEN_LECTUREMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OPEN_LECTUREMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OPEN_LECTUREMouseExited(evt);
            }
        });
        BasePanel.add(OPEN_LECTURE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, 50));

        ADD_COURSE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/ADDCOURSE.png"))); // NOI18N
        ADD_COURSE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADD_COURSEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ADD_COURSEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ADD_COURSEMouseExited(evt);
            }
        });
        BasePanel.add(ADD_COURSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, 50));

        LogoutButt.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        LogoutButt.setText(" LOGOUT");
        LogoutButt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutButtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutButtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutButtMouseExited(evt);
            }
        });
        BasePanel.add(LogoutButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 60, 20));

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CollegeManagerJFrame/exitmini.png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitMouseExited(evt);
            }
        });
        BasePanel.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 30, 30));

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CourseManagerJFrame/BaseBackGround.png"))); // NOI18N
        BasePanel.add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        DragBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DragBarMouseDragged(evt);
            }
        });
        DragBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DragBarMousePressed(evt);
            }
        });
        BasePanel.add(DragBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 60));

        getContentPane().add(BasePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        setSize(new java.awt.Dimension(900, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void DragBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DragBarMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_DragBarMouseDragged

    private void DragBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DragBarMousePressed
        // TODO add your handling code here:
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_DragBarMousePressed

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered
        // TODO add your handling code here:
        this.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited
        // TODO add your handling code here:
        this.setCursor(new Cursor(0));
    }//GEN-LAST:event_ExitMouseExited

    private void LogoutButtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutButtMouseClicked
        // TODO add your handling code here:
        this.dispose();
        MainLoginFrame l = new MainLoginFrame();
        l.setVisible(true);
    }//GEN-LAST:event_LogoutButtMouseClicked

    private void LogoutButtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutButtMouseEntered
        // TODO add your handling code here:
        this.setCursor(HAND_CURSOR);
    }//GEN-LAST:event_LogoutButtMouseEntered

    private void LogoutButtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutButtMouseExited
        // TODO add your handling code here:
        this.setCursor(0);
    }//GEN-LAST:event_LogoutButtMouseExited

    private void ADD_COURSEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADD_COURSEMouseEntered
        // TODO add your handling code here:
        ADD_COURSE.setIcon(new ImageIcon("./src/CourseManagerJFrame/ADD COURSE Clicked.png"));
        this.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_ADD_COURSEMouseEntered

    private void OPEN_LECTUREMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OPEN_LECTUREMouseEntered
        // TODO add your handling code here:
        OPEN_LECTURE.setIcon(new ImageIcon("./src/CourseManagerJFrame/OPEN LECTURE Clicked .png"));
        this.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_OPEN_LECTUREMouseEntered

    private void MODIFY_COURSEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MODIFY_COURSEMouseEntered
        // TODO add your handling code here:
        MODIFY_COURSE.setIcon(new ImageIcon("./src/CourseManagerJFrame/MODIFY COURSE Clicked.png"));
        this.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_MODIFY_COURSEMouseEntered

    private void DELETE_COURSEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DELETE_COURSEMouseEntered
        // TODO add your handling code here:
        DELETE_COURSE.setIcon(new ImageIcon("./src/CourseManagerJFrame/DELETE COURSE Clicked.png"));
        this.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_DELETE_COURSEMouseEntered

    private void ADD_COURSEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADD_COURSEMouseExited
        // TODO add your handling code here:
        ADD_COURSE.setIcon(new ImageIcon("./src/CourseManagerJFrame/ADDCOURSE.png"));
        this.setCursor(0);
    }//GEN-LAST:event_ADD_COURSEMouseExited

    private void OPEN_LECTUREMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OPEN_LECTUREMouseExited
        // TODO add your handling code here:
        OPEN_LECTURE.setIcon(new ImageIcon("./src/CourseManagerJFrame/OPEN LECTURE .png"));
        this.setCursor(0);
    }//GEN-LAST:event_OPEN_LECTUREMouseExited

    private void MODIFY_COURSEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MODIFY_COURSEMouseExited
        // TODO add your handling code here:
        MODIFY_COURSE.setIcon(new ImageIcon("./src/CourseManagerJFrame/MODIFY COURSE.png"));
        this.setCursor(0);
    }//GEN-LAST:event_MODIFY_COURSEMouseExited

    private void DELETE_COURSEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DELETE_COURSEMouseExited
        // TODO add your handling code here:
        DELETE_COURSE.setIcon(new ImageIcon("./src/CourseManagerJFrame/DELETE COURSE.png"));
        this.setCursor(0);
    }//GEN-LAST:event_DELETE_COURSEMouseExited

    private void AddCourseButtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCourseButtMouseClicked
        // TODO add your handling code here:
        CourseManagement.CourseManager c = new CourseManagement.CourseManager();
        AddCourse add = new AddCourse();
        CreditCheckText.setText("");
        CourseNumCheckText.setText("");
        CourseMajorCheck.setText("");

        String CourseNum = CourseNumInput.getText();
        String CourseName = CourseNameInput.getText();
        String CourseMajor = (String) CourseMajorInput.getSelectedItem();// CourseMajorInput.getText();
        String CourseInfo = CourseInfoInput.getText();
        String CourseCredit = CreditInput.getText();

        boolean isAdded = add.AddCourse(CourseNum, CourseName, CourseMajor, CourseCredit, CourseInfo, CreditCheckText, CourseNumCheckText, CourseMajorCheck);
        if (isAdded) {
            CourseNumInput.setText("");
            CourseNameInput.setText("");
            //CourseMajorInput.setText("");
            CourseInfoInput.setText("");
            CreditInput.setText("");
            JOptionPane.showInternalMessageDialog(null, "강좌 등록 완료");
        } else {
            JOptionPane.showInternalMessageDialog(null, "강좌 등록 실패");
        }

    }//GEN-LAST:event_AddCourseButtMouseClicked

    private void CourseTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CourseTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = CourseTable.getSelectedRow();
        String CourseNum = (String) CourseTable.getValueAt(selectedRow, 0);
        String CourseName = (String) CourseTable.getValueAt(selectedRow, 1);
        String Major = (String) CourseTable.getValueAt(selectedRow, 2);
        String Credit = (String) CourseTable.getValueAt(selectedRow, 3);
        String Info = (String) CourseTable.getValueAt(selectedRow, 4);

        CourseNumField.setText(CourseNum);
        CourseNameField.setText(CourseName);
        MajorField.setText(Major);
        CreditField.setText(Credit);
        InfoField.setText(Info);

    }//GEN-LAST:event_CourseTableMouseClicked

    private void ADD_COURSEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADD_COURSEMouseClicked
        // TODO add your handling code here:
        ADDPanel.setVisible(true);
        OPENPanel.setVisible(false);
        MODIFYPanel.setVisible(false);
        DELETEPanel.setVisible(false);
        SENDBILLPanel.setVisible(false);
        PASSWORDPanel.setVisible(false);

        ADDPanel.setEnabled(true);
        OPENPanel.setEnabled(false);
        MODIFYPanel.setEnabled(false);
        DELETEPanel.setEnabled(false);
        SENDBILLPanel.setEnabled(false);
        PASSWORDPanel.setEnabled(false);

    }//GEN-LAST:event_ADD_COURSEMouseClicked

    private void OPEN_LECTUREMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OPEN_LECTUREMouseClicked
        // TODO add your handling code here:
        ViewCourseList v = new ViewCourseList();
        ADDPanel.setVisible(false);
        OPENPanel.setVisible(true);
        MODIFYPanel.setVisible(false);
        DELETEPanel.setVisible(false);
        SENDBILLPanel.setVisible(false);
        PASSWORDPanel.setVisible(false);

        ADDPanel.setEnabled(false);
        OPENPanel.setEnabled(true);
        MODIFYPanel.setEnabled(false);
        DELETEPanel.setEnabled(false);
        SENDBILLPanel.setEnabled(false);
        PASSWORDPanel.setEnabled(false);
        v.PrintCourseList(CourseTableModel);
    }//GEN-LAST:event_OPEN_LECTUREMouseClicked

    private void ADDButtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDButtMouseClicked
        // TODO add your handling code here:
        CourseManagement.CourseManager c = new CourseManagement.CourseManager();
        AddLecture add = new AddLecture();

        CourseCheck.setText("");
        ProfessorCheck.setText("");
        MinMaxCheck.setText("");

        String courseNum = CourseNumField.getText();
        String courseName = CourseNameField.getText();
        String Major = MajorField.getText();
        int Credit = Integer.parseInt(CreditField.getText());
        String courseInfo = InfoField.getText();
        String Professor = InputProfessor.getText();
        String PNum = InputPNum.getText();
        String Min = InputMinimum.getText();
        String Max = InputMaximum.getText();

        boolean isAdded = add.AddLecture(courseNum, courseName, Major, Credit, courseInfo, Professor, PNum, Min, Max, CourseCheck, ProfessorCheck, MinMaxCheck);
        if (isAdded) {
            JOptionPane.showInternalMessageDialog(null, "강의 개설 완료");
            CourseNumField.setText("");
            CourseNameField.setText("");
            MajorField.setText("");
            CreditField.setText("");
            InfoField.setText("");
            InputProfessor.setText("");
            InputPNum.setText("");
            InputMinimum.setText("");
            InputMaximum.setText("");
        } else {
            JOptionPane.showInternalMessageDialog(null, "강의 개설 실패");
        }

    }//GEN-LAST:event_ADDButtMouseClicked

    private void MODIFY_COURSEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MODIFY_COURSEMouseClicked
        // TODO add your handling code here:
        ViewCourseList v = new ViewCourseList();
        ADDPanel.setVisible(false);
        OPENPanel.setVisible(false);
        MODIFYPanel.setVisible(true);
        DELETEPanel.setVisible(false);
        SENDBILLPanel.setVisible(false);
        PASSWORDPanel.setVisible(false);

        ADDPanel.setEnabled(false);
        OPENPanel.setEnabled(false);
        MODIFYPanel.setEnabled(true);
        DELETEPanel.setEnabled(false);
        SENDBILLPanel.setEnabled(false);
        PASSWORDPanel.setEnabled(false);
        v.PrintCourseList(ModifyTable);

    }//GEN-LAST:event_MODIFY_COURSEMouseClicked

    private void DELETE_COURSEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DELETE_COURSEMouseClicked
        // TODO add your handling code here:
        ViewCourseList v = new ViewCourseList();
        ADDPanel.setVisible(false);
        OPENPanel.setVisible(false);
        MODIFYPanel.setVisible(false);
        DELETEPanel.setVisible(true);
        SENDBILLPanel.setVisible(false);
        PASSWORDPanel.setVisible(false);

        ADDPanel.setEnabled(false);
        OPENPanel.setEnabled(false);
        MODIFYPanel.setEnabled(false);
        DELETEPanel.setEnabled(true);
        SENDBILLPanel.setEnabled(false);
        PASSWORDPanel.setEnabled(false);
        v.PrintCourseList(DeleteTable);
    }//GEN-LAST:event_DELETE_COURSEMouseClicked

    private void ModifyCourseTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifyCourseTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = ModifyCourseTable.getSelectedRow();

        String courseNum = (String) ModifyCourseTable.getValueAt(selectedRow, 0);
        String courseName = (String) ModifyCourseTable.getValueAt(selectedRow, 1);
        String major = (String) ModifyCourseTable.getValueAt(selectedRow, 2);
        String Credit = (String) ModifyCourseTable.getValueAt(selectedRow, 3);
        String courseInfo = (String) ModifyCourseTable.getValueAt(selectedRow, 4);

        ModifyCourseNum.setText(courseNum);
        ModifyCourseName.setText(courseName);
        ModifyCourseCredit.setText(Credit);
        ModifyCourseInfo.setText(courseInfo);

        if ("전산학과".equals(major)) {
            ModifyCourseMajor.setSelectedIndex(0);
        } else if ("전자공학과".equals(major)) {
            ModifyCourseMajor.setSelectedIndex(1);
        } else if ("화학공학과".equals(major)) {
            ModifyCourseMajor.setSelectedIndex(2);
        } else if ("기계공학과".equals(major)) {
            ModifyCourseMajor.setSelectedIndex(3);
        } else if ("항공우주공학과".equals(major)) {
            ModifyCourseMajor.setSelectedIndex(4);
        }

    }//GEN-LAST:event_ModifyCourseTableMouseClicked

    private void CourseModifyButtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CourseModifyButtMouseClicked
        // TODO add your handling code here:
        ModifyCourse m = new ModifyCourse();

        CheckCredit.setText("");
        CheckMajor.setText("");

        String CourseNumber = ModifyCourseNum.getText();
        String ModifyName = ModifyCourseName.getText();
        String ModifyMajor = (String) ModifyCourseMajor.getSelectedItem();// ModifyCourseMajor.getText();
        String ModifyCredit = ModifyCourseCredit.getText();
        String ModifyInfo = ModifyCourseInfo.getText();
        boolean isModified = m.CourseModify(CourseNumber, ModifyName, ModifyMajor, ModifyCredit, ModifyInfo, CheckCredit, CheckMajor);
        if (isModified) {
            JOptionPane.showInternalMessageDialog(null, "강좌 수정 완료");
        } else {
            JOptionPane.showInternalMessageDialog(null, "강좌 수정 실패");
        }

        ModifyCourseNum.setText("");
        ModifyCourseName.setText("");
        ModifyCourseCredit.setText("");
        ModifyCourseInfo.setText("");
    }//GEN-LAST:event_CourseModifyButtMouseClicked

    private void DeleteCourseTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteCourseTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = DeleteCourseTable.getSelectedRow();

        DeleteCourseNum.setText((String) DeleteCourseTable.getValueAt(selectedRow, 0));
        DeleteCourseName.setText((String) DeleteCourseTable.getValueAt(selectedRow, 1));
        DeleteCourseMajor.setText((String) DeleteCourseTable.getValueAt(selectedRow, 2));
        DeleteCourseCredit.setText((String) DeleteCourseTable.getValueAt(selectedRow, 3));
        DeleteCourseInfo.setText((String) DeleteCourseTable.getValueAt(selectedRow, 4));

    }//GEN-LAST:event_DeleteCourseTableMouseClicked

    private void DeleteCourseButtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteCourseButtMouseClicked
        // TODO add your handling code here:
        DeleteCourse d = new DeleteCourse();
        ViewCourseList v = new ViewCourseList();
        String CourseNum = DeleteCourseNum.getText();
        boolean isDeleted = d.DeleteCourse(CourseNum);

        if (isDeleted) {
            JOptionPane.showInternalMessageDialog(null, "강좌 삭제 완료");
        } else {
            JOptionPane.showInternalMessageDialog(null, "강좌 삭제 실패");
        }
        v.PrintCourseList(DeleteTable);
    }//GEN-LAST:event_DeleteCourseButtMouseClicked

    private void SENDBILLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SENDBILLMouseClicked
        // TODO add your handling code here:
        ViewStudentList v = new ViewStudentList();
        ADDPanel.setVisible(false);
        OPENPanel.setVisible(false);
        MODIFYPanel.setVisible(false);
        DELETEPanel.setVisible(false);
        SENDBILLPanel.setVisible(true);
        PASSWORDPanel.setVisible(false);

        ADDPanel.setEnabled(false);
        OPENPanel.setEnabled(false);
        MODIFYPanel.setEnabled(false);
        DELETEPanel.setEnabled(false);
        SENDBILLPanel.setEnabled(true);
        PASSWORDPanel.setEnabled(false);

        v.ViewStudentList(StudentListTableModel);
    }//GEN-LAST:event_SENDBILLMouseClicked

    private void SENDBILLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SENDBILLMouseEntered
        // TODO add your handling code here:
        SENDBILL.setIcon(new ImageIcon("./src/CourseManagerJFrame/SEND BILL .png"));
        this.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_SENDBILLMouseEntered

    private void SENDBILLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SENDBILLMouseExited
        // TODO add your handling code here:
        SENDBILL.setIcon(new ImageIcon("./src/CourseManagerJFrame/SEND BILL Clicked.png"));
        this.setCursor(0);
    }//GEN-LAST:event_SENDBILLMouseExited

    private void StudentListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentListTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentListTableMouseClicked

    private void SENDButtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SENDButtMouseClicked
        // TODO add your handling code here:
        SendBill s = new SendBill();
        int selectedRow = StudentListTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showInternalMessageDialog(null, "학생을 선택해주세요.");
        } else {
            String SNum = (String) StudentListTable.getValueAt(selectedRow, 0);
            String SName = (String) StudentListTable.getValueAt(selectedRow, 1);
            String Major = (String) StudentListTable.getValueAt(selectedRow, 2);
            String SCredit = (String) StudentListTable.getValueAt(selectedRow, 3);

            boolean SendCheck = s.sendBill(SNum, SName, Major, SCredit, StudentListTableModel);

            if (SendCheck) {
                JOptionPane.showInternalMessageDialog(null, "발급 완료");
            } else {
                JOptionPane.showInternalMessageDialog(null, "발급 실패");
            }
        }

    }//GEN-LAST:event_SENDButtMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        ChangePassword cp = new ChangePassword();
        JOptionPane.showInternalMessageDialog(null, userID + NowPW.getText() + AfterPW.getText());
        boolean changeCheck = cp.changePassword(userID, NowPW.getText(), AfterPW.getText());

        if (changeCheck) {
            JOptionPane.showInternalMessageDialog(null, "변경 완료.");
        } else {
            JOptionPane.showInternalMessageDialog(null, "변경 오류.");
        }

        NowPW.setText("");
        AfterPW.setText("");
    }//GEN-LAST:event_jButton1MouseClicked

    private void ChangePWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePWMouseClicked
        // TODO add your handling code here:
        ADDPanel.setVisible(false);
        OPENPanel.setVisible(false);
        MODIFYPanel.setVisible(false);
        DELETEPanel.setVisible(false);
        SENDBILLPanel.setVisible(false);
        PASSWORDPanel.setVisible(true);

        ADDPanel.setEnabled(false);
        OPENPanel.setEnabled(false);
        MODIFYPanel.setEnabled(false);
        DELETEPanel.setEnabled(false);
        SENDBILLPanel.setEnabled(false);
        PASSWORDPanel.setEnabled(true);
    }//GEN-LAST:event_ChangePWMouseClicked

    private void ChangePWMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePWMouseEntered
        // TODO add your handling code here:
        this.setCursor(HAND_CURSOR);
    }//GEN-LAST:event_ChangePWMouseEntered

    private void ChangePWMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePWMouseExited
        // TODO add your handling code here:
        this.setCursor(0);
    }//GEN-LAST:event_ChangePWMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CourseManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CourseManager().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDButt;
    private javax.swing.JLabel ADDCOURSE_TEXT;
    private javax.swing.JPanel ADDPanel;
    private javax.swing.JLabel ADD_COURSE;
    private javax.swing.JButton AddCourseButt;
    private javax.swing.JPasswordField AfterPW;
    private javax.swing.JLabel BackGround;
    private javax.swing.JPanel BasePanel;
    private javax.swing.JLabel ChagePasswordField;
    private javax.swing.JLabel ChangePW;
    private javax.swing.JLabel ChangePassword;
    private javax.swing.JLabel CheckCredit;
    private javax.swing.JLabel CheckMajor;
    private javax.swing.JLabel CourseCheck;
    private javax.swing.JTextField CourseInfoInput;
    private javax.swing.JLabel CourseInfo_Text;
    private javax.swing.JLabel CourseMajorCheck;
    private javax.swing.JComboBox<String> CourseMajorInput;
    private javax.swing.JLabel CourseMajor_Text;
    private javax.swing.JButton CourseModifyButt;
    private javax.swing.JTextField CourseNameField;
    private javax.swing.JTextField CourseNameInput;
    private javax.swing.JLabel CourseNameLabel;
    private javax.swing.JLabel CourseNumCheckText;
    private javax.swing.JTextField CourseNumField;
    private javax.swing.JTextField CourseNumInput;
    private javax.swing.JLabel CourseNumLabel;
    private javax.swing.JTable CourseTable;
    private javax.swing.JLabel CouserName_Text;
    private javax.swing.JLabel CouserNumber_Text;
    private javax.swing.JLabel CreditCheckText;
    private javax.swing.JTextField CreditField;
    private javax.swing.JLabel CreditFieldBG;
    private javax.swing.JLabel CreditFieldBG1;
    private javax.swing.JTextField CreditInput;
    private javax.swing.JLabel CreditLabel;
    private javax.swing.JLabel CreditText;
    private javax.swing.JLabel CreditText1;
    private javax.swing.JLabel Credit_Text;
    private javax.swing.JPanel DELETEPanel;
    private javax.swing.JLabel DELETE_COURSE;
    private javax.swing.JButton DeleteCourseButt;
    private javax.swing.JTextField DeleteCourseCredit;
    private javax.swing.JTextField DeleteCourseInfo;
    private javax.swing.JTextField DeleteCourseMajor;
    private javax.swing.JTextField DeleteCourseName;
    private javax.swing.JTextField DeleteCourseNum;
    private javax.swing.JTable DeleteCourseTable;
    private javax.swing.JLabel DragBar;
    private javax.swing.JLabel Exit;
    private javax.swing.JTextField InfoField;
    private javax.swing.JLabel InfoFieldBG;
    private javax.swing.JLabel InfoFieldBG1;
    private javax.swing.JLabel InfoLabel;
    private javax.swing.JLabel InfoText;
    private javax.swing.JLabel InfoText1;
    private javax.swing.JLabel InputFieldLong;
    private javax.swing.JTextField InputMaximum;
    private javax.swing.JTextField InputMinimum;
    private javax.swing.JTextField InputPNum;
    private javax.swing.JTextField InputProfessor;
    private javax.swing.JLabel InputProfessorField;
    private javax.swing.JLabel InputProfessorNumField;
    private javax.swing.JLabel LogoutButt;
    private javax.swing.JPanel MODIFYPanel;
    private javax.swing.JLabel MODIFY_COURSE;
    private javax.swing.JTextField MajorField;
    private javax.swing.JLabel MajorFieldBG;
    private javax.swing.JLabel MajorFieldBG1;
    private javax.swing.JLabel MajorLabel;
    private javax.swing.JLabel MajorText;
    private javax.swing.JLabel MajorText1;
    private javax.swing.JLabel MaximumField;
    private javax.swing.JLabel MinMaxCheck;
    private javax.swing.JLabel Min_Text;
    private javax.swing.JLabel Min_Text1;
    private javax.swing.JLabel MinimumField;
    private javax.swing.JTextField ModifyCourseCredit;
    private javax.swing.JTextField ModifyCourseInfo;
    private javax.swing.JComboBox<String> ModifyCourseMajor;
    private javax.swing.JTextField ModifyCourseName;
    private javax.swing.JTextField ModifyCourseNum;
    private javax.swing.JTable ModifyCourseTable;
    private javax.swing.JLabel NameFieldBG;
    private javax.swing.JLabel NameFieldBG1;
    private javax.swing.JLabel NameText;
    private javax.swing.JLabel NameText1;
    private javax.swing.JTextField NowPW;
    private javax.swing.JLabel NowPasswordField;
    private javax.swing.JLabel NowPasswordText;
    private javax.swing.JLabel NumberFieldBG;
    private javax.swing.JLabel NumberFieldBG1;
    private javax.swing.JLabel NumberText;
    private javax.swing.JLabel NumberText1;
    private javax.swing.JPanel OPENPanel;
    private javax.swing.JLabel OPEN_LECTURE;
    private javax.swing.JLabel OPEN_LECTURE_TEXT;
    private javax.swing.JPanel PASSWORDPanel;
    private javax.swing.JLabel ProfessorCheck;
    private javax.swing.JLabel ProfessorNum_Text;
    private javax.swing.JLabel Professor_Text;
    private javax.swing.JLabel SENDBILL;
    private javax.swing.JPanel SENDBILLPanel;
    private javax.swing.JButton SENDButt;
    private javax.swing.JTable StudentListTable;
    private javax.swing.JLabel inputField;
    private javax.swing.JLabel inputField1;
    private javax.swing.JLabel inputField2;
    private javax.swing.JLabel inputField3;
    private javax.swing.JLabel inputField4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel userIDLabel;
    // End of variables declaration//GEN-END:variables
}
