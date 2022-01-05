package Forms;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Frame;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class HourlyEmployee extends javax.swing.JFrame {

    final Database.DataManager DATA_MANAGER;
    final DefaultTableModel EMPLOYEES_TABLE_MODEL;

    public HourlyEmployee() {
        initComponents();

        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon("AppIcon.png").getImage());

        EMPLOYEES_TABLE_MODEL = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        EMPLOYEES_TABLE_MODEL.addColumn("RFC");
        EMPLOYEES_TABLE_MODEL.addColumn("NOMBRE");
        EMPLOYEES_TABLE_MODEL.addColumn("DEPARTAMENTO");
        EMPLOYEES_TABLE_MODEL.addColumn("PUESTO");
        EMPLOYEES_TABLE_MODEL.addColumn("HORAS TRABAJADAS");
        EMPLOYEES_TABLE_MODEL.addColumn("PAGO POR HORA");
        tblEmployees.setModel(EMPLOYEES_TABLE_MODEL);

        DATA_MANAGER = new Database.DataManager();
        showEmployees();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        button2 = new Components.Button();
        button1 = new Components.Button();
        label1 = new Components.Label();
        jLabel1 = new javax.swing.JLabel();
        label2 = new Components.Label();
        label4 = new Components.Label();
        label5 = new Components.Label();
        label6 = new Components.Label();
        label7 = new Components.Label();
        txtHoursWorked = new Components.TextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtPosition = new Components.TextField();
        txtHourly = new Components.TextField();
        txtDepartment = new Components.TextField();
        txtName = new Components.TextField();
        txtRFC = new Components.TextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        btnDelete = new Components.Button();
        btnUpdate = new Components.Button();
        btnSave = new Components.Button();
        btnGenerateCheck = new Components.Button();
        btnClean = new Components.Button();
        btnGoBack = new Components.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployees = new Components.Table();
        label8 = new Components.Label();
        btnSearch = new Components.ToggleButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empleado por Horas");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(null);

        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnMinimize.png"))); // NOI18N
        button2.setPressedIcon(null);
        button2.setRolloverIcon(null);
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel1.add(button2);
        button2.setBounds(1140, 10, 50, 50);

        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnClose.png"))); // NOI18N
        button1.setPressedIcon(null);
        button1.setRolloverIcon(null);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1);
        button1.setBounds(1200, 10, 50, 50);

        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Empleado por Horas");
        label1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 52)); // NOI18N
        jPanel1.add(label1);
        label1.setBounds(10, 0, 1250, 70);

        jLabel1.setBackground(new java.awt.Color(255, 50, 50));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1260, 70);

        label2.setText("Pago por Hora:");
        jPanel1.add(label2);
        label2.setBounds(10, 280, 240, 40);

        label4.setText("Nombre:");
        jPanel1.add(label4);
        label4.setBounds(10, 120, 240, 40);

        label5.setText("Departamento:");
        jPanel1.add(label5);
        label5.setBounds(10, 160, 290, 40);

        label6.setText("Puesto:");
        jPanel1.add(label6);
        label6.setBounds(10, 200, 290, 38);

        label7.setText("Horas Trabajadas:");
        jPanel1.add(label7);
        label7.setBounds(10, 240, 290, 40);

        txtHoursWorked.setNextFocusableComponent(txtHourly);
        txtHoursWorked.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoursWorkedKeyTyped(evt);
            }
        });
        jPanel1.add(txtHoursWorked);
        txtHoursWorked.setBounds(300, 240, 570, 38);

        jSeparator1.setBackground(new java.awt.Color(255, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(300, 276, 570, 10);

        txtPosition.setNextFocusableComponent(txtHoursWorked);
        txtPosition.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPositionKeyTyped(evt);
            }
        });
        jPanel1.add(txtPosition);
        txtPosition.setBounds(300, 200, 570, 38);

        txtHourly.setNextFocusableComponent(btnSave);
        txtHourly.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHourlyKeyTyped(evt);
            }
        });
        jPanel1.add(txtHourly);
        txtHourly.setBounds(300, 280, 570, 38);

        txtDepartment.setNextFocusableComponent(txtPosition);
        txtDepartment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDepartmentKeyTyped(evt);
            }
        });
        jPanel1.add(txtDepartment);
        txtDepartment.setBounds(300, 160, 570, 38);

        txtName.setNextFocusableComponent(txtDepartment);
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        jPanel1.add(txtName);
        txtName.setBounds(300, 120, 570, 38);

        txtRFC.setNextFocusableComponent(txtName);
        txtRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRFCKeyTyped(evt);
            }
        });
        jPanel1.add(txtRFC);
        txtRFC.setBounds(300, 80, 570, 38);

        jSeparator2.setBackground(new java.awt.Color(255, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(300, 276, 570, 10);

        jSeparator3.setBackground(new java.awt.Color(255, 51, 51));
        jSeparator3.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(300, 316, 570, 10);

        jSeparator4.setBackground(new java.awt.Color(255, 51, 51));
        jSeparator4.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(300, 236, 570, 10);

        jSeparator5.setBackground(new java.awt.Color(255, 51, 51));
        jSeparator5.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(300, 196, 570, 10);

        jSeparator6.setBackground(new java.awt.Color(255, 51, 51));
        jSeparator6.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jSeparator6);
        jSeparator6.setBounds(300, 156, 570, 10);

        jSeparator7.setBackground(new java.awt.Color(255, 51, 51));
        jSeparator7.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jSeparator7);
        jSeparator7.setBounds(300, 116, 570, 10);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnDelete.png"))); // NOI18N
        btnDelete.setEnabled(false);
        btnDelete.setNextFocusableComponent(btnUpdate);
        btnDelete.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnDeletePressed.png"))); // NOI18N
        btnDelete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnDeleteRollover.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);
        btnDelete.setBounds(880, 140, 180, 50);

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnUpdate.png"))); // NOI18N
        btnUpdate.setEnabled(false);
        btnUpdate.setNextFocusableComponent(btnGenerateCheck);
        btnUpdate.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnUpdatePressed.png"))); // NOI18N
        btnUpdate.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnUpdateRollover.png"))); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate);
        btnUpdate.setBounds(880, 200, 180, 50);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnSave.png"))); // NOI18N
        btnSave.setNextFocusableComponent(btnSearch);
        btnSave.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnSavePressed.png"))); // NOI18N
        btnSave.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnSaveRollover.png"))); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave);
        btnSave.setBounds(880, 80, 180, 50);

        btnGenerateCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnGenerateCheck.png"))); // NOI18N
        btnGenerateCheck.setEnabled(false);
        btnGenerateCheck.setNextFocusableComponent(btnClean);
        btnGenerateCheck.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnGenerateCheckPressed.png"))); // NOI18N
        btnGenerateCheck.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnGenerateCheckRollover.png"))); // NOI18N
        btnGenerateCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateCheckActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerateCheck);
        btnGenerateCheck.setBounds(1070, 110, 180, 50);

        btnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnClean.png"))); // NOI18N
        btnClean.setNextFocusableComponent(btnGoBack);
        btnClean.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnCleanPressed.png"))); // NOI18N
        btnClean.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnCleanRollover.png"))); // NOI18N
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });
        jPanel1.add(btnClean);
        btnClean.setBounds(1070, 170, 180, 50);

        btnGoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnGoBack.png"))); // NOI18N
        btnGoBack.setNextFocusableComponent(txtRFC);
        btnGoBack.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnGoBackPressed.png"))); // NOI18N
        btnGoBack.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnGoBackRollover.png"))); // NOI18N
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnGoBack);
        btnGoBack.setBounds(1070, 230, 180, 50);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tblEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployees);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 330, 1240, 300);

        label8.setText("RFC:");
        jPanel1.add(label8);
        label8.setBounds(10, 80, 240, 40);

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnSearch.png"))); // NOI18N
        btnSearch.setText("");
        btnSearch.setNextFocusableComponent(btnClean);
        btnSearch.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnSearchPressed.png"))); // NOI18N
        btnSearch.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnSearchRollover.png"))); // NOI18N
        btnSearch.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnSearchPressed.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch);
        btnSearch.setBounds(880, 260, 180, 50);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.png"))); // NOI18N
        jPanel1.add(lblBackground);
        lblBackground.setBounds(0, 70, 1260, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCKeyTyped
        Libraries.Validations.validateRFC(txtRFC, evt);
    }//GEN-LAST:event_txtRFCKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        Libraries.Validations.validateName(txtName, evt);
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtDepartmentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDepartmentKeyTyped
        Libraries.Validations.validateDepartment(txtDepartment, evt);
    }//GEN-LAST:event_txtDepartmentKeyTyped

    private void txtPositionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPositionKeyTyped
        Libraries.Validations.validatePosition(txtPosition, evt);
    }//GEN-LAST:event_txtPositionKeyTyped

    private void txtHoursWorkedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoursWorkedKeyTyped
        Libraries.Validations.validateHoursWorked(txtHoursWorked, evt);
    }//GEN-LAST:event_txtHoursWorkedKeyTyped

    private void txtHourlyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHourlyKeyTyped
        Libraries.Validations.validateHourly(txtHourly, evt);
    }//GEN-LAST:event_txtHourlyKeyTyped

    private void tblEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeesMouseClicked

        int selectedRoxIndex = tblEmployees.getSelectedRow();

        txtRFC.setText(tblEmployees.getValueAt(selectedRoxIndex, 0).toString());
        txtName.setText(tblEmployees.getValueAt(selectedRoxIndex, 1).toString());
        txtDepartment.setText(tblEmployees.getValueAt(selectedRoxIndex, 2).toString());
        txtPosition.setText(tblEmployees.getValueAt(selectedRoxIndex, 3).toString());
        txtHoursWorked.setText(tblEmployees.getValueAt(selectedRoxIndex, 4).toString());
        txtHourly.setText(tblEmployees.getValueAt(selectedRoxIndex, 5).toString());

        disableRegister();
        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_tblEmployeesMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if (isAnyFieldEmpty()) {
            JOptionPane.showMessageDialog(rootPane,
                    "Complete todos los campos antes de guardar",
                    "Campo(s) vacío(s)",
                    2);
            return;
        }

        try {
            DATA_MANAGER.executeUpdate(String.format(""
                    + "INSERT INTO EmpleadosPorHora "
                    + "(RFC, NOMBRE, DEPARTAMENTO, PUESTO, HORAS_TRABAJADAS, PAGO_HORA)"
                    + "VALUES ('%s', '%s', '%s', '%s', '%s', '%s')",
                    txtRFC.getText(),
                    txtName.getText(),
                    txtDepartment.getText(),
                    txtPosition.getText(),
                    txtHoursWorked.getText(),
                    txtHourly.getText()));
            JOptionPane.showMessageDialog(rootPane,
                    "El empleado ha sido guardado exitosamente",
                    "Guardado exitoso",
                    1);
            showEmployees();
            clean();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane,
                    "Hubo un problema al mostrar los empleados",
                    "Error de conexión",
                    0);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        try {
            DATA_MANAGER.executeUpdate(String.format(
                    "DELETE FROM EmpleadosPorHora WHERE RFC = '%s'",
                    txtRFC.getText()));
            JOptionPane.showMessageDialog(rootPane,
                    "El empleado ha sido eliminado exitosamente",
                    "Eliminación exitosa",
                    1);
            showEmployees();
            clean();
            enableRegister();
        } catch (SQLException e) {
            throwError(e);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        if (isAnyFieldEmpty()) {
            JOptionPane.showMessageDialog(rootPane,
                    "Complete todos los campos antes de actualizar",
                    "Campo(s) vacío(s)",
                    2);
            return;
        }

        try {
            DATA_MANAGER.executeUpdate(String.format(
                    "UPDATE EmpleadosPorHora SET "
                    + "NOMBRE = '%s', "
                    + "DEPARTAMENTO = '%s', "
                    + "PUESTO = '%s', "
                    + "HORAS_TRABAJADAS = '%s', "
                    + "PAGO_HORA = '%s' "
                    + "WHERE RFC = '%s'",
                    txtName.getText(),
                    txtDepartment.getText(),
                    txtPosition.getText(),
                    txtHoursWorked.getText(),
                    txtHourly.getText(),
                    txtRFC.getText()));
            JOptionPane.showMessageDialog(rootPane,
                    "El empleado ha sido actualizado exitosamente",
                    "Actualización exitosa",
                    1);
            showEmployees();
            clean();
            enableRegister();
        } catch (SQLException e) {
            throwError(e);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        if (btnSearch.isSelected()) {
            enableSearch();
            clean();
        } else {
            disableSearch();

            if (txtRFC.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane,
                        "Complete el campo antes de buscar",
                        "Campo(s) vacío(s)",
                        2);
                return;
            }

            try {
                ResultSet searchData = DATA_MANAGER.executeQuery(String.format(
                        "SELECT * FROM EmpleadosPorHora WHERE RFC = '%s'",
                        txtRFC.getText()));

                EMPLOYEES_TABLE_MODEL.setRowCount(0);
                String[] rowData = new String[6];
                for (int i = 0; i < rowData.length; i++) {
                    rowData[i] = searchData.getString(i + 1);
                }
                EMPLOYEES_TABLE_MODEL.addRow(rowData);

                DATA_MANAGER.disconnectDatabase();
            } catch (SQLException e) {
                throwError(e);
                showEmployees();
            }
            clean();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnGenerateCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateCheckActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnedValue = fileChooser.showSaveDialog(rootPane);

        if (returnedValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String fileName = file.toString() + "\\Empleado_por_Horas_" + txtRFC.getText() + ".pdf";

            try {
                generateCheckPDF(fileName);
                JOptionPane.showMessageDialog(rootPane,
                        "El archivo fue generado en " + fileName,
                        "Cheque generado con éxito",
                        1);
            } catch (FileNotFoundException | DocumentException e) {
                JOptionPane.showMessageDialog(rootPane,
                        "Ha ocurrido un error inesperado al generar el documento",
                        "Error al generar cheque",
                        0);
            }
        }
    }//GEN-LAST:event_btnGenerateCheckActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed

        clean();
        enableRegister();
        disableSearch();
        tblEmployees.clearSelection();
        showEmployees();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed

        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed

        setState(Frame.ICONIFIED);
    }//GEN-LAST:event_button2ActionPerformed

    public void generateCheckPDF(String fileName) throws FileNotFoundException, DocumentException {

        //Document creation
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(fileName));

        //Document header attributes
        document.addAuthor("Mauricio Romero");
        document.addCreationDate();
        document.addProducer();
        document.addCreator("https://github.com/Angxlware");
        document.addTitle("Cheque " + txtRFC.getText());
        document.setPageSize(PageSize.LETTER);

        //Open document
        document.open();

        //Header
        Font fntHeader = new Font(FontFamily.TIMES_ROMAN, 14.0f, Font.ITALIC, BaseColor.BLACK);
        Paragraph pgHeader = new Paragraph("Instituto Tecnológico de Hermosillo", fntHeader);
        pgHeader.setAlignment(Element.ALIGN_LEFT);
        document.add(pgHeader);

        //Date & time
        DateTimeFormatter dateF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter timeF = DateTimeFormatter.ofPattern("HH:mm:ss");
        Paragraph pgDate = new Paragraph();
        pgDate.setAlignment(Element.ALIGN_LEFT);
        pgDate.setFont(fntHeader);
        pgDate.add(dateF.format(LocalDateTime.now()) + "\n");
        pgDate.add(timeF.format(LocalDateTime.now()) + "\n");
        document.add(pgDate);

        //Title
        Font fntTitle = new Font(FontFamily.TIMES_ROMAN, 20.0f, Font.BOLD, BaseColor.BLACK);
        Paragraph pgTitle = new Paragraph();
        pgTitle.setFont(fntTitle);
        pgTitle.add("\n\nCheque de Empleado por Horas\n\n");
        pgTitle.setAlignment(Element.ALIGN_CENTER);
        document.add(pgTitle);

        //Table
        PdfPTable table = new PdfPTable(2);
        table.addCell("\nRFC\n\n");
        table.addCell("\n" + txtRFC.getText() + "\n\n");
        table.addCell("\nNOMBRE\n\n");
        table.addCell("\n" + txtName.getText() + "\n\n");
        table.addCell("\nDEPARTAMENTO\n\n");
        table.addCell("\n" + txtDepartment.getText() + "\n\n");
        table.addCell("\nPUESTO\n\n");
        table.addCell("\n" + txtPosition.getText() + "\n\n");
        table.addCell("\nHORAS TRABAJADAS\n\n");
        table.addCell("\n" + txtHoursWorked.getText() + "\n\n");
        table.addCell("\nPAGO POR HORA\n\n");
        table.addCell("\n" + txtHourly.getText() + "\n\n");
        document.add(table);

        //Github
        Paragraph pgGithub = new Paragraph("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        pgGithub.add("https://github.com/Angxlware");
        pgGithub.setAlignment(Element.ALIGN_CENTER);
        document.add(pgGithub);

        //Close document
        document.close();
    }

    public void enableSearch() {
        txtName.setEnabled(false);
        txtDepartment.setEnabled(false);
        txtPosition.setEnabled(false);
        txtHoursWorked.setEnabled(false);
        txtHourly.setEnabled(false);
        btnSave.setEnabled(false);
    }

    public void disableSearch() {
        btnSearch.setSelected(false);
        txtName.setEnabled(true);
        txtDepartment.setEnabled(true);
        txtPosition.setEnabled(true);
        txtHoursWorked.setEnabled(true);
        txtHourly.setEnabled(true);
        btnSave.setEnabled(true);
    }

    public void enableRegister() {

        txtRFC.setEnabled(true);
        btnSave.setEnabled(true);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnSearch.setEnabled(true);
        btnGenerateCheck.setEnabled(false);
    }

    public void disableRegister() {

        txtRFC.setEnabled(false);
        btnSave.setEnabled(false);
        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnSearch.setEnabled(false);
        btnGenerateCheck.setEnabled(true);
    }

    public void clean() {
        txtRFC.setText(null);
        txtName.setText(null);
        txtDepartment.setText(null);
        txtPosition.setText(null);
        txtHoursWorked.setText(null);
        txtHourly.setText(null);
        txtRFC.requestFocus();
    }

    public boolean isAnyFieldEmpty() {
        return (txtRFC.getText().isEmpty())
                || (txtName.getText().isEmpty())
                || (txtDepartment.getText().isEmpty())
                || (txtPosition.getText().isEmpty())
                || (txtHoursWorked.getText().isEmpty())
                || (txtHourly.getText().isEmpty());
    }

    public final void showEmployees() {

        try {
            ResultSet search = DATA_MANAGER.executeQuery(
                    "SELECT * FROM EmpleadosPorHora");

            EMPLOYEES_TABLE_MODEL.setRowCount(0);
            while (search.next()) {
                String[] rowData = new String[6];
                for (int i = 0; i < rowData.length; i++) {
                    rowData[i] = search.getString(i + 1);
                }
                EMPLOYEES_TABLE_MODEL.addRow(rowData);
            }

            DATA_MANAGER.disconnectDatabase();
        } catch (SQLException e) {
            throwError(e);
        }
    }

    public void throwError(SQLException e) {

        final int SQLITE_ERROR = 1;
        final int SQLITE_BUSY = 5;
        final int SQLITE_CONSTRAINT_PRIMARYKEY = 19;
        final int RESULTSET_CLOSED = 0;

        switch (e.getErrorCode()) {
            case SQLITE_ERROR ->
                JOptionPane.showMessageDialog(rootPane,
                        "Hubo un problema al conectarse a la base de datos",
                        "Error de conexión",
                        0);
            case SQLITE_BUSY ->
                JOptionPane.showMessageDialog(rootPane,
                        "La base de datos está siendo ocupada por otro programa",
                        "Error de conexión",
                        0);
            case SQLITE_CONSTRAINT_PRIMARYKEY ->
                JOptionPane.showMessageDialog(rootPane, String.format(
                        "Ya existe un empleado con el RFC ''%s''",
                        txtRFC.getText()),
                        "Error al guardar",
                        0);
            case RESULTSET_CLOSED ->
                JOptionPane.showMessageDialog(rootPane, String.format(
                        "No existe ningún empleado con el RFC ''%s''",
                        txtRFC.getText()),
                        "Error al buscar",
                        0);
            default -> {
                JOptionPane.showMessageDialog(rootPane,
                        "Ha ocurrido un error inesperado",
                        "Error inesperado",
                        0);
                System.out.println("Message: " + e.getMessage());
                System.out.println("Code: " + e.getErrorCode());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.Button btnClean;
    private Components.Button btnDelete;
    private Components.Button btnGenerateCheck;
    private Components.Button btnGoBack;
    private Components.Button btnSave;
    private Components.ToggleButton btnSearch;
    private Components.Button btnUpdate;
    private Components.Button button1;
    private Components.Button button2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private Components.Label label1;
    private Components.Label label2;
    private Components.Label label4;
    private Components.Label label5;
    private Components.Label label6;
    private Components.Label label7;
    private Components.Label label8;
    private javax.swing.JLabel lblBackground;
    private Components.Table tblEmployees;
    private Components.TextField txtDepartment;
    private Components.TextField txtHourly;
    private Components.TextField txtHoursWorked;
    private Components.TextField txtName;
    private Components.TextField txtPosition;
    private Components.TextField txtRFC;
    // End of variables declaration//GEN-END:variables
}
