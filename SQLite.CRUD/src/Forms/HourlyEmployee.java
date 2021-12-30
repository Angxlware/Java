package Forms;

import Database.DataManager;
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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public final class HourlyEmployee extends javax.swing.JInternalFrame {

    private final DataManager DATA_MANAGER;
    private final DefaultTableModel EMPLOYEES_TABLE_MODEL;

    public HourlyEmployee() {

        initComponents();

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
        tblEmployees.getTableHeader().setReorderingAllowed(false);

        DATA_MANAGER = new DataManager();
        showEmployees();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        txtHourly = new javax.swing.JTextField();
        txtHoursWorked = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cmbPosition = new javax.swing.JComboBox<>();
        cmbDepartment = new javax.swing.JComboBox<>();
        btnClose = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnCenter = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnGenerateCheck = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();
        btnSearch = new javax.swing.JToggleButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Empleado por Horas");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Pago por Hora:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 240, 150, 30);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("RFC:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 40, 150, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 80, 150, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Departamento:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 120, 150, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Puesto:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 160, 150, 30);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Horas Trabajadas:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 200, 150, 30);

        txtRFC.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRFCKeyTyped(evt);
            }
        });
        jPanel2.add(txtRFC);
        txtRFC.setBounds(160, 40, 490, 30);

        txtHourly.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtHourly.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHourlyKeyTyped(evt);
            }
        });
        jPanel2.add(txtHourly);
        txtHourly.setBounds(160, 240, 490, 30);

        txtHoursWorked.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtHoursWorked.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoursWorkedKeyTyped(evt);
            }
        });
        jPanel2.add(txtHoursWorked);
        txtHoursWorked.setBounds(160, 200, 490, 30);

        txtName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        jPanel2.add(txtName);
        txtName.setBounds(160, 80, 490, 30);

        cmbPosition.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cmbPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un puesto", "Jefe de departamento", "Docente" }));
        jPanel2.add(cmbPosition);
        cmbPosition.setBounds(160, 160, 490, 30);

        cmbDepartment.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cmbDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un departamento", "Ingeniería en Sistemas Computacionales", "Ingeniería en Mecatrónica", "Ingeniería en Aeronáutica" }));
        jPanel2.add(cmbDepartment);
        cmbDepartment.setBounds(160, 120, 490, 30);

        btnClose.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnClose.setText("Cerrar");
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel2.add(btnClose);
        btnClose.setBounds(850, 220, 170, 50);

        btnRegister.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnRegister.setText("Registrar");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegister);
        btnRegister.setBounds(670, 40, 170, 50);

        btnDelete.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setEnabled(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete);
        btnDelete.setBounds(670, 100, 170, 50);

        btnUpdate.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnUpdate.setText("Actualizar");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.setEnabled(false);
        btnUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate);
        btnUpdate.setBounds(670, 160, 170, 50);

        btnCenter.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCenter.setText("Centrar");
        btnCenter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCenter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCenterActionPerformed(evt);
            }
        });
        jPanel2.add(btnCenter);
        btnCenter.setBounds(850, 160, 170, 50);
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(0, 280, 1030, 10);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Información del Empleado");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 0, 660, 37);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Controles");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(710, 0, 270, 40);

        btnGenerateCheck.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnGenerateCheck.setText("Generar Cheque");
        btnGenerateCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerateCheck.setEnabled(false);
        btnGenerateCheck.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGenerateCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateCheckActionPerformed(evt);
            }
        });
        jPanel2.add(btnGenerateCheck);
        btnGenerateCheck.setBounds(850, 40, 170, 50);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator4);
        jSeparator4.setBounds(660, 0, 10, 280);

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

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 290, 1010, 290);

        btnClear.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnClear.setText("Limpiar");
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear);
        btnClear.setBounds(850, 100, 170, 50);

        btnSearch.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSearch.setText("Buscar");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel2.add(btnSearch);
        btnSearch.setBounds(670, 220, 170, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        //Validation
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
                    cmbDepartment.getSelectedItem(),
                    cmbPosition.getSelectedItem(),
                    txtHoursWorked.getText(),
                    txtHourly.getText()));
            JOptionPane.showMessageDialog(rootPane,
                    "El empleado ha sido guardado exitosamente",
                    "Guardado exitoso",
                    1);
            showEmployees();
            clear();
        } catch (SQLException e) {
            throwError(e);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

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
            clear();
            enableRegister();
        } catch (SQLException e) {
            throwError(e);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        //Validation
        if (isAnyFieldEmpty()) {
            JOptionPane.showMessageDialog(rootPane,
                    "Complete todos los campos antes de actualizar",
                    "Campo(s) vacío(s)",
                    2);
            return;
        }

        try {
            DATA_MANAGER.executeUpdate(""
                    + "UPDATE EmpleadosPorHora SET "
                    + "NOMBRE = '" + txtName.getText() + "', "
                    + "DEPARTAMENTO = '" + cmbDepartment.getSelectedItem() + "', "
                    + "PUESTO = '" + cmbPosition.getSelectedItem() + "', "
                    + "HORAS_TRABAJADAS = '" + txtHoursWorked.getText() + "', "
                    + "PAGO_HORA = '" + txtHourly.getText() + "' "
                    + "WHERE RFC = '" + txtRFC.getText() + "'");
            JOptionPane.showMessageDialog(rootPane,
                    "El empleado ha sido actualizado exitosamente",
                    "Actualización exitosa",
                    1);
            showEmployees();
            clear();
            enableRegister();
        } catch (SQLException e) {
            throwError(e);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnGenerateCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateCheckActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnedValue = fileChooser.showSaveDialog(rootPane);

        if (returnedValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String fileName = file.toString() + "\\" + txtRFC.getText() + ".pdf";

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

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        clear();
        enableRegister();
        disableSearch();
        tblEmployees.clearSelection();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCenterActionPerformed

        setLocation(((Menu.dpScreen.getWidth() - this.getWidth()) / 2),
                ((Menu.dpScreen.getHeight() - this.getHeight()) / 2));
    }//GEN-LAST:event_btnCenterActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void tblEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeesMouseClicked

        int selectedRowIndex = tblEmployees.getSelectedRow();

        txtRFC.setText(tblEmployees.getValueAt(selectedRowIndex, 0).toString());
        txtName.setText(tblEmployees.getValueAt(selectedRowIndex, 1).toString());
        cmbDepartment.setSelectedItem(tblEmployees.getValueAt(selectedRowIndex, 2).toString());
        cmbPosition.setSelectedItem(tblEmployees.getValueAt(selectedRowIndex, 3).toString());
        txtHoursWorked.setText(tblEmployees.getValueAt(selectedRowIndex, 4).toString());
        txtHourly.setText(tblEmployees.getValueAt(selectedRowIndex, 5).toString());

        disableRegister();
    }//GEN-LAST:event_tblEmployeesMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        if (btnSearch.isSelected()) {
            enableSearch();
            clear();
        } else {
            disableSearch();

            //Validation
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
            clear();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCKeyTyped

        MyLibraries.Validations.validateRFC(txtRFC, evt);
    }//GEN-LAST:event_txtRFCKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped

        MyLibraries.Validations.validateName(txtName, evt);
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtHoursWorkedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoursWorkedKeyTyped

        MyLibraries.Validations.validateHoursWorked(txtHoursWorked, evt);
    }//GEN-LAST:event_txtHoursWorkedKeyTyped

    private void txtHourlyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHourlyKeyTyped

        MyLibraries.Validations.validateHourly(txtHourly, evt);
    }//GEN-LAST:event_txtHourlyKeyTyped

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        Menu.jMenuItem3.setEnabled(true);
    }//GEN-LAST:event_formInternalFrameClosed

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
        pgTitle.add("\n\nCheque del empleado " + txtRFC.getText() + "\n\n");
        pgTitle.setAlignment(Element.ALIGN_CENTER);
        document.add(pgTitle);

        //Table
        PdfPTable table = new PdfPTable(2);
        table.addCell("\nRFC\n\n");
        table.addCell("\n" + txtRFC.getText() + "\n\n");
        table.addCell("\nNOMBRE\n\n");
        table.addCell("\n" + txtName.getText() + "\n\n");
        table.addCell("\nDEPARTAMENTO\n\n");
        table.addCell("\n" + cmbDepartment.getSelectedItem().toString() + "\n\n");
        table.addCell("\nPUESTO\n\n");
        table.addCell("\n" + cmbPosition.getSelectedItem().toString() + "\n\n");
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

    public void disableSearch() {

        btnSearch.setSelected(false);
        txtName.setEnabled(true);
        cmbDepartment.setEnabled(true);
        cmbPosition.setEnabled(true);
        txtHoursWorked.setEnabled(true);
        txtHourly.setEnabled(true);
        btnRegister.setEnabled(true);
    }

    public void enableSearch() {

        txtName.setEnabled(false);
        cmbDepartment.setEnabled(false);
        cmbPosition.setEnabled(false);
        txtHoursWorked.setEnabled(false);
        txtHourly.setEnabled(false);
        btnRegister.setEnabled(false);
    }

    public void enableRegister() {

        txtRFC.setEnabled(true);
        btnRegister.setEnabled(true);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnSearch.setEnabled(true);
        btnGenerateCheck.setEnabled(false);
    }

    public void disableRegister() {

        txtRFC.setEnabled(false);
        btnRegister.setEnabled(false);
        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnSearch.setEnabled(false);
        btnGenerateCheck.setEnabled(true);
    }

    public void clear() {

        txtRFC.setText(null);
        txtName.setText(null);
        cmbDepartment.setSelectedIndex(0);
        cmbPosition.setSelectedIndex(0);
        txtHoursWorked.setText(null);
        txtHourly.setText(null);
        txtRFC.requestFocus();
    }

    public boolean isAnyFieldEmpty() {

        return (txtRFC.getText().isEmpty())
                || (txtName.getText().isEmpty())
                || (cmbDepartment.getSelectedIndex() == 0)
                || (cmbPosition.getSelectedIndex() == 0)
                || (txtHoursWorked.getText().isEmpty())
                || (txtHourly.getText().isEmpty());
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
    private javax.swing.JButton btnCenter;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGenerateCheck;
    private javax.swing.JButton btnRegister;
    private javax.swing.JToggleButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbDepartment;
    private javax.swing.JComboBox<String> cmbPosition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable tblEmployees;
    private javax.swing.JTextField txtHourly;
    private javax.swing.JTextField txtHoursWorked;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRFC;
    // End of variables declaration//GEN-END:variables
}
