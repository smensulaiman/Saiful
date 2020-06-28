package com.saiful.gui;

import com.saiful.ocr.APIClient;
import com.saiful.utils.GlobalKeyListenerExample;
import com.saiful.utils.GlobalKeyListenerExample1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Solaiman
 */
public class Dashboard extends javax.swing.JFrame {

    int xx = 0;
    int yy = 0;

    public Dashboard() {
        initComponents();
        globalKeyListenerExample = new GlobalKeyListenerExample();
        globalKeyListenerExample1 = new GlobalKeyListenerExample1();
        File file = new File(System.getProperty("user.home") + "/Desktop/screenshot");

        if (file.isDirectory()) {
            System.out.println("Present");
        } else {
            file.mkdir();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        icCross = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnStart = new javax.swing.JLabel();
        txtPath = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnScrStop = new javax.swing.JButton();
        btnScrStart = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnScrStop1 = new javax.swing.JButton();
        btnScrStart1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnStartOCR = new javax.swing.JLabel();
        txtImagePath = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/less.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 30, 30));

        icCross.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icCross.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cross.png"))); // NOI18N
        icCross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icCrossMouseClicked(evt);
            }
        });
        jPanel1.add(icCross, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 30));

        jTabbedPane1.setBackground(new java.awt.Color(102, 102, 102));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 153), 2));
        jTabbedPane1.setForeground(new java.awt.Color(0, 204, 153));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jTabbedPane1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseDragged(evt);
            }
        });
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTabbedPane1MousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play-button.png"))); // NOI18N
        btnStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStartMouseClicked(evt);
            }
        });
        jPanel2.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 40, 50));

        txtPath.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtPath.setForeground(new java.awt.Color(102, 102, 102));
        txtPath.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 153)));
        jPanel2.add(txtPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 30));

        jTabbedPane1.addTab("Dat To Excel", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnScrStop.setBackground(new java.awt.Color(255, 102, 102));
        btnScrStop.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnScrStop.setForeground(new java.awt.Color(255, 255, 255));
        btnScrStop.setText("STOP");
        btnScrStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScrStopActionPerformed(evt);
            }
        });
        jPanel3.add(btnScrStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 90, 30));

        btnScrStart.setBackground(new java.awt.Color(0, 153, 102));
        btnScrStart.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnScrStart.setForeground(new java.awt.Color(255, 255, 255));
        btnScrStart.setText("START");
        btnScrStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScrStartActionPerformed(evt);
            }
        });
        jPanel3.add(btnScrStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 90, 30));

        jTabbedPane1.addTab("Screenshot", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnScrStop1.setBackground(new java.awt.Color(255, 102, 102));
        btnScrStop1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnScrStop1.setForeground(new java.awt.Color(255, 255, 255));
        btnScrStop1.setText("STOP");
        btnScrStop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScrStop1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnScrStop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 90, 30));

        btnScrStart1.setBackground(new java.awt.Color(0, 153, 102));
        btnScrStart1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnScrStart1.setForeground(new java.awt.Color(255, 255, 255));
        btnScrStart1.setText("START");
        btnScrStart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScrStart1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnScrStart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 90, 30));

        jTabbedPane1.addTab("Screenshot (Name)", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStartOCR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnStartOCR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play-button.png"))); // NOI18N
        btnStartOCR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStartOCRMouseClicked(evt);
            }
        });
        jPanel5.add(btnStartOCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 40, 50));

        txtImagePath.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        txtImagePath.setForeground(new java.awt.Color(102, 102, 102));
        txtImagePath.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 153)));
        jPanel5.add(txtImagePath, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 30));

        jTabbedPane1.addTab("Image To Text", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 390, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        this.setLocation(evt.getXOnScreen() - xx, evt.getYOnScreen() - yy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void icCrossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icCrossMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_icCrossMouseClicked

    private void jTabbedPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_jTabbedPane1MousePressed

    private void jTabbedPane1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseDragged
        // TODO add your handling code here:
        this.setLocation(evt.getXOnScreen() - xx, evt.getYOnScreen() - (yy + 30));
    }//GEN-LAST:event_jTabbedPane1MouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        this.setState(1);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMouseClicked
        // TODO add your handling code here:
        btnStart.setEnabled(false);

        String datFolderPath = txtPath.getText();

        File folder = new File(datFolderPath);
        File[] files = folder.listFiles();

        generateExcel(files);

    }//GEN-LAST:event_btnStartMouseClicked

    private void btnScrStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScrStartActionPerformed
        // TODO add your handling code here:

        globalKeyListenerExample.start();
        btnScrStart.setEnabled(false);
    }//GEN-LAST:event_btnScrStartActionPerformed

    private void btnScrStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScrStopActionPerformed
        // TODO add your handling code here:

        globalKeyListenerExample.stop();
        btnScrStart.setEnabled(true);
    }//GEN-LAST:event_btnScrStopActionPerformed

    private void btnScrStop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScrStop1ActionPerformed
        // TODO add your handling code here:
        globalKeyListenerExample1.stop();
        btnScrStart1.setEnabled(true);
    }//GEN-LAST:event_btnScrStop1ActionPerformed

    private void btnScrStart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScrStart1ActionPerformed
        // TODO add your handling code here:
        globalKeyListenerExample1.start();
        btnScrStart1.setEnabled(false);
    }//GEN-LAST:event_btnScrStart1ActionPerformed

    private void btnStartOCRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartOCRMouseClicked
        // TODO add your handling code here:
        APIClient apiclient = new APIClient();
        btnStartOCR.setEnabled(false);

        String imagePath = txtImagePath.getText();
        File file = new File(imagePath);
        File[] images = file.listFiles();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (File image : images) {
                    try {
                        String imagetoText = apiclient.getTextFromImage(image);
                        if (imagetoText.equals("error")) {
                            System.out.println(image.getName() + " is error");
                        } else {
                            System.out.println(imagetoText);
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }).start();

    }//GEN-LAST:event_btnStartOCRMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnScrStart;
    private javax.swing.JButton btnScrStart1;
    private javax.swing.JButton btnScrStop;
    private javax.swing.JButton btnScrStop1;
    private javax.swing.JLabel btnStart;
    private javax.swing.JLabel btnStartOCR;
    private javax.swing.JLabel icCross;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtImagePath;
    private javax.swing.JTextField txtPath;
    // End of variables declaration//GEN-END:variables

    GlobalKeyListenerExample globalKeyListenerExample;
    GlobalKeyListenerExample1 globalKeyListenerExample1;

    private XSSFWorkbook workbook;
    private XSSFSheet spreadsheet;
    private FileOutputStream out;
    private XSSFRow row;
    private Map< String, Object[]> empinfo;

    public void generateExcel(File[] files) {
        int rowIndex = 1;
        try {

            workbook = new XSSFWorkbook();
            spreadsheet = workbook.createSheet("Dat Files");
            spreadsheet.setColumnWidth(0, 3000);
            empinfo = new TreeMap< String, Object[]>();
            out = new FileOutputStream(new File(System.getProperty("user.home") + "/Desktop/Excel Data.xlsx"));

            //empinfo.put(String.valueOf(rowIndex), new Object[]{"name"});
            rowIndex++;

            for (File file : files) {
                empinfo.put(String.valueOf(rowIndex), new Object[]{file.getName().split(".dat")[0]});
                rowIndex++;
            }

            try {

                Set< String> keyid = empinfo.keySet();
                int rowid = 0;

                for (String key : keyid) {
                    row = spreadsheet.createRow(rowid++);
                    row.setHeight((short) 300);
                    Object[] objectArr = empinfo.get(key);
                    int cellid = 0;

                    for (Object obj : objectArr) {
                        Cell cell = row.createCell(cellid++);
                        cell.setCellValue((String) obj);
                    }
                }

                workbook.write(out);
                out.close();

                btnStart.setEnabled(true);
                JOptionPane.showMessageDialog(null, "Complete !!!");

            } catch (IOException ex) {
                ex.printStackTrace();
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
