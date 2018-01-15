/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ashen_Cafe.view.memberView;

import com.Ashen_Cafe.Support.Message;
import com.Ashen_Cafe.Support.Validation;
import com.Ashen_Cafe.database.DataBaseConnection;
import com.Ashen_Cafe.database.DataBaseMember;
import com.Ashen_Cafe.entity.Member;
import com.Ashen_Cafe.view.AddTime;
import com.Ashen_Cafe.view.MainMenu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MaLindu DiLshan
 */
public class UpdateMember extends javax.swing.JFrame {

    /*
     *
     */
    public UpdateMember() {
        initComponents();
    }
    public void setMenuRef(MainMenu menu) {
        this.menu=menu;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_heading = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        lbl_fname = new javax.swing.JLabel();
        lbl_lname = new javax.swing.JLabel();
        txt_fname = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        txt_lname = new javax.swing.JTextField();
        lbl_nic = new javax.swing.JLabel();
        lbl_mobile = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        txt_nic = new javax.swing.JTextField();
        txt_mobile = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jcb_memberid = new javax.swing.JComboBox();
        lbl_backgroundupdatemember = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Member");
        setAlwaysOnTop(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbl_heading.setFont(new java.awt.Font("Adobe Caslon Pro", 2, 36)); // NOI18N
        lbl_heading.setForeground(new java.awt.Color(255, 255, 255));
        lbl_heading.setText("Update Member...");

        lbl_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_id.setForeground(new java.awt.Color(255, 255, 255));
        lbl_id.setText("Member ID           :");

        lbl_fname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_fname.setForeground(new java.awt.Color(255, 255, 255));
        lbl_fname.setText("New First Name   :");

        lbl_lname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_lname.setForeground(new java.awt.Color(255, 255, 255));
        lbl_lname.setText("New Last Name   :");

        btn_update.setText("Update");
        btn_update.setToolTipText("click here to update member profile");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        lbl_nic.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nic.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nic.setText("New NIC              :");

        lbl_mobile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_mobile.setForeground(new java.awt.Color(255, 255, 255));
        lbl_mobile.setText("New Mobile          :");

        lbl_email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(255, 255, 255));
        lbl_email.setText("New E-Mail          :");

        jcb_memberid.setModel(new javax.swing.DefaultComboBoxModel());
        jcb_memberid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_memberidItemStateChanged(evt);
            }
        });

        lbl_backgroundupdatemember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Ashen_Cafe/view/memberView/BackgroundGameZone.jpg"))); // NOI18N
        lbl_backgroundupdatemember.setText("Background");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lbl_heading, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jcb_memberid, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(txt_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(txt_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lbl_backgroundupdatemember, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbl_heading, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jcb_memberid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(lbl_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txt_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lbl_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(txt_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(lbl_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lbl_backgroundupdatemember, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        DataBaseMember dbm=new DataBaseMember();
        
        Member dox=new Member();
        Message msg=new Message();
        Validation vd=new Validation();
        
        dox.setId(id);
        dox.setFname(txt_fname.getText());
        dox.setLname(txt_lname.getText());
        dox.setNic(txt_nic.getText());
        dox.setMobile(txt_mobile.getText());
        dox.setEmail(txt_email.getText());
        dox.setPhotopath("D://ex.jpg");
        
        if(String.valueOf(jcb_memberid.getSelectedItem()).equals("Select ID"))
            msg.warningMsg("Member ID should be selected", this);
        else if(dox.getFname().isEmpty())
            msg.warningMsg("Member New First Name should not be empty", this);
        else if(dox.getLname().isEmpty())
            msg.warningMsg("Member New Last Name should not be empty", this);
        else if(dox.getNic().isEmpty())
            msg.warningMsg("Member New NIC should not be empty", this);   
        else if(!vd.isNIC(dox.getNic()))
            msg.warningMsg("NIC should be valid no", this);
        else if(dox.getMobile().isEmpty())
            msg.warningMsg("New Mobile should not be empty", this); 
        else if(dox.getMobile().length()!=10)
            msg.warningMsg("Mobile should contain 10 digits", this);
        else if(!vd.isNumeric(dox.getMobile()))
            msg.warningMsg("Mobile should only contain numbers", this);
        else if(dox.getEmail().isEmpty())
            msg.warningMsg("New E-mail should not be empty", this); 
        else if(!vd.isEmail(dox.getEmail()))
            msg.warningMsg("E-mail should be valid", this);
        else{
            int dialogResult = msg.confirmMsg("Do you want to update this profile ", this);
            if( dialogResult ==  0 ){
              try{
                  if(id==1){
                    msg.warningMsg("You can't Update this record...", this);
                    clearAll();
                  }
                  else{
                dbm.update(dox,id);
                
                clearAll();
                menu.setMemberTable();
                msg.informMsg("Profile Successfully Updated", this);
                this.dispose();
                  }
                }
            catch(Exception ex){
                msg.warningMsg(ex.toString(), this);
                }
            }
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
            Message msg=new Message();
        
        int dialogResult = msg.confirmMsg("Do you want to clear all the fields? ", this);
				if(dialogResult ==  0){
					clearAll();
				}
    }//GEN-LAST:event_btn_clearActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
try{
   DataBaseConnection dbcon=new DataBaseConnection();
   
   con=dbcon.connection();
   Statement st=con.createStatement();
				
ResultSet rs = st.executeQuery("select memberid from members");				
jcb_memberid.addItem("Select ID");
while(rs.next()){											
jcb_memberid.addItem(rs.getInt(1));			
}	
con.close();
}
catch(SQLException e){
		System.out.println("SQL Error in Update Member Form"+"\n"+e.getMessage());
            }
    }//GEN-LAST:event_formWindowOpened

    private void jcb_memberidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_memberidItemStateChanged
        if(String.valueOf(jcb_memberid.getSelectedItem()).equals("Select ID")){
            System.out.println("******Select id to update Member******");    
        }
        else
        id=Integer.parseInt(String.valueOf(jcb_memberid.getSelectedItem()));
    }//GEN-LAST:event_jcb_memberidItemStateChanged
    public void clearAll(){
        jcb_memberid.setSelectedItem("Select ID");
        txt_fname.setText("");
        txt_lname.setText("");
        txt_nic.setText("");
        txt_mobile.setText("");
        txt_email.setText("");

    }
    /**
     * @param args the command line arguments
     */
    private int id;
    private Connection con;
    private MainMenu menu;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox jcb_memberid;
    private javax.swing.JLabel lbl_backgroundupdatemember;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_fname;
    private javax.swing.JLabel lbl_heading;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_lname;
    private javax.swing.JLabel lbl_mobile;
    private javax.swing.JLabel lbl_nic;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_lname;
    private javax.swing.JTextField txt_mobile;
    private javax.swing.JTextField txt_nic;
    // End of variables declaration//GEN-END:variables
}