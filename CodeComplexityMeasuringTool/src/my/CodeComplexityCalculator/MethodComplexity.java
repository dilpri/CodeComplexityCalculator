package my.CodeComplexityCalculator;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pancha27
 */
public class MethodComplexity extends javax.swing.JFrame {

    /**
     * Creates new form MethodComplexity
     */
    public MethodComplexity() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtM1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtM2 = new javax.swing.JTextArea();
        btnM1 = new javax.swing.JButton();
        btnM2 = new javax.swing.JButton();
        btnM3 = new javax.swing.JButton();
        swlb1 = new javax.swing.JLabel();
        swtx5 = new javax.swing.JTextField();
        swlb2 = new javax.swing.JLabel();
        swlb3 = new javax.swing.JLabel();
        swlb4 = new javax.swing.JLabel();
        swtx4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        swtx1 = new javax.swing.JTextField();
        swtx3 = new javax.swing.JTextField();
        swtx2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Code Complexity Calculator");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Statement", "Wmrt ", "Npdtp ", "Wpdtp ", "Ncdtp ", "Wcdtp ", "Cm"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(200);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Complexity of a Program Statement due to Method ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Choose a .java file");

        txtM1.setColumns(20);
        txtM1.setRows(5);
        jScrollPane2.setViewportView(txtM1);

        txtM2.setColumns(20);
        txtM2.setRows(5);
        jScrollPane3.setViewportView(txtM2);

        btnM1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnM1.setText("Code Complexity");
        btnM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importCodet(evt);
            }
        });

        btnM2.setText("Clear");
        btnM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnM2ActionPerformed(evt);
            }
        });

        btnM3.setText("Import");
        btnM3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnM3ActionPerformed(evt);
            }
        });

        swlb1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        swlb1.setText("Weights related to the method factor");

        swtx5.setText("2");
        swtx5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swtx5ActionPerformed(evt);
            }
        });

        swlb2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        swlb2.setText("Program Component ");

        swlb3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        swlb3.setText("Weight");

        swlb4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        swlb4.setText("Method with a primitive return type");

        swtx4.setText("1");
        swtx4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swtx4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Method with a composite return type");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Primitive data type parameter");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Method with a void return type");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Composite data type parameter");

        swtx1.setText("1");
        swtx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swtx1ActionPerformed(evt);
            }
        });

        swtx3.setText("0");
        swtx3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swtx3ActionPerformed(evt);
            }
        });

        swtx2.setText("2");
        swtx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swtx2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Generate Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnM3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnM2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(350, 350, 350))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(swlb1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(swlb2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(swlb4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnM1))
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(swtx5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(swtx3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(swtx4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(swtx2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(swtx1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(swlb3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnM3)
                        .addComponent(btnM2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(swlb1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(swlb2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(swlb3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(swlb4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(swtx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(swtx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(swtx3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(swtx4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(swtx5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(btnM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void importCodet(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importCodet
        Parser.init(txtM1.getText());
        
        txtM2.setText(Parser.sourceStr);
        Cm[] s =Parser.cmHashMap.values().toArray(new Cm[0]);
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

        for(int i =0; i<s.length; i++) {
            String[] row = {//String.valueOf(s[i]),
                         Parser.lines.get(i),
                        String.valueOf(s[i].getWmrt()*Integer.parseInt(swtx3.getText())),
                        String.valueOf(s[i].getNpdtp()),
                        String.valueOf(s[i].getwpdtp()*Integer.parseInt(swtx1.getText())),
                        String.valueOf(s[i].getNcdtp()),
                        String.valueOf(s[i].getWcdtp()*Integer.parseInt(swtx2.getText())),
                        String.valueOf((s[i].getWmrt()*Integer.parseInt(swtx3.getText()))+
                                (s[i].getwpdtp()*Integer.parseInt(swtx1.getText()))+
                                  s[i].getWcdtp()*Integer.parseInt(swtx2.getText()))
                        /*String.valueOf(s[i].getWmrt()*Integer.parseInt(swtx3.getText())),
                        String.valueOf(s[i].getNpdtp()),
                        String.valueOf(s[i].getwpdtp()*Integer.parseInt(swtx1.getText())),
                        String.valueOf(s[i].getNcdtp()),
                        String.valueOf(s[i].getWcdtp()*Integer.parseInt(swtx2.getText())),
                        String.valueOf((s[i].getWmrt()*Integer.parseInt(swtx3.getText()))+
                                (s[i].getNpdtp()*(s[i].getwpdtp()*Integer.parseInt(swtx1.getText())))+
                                  s[i].getNcdtp()*(s[i].getWcdtp()*Integer.parseInt(swtx2.getText())))*/
                      
                        };
            model.addRow(row);
        }
    }//GEN-LAST:event_importCodet

    private void btnM3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnM3ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
       chooser.showOpenDialog(null);
        File file1 = chooser.getSelectedFile();
       String filename = file1.getAbsolutePath();
       txtM1.setText(filename);
    }//GEN-LAST:event_btnM3ActionPerformed

    private void swtx5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swtx5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_swtx5ActionPerformed

    private void swtx4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swtx4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_swtx4ActionPerformed

    private void swtx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swtx1ActionPerformed
        // TODO add your handling code here:
        // String s1=swtx1.getText();

        //int wes1 = Integer.parseInt(s1);

    }//GEN-LAST:event_swtx1ActionPerformed

    private void swtx3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swtx3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_swtx3ActionPerformed

    private void swtx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swtx2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_swtx2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        // Generate PDF
        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int m = j.showSaveDialog(this);
        
        if(m==JFileChooser.APPROVE_OPTION){
        path = j.getSelectedFile().getPath();
        }
        
        Document doc = new Document();
        
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"Complexity due to Method.pdf"));
            
            doc.open();
            
            PdfPTable tm = new PdfPTable(7);
            
            tm.addCell("Statement");
            tm.addCell("Wmrt");
            tm.addCell("Npdtp");
            tm.addCell("Wpdtp");
            tm.addCell("Ncdtp");
            tm.addCell("Wcdtp");
            tm.addCell("Cm");
            
            
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                String Statement = jTable1.getValueAt(i, 0).toString();
                String Wmrt = jTable1.getValueAt(i, 1).toString();
                String Npdtp = jTable1.getValueAt(i, 2).toString();
                String Wpdtp = jTable1.getValueAt(i, 3).toString();
                String Ncdtp = jTable1.getValueAt(i, 4).toString();
                String Wcdtp = jTable1.getValueAt(i, 5).toString();
                String Cm = jTable1.getValueAt(i, 6).toString();
                
                
                tm.addCell(Statement);
                tm.addCell(Wmrt);
                tm.addCell(Npdtp);
                tm.addCell(Wpdtp);
                tm.addCell(Ncdtp);
                tm.addCell(Wcdtp);
                tm.addCell(Cm);
               
                
            }
            
            doc.add(tm);
            
            JOptionPane.showMessageDialog(null, "Downloaded PDF File", "ALERT MESSAGE", JOptionPane.WARNING_MESSAGE);
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        doc.close();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnM2ActionPerformed
        // TODO add your handling code here:
        //clear
        txtM1.setText("");
        txtM2.setText("");  
        swtx1.setText("");
        swtx2.setText("");
        swtx3.setText("");
        swtx4.setText("");
        swtx5.setText("");
        DefaultTableModel mTable = (DefaultTableModel) jTable1.getModel();
        mTable.setRowCount(0);
    }//GEN-LAST:event_btnM2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
        new MainScreen().toFront();
        new MainScreen().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MethodComplexity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MethodComplexity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MethodComplexity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MethodComplexity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MethodComplexity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnM1;
    private javax.swing.JButton btnM2;
    private javax.swing.JButton btnM3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel swlb1;
    private javax.swing.JLabel swlb2;
    private javax.swing.JLabel swlb3;
    private javax.swing.JLabel swlb4;
    private javax.swing.JTextField swtx1;
    private javax.swing.JTextField swtx2;
    private javax.swing.JTextField swtx3;
    private javax.swing.JTextField swtx4;
    private javax.swing.JTextField swtx5;
    private javax.swing.JTextArea txtM1;
    private javax.swing.JTextArea txtM2;
    // End of variables declaration//GEN-END:variables
}
