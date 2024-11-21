/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package praktik_9;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author HP
 */
public class frm_mahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form frm_mahasiswa
     */
    private DefaultTableModel tableModel;
    
    public frm_mahasiswa() {
        initComponents();
        
        // Initially disable fields that are not for direct input
        txtAKHIR.setEditable(false);
        txtHURUF.setEditable(false);
        txtPREDIKAT.setEditable(false);
        txthasildua.setEditable(false);
        txthasiltiga.setEditable(false);
        txthasilempat.setEditable(false);

        // Add listeners to input fields to perform calculations
        addListeners();
        
        setupTableModel();
        loadTableData();
        
        addWindowListener(new WindowAdapter(){
         @Override
            public void windowClosing(WindowEvent e) {
                saveTableData();
                System.exit(0);
            }
        });
    }
   
    
    private void addListeners() {
        DocumentListener listener = new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) { calculate(); }
            @Override
            public void removeUpdate(DocumentEvent e) { calculate(); }
            @Override
            public void insertUpdate(DocumentEvent e) { calculate(); }
        };

        txtTUGAS.getDocument().addDocumentListener(listener);
        txtUTS.getDocument().addDocumentListener(listener);
        txtUAS.getDocument().addDocumentListener(listener);
    }
      private void setupTableModel() {
        tableModel = new DefaultTableModel(new Object[]{"NIM", "Nama", "Nilai Tugas", "Nilai UTS", "Nilai UAS", 
            "Nilai Akhir", "Huruf", "Predikat"}, 0);
        datamenampungnilai.setModel(tableModel);
    }
    
    
    private void calculate() {
        try {
            double nilaiTugas = Double.parseDouble(txtTUGAS.getText());
            double nilaiUTS = Double.parseDouble(txtUTS.getText());
            double nilaiUAS = Double.parseDouble(txtUAS.getText());
           
            double hasilTugas = nilaiTugas * 0.2;
            double hasilUTS = nilaiUTS * 0.35;
            double hasilUAS = nilaiUAS * 0.45;

            double nilaiAkhir = hasilTugas + hasilUTS + hasilUAS;

            String nilaiHuruf = "";
            String predikat = "";
            
            if (nilaiAkhir >= 85) {
                nilaiHuruf = "A";
                predikat = "Sangat Baik";
            } else if (nilaiAkhir >= 70) {
                nilaiHuruf = "B";
                predikat = "Baik";
            } else if (nilaiAkhir >= 55) {
                nilaiHuruf = "C";
                predikat = "Cukup";
            } else if (nilaiAkhir >= 40) {
                nilaiHuruf = "D";
                predikat = "Kurang";
            } else {
                nilaiHuruf = "E";
                predikat = "Gagal";
            }
            txthasildua.setText(String.format("%.2f", hasilTugas));
            txthasiltiga.setText(String.format("%.2f", hasilUTS));
            txthasilempat.setText(String.format("%.2f", hasilUAS));
            txtAKHIR.setText(String.format("%.2f", nilaiAkhir));
            txtHURUF.setText(nilaiHuruf);
            txtPREDIKAT.setText(predikat);

            // Update table
            updateTable();
            
        } catch (NumberFormatException e) {
            // Handle the case where inputs are not valid numbers
            // You may want to clear the calculated fields or show an error message
        }
    }
    
    private void updateTable() {
        tableModel.setRowCount(0);
        loadTableData();
        String nim = txtNim.getText();
        String nama = txtNama.getText();
        String tugas = txtTUGAS.getText();
        String uts = txtUTS.getText();
        String uas = txtUAS.getText();
        String nilaiAkhir = txtAKHIR.getText();
        String huruf = txtHURUF.getText();
        String predikat = txtPREDIKAT.getText();

        // Check if NIM already exists in the table
        boolean nimExists = false;
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            if (tableModel.getValueAt(i, 0).equals(nim)) {
                nimExists = true;
                tableModel.setValueAt(nama, i, 1);
                tableModel.setValueAt(tugas, i, 2);
                tableModel.setValueAt(uts, i, 3);
                tableModel.setValueAt(uas, i, 4);
                tableModel.setValueAt(nilaiAkhir, i, 5);
                tableModel.setValueAt(huruf, i, 6);
                tableModel.setValueAt(predikat, i, 7);
                break;
            }
        }

        if (!nimExists) {
            tableModel.addRow(new Object[]{nim, nama, tugas, uts, uas, nilaiAkhir, huruf, predikat});
        }
    }
    
     private void saveTableData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.dat"))) {
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                for (int j = 0; j < tableModel.getColumnCount(); j++) {
                    oos.writeObject(tableModel.getValueAt(i, j));
                }
            }
        } catch (IOException e) {
          e.printStackTrace();  
        }
    }
    
    private void loadTableData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.dat"))) {
            while (true) {
                Object[] rowData = new Object[tableModel.getColumnCount()];
                for (int i = 0; i < tableModel.getColumnCount(); i++) {
                    rowData[i] = ois.readObject();
                }
                tableModel.addRow(rowData);
            }
        } catch (EOFException e) {
            // End of file reached
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    } 
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judul = new javax.swing.JLabel();
        NIM = new javax.swing.JLabel();
        NAMA = new javax.swing.JLabel();
        txtNim = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        NTGS = new javax.swing.JLabel();
        NUTS = new javax.swing.JLabel();
        NUAS = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        datamenampungnilai = new javax.swing.JTable();
        txtTUGAS = new javax.swing.JTextField();
        txtUTS = new javax.swing.JTextField();
        txtUAS = new javax.swing.JTextField();
        txtdua = new javax.swing.JLabel();
        txtTiga = new javax.swing.JLabel();
        txtempat = new javax.swing.JLabel();
        txthasildua = new javax.swing.JTextField();
        txthasiltiga = new javax.swing.JTextField();
        txthasilempat = new javax.swing.JTextField();
        NAKHIR = new javax.swing.JLabel();
        NHURUF = new javax.swing.JLabel();
        PREDIKAT = new javax.swing.JLabel();
        txtAKHIR = new javax.swing.JTextField();
        txtHURUF = new javax.swing.JTextField();
        txtPREDIKAT = new javax.swing.JTextField();
        btn_hpus = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        judul.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        judul.setText("FORUM DATA MAHASISWA");

        NIM.setText("NIM");

        NAMA.setText("Nama");

        txtNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNimActionPerformed(evt);
            }
        });

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        NTGS.setText("Nilai Tugas");

        NUTS.setText("Nilai UTS");

        NUAS.setText("Nilai UAS");

        datamenampungnilai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Nilai Tugas", "Nilai UTS", "Nilai UAS", "Nilai Akhir", "Nilai Huruf", "Predikat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        datamenampungnilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datamenampungnilaiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(datamenampungnilai);

        txtTUGAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTUGASActionPerformed(evt);
            }
        });

        txtUTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUTSActionPerformed(evt);
            }
        });

        txtUAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUASActionPerformed(evt);
            }
        });

        txtdua.setText("20%");

        txtTiga.setText("35%");

        txtempat.setText("45%");

        txthasildua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthasilduaActionPerformed(evt);
            }
        });

        txthasiltiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthasiltigaActionPerformed(evt);
            }
        });

        txthasilempat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthasilempatActionPerformed(evt);
            }
        });

        NAKHIR.setText("Nilai Akhir");

        NHURUF.setText("Nilai Huruf");

        PREDIKAT.setText("Predikat");

        txtAKHIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAKHIRActionPerformed(evt);
            }
        });

        txtHURUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHURUFActionPerformed(evt);
            }
        });

        txtPREDIKAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPREDIKATActionPerformed(evt);
            }
        });

        btn_hpus.setText("Hapus");
        btn_hpus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hpusActionPerformed(evt);
            }
        });

        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NAMA)
                                    .addComponent(NIM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NUTS)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtUTS, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NUAS)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtUAS, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NTGS)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTUGAS, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtdua)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txthasildua, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtempat)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txthasilempat, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTiga)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txthasiltiga, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NAKHIR)
                                    .addComponent(NHURUF)
                                    .addComponent(PREDIKAT))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHURUF, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAKHIR, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPREDIKAT, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 77, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_hpus)
                .addGap(18, 18, 18)
                .addComponent(btn_keluar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIM)
                    .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NAMA)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTUGAS, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthasildua, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NTGS)
                        .addComponent(txtdua)
                        .addComponent(NAKHIR)
                        .addComponent(txtAKHIR, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NUTS)
                        .addComponent(txtTiga)
                        .addComponent(NHURUF)
                        .addComponent(txtHURUF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtUTS, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthasiltiga))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NUAS)
                    .addComponent(txtUAS, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtempat)
                    .addComponent(txthasilempat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PREDIKAT)
                    .addComponent(txtPREDIKAT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_hpus)
                    .addComponent(btn_keluar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNimActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void datamenampungnilaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datamenampungnilaiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_datamenampungnilaiMouseClicked

    private void txtTUGASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTUGASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTUGASActionPerformed

    private void txtUTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUTSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUTSActionPerformed

    private void txtUASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUASActionPerformed

    private void txthasilduaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthasilduaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthasilduaActionPerformed

    private void txthasiltigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthasiltigaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthasiltigaActionPerformed

    private void txthasilempatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthasilempatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthasilempatActionPerformed

    private void txtAKHIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAKHIRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAKHIRActionPerformed

    private void txtHURUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHURUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHURUFActionPerformed

    private void txtPREDIKATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPREDIKATActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPREDIKATActionPerformed

    private void btn_hpusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hpusActionPerformed
        // TODO add your handling code here:
        int selectedRow = datamenampungnilai.getSelectedRow();
        if (selectedRow != -1){
            tableModel.removeRow(selectedRow);
            saveTableData();
        }
    }//GEN-LAST:event_btn_hpusActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_keluarActionPerformed

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
            java.util.logging.Logger.getLogger(frm_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frm_mahasiswa().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NAKHIR;
    private javax.swing.JLabel NAMA;
    private javax.swing.JLabel NHURUF;
    private javax.swing.JLabel NIM;
    private javax.swing.JLabel NTGS;
    private javax.swing.JLabel NUAS;
    private javax.swing.JLabel NUTS;
    private javax.swing.JLabel PREDIKAT;
    private javax.swing.JButton btn_hpus;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JTable datamenampungnilai;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel judul;
    private javax.swing.JTextField txtAKHIR;
    private javax.swing.JTextField txtHURUF;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNim;
    private javax.swing.JTextField txtPREDIKAT;
    private javax.swing.JTextField txtTUGAS;
    private javax.swing.JLabel txtTiga;
    private javax.swing.JTextField txtUAS;
    private javax.swing.JTextField txtUTS;
    private javax.swing.JLabel txtdua;
    private javax.swing.JLabel txtempat;
    private javax.swing.JTextField txthasildua;
    private javax.swing.JTextField txthasilempat;
    private javax.swing.JTextField txthasiltiga;
    // End of variables declaration//GEN-END:variables
}
