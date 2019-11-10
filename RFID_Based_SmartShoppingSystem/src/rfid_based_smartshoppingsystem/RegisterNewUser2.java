
package rfid_based_smartshoppingsystem;

import Database.RetriveData;
import Database.UploadData;
import javax.swing.JOptionPane;
import Regex.*;
//import com.itextpdf.text.Image;
import com.sun.mail.handlers.image_gif;
import email.Email;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.awt.RenderingHints;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Dell
 */
public class RegisterNewUser2 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private String filename;
    String bkname,mirc,ccno,setpass,cnfpass,email,name,uname,dob,add,city,gender;
    private byte[] imgbyte;
    

    public RegisterNewUser2() {
        initComponents();
        CSV csv=new CSV();
        CSV csv1=csv.readCsvFile();
        city=csv1.getcity();
        name=csv1.getname();
        dob=csv1.getdob();
        gender=csv1.getgender();
        add=csv1.getadd();
        email=csv1.getemail();
        new Mod10algo1().generate();
        File file=new File("C:\\RFID_Based_SmartShoppingSystem\\images\\"+gender+".png");
        ImageIcon icon=new ImageIcon(file.getAbsolutePath());
        filename=file.getAbsolutePath();
        txtPhoto.setIcon(icon);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtBankName = new javax.swing.JTextField();
        txtMM = new javax.swing.JTextField();
        txtCreditNo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSetPassword = new javax.swing.JPasswordField();
        txtCnfPassword = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        txtPhoto = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        radiobtn1 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        txtYY = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane2.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 5, true));
        jLayeredPane2.setForeground(new java.awt.Color(255, 0, 0));
        jLayeredPane2.setOpaque(true);

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 5, true));
        jLayeredPane1.setForeground(new java.awt.Color(0, 51, 153));
        jLayeredPane1.setOpaque(true);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\RFID_Based_SmartShoppingSystem\\images\\shopping_cart.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("SMART SHOPPING");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane2.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\RFID_Based_SmartShoppingSystem\\images\\EXIT.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\RFID_Based_SmartShoppingSystem\\images\\back-arrow.png")); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setText("BANK INFORMATION & ACCOUNT INFORMATION");

        jLabel4.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel4.setText("BANK NAME");

        jLabel5.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel5.setText("CREDIT CARD #");

        jLabel6.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel6.setText("EXP DATE OF CARD");

        jButton3.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\RFID_Based_SmartShoppingSystem\\images\\upload.png")); // NOI18N
        jButton3.setText("UPLOAD DATA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtBankName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtMM.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtMM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMMActionPerformed(evt);
            }
        });

        txtCreditNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\RFID_Based_SmartShoppingSystem\\images\\DEBIT.png")); // NOI18N

        jLabel7.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel7.setText("USER NAME");

        txtUName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel9.setText("SET PASSWORD");

        jLabel10.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel10.setText("CONFIRM PASSWORD");

        txtSetPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtCnfPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel11.setText("USER'S PHOTO");

        txtPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton5.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\RFID_Based_SmartShoppingSystem\\images\\browsing.png")); // NOI18N
        jButton5.setText("BROWSE IMAGE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        radiobtn1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        radiobtn1.setText("I ACCEPT ALL YOUR TERMS AND CONDITION");
        radiobtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtn1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setText("/");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("MM/YYYY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBankName)
                                    .addComponent(txtCreditNo, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                                    .addComponent(txtUName)
                                    .addComponent(txtSetPassword)
                                    .addComponent(txtCnfPassword)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtMM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtYY, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(radiobtn1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMM)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addComponent(txtYY, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtCreditNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCnfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addComponent(txtPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(8, 8, 8)))
                .addComponent(radiobtn1)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(743, 808));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Home().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Home().setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(txtBankName.getText().toString().trim().equals("")        ||
           txtMM.getText().toString().trim().equals("")              ||
           txtYY.getText().toString().trim().equals("")              ||
           txtSetPassword.getText().toString().trim().equals("")     ||
           txtCnfPassword.getText().toString().trim().equals("")     ||
           txtUName.getText().toString().trim().equals("")           ||
           txtCreditNo.getText().toString().trim().equals("")        ||
           radiobtn1.isSelected()==false                         ){

          JOptionPane.showMessageDialog(null, " *** All Feilds Are Compulsory To Fill *** "); 
          
        }else if(new Name_RegeX().validate(txtBankName.getText().toString().trim())==false){
            
            JOptionPane.showMessageDialog(null, " *** Enter Valid Bank Name *** ");
        
        }else if(txtMM.getText().toString().trim().length()!=2 || txtYY.getText().toString().trim().length()!=4 || new Exp_Date().validate(txtMM.getText().toString(), txtYY.getText().toString().trim())==false){
            
            JOptionPane.showMessageDialog(null, " *** Enter Valid Expiry Date In MM/YY Format *** ");
            
        }else if(txtCreditNo.getText().toString().trim().length()!=16 || new Mod10algo1().checkLuhn(txtCreditNo.getText().toString().trim())==false){
            
            JOptionPane.showMessageDialog(null, " *** Enter Valid Credit-Card Number Without Any Space *** ");
            
        }else if(new Password_RegeX().validate(txtUName.getText().toString().trim())==false){
            
            JOptionPane.showMessageDialog(null, " *** Invalid UserName ***\n"
                                              + " ***UserName Can Be Of Min Length Of 6 Characters and Max Length Upto 20 Charaters And Must Contain Atleast One Of All Of This Characters {@, 0-9, A-Z, a-z} *** ");

        }else if(new RetriveData().userFound(txtUName.getText().toString().trim(), 3)){
            
            JOptionPane.showMessageDialog(null, " *** UserName Already Registered Use Another UserName *** ");

        }else if(new Password_RegeX().validate(txtSetPassword.getText().toString().trim())==false){
            
            JOptionPane.showMessageDialog(null, " *** Invalid Password ***\n"
                                              + " *** Password Can Be Of Min Length Of 6 Characters and Max Length Upto 20 Characters And Must Contain Atleast One Of All Of This Characters {@, 0-9, A-Z, a-z} *** ");

        }else if(txtSetPassword.getText().toString().trim().equals(txtCnfPassword.getText().toString().trim())==false){
            
            JOptionPane.showMessageDialog(null, " *** Password And Confirm Password Mis-Match *** ");

        }else{
            
            bkname=txtBankName.getText().toString().trim();
            uname=txtUName.getText().toString().trim();
            setpass=txtSetPassword.getText().toString().trim();
            cnfpass=txtCnfPassword.getText().toString().trim();
            mirc=txtMM.getText().toString().trim()+"/"+txtYY.getText().toString().trim();
            ccno=txtCreditNo.getText().toString().trim();
            //Name,Email,Uname,Password,DOB,Address,City,CreditCardNo,BankName,MIRCNo,Image
             try{
            File img=new File(filename);
            FileInputStream fis=new FileInputStream(img);
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int readNum;(readNum=fis.read(buf))!=-1;){
                baos.write(buf,0,readNum);
            }
            
            imgbyte=baos.toByteArray();
            
        }catch(Exception e){
            
        }
            try {
                UploadData data= new UploadData();
                data.uploadImg(imgbyte,filename);
                try {
                    data.upload(new String[]{name,email,uname,setpass,dob,add,city,ccno,bkname,mirc});
                } catch (FileNotFoundException ex) {
                    //Logger.getLogger(RegisterNewUser2.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (SQLException ex) {
                //Logger.getLogger(RegisterNewUser2.class.getName()).log(Level.SEVERE, null, ex);
            }
            Email e=new Email(name,uname,setpass);
            e.send(2, 1, email);
            new Home().setVisible(true);
            setVisible(false);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JFileChooser chooser=new JFileChooser();
        chooser.setDialogTitle("Please Select A Photo");
        chooser.setMultiSelectionEnabled(false);
        chooser.setFileFilter(new FileNameExtensionFilter("*.IMAGE","PNG","JPG","JPEG","GIF"));
        int result=chooser.showOpenDialog(null);
        File file=chooser.getSelectedFile();
        filename=file.getAbsolutePath();
        //Image img=i.getScaledInstance(txtPhoto.getWidth(), txtPhoto.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icon=new ImageIcon(filename);
        txtPhoto.setIcon(icon);
        
        if(result==chooser.APPROVE_OPTION){
            
        }else if(result==chooser.CANCEL_OPTION){
            
        }
        
       
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void radiobtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobtn1ActionPerformed

    private void txtMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMMActionPerformed

    /*private Image ScaledImage(ImageIcon img, int w, int h){
        BufferedImage resizeImage=new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2=resizeImage.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img.getImage(), 0, 0, w, h, null);
        g2.dispose();
        
        return resizeImage;
    }*/
    
    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterNewUser2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterNewUser2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterNewUser2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterNewUser2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterNewUser2().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JCheckBox radiobtn1;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JPasswordField txtCnfPassword;
    private javax.swing.JTextField txtCreditNo;
    private javax.swing.JTextField txtMM;
    private javax.swing.JLabel txtPhoto;
    private javax.swing.JPasswordField txtSetPassword;
    private javax.swing.JTextField txtUName;
    private javax.swing.JTextField txtYY;
    // End of variables declaration//GEN-END:variables
}