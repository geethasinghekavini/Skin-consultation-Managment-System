package frames;

import dto.Consultation;
import dto.Doctor;
import dto.Patient;
import manager.SkinConsultationManager;
import manager.WestminsterSkinConsultationManager;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * The class Consultation frame extends javax.swing. J frame
 */
public class ConsultationFrame extends javax.swing.JFrame {

    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lbluserimg;
    private javax.swing.JTable tblDoctor;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtEndTime;
    private javax.swing.JTextField txtNotes;
    private javax.swing.JTextField txtPDob;
    private javax.swing.JTextField txtPId;
    private javax.swing.JTextField txtPMobileNo;
    private javax.swing.JTextField txtPSurename;
    private javax.swing.JTextField txtPname;
    private javax.swing.JTextField txtStartTime;
    private javax.swing.JTextField txtimage;
    SkinConsultationManager skinConsultationManager=new WestminsterSkinConsultationManager();
    Object[][] data;
    ArrayList<Doctor> doctors;

    /**
     * Consultation frame
     *
     * @param doctors the doctors
     * @return public
     */

    public ConsultationFrame(ArrayList<Doctor> doctors) {
        initComponents();
        setLocationRelativeTo(null);
        addDoctors(doctors);
        data=new Object[doctors.size()][10];
        this.doctors=doctors;
    }

    /**
     * Init components
     */
    private void initComponents() {

        jScrollPane1=new JScrollPane();
        tblDoctor=new JTable();
        jLabel1=new JLabel();
        jLabel2=new JLabel();
        jLabel4=new JLabel();
        jLabel5=new JLabel();
        jLabel6=new JLabel();
        txtPId=new JTextField();
        txtDoctorName=new JTextField();
        txtPSurename=new JTextField();
        txtPDob=new JTextField();
        txtPMobileNo=new JTextField();
        jTextField6=new JTextField();
        jLabel7=new JLabel();
        txtPname=new JTextField();
        btnSave=new JButton();
        jLabel8=new JLabel();
        txtStartTime=new JTextField();
        jLabel9=new JLabel();
        jButton1=new JButton();
        jButton2=new JButton();
        txtEndTime=new JTextField();
        jLabel10=new JLabel();
        jLabel11=new JLabel();
        txtNotes=new JTextField();
        jLabel12=new JLabel();
        txtDate=new JTextField();
        txtCost=new JTextField();
        jLabel13=new JLabel();
        jButton3=new JButton();
        txtimage=new JTextField();
        jButton4=new JButton();
        jLabel14=new JLabel();
        lbluserimg=new JLabel();
        jLabel3=new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                },
                new String[]{"Name", "Surname", "Date of Birth", "Mobile no", "Medical No", "Specialization"}
        ));
        tblDoctor.addMouseListener(new java.awt.event.MouseAdapter() {

            /**
             *
             * Mouse clicked
             *
             * @param evt  the evt
             */
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDoctorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDoctor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 47, 1340, 210));

        jLabel1.setFont(new java.awt.Font("Calibre", 1, 18));
        jLabel1.setText("Patient ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 200, 30));

        jLabel2.setFont(new java.awt.Font("Calibre", 1, 18));
        jLabel2.setText("View Doctor Details");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 10, 270, 30));

        jLabel4.setFont(new java.awt.Font("Calibre", 1, 18));
        jLabel4.setText("Surname");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 200, 30));

        jLabel5.setFont(new java.awt.Font("Calibre", 1, 18));
        jLabel5.setText("Date of Birth");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 200, 30));

        jLabel6.setFont(new java.awt.Font("Calibre", 1, 18));
        jLabel6.setText("Mobile NO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 200, 30));

        txtPId.setFont(new java.awt.Font("Calibre", 1, 12));
        getContentPane().add(txtPId, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 330, 30));

        txtDoctorName.setFont(new java.awt.Font("Calibre", 1, 12));
        getContentPane().add(txtDoctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 330, 30));

        txtPSurename.setFont(new java.awt.Font("Calibre", 1, 12));
        getContentPane().add(txtPSurename, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 330, 30));

        txtPDob.setFont(new java.awt.Font("Calibre", 1, 12));
        getContentPane().add(txtPDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 330, 30));

        txtPMobileNo.setFont(new java.awt.Font("Calibre", 1, 12));
        getContentPane().add(txtPMobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 330, 30));

        jTextField6.setText("jTextField1");
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 330, 30));

        jLabel7.setFont(new java.awt.Font("Calibre", 1, 18));
        jLabel7.setText("Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 170, 30));

        txtPname.setFont(new java.awt.Font("Calibre", 1, 12));
        getContentPane().add(txtPname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 330, 30));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {

            /**
             *
             * Action performed
             *
             * @param evt  the evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 660, 330, 50));

        jLabel8.setFont(new java.awt.Font("Calibre", 1, 18));
        jLabel8.setText("Ending Time(Hour)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 200, 30));

        txtStartTime.setFont(new java.awt.Font("Calibre", 1, 12));
        txtStartTime.setText("8");
        getContentPane().add(txtStartTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, 330, 30));

        jLabel9.setFont(new java.awt.Font("Calibre", 1, 18));
        jLabel9.setText("Selected Doctors");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 200, 30));

        jButton1.setText("Sort Ascending");
        jButton1.addActionListener(new java.awt.event.ActionListener() {

            /**
             *
             * Action performed
             *
             * @param evt  the evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, 230, 30));

        jButton2.setText("Sort Descending");
        jButton2.addActionListener(new java.awt.event.ActionListener() {

            /**
             *
             * Action performed
             *
             * @param evt  the evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 230, 30));

        txtEndTime.setFont(new java.awt.Font("Calibre", 1, 12));
        txtEndTime.setText("9");
        txtEndTime.addKeyListener(new java.awt.event.KeyAdapter() {

            /**
             *
             * Key released
             *
             * @param evt  the evt
             */
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEndTimeKeyReleased(evt);
            }
        });
        getContentPane().add(txtEndTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 370, 330, 30));

        jLabel10.setFont(new java.awt.Font("Calibre", 1, 18));
        jLabel10.setText("Starting Time(Hour)");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 200, 30));

        jLabel11.setFont(new java.awt.Font("Calibre", 1, 18));
        jLabel11.setText("Image");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 200, 20));

        txtNotes.setFont(new java.awt.Font("Calibre", 1, 12));
        getContentPane().add(txtNotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 420, 330, 30));

        jLabel12.setFont(new java.awt.Font("Calibre", 1, 18));
        jLabel12.setText("Date(DD/MM/YYYY)");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 200, 30));

        txtDate.setFont(new java.awt.Font("Calibre", 1, 12));
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 330, 30));

        txtCost.setFont(new java.awt.Font("Calibre", 1, 12));
        getContentPane().add(txtCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 470, 330, 30));

        jLabel13.setFont(new java.awt.Font("Calibre", 1, 18));
        jLabel13.setText("Notes");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 200, 30));

        jButton3.setText("View Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {

            /**
             *
             * Action performed
             *
             * @param evt  the evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1203, 270, 140, -1));

        txtimage.setEnabled(false);
        getContentPane().add(txtimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, 330, 20));

        jButton4.setText("Select file");
        jButton4.addActionListener(new java.awt.event.ActionListener() {

            /**
             *
             * Action performed
             *
             * @param evt  the evt
             */
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 120, 20));

        jLabel14.setFont(new java.awt.Font("Calibre", 1, 18));
        jLabel14.setText("Cost");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, 200, 30));
        getContentPane().add(lbluserimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 400, 160, 140));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));
        pack();
    }


    /**
     * Tbl doctor mouse clicked
     *
     * @param evt the evt
     */
    private void tblDoctorMouseClicked(java.awt.event.MouseEvent evt) {

        DefaultTableModel model=(DefaultTableModel) tblDoctor.getModel();
        if (model.getRowCount() != 0) {
            String dName=model.getValueAt(tblDoctor.getSelectedRow(), 0).toString();
            txtDoctorName.setText(dName);
        }
    }


    /**
     * Btn save action performed
     *
     * @param evt the evt
     */
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
        save();
    }

    /**
     * j button1 action performed
     * sort descending button
     *
     * @param evt the evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        TableRowSorter<TableModel> sorter=new TableRowSorter<TableModel>(tblDoctor.getModel());
        tblDoctor.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys=new ArrayList<>(25);
        sortKeys.add(new RowSorter.SortKey(4, SortOrder.DESCENDING));
        sortKeys.add(new RowSorter.SortKey(0, SortOrder.DESCENDING));
        sorter.setSortKeys(sortKeys);
    }

    /**
     * j button2 action performed
     * sort ascending button
     *
     * @param evt the evt
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        TableRowSorter<TableModel> sorter=new TableRowSorter<TableModel>(tblDoctor.getModel());
        tblDoctor.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys=new ArrayList<>(25);
        sortKeys.add(new RowSorter.SortKey(4, SortOrder.ASCENDING));
        sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
    }

    /**
     * Txt end time key released
     * calculate and set the cost
     *
     * @param evt the evt
     */
    private void txtEndTimeKeyReleased(java.awt.event.KeyEvent evt) {
        if (!txtStartTime.getText().equals("") && !txtEndTime.getText().equals("")) {
            int end=Integer.parseInt(txtStartTime.getText());
            int start=Integer.parseInt(txtEndTime.getText());
            if (!txtEndTime.getText().equals("")) {
                if (start - end == 1) {
                    txtCost.setText("15");
                } else if (start - end == 2) {
                    txtCost.setText(Integer.toString(15 + 25));
                } else if (start - end == 3) {
                    txtCost.setText(Integer.toString(15 + 25 + 25));
                } else if (start - end == 4) {
                    txtCost.setText(Integer.toString(15 + 25 + 25 + 25));
                } else if (start - end == 5) {
                    txtCost.setText(Integer.toString(15 + 25 + 25 + 25 + 25));
                }
            }
        }
    }


    /**
     * j button3 action performed
     * view consultations button
     *
     * @param evt the evt
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        ViewAllDetailFrame allDetailFrame=new ViewAllDetailFrame(skinConsultationManager.getConsultation(), skinConsultationManager.getPatient());
        allDetailFrame.setVisible(true);
    }

    /**
     * j button4 action performed
     * Upload image
     *
     * @param evt the evt
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {

        JFileChooser jfc=new JFileChooser(FileSystemView.getFileSystemView());
        jfc.setCurrentDirectory(new File(System.getProperty("user.home")));
        jfc.setDialogTitle("Select image");
        jfc.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter=new FileNameExtensionFilter("*.Images", "jpg", "png");
        jfc.addChoosableFileFilter(filter);

        int returnValue=jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            System.out.println(jfc.getSelectedFile().getAbsolutePath());
            txtimage.setText(jfc.getSelectedFile().getAbsolutePath());
            lbluserimg.setIcon(setImage(txtimage.getText()));
        }
    }

    /**
     * Main
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }


    /**
     * Add doctors
     *
     * @param doctors the doctors
     */
    private void addDoctors(List<Doctor> doctors) {

        DefaultTableModel model=(DefaultTableModel) tblDoctor.getModel();
        model.setRowCount(0);
        for (Doctor allItem : doctors) {
            Object[] data={allItem.getName(),
                    allItem.getSurname(),
                    allItem.getDateOfBirth(),
                    allItem.getMobileNumber(),
                    allItem.getMedicalLicenseNumber(),
                    allItem.getSpecialization()
            };
            model.addRow(data);
        }
    }

    /**
     * Sets the image
     *
     * @param path the path
     * @return ImageIcon
     */
    public ImageIcon setImage(String path) {
        ImageIcon myimage=new ImageIcon(path);
        Image image=myimage.getImage();
        Image scaledInstance=image.getScaledInstance(lbluserimg.getWidth(), lbluserimg.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imagee=new ImageIcon(scaledInstance);
        return imagee;
    }

    /**
     * Save
     */
    private void save() {
        try {
            boolean doctortstatus=false;

            String dName=txtDoctorName.getText();
            String date=txtDate.getText();
            String startTime=txtStartTime.getText();
            String endTime=txtEndTime.getText();
            String patientName=txtPname.getText();
            String sureName=txtPSurename.getText();
            int dob=Integer.parseInt(txtPDob.getText());
            int mobileNo=Integer.parseInt(txtPMobileNo.getText());
            int patiendId=Integer.parseInt(txtPId.getText());
            String notes=txtNotes.getText();

            double cost=0;
            cost=Double.parseDouble(txtCost.getText());
            ArrayList<Consultation> consultations=skinConsultationManager.getConsultation();
            for (Consultation consultation1 : consultations) {
                if (consultation1.getDoctorName().equals(dName)
                        && startTime.equals(consultation1.getStartTime())) {
                    doctortstatus=true;
                }
            }
            if (!doctortstatus) {
                //save patient details in patient arrylist

                Patient patient=new Patient(patientName, sureName, dob, mobileNo, patiendId);
                skinConsultationManager.addPatient(patient);

                //save patient and doctor relation in consultation arrylist
                //dto.Consultation consultation= new dto.Consultation(date, time, ABORT, dob)
                Consultation consultation=new Consultation();
                consultation.setDoctorName(dName);
                consultation.setPatientId(Integer.toString(patiendId));
                consultation.setDate(date);
                consultation.setStartTime(startTime);
                consultation.setEndTime(endTime);
                consultation.setNotes(notes);
                consultation.setCost(cost);
                consultation.setImage(txtimage.getText());
                skinConsultationManager.addConsultation(consultation);

                JOptionPane.showMessageDialog(this, "Saved dto.Patient details and consultation details");

                ArrayList<Consultation> consultation1=skinConsultationManager.getConsultation();
                for (Consultation consultation2 : consultation1) {
                    System.out.println(" " + consultation2.getDoctorName() + " "
                            + consultation2.getDate() + " "
                            + consultation2.getEndTime() + " "
                            + consultation2.getNotes() + " "
                            + consultation2.getPatientId() + " "
                            + consultation2.getStartTime() + " "
                    );
                }

            } else {
                //assign random doctor
                Patient patient=new Patient(patientName, sureName, dob, mobileNo, patiendId);
                skinConsultationManager.addPatient(patient);

                JOptionPane.showMessageDialog(this, "Doctor is not available for this date and time.. "
                        + "Another doctor will assign to this patient automatically");

                 for (Doctor consultation : doctors) {
                    if (!consultation.getName().equals(dName)) {
                        dName=consultation.getName();
                        Consultation consultation1=new Consultation();
                        consultation1.setDoctorName(dName);
                        consultation1.setPatientId(Integer.toString(patiendId));
                        consultation1.setDate(date);
                        consultation1.setStartTime(startTime);
                        consultation1.setEndTime(endTime);
                        consultation1.setNotes(notes);
                        consultation1.setCost(cost);
                        consultation1.setImage(txtimage.getText());
                        skinConsultationManager.addConsultation(consultation1);
                        JOptionPane.showMessageDialog(this, "Patient id" + txtPname.getText() + " assign to " +dName );
                        break;
                    }
                }
            }

            reset();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Failed");
        }
    }


    /**
     * Reset
     */
    private void reset() {

        txtDoctorName.setText("");
        txtPname.setText("");
        txtPSurename.setText("");
        txtPDob.setText("");
        txtPMobileNo.setText("");
        txtPId.setText("");
        txtDate.setText("");
        txtStartTime.setText("");
        txtEndTime.setText("");
        txtNotes.setText("");
        txtCost.setText("");
        lbluserimg.setIcon(null);
    }
}
