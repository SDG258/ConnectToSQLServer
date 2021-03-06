/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Song Du
 */
public class StudentFrame extends javax.swing.JFrame {
    
    DefaultTableModel tableModel;
    
    List<Students> studentList = new ArrayList<>();
    List<String> tmp = new LinkedList<>();
    
    /**
     * Creates new form StudentFrame
     * @throws java.sql.SQLException
     */
    public StudentFrame() throws SQLException {
        initComponents();
        
        tableModel = (DefaultTableModel) tblStudents.getModel();
        
        ShowStudent();
    }
    
    public void ShowStudentInTableModels(List<Students> studentList) {
        tableModel.setRowCount(0);
        studentList.forEach((Students) -> {
            tableModel.addRow(new Object[] {Students.getID(), 
                Students.getName(),
                Students.getScores(),
                Students.getPicture(),
                Students.getAddress(),
                Students.getNote()});
        });
    }

    private void ShowStudent() throws SQLException {
        studentList = StudensModify.FindAll();
        ShowStudentInTableModels(studentList);
    }
    
    private void ShowStudentSortByIDAscending() throws SQLException {
        studentList = StudensModify.SortByIDAscending();
        tableModel.setRowCount(0);
        studentList.forEach((Students) -> {
            tableModel.addRow(new Object[] {Students.getID(), 
                Students.getName(),
                Students.getScores(),
                Students.getPicture(),
                Students.getAddress(),
                Students.getNote()});
        });
    }
    
    private void ShowStudentSortByIDDecrease() throws SQLException {
        studentList = StudensModify.SortByIDDecrease();
        tableModel.setRowCount(0);
        
        studentList.forEach((Students) -> {
            tableModel.addRow(new Object[] {Students.getID(), 
                Students.getName(),
                Students.getScores(),
                Students.getPicture(),
                Students.getAddress(),
                Students.getNote()});
        });
    }
    
    private void ShowStudentSortByScoresAscending() throws SQLException {
        studentList = StudensModify.SortByScoresAscending();
        tableModel.setRowCount(0);
        studentList.forEach((Students) -> {
            tableModel.addRow(new Object[] {Students.getID(), 
                Students.getName(),
                Students.getScores(),
                Students.getPicture(),
                Students.getAddress(),
                Students.getNote()});
        });
    }
    
    private void ShowStudentSortByScoresDecrease() throws SQLException {
        studentList = StudensModify.SortByScoresDecrease();
        tableModel.setRowCount(0);
        
        studentList.forEach((Students) -> {
            tableModel.addRow(new Object[] {Students.getID(), 
                Students.getName(),
                Students.getScores(),
                Students.getPicture(),
                Students.getAddress(),
                Students.getNote()});
        });
    }
    
    private void Reset() {
        txtID.setText("");
        txtName.setText("");
        txtScores.setText("");
        txtAddress.setText("");
        TextAreaNote.setText("");
        btnBrowse.setText("");
        cbSort.setSelectedIndex(0);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaNote = new javax.swing.JTextArea();
        txtID = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtScores = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        cbSort = new javax.swing.JComboBox<>();
        btnExport = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        FileChooseLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Infor Student"));

        jLabel1.setText("ID: ");

        jLabel2.setText("Name:");

        jLabel3.setText("Scores:");

        jLabel4.setText("Picture:");

        jLabel5.setText("Address: ");

        jLabel6.setText("Note:");

        TextAreaNote.setColumns(20);
        TextAreaNote.setRows(5);
        jScrollPane1.setViewportView(TextAreaNote);

        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        cbSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Ascending", "ID Decrease", "Scores Ascending", "Scores Decrease" }));
        cbSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSortActionPerformed(evt);
            }
        });

        btnExport.setText("Export");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        btnImport.setText("Import");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        FileChooseLabel.setText("File Choose");
        FileChooseLabel.setName("FileChooseLabel"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtScores, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                            .addComponent(txtName)
                            .addComponent(txtID))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                            .addComponent(txtAddress)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBrowse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FileChooseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbSort, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBrowse)
                        .addComponent(FileChooseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(txtScores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSort, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Scores", "Picture", "Address", "Note"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblStudents);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        int ID = Integer.parseInt(txtID.getText());
        String Name = txtName.getText();
        float Scores = Float.parseFloat(txtScores.getText());
        String Picture = FileChooseLabel.getText();
        String Address = txtAddress.getText();
        String Note = TextAreaNote.getText();
        
        Students students = new Students(ID, Name, Scores, Picture, Address, Note);
        
        try {
            StudensModify.Add(students);
            Reset();
        } catch (SQLException ex) {
            Logger.getLogger(StudentFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ShowStudent();
            } catch (SQLException ex) {
                Logger.getLogger(StudentFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectIndex = tblStudents.getSelectedRow();
        if(selectIndex >= 0) {
            Students students = studentList.get(selectIndex);
            
            int option = JOptionPane.showConfirmDialog(this, "Do you want delete it!!!");
            if(option == 0) {
                try {
                    StudensModify.Delete(students.getID());
                    
                    ShowStudent();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int ID = Integer.parseInt(txtID.getText());
        String Name = txtName.getText();
        float Scores = Float.parseFloat(txtScores.getText());
        String Picture = FileChooseLabel.getText();
        String Address = txtAddress.getText();
        String Note = TextAreaNote.getText();
        
        Students students = new Students(ID, Name, Scores, Picture, Address, Note);
        
        int option = JOptionPane.showConfirmDialog(this, "Do you want update it!!!");
        if(option == 0) {
            try {
                StudensModify.Update(students);
                ShowStudent();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentsMouseClicked
        int selectIndex = tblStudents.getSelectedRow();
        if(selectIndex >= 0) {
            Students students = studentList.get(selectIndex);
            txtID.setText(Integer.toString(students.ID));   
            txtName.setText(students.Name);
            txtScores.setText(Float.toString(students.Scores));
            FileChooseLabel.setText(students.Picture);
            txtAddress.setText(students.Address);
            TextAreaNote.setText(students.Note);
        }
    }//GEN-LAST:event_tblStudentsMouseClicked

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter img = new FileNameExtensionFilter("picture", "jpg", "png");
        fileChooser.setFileFilter(img);
        fileChooser.setMultiSelectionEnabled(false);
        
        int x = fileChooser.showDialog(this, "Select");
        if( x == JFileChooser.APPROVE_OPTION) {
            File f = fileChooser.getSelectedFile();
            FileChooseLabel.setText(f.getAbsolutePath());
        }
        
        
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void cbSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSortActionPerformed
        // TODO add your handling code here:
        int Select = cbSort.getSelectedIndex();
        if(Select == 0) {
            try {
                ShowStudentSortByIDAscending();
            } catch (SQLException ex) {
                Logger.getLogger(StudentFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ( Select == 1) {
            try {
                ShowStudentSortByIDDecrease();
            } catch (SQLException ex) {
                Logger.getLogger(StudentFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if ( Select == 2) {
            try {
                ShowStudentSortByScoresAscending();
            } catch (SQLException ex) {
                Logger.getLogger(StudentFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                ShowStudentSortByScoresDecrease();
            } catch (SQLException ex) {
                Logger.getLogger(StudentFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_cbSortActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file save");
        int userSelection = fileChooser.showSaveDialog(this);
        if(userSelection == JFileChooser.APPROVE_OPTION){
            File fileToSave = fileChooser.getSelectedFile();
            try {
                FileWriter fw = new FileWriter(fileToSave + ".csv");
                BufferedWriter bw = new BufferedWriter(fw);
                    for(int i = 0; i < tblStudents.getRowCount(); i++) {
                        for(int j = 0; j < tblStudents.getColumnCount(); j++) {
                            bw.write(tblStudents.getValueAt(i, j).toString()+",");
                        }
                    bw.newLine();//record per line 
                }
                JOptionPane.showMessageDialog(this, "SUCCESSFULLY LOADED","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
                bw.close();
                fw.close();
            } catch (IOException ex) {
               JOptionPane.showMessageDialog(this, "ERROR","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
            }
            
            
        }
    }//GEN-LAST:event_btnExportActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file you want import");
        int userSelection = fileChooser.showSaveDialog(this);
        if(userSelection == JFileChooser.APPROVE_OPTION){
            File fileToChoose = fileChooser.getSelectedFile();
            BufferedReader reader = null;
            String line = "";
            try {
                reader = new BufferedReader(new FileReader(fileToChoose));
                while((line = reader.readLine()) != null) {
                    String[] row = line.split(",");
                    Students students = new Students(
                        Integer.parseInt(row[0]),
                        row[1],
                        Float.parseFloat(row[2]),
                        row[4],
                        row[3],
                        row[5]);
                    studentList.add(students);
                }
                ShowStudentInTableModels(studentList);
            }
            catch(IOException e) {
            }
            finally {
                try {
                    reader.close();
                } catch (IOException e) {
                }
            }
        }
    }//GEN-LAST:event_btnImportActionPerformed

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
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new StudentFrame().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(StudentFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FileChooseLabel;
    private javax.swing.JTextArea TextAreaNote;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtScores;
    // End of variables declaration//GEN-END:variables
}
