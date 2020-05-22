package my.CodeComplexityCalculator;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.table.DefaultTableModel;
import java.lang.reflect.Array;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pancha27
 */
public class VariableComplexity extends javax.swing.JFrame {

    /**
     * Creates new form VariableComplexity
     */
    public VariableComplexity() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnV1 = new javax.swing.JButton();
        btnV2 = new javax.swing.JButton();
        btnV3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtV2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtV1 = new javax.swing.JTextArea();
        swlb1 = new javax.swing.JLabel();
        swlb2 = new javax.swing.JLabel();
        swlb3 = new javax.swing.JLabel();
        swlb4 = new javax.swing.JLabel();
        swtx4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        swtx1 = new javax.swing.JTextField();
        swtx3 = new javax.swing.JTextField();
        swtx2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Code Complexity Calculator");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Complexity of a Program Statement due to Variable ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Choose a .java file");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Statement", "Wvs ", "Npdtv ", "Wpdtv ", "Ncdtv ", "Wcdtv ", "Cv"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(200);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        btnV1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnV1.setText("Code Complexity");
        btnV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importCode(evt);
            }
        });

        btnV2.setText("Clear");
        btnV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnV2ActionPerformed(evt);
            }
        });

        btnV3.setText("Import");
        btnV3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnV3ActionPerformed(evt);
            }
        });

        txtV2.setColumns(20);
        txtV2.setRows(5);
        jScrollPane3.setViewportView(txtV2);

        txtV1.setColumns(20);
        txtV1.setRows(5);
        jScrollPane2.setViewportView(txtV1);

        swlb1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        swlb1.setText("Weights related to the variable  factor");

        swlb2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        swlb2.setText("Program Component ");

        swlb3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        swlb3.setText("Weight");

        swlb4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        swlb4.setText("Global variable ");

        swtx4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swtx4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Local variable ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Composite data type variable ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Primitive data type variable ");

        swtx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swtx1ActionPerformed(evt);
            }
        });

        swtx3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swtx3ActionPerformed(evt);
            }
        });

        swtx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swtx2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Generate PDF");
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
                .addGap(256, 256, 256)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnV3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnV2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(swlb1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(swlb2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(swlb3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(swlb4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(swtx1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(swtx2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(swtx3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnV1)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(swtx4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnV2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnV3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(swlb1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(swlb2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(swlb3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(swlb4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(swtx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(swtx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(swtx3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(swtx4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnV1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void importCode(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importCode
        // TODO add your handling code here:
         Parser.init(txtV1.getText());
          txtV2.setText(Parser.sourceStr);
        Cv[] s= Parser.cvHashMap.values().toArray(new Cv[0]);
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

        for(int i =0; i<s.length; i++) {
            
            String[] row= {//String.valueOf(s[i]),
                         Parser.lines.get(i),
                         String.valueOf(s[i].getWvs()),
                         String.valueOf(s[i].getNpdtv()),
                         String.valueOf(s[i].getWpdtv()* Integer.parseInt(swtx3.getText())),
                         String.valueOf(s[i].getNcdtv()),
                         String.valueOf(s[i].getWcdtv()* Integer.parseInt(swtx4.getText())),
                         String.valueOf((s[i].getWvs())*((s[i].getWpdtv()* Integer.parseInt(swtx3.getText()))+(s[i].getWcdtv()* Integer.parseInt(swtx4.getText()))))         
                        };
            model.addRow(row);
        }
        
    }//GEN-LAST:event_importCode

    private void btnV3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnV3ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
       chooser.showOpenDialog(null);
        File file1 = chooser.getSelectedFile();
       String filename = file1.getAbsolutePath();
       txtV1.setText(filename);
    }//GEN-LAST:event_btnV3ActionPerformed

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
        int v = j.showSaveDialog(this);
        
        if(v==JFileChooser.APPROVE_OPTION){
        path = j.getSelectedFile().getPath();
        }
        
        Document doc = new Document();
        
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"Complexity due to Variable.pdf"));
            
            doc.open();
            
            PdfPTable tv = new PdfPTable(7);
            
            tv.addCell("Statement");
            tv.addCell("Wvs");
            tv.addCell("Npdtv");
            tv.addCell("Wpdtv");
            tv.addCell("Ncdtv");
            tv.addCell("Wcdtv");
            tv.addCell("Cv");
            
            
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                String Statement = jTable1.getValueAt(i, 0).toString();
                String Wvs = jTable1.getValueAt(i, 1).toString();
                String Npdtv = jTable1.getValueAt(i, 2).toString();
                String Wpdtv = jTable1.getValueAt(i, 3).toString();
                String Ncdtv = jTable1.getValueAt(i, 4).toString();
                String Wcdtv = jTable1.getValueAt(i, 5).toString();
                String Cv = jTable1.getValueAt(i, 6).toString();
                
                
                tv.addCell(Statement);
                tv.addCell(Wvs);
                tv.addCell(Npdtv);
                tv.addCell(Wpdtv);
                tv.addCell(Ncdtv);
                tv.addCell(Wcdtv);
                tv.addCell(Cv);
               
                
            }
            
            doc.add(tv);
            
            JOptionPane.showMessageDialog(null, "Downloaded PDF File", "ALERT MESSAGE", JOptionPane.WARNING_MESSAGE);
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        doc.close();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnV2ActionPerformed
        // TODO add your handling code here:
        
        txtV1.setText("");
        txtV2.setText("");  
        swtx1.setText("");
        swtx2.setText("");
        swtx3.setText("");
        swtx4.setText("");
        DefaultTableModel vTable = (DefaultTableModel) jTable1.getModel();
        vTable.setRowCount(0);
    }//GEN-LAST:event_btnV2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
        new MainScreen().toFront();
        new MainScreen().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    
   /* private void importCode(java.awt.event.ActionEvent evt) {                            
        GigaParser.init(txtV1.getText());
        Cv[] v = GigaParser.cvHashMap.values().toArray(new Cv[0]);
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

        for(int i =0; i<v.length; i++) {
            Integer[] row = {i,
                        v[i].getwvs(),
                        v[i].getnpdtv(),
                        v[i].getwpdtv(),
                        v[i].getncdtv(),
                        v[i].getwcdtv()
                        };
            model.addRow(row);
        }
        
        
    }   */
    
    
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
            java.util.logging.Logger.getLogger(VariableComplexity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VariableComplexity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VariableComplexity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VariableComplexity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VariableComplexity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnV1;
    private javax.swing.JButton btnV2;
    private javax.swing.JButton btnV3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JTextArea txtV1;
    private javax.swing.JTextArea txtV2;
    // End of variables declaration//GEN-END:variables
}
