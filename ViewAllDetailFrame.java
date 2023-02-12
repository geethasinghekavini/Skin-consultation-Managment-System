package frames;

import dto.Consultation;
import dto.Patient;
import manager.SkinConsultationManager;
import manager.WestminsterSkinConsultationManager;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 * The class View all detail frame extends javax.swing. J frame
 */
public class ViewAllDetailFrame extends javax.swing.JFrame {

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbluserimg;
    private javax.swing.JTextField txtPDob;
    private javax.swing.JTextField txtPId;
    private javax.swing.JTextField txtPMobileNo;
    private javax.swing.JTextField txtPSurename;
    private javax.swing.JTextField txtPname;
    SkinConsultationManager skinConsultationManager = new WestminsterSkinConsultationManager();
    ArrayList<Consultation> consultations;
    ArrayList<Patient> patient;

    /**
     *
     * View all detail frame
     *
     * @param consultations  the consultations
     * @param patient  the patient
     * @return public
     */
    public ViewAllDetailFrame(ArrayList<Consultation> consultations, ArrayList<Patient> patient) {
        initComponents();
        this.consultations = consultations;
        this.patient = patient;
        setLocationRelativeTo(null);
        loadAllDetails(consultations);
    }

    /**
     *
     * Init components
     *
     */
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtPname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPSurename = new javax.swing.JTextField();
        txtPDob = new javax.swing.JTextField();
        txtPMobileNo = new javax.swing.JTextField();
        txtPId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbluserimg = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("X");
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, -1, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null}
                },
                new String [] {
                        "Patient ID", "Doctor name", "Cost", "Notes", "Date", "Start Time", "End Time"
                }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter(){

            /**
             *
             * Mouse clicked
             *
             * @param evt  the evt
             */
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 67, 1350, 330));

        txtPname.setFont(new java.awt.Font("Calibre", 1, 11));
        getContentPane().add(txtPname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 330, 30));

        jLabel7.setFont(new java.awt.Font("Calibre", 1, 17));
        jLabel7.setText("Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 170, 30));

        jLabel4.setFont(new java.awt.Font("Calibre", 1, 17));
        jLabel4.setText("Surname");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 200, 30));

        txtPSurename.setFont(new java.awt.Font("Calibre", 1, 11));
        getContentPane().add(txtPSurename, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 330, 30));

        txtPDob.setFont(new java.awt.Font("Calibre", 1, 11));
        getContentPane().add(txtPDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, 330, 30));

        txtPMobileNo.setFont(new java.awt.Font("Calibre", 1, 11));
        getContentPane().add(txtPMobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 610, 330, 30));

        txtPId.setFont(new java.awt.Font("Calibre", 1, 11));
        getContentPane().add(txtPId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 670, 330, 30));

        jLabel2.setFont(new java.awt.Font("Calibre", 1, 17));
        jLabel2.setText("Patient ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 200, 30));

        jLabel6.setFont(new java.awt.Font("Calibre", 1, 17));
        jLabel6.setText("Mobile No");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 200, 30));
        getContentPane().add(lbluserimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 290, 270));

        jLabel5.setFont(new java.awt.Font("Calibre", 1, 17));
        jLabel5.setText("Date of Birth");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 200, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
    }

    /**
     *
     * j button1 action performed
     *
     * @param evt  the evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        this.dispose();
    }

    /**
     *
     * j table1 mouse clicked
     *
     * @param evt  the evt
     */
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (model.getRowCount() != 0) {
            String dName = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
            for (Patient patient1 : patient) {
                if (patient1.getPatientId() == Integer.parseInt(dName)) {
                    txtPDob.setText(Integer.toString(patient1.getDateOfBirth()));
                    txtPname.setText(patient1.getName());
                    txtPSurename.setText(patient1.getSurname());
                    txtPMobileNo.setText(Integer.toString(patient1.getMobileNumber()));
                    txtPId.setText(dName);

                }
            }
            for (Consultation patient1 : consultations) {
                if (patient1.getPatientId().equals(dName)) {
                    lbluserimg.setIcon(setImage(patient1.getImage()));
                }
            }
        }
    }


    /**
     *
     * Main
     *
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
            java.util.logging.Logger.getLogger(ViewAllDetailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAllDetailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAllDetailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAllDetailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }




    /**
     *
     * Load all details
     *
     * @param consultations  the consultations
     */
    private void loadAllDetails(ArrayList<Consultation> consultations) {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (Consultation allItem : consultations) {
            Object[] data = {allItem.getPatientId(),
                    allItem.getDoctorName(),
                    allItem.getCost(),
                    allItem.getNotes(),
                    allItem.getDate(),
                    allItem.getStartTime(),
                    allItem.getEndTime()
            };
            model.addRow(data);
        }
    }


    /**
     *
     * Sets the image
     *
     * @param path  the path
     * @return ImageIcon
     */
    public ImageIcon setImage(String path) {

        ImageIcon myimage = new ImageIcon(path);
        Image image = myimage.getImage();
        Image scaledInstance = image.getScaledInstance(lbluserimg.getWidth(), lbluserimg.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imagee = new ImageIcon(scaledInstance);
        return imagee;
    }
}

