/*8
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class login_home1 extends javax.swing.JFrame {

    /**
     * Creates new form login_home
     */
    public login_home1() {
        initComponents();
        //jTextArea1.setOpaque(false);
        jTextArea1.setEditable(false);
        //JScrollPane scrollPane = new JScrollPane(jTextArea1);
//scrollPane.getViewport().setOpaque(false);
//scrollPane.setOpaque(true);
//jTextArea1.setContentAreaFilled(false);
//jTextArea1.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();
        search = new javax.swing.JMenu();
        food = new javax.swing.JMenu();
        about = new javax.swing.JMenu();
        flyers = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        admin = new javax.swing.JMenu();
        exit = new javax.swing.JMenu();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1470, 770));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Gabriola", 3, 58)); // NOI18N
        jLabel1.setText("Welcome to Airlines");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 160, 440, 70);

        jLabel2.setBackground(new java.awt.Color(102, 51, 255));
        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("FlightSite Alert!");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(800, 110, 300, 40);

        jButton1.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jButton1.setText("Admin Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(210, 260, 190, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 0, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("\"Dear Customer,\n\nPersuant to announcement made by Hon'ble Prime\nMinister Shri Narendra Modi, FlightSite will not be\naccepting 500 Rupee and 1000 Rupee \ndemonetisation currency notes with effect from \n0000 hrs on November 9,2016 for any services \nwhatsoever including baggage charges with the \nonly exception for airline  tickets at airport ticket \ncounters till November 24,2016.");
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.getAccessibleContext().setAccessibleParent(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(750, 150, 380, 310);

        jButton2.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jButton2.setText("Customer Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(210, 350, 190, 40);

        jButton3.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(210, 540, 190, 40);

        jButton4.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jButton4.setLabel("Search Flights");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(210, 450, 190, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thy_tr_wp2.jpg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jLabel4.setMaximumSize(new java.awt.Dimension(1426, 750));
        jLabel4.setPreferredSize(new java.awt.Dimension(1466, 768));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-70, -30, 1466, 768);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setAlignmentX(20.0F);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(301, 51));

        home.setText("HOME");
        home.setAlignmentX(205.0F);
        home.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        home.setIconTextGap(30);
        home.setMaximumSize(new java.awt.Dimension(205, 32767));
        home.setPreferredSize(new java.awt.Dimension(205, 21));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jMenuBar1.add(home);

        search.setText("SEARCH");
        search.setAlignmentX(205.0F);
        search.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        search.setIconTextGap(30);
        search.setPreferredSize(new java.awt.Dimension(205, 21));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        jMenuBar1.add(search);

        food.setText("FOOD MENU");
        food.setAlignmentX(415.0F);
        food.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        food.setIconTextGap(30);
        food.setMaximumSize(new java.awt.Dimension(255, 32767));
        food.setPreferredSize(new java.awt.Dimension(255, 21));
        food.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foodMouseClicked(evt);
            }
        });
        jMenuBar1.add(food);

        about.setText("ABOUT");
        about.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        about.setIconTextGap(30);
        about.setPreferredSize(new java.awt.Dimension(205, 21));
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });
        jMenuBar1.add(about);

        flyers.setText("FREQUENT FLYERS");
        flyers.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        flyers.setIconTextGap(30);
        flyers.setMaximumSize(new java.awt.Dimension(255, 32767));
        flyers.setPreferredSize(new java.awt.Dimension(255, 21));
        flyers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flyersMouseClicked(evt);
            }
        });
        jMenuBar1.add(flyers);

        jMenu5.setText("EXIT");
        jMenu5.setAlignmentX(280.0F);
        jMenu5.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jMenu5.setIconTextGap(30);
        jMenu5.setMaximumSize(new java.awt.Dimension(0, 0));
        jMenuBar1.add(jMenu5);

        admin.setText("ADMIN");
        admin.setAlignmentX(0.0F);
        admin.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        admin.setIconTextGap(30);
        admin.setMaximumSize(new java.awt.Dimension(175, 32767));
        admin.setPreferredSize(new java.awt.Dimension(175, 21));
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
        });
        jMenuBar1.add(admin);

        exit.setText("EXIT");
        exit.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        exit.setMaximumSize(new java.awt.Dimension(175, 32767));
        exit.setPreferredSize(new java.awt.Dimension(175, 21));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jMenuBar1.add(exit);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
            
    }//GEN-LAST:event_formMouseClicked

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        login_admin add=new login_admin();
        add.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AdminActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        login_customer add=new login_customer();
        add.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        searchflights1 add = new searchflights1();
        add.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        login_home1 add = new login_home1();
        add.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeMouseClicked

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        searchflights1 add = new searchflights1();
        add.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:*/
    }//GEN-LAST:event_searchMouseClicked

    private void foodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodMouseClicked
        foodmenu add = new foodmenu();
        add.setVisible(true);
        this.setVisible(false);
           // TODO add your handling code here:
    }//GEN-LAST:event_foodMouseClicked

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        about add = new about();
        add.setVisible(true);
        this.setVisible(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutMouseClicked

    private void flyersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flyersMouseClicked
        login_customer add = new login_customer();
        add.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_flyersMouseClicked

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
        login_admin add = new login_admin();
        add.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_adminMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_exitMouseClicked

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
            java.util.logging.Logger.getLogger(login_home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_home1().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu about;
    private javax.swing.JMenu admin;
    private javax.swing.JMenu exit;
    private javax.swing.JMenu flyers;
    private javax.swing.JMenu food;
    private javax.swing.JMenu home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenu search;
    // End of variables declaration//GEN-END:variables
}