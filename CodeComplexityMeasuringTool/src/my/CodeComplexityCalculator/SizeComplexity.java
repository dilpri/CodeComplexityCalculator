package my.CodeComplexityCalculator;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.print.PrinterException;
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
public class SizeComplexity extends javax.swing.JFrame {

    /**
     * Creates new form SizeComplexity
     */
        
    public SizeComplexity() {
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
        btnS1 = new javax.swing.JButton();
        btnS2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtS1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtS2 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        swlb2 = new javax.swing.JLabel();
        swlb4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        swtx1 = new javax.swing.JTextField();
        swtx3 = new javax.swing.JTextField();
        swtx2 = new javax.swing.JTextField();
        swlb1 = new javax.swing.JLabel();
        swtx5 = new javax.swing.JTextField();
        swlb3 = new javax.swing.JLabel();
        swtx4 = new javax.swing.JTextField();
        repo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Code Complexity Calculator");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Complexity of a Program Statement due to Size ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Choose a .java file");

        btnS1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnS1.setText("Code Complexity");
        btnS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importCode(evt);
            }
        });

        btnS2.setText("Clear");
        btnS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnS2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Statement", "Nkw", "Wkw", "Nid", "Wid", "Nop", "Wop", "Nnv", "Wnv", "Nsl", "Wsl", "Cs"
            }
        ));
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(200);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        txtS1.setColumns(20);
        txtS1.setRows(5);
        jScrollPane3.setViewportView(txtS1);

        txtS2.setColumns(20);
        txtS2.setRows(5);
        jScrollPane4.setViewportView(txtS2);

        jButton2.setText("Import");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        swlb2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        swlb2.setText("Program Component ");

        swlb4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        swlb4.setText("Keyword");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Identifier");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Numerical value");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Operator");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("String literal ");

        swtx1.setText("1");
        swtx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swtx1ActionPerformed(evt);
            }
        });

        swtx3.setText("1");
        swtx3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swtx3ActionPerformed(evt);
            }
        });

        swtx2.setText("1");
        swtx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swtx2ActionPerformed(evt);
            }
        });

        swlb1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        swlb1.setText("Weights related to the size factor");

        swtx5.setText("1");
        swtx5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swtx5ActionPerformed(evt);
            }
        });

        swlb3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        swlb3.setText("Weight");

        swtx4.setText("1");
        swtx4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swtx4ActionPerformed(evt);
            }
        });

        repo.setBackground(new java.awt.Color(0, 204, 0));
        repo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        repo.setText("Generate PDF");
        repo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(750, 750, 750)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(swlb1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(swlb4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(149, 149, 149)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(swtx2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(swtx3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(swtx4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(swtx5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(swlb3))
                                        .addComponent(swtx1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(swlb2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(295, 295, 295))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnS1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(repo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnS2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnS2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(swlb1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(swlb3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(swlb2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(swlb4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(swtx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(swtx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(swtx3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(swtx4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(swtx5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnS1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(repo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void importCode(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importCode
        Parser.init(txtS1.getText());
        txtS2.setText(Parser.sourceStr);
        Cs[] s = Parser.csHashMap.values().toArray(new Cs[0]);
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
   
                /*int a=Integer.parseInt(swtx1.getText());
                int b=Integer.parseInt(swtx2.getText());
                */
               
                
                
                
                
        for(int i =0; i<s.length; i++) {
            String[] row = {//String.valueOf(s.length),
                        Parser.lines.get(i),
                        String.valueOf(s[i].getnKW() ),
                      String.valueOf(s[i].getwKW()*Integer.parseInt(swtx1.getText())),
                        String.valueOf(s[i].getnId()),
                        String.valueOf(s[i].getwId()*Integer.parseInt(swtx2.getText())),
                        String.valueOf(s[i].getnOp()),
                        String.valueOf(s[i].getwOp()*Integer.parseInt(swtx3.getText())),
                        String.valueOf(s[i].getnNv()),
                        String.valueOf(s[i].getwNv()*Integer.parseInt(swtx4.getText())),
                        String.valueOf(s[i].getnSl()),
                        String.valueOf(s[i].getwSl()*Integer.parseInt(swtx5.getText())),
                       
                        String.valueOf((s[i].getwKW()*Integer.parseInt(swtx1.getText()))+
                                      (s[i].getwId()*Integer.parseInt(swtx2.getText()))+
                                      (s[i].getwOp()*Integer.parseInt(swtx3.getText()))+
                                      (s[i].getwNv()*Integer.parseInt(swtx4.getText()))+
                                      (s[i].getwSl()*Integer.parseInt(swtx5.getText())))
                        
                        };
            model.addRow(row);
        }
        
       /* Cs cs = new Cs();
        int sum =cs (Integer.parseInt(swtx1.getText());
                , Integer.parseInt(swtx2.getText()), Integer.parseInt(swtx3.getText()), 
                Integer.parseInt(swtx4.getText()), Integer.parseInt(swtx5.getText()));
        */
    }//GEN-LAST:event_importCode
           /*public int size(int a1){
             Cs  ob=new Cs();
                a1=ob.SizeComplexity();
                
         }*/
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            JFileChooser chooser = new JFileChooser();
       chooser.showOpenDialog(null);
        File file1 = chooser.getSelectedFile();
       String filename = file1.getAbsolutePath();
       txtS1.setText(filename);
    }//GEN-LAST:event_jButton2ActionPerformed

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

    private void swtx5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swtx5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_swtx5ActionPerformed

    private void swtx4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swtx4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_swtx4ActionPerformed

    private void btnS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnS2ActionPerformed
        // TODO add your handling code here:
        //clear
        txtS1.setText("");
        txtS2.setText("");  
        swtx1.setText("");
        swtx2.setText("");
        swtx3.setText("");
        swtx4.setText("");
        swtx5.setText("");
        DefaultTableModel sTable = (DefaultTableModel) jTable1.getModel();
        sTable.setRowCount(0);

    }//GEN-LAST:event_btnS2ActionPerformed

    private void repoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repoActionPerformed
        /* try{
            jTable1.print();
       
       } catch (PrinterException ex) {
            Logger.getLogger(SizeComplexity.class.getName()).log(Level.SEVERE, null, ex);
        }*/
         // Generate PDF
        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int s = j.showSaveDialog(this);
        
        if(s==JFileChooser.APPROVE_OPTION){
        path = j.getSelectedFile().getPath();
        }
        
        Document doc = new Document();
        
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"Complexity due to Size.pdf"));
            
            doc.open();
            
            PdfPTable ts = new PdfPTable(12);
            
            ts.addCell("Statement");
            ts.addCell("Nkw");
            ts.addCell("Wkw");
            ts.addCell("Nid");
            ts.addCell("Wid");
            ts.addCell("Nop");
            ts.addCell("Wop");
            ts.addCell("Nnv");
            ts.addCell("Wnv");
             ts.addCell("Nsl");
            ts.addCell("Wsl");
            ts.addCell("Cs");
            
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                String Statement = jTable1.getValueAt(i, 0).toString();
                String Nkw = jTable1.getValueAt(i, 1).toString();
                String Wkw = jTable1.getValueAt(i, 2).toString();
                String Nid = jTable1.getValueAt(i, 3).toString();
                String Wid = jTable1.getValueAt(i, 4).toString();
                String Nop = jTable1.getValueAt(i, 5).toString();
                String Wop = jTable1.getValueAt(i, 6).toString();
                String Nnv = jTable1.getValueAt(i, 7).toString();
                String Wnv = jTable1.getValueAt(i, 8).toString();
                 String Nsl = jTable1.getValueAt(i, 9).toString();
                String Wsl = jTable1.getValueAt(i, 10).toString();
                String Cs = jTable1.getValueAt(i, 11).toString();
                
                ts.addCell(Statement);
                ts.addCell(Nkw);
                ts.addCell(Wkw);
                ts.addCell(Nid);
                ts.addCell(Wid);
                ts.addCell(Nop);
                ts.addCell(Wop);
                ts.addCell(Nnv);
                ts.addCell(Wnv);
                ts.addCell(Nsl);
                ts.addCell(Wsl);
                ts.addCell(Cs);
             
                
            }
            
            doc.add(ts);
            
            JOptionPane.showMessageDialog(null, "Downloaded PDF File", "ALERT MESSAGE", JOptionPane.WARNING_MESSAGE);
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        doc.close();
        
    }//GEN-LAST:event_repoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
        new MainScreen().toFront();
        new MainScreen().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SizeComplexity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SizeComplexity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SizeComplexity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SizeComplexity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SizeComplexity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnS1;
    private javax.swing.JButton btnS2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton repo;
    private javax.swing.JLabel swlb1;
    private javax.swing.JLabel swlb2;
    private javax.swing.JLabel swlb3;
    private javax.swing.JLabel swlb4;
    private javax.swing.JTextField swtx1;
    private javax.swing.JTextField swtx2;
    private javax.swing.JTextField swtx3;
    private javax.swing.JTextField swtx4;
    private javax.swing.JTextField swtx5;
    private javax.swing.JTextArea txtS1;
    private javax.swing.JTextArea txtS2;
    // End of variables declaration//GEN-END:variables
}
