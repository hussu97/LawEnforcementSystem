/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIP;

import ALP.Employee;
import DSP.OracleJDBCConnection;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author H_Abb
 */
public class AddEmployeeClerical extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployeeClerical
     */
    ArrayList<JFrame> formList;
    DefaultComboBoxModel jobType=new DefaultComboBoxModel();
    public AddEmployeeClerical(ArrayList<JFrame> formList) {
        this.formList=formList;
        this.setResizable(false);
        formList.add(this);
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        
    }

    public void setComboBox(){
        jobType.removeAllElements();
        Connection conn=OracleJDBCConnection.connectDataBase();
        Statement st=null;
        try {
            st=conn.createStatement();
            ResultSet rs=st.executeQuery("SELECT JOB_TYPE FROM CLERICAL");
            while(rs.next()){
                jobType.addElement(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee1.class.getName()).log(Level.SEVERE, null, ex);
        }
        jobType.addElement("Other");
    }
    
    public void clear(){
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        OtherField = new javax.swing.JTextField();
        SalaryField = new javax.swing.JTextField();
        JobTypeField = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Employee");

        jLabel2.setText("2/2");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1submitClicked(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2backClicked(evt);
            }
        });

        jLabel7.setText("Salary*");

        jLabel8.setText("Job Type*");

        jLabel9.setText("If Other,");

        jLabel10.setText("Please specify");

        JobTypeField.setModel(jobType);

        jMenu1.setText("File");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Exit");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6exitClicked(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Employee");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Add Employee");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1addEmpClicked(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Edit Employee");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("View Employees");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Station");

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("View Station");
        jMenu3.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("View Station Employees");
        jMenu3.add(jMenuItem9);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Add Station");
        jMenu3.add(jMenuItem7);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setText("View Department");
        jMenu3.add(jMenuItem15);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setText("Add Department");
        jMenu3.add(jMenuItem14);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Prison");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("View Prison");
        jMenu4.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Add Prison");
        jMenu4.add(jMenuItem5);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText("View Inmates");
        jMenu4.add(jMenuItem10);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setText("Add Inmate");
        jMenu4.add(jMenuItem13);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("View Cells");
        jMenu4.add(jMenuItem11);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setText("Add Cell");
        jMenu4.add(jMenuItem12);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(92, 92, 92)
                                .addComponent(jButton1))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OtherField)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SalaryField)
                                    .addComponent(JobTypeField, 0, 380, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(SalaryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(JobTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(OtherField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(130, 130, 130))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem6exitClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6exitClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem6exitClicked

    private void jMenuItem1addEmpClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1addEmpClicked
        // TODO add your handling code here:
        this.setVisible(false);
        for (JFrame frame : formList) {
            if (frame instanceof AddEmployee1) {
                ((AddEmployee1) frame).clear();
                frame.setVisible(true);
                break;

            }
        }
    }//GEN-LAST:event_jMenuItem1addEmpClicked

    private void jButton1submitClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1submitClicked
        // TODO add your handling code here:
        if(SalaryField.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Some of the fields are invalid","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            Connection conn = OracleJDBCConnection.connectDataBase();
            Statement st = null;
            ResultSet rs=null;
            int ID=Employee.getID();
            String sql = "Insert into Employee values(";
            sql += ID;
            sql += "," + Employee.SSN +""  ;
            sql += ",'" + Employee.name +"'";
            sql += ",'" + Employee.contact +"'";
            sql += ",'"+ Employee.date + "'";
            if(Employee.station.equals("N/A"))
            sql += ",NULL";
            else
            sql+=",'"+Employee.station+"'";
            try {
                st = conn.createStatement();
                System.out.println(Employee.prison);
                if(Employee.prison.equals("N/A"))
                sql += ",NULL)";
                else{
                    rs=st.executeQuery("SELECT PRISON_ID FROM PRISON WHERE PRISON_LOCATION ='"+Employee.prison+"'");
                    while(rs.next()){
                        System.out.println(rs.getString(1));
                        sql += ","+ rs.getString(1)+")";
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddEmployeeCop.class.getName()).log(Level.SEVERE, null, ex);
            }

            String sql2 ="Insert into Clerical values(";
            sql2 +=ID;
            sql2 += ","+SalaryField.getText().trim();
            if(JobTypeField.getSelectedItem().toString().trim().equals("Other"))
                sql2+= ",'"+OtherField.getText().trim()+"')";
            else
                sql2+= ",'"+JobTypeField.getSelectedItem().toString().trim()+"')";
                
           try {
                System.out.println(sql);
                st.executeUpdate(sql);
                System.out.println(sql2);
                st.executeUpdate(sql2);
                JOptionPane.showMessageDialog(null,"Cop Added");
                this.setVisible(false);
                for (JFrame frame : formList) {
                    if(frame instanceof AddEmployee1){
                        ((AddEmployee1) frame).clear();
                    }
                    if (frame instanceof EmployeeInfo) {
                        frame.setVisible(true);
                        break;
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddEmployeeClerical.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Some of the fields are invalid","Error",JOptionPane.ERROR_MESSAGE);
            }
            try {
                st.close();
            } catch (SQLException ex) {
                Logger.getLogger(AddEmployeeClerical.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1submitClicked

    private void jButton2backClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2backClicked
        // TODO add your handling code here:
        this.setVisible(false);
        for (JFrame frame : formList) {
            if (frame instanceof AddEmployee1) {
                frame.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_jButton2backClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JobTypeField;
    private javax.swing.JTextField OtherField;
    private javax.swing.JTextField SalaryField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}