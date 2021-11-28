package Formularios_CDF;

import Clases_CDF_E4.*;
import static Librerías.Validaciones.*;
import static Formularios_Menú.Menú_FRM.*;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CDF_E4_IFRM extends javax.swing.JInternalFrame 
{   
    private final DecimalFormat dcfNúmero = new DecimalFormat("###,###.##");
    public final String tema = "Control de Flujo";
    public final String numEvidencia = "Evidencia IV";
    public final String nombreProblema = "Calc. Impuestos";
    private CalcImpuestos_Interfaz CalcImpuestos;
    private final DefaultTableModel modelo;
    
    public CDF_E4_IFRM() 
    {
        initComponents();
        this.setTitle(tema + ", " + numEvidencia + ": " + nombreProblema);
        modelo = new DefaultTableModel() {
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };
        modelo.addColumn("Importe");
        modelo.addColumn("Impuesto");
        modelo.addColumn("Total");
        tblImportes.setModel(modelo);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtImporteFinal = new javax.swing.JTextField();
        txtImporteFinal.setTransferHandler(null);
        txtImpuesto = new javax.swing.JTextField();
        txtImpuesto.setTransferHandler(null);
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtImporteInicial = new javax.swing.JTextField();
        txtImporteInicial.setTransferHandler(null);
        jLabel6 = new javax.swing.JLabel();
        lblImporteFinal = new javax.swing.JLabel();
        lblImporteInicial = new javax.swing.JLabel();
        lblImpuesto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCentrar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblImportes = new javax.swing.JTable();
        lblValorX = new javax.swing.JLabel();

        setBackground(new java.awt.Color(33, 33, 33));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_Menú/Ícono_x16.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(720, 670));
        setPreferredSize(new java.awt.Dimension(720, 670));
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
                formInternalFrameDeiconified(evt);
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameIconified(evt);
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(48, 48, 48));
        jPanel1.setFocusable(false);
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tabla de Importes Aplicando Impuesto");
        jLabel1.setFocusable(false);
        jLabel1.setRequestFocusEnabled(false);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 640, 50);

        txtImporteFinal.setBackground(new java.awt.Color(63, 63, 63));
        txtImporteFinal.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtImporteFinal.setForeground(new java.awt.Color(255, 255, 255));
        txtImporteFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtImporteFinal.setBorder(null);
        txtImporteFinal.setCaretColor(new java.awt.Color(255, 255, 255));
        txtImporteFinal.setNextFocusableComponent(txtImpuesto);
        txtImporteFinal.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtImporteFinal.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtImporteFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtImporteFinalKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImporteFinalKeyTyped(evt);
            }
        });
        jPanel1.add(txtImporteFinal);
        txtImporteFinal.setBounds(240, 120, 200, 30);

        txtImpuesto.setBackground(new java.awt.Color(63, 63, 63));
        txtImpuesto.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtImpuesto.setForeground(new java.awt.Color(255, 255, 255));
        txtImpuesto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtImpuesto.setBorder(null);
        txtImpuesto.setCaretColor(new java.awt.Color(255, 255, 255));
        txtImpuesto.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtImpuesto.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtImpuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtImpuestoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImpuestoKeyTyped(evt);
            }
        });
        jPanel1.add(txtImpuesto);
        txtImpuesto.setBounds(460, 120, 200, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Impuesto (%)");
        jLabel3.setFocusable(false);
        jLabel3.setRequestFocusEnabled(false);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(460, 83, 200, 27);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Importe Inicial");
        jLabel4.setFocusable(false);
        jLabel4.setRequestFocusEnabled(false);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 80, 200, 30);

        txtImporteInicial.setBackground(new java.awt.Color(63, 63, 63));
        txtImporteInicial.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtImporteInicial.setForeground(new java.awt.Color(255, 255, 255));
        txtImporteInicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtImporteInicial.setBorder(null);
        txtImporteInicial.setCaretColor(new java.awt.Color(255, 255, 255));
        txtImporteInicial.setNextFocusableComponent(txtImporteFinal);
        txtImporteInicial.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtImporteInicial.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtImporteInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtImporteInicialKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImporteInicialKeyTyped(evt);
            }
        });
        jPanel1.add(txtImporteInicial);
        txtImporteInicial.setBounds(20, 120, 200, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Importe Final");
        jLabel6.setFocusable(false);
        jLabel6.setRequestFocusEnabled(false);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(240, 83, 200, 27);

        lblImporteFinal.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblImporteFinal.setForeground(new java.awt.Color(255, 51, 51));
        lblImporteFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImporteFinal.setFocusable(false);
        lblImporteFinal.setRequestFocusEnabled(false);
        jPanel1.add(lblImporteFinal);
        lblImporteFinal.setBounds(240, 140, 200, 30);

        lblImporteInicial.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblImporteInicial.setForeground(new java.awt.Color(255, 51, 51));
        lblImporteInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImporteInicial.setFocusable(false);
        lblImporteInicial.setRequestFocusEnabled(false);
        jPanel1.add(lblImporteInicial);
        lblImporteInicial.setBounds(20, 140, 200, 30);

        lblImpuesto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblImpuesto.setForeground(new java.awt.Color(255, 51, 51));
        lblImpuesto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImpuesto.setFocusable(false);
        lblImpuesto.setRequestFocusEnabled(false);
        jPanel1.add(lblImpuesto);
        lblImpuesto.setBounds(460, 140, 200, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 680, 170);

        jPanel2.setBackground(new java.awt.Color(48, 48, 48));
        jPanel2.setFocusable(false);
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(null);

        btnCalcular.setBackground(new java.awt.Color(230, 57, 70));
        btnCalcular.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(0, 0, 0));
        btnCalcular.setText("Calcular");
        btnCalcular.setBorder(null);
        btnCalcular.setBorderPainted(false);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        btnCalcular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCalcularKeyPressed(evt);
            }
        });
        jPanel2.add(btnCalcular);
        btnCalcular.setBounds(20, 20, 140, 50);

        btnBorrar.setBackground(new java.awt.Color(230, 57, 70));
        btnBorrar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrar.setText("Borrar");
        btnBorrar.setBorder(null);
        btnBorrar.setBorderPainted(false);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        btnBorrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBorrarKeyPressed(evt);
            }
        });
        jPanel2.add(btnBorrar);
        btnBorrar.setBounds(20, 90, 140, 50);

        btnCentrar.setBackground(new java.awt.Color(230, 57, 70));
        btnCentrar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        btnCentrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCentrar.setText("Centrar");
        btnCentrar.setBorder(null);
        btnCentrar.setBorderPainted(false);
        btnCentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentrarActionPerformed(evt);
            }
        });
        btnCentrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCentrarKeyPressed(evt);
            }
        });
        jPanel2.add(btnCentrar);
        btnCentrar.setBounds(20, 160, 140, 50);

        btnCerrar.setBackground(new java.awt.Color(230, 57, 70));
        btnCerrar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrar.setText("Cerrar");
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setNextFocusableComponent(txtImporteInicial);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        btnCerrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCerrarKeyPressed(evt);
            }
        });
        jPanel2.add(btnCerrar);
        btnCerrar.setBounds(20, 230, 140, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 210, 180, 300);

        jPanel4.setBackground(new java.awt.Color(48, 48, 48));
        jPanel4.setFocusable(false);
        jPanel4.setRequestFocusEnabled(false);
        jPanel4.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tiempo");
        jLabel7.setFocusable(false);
        jLabel7.setRequestFocusEnabled(false);
        jPanel4.add(jLabel7);
        jLabel7.setBounds(20, 20, 140, 20);

        txtTiempo.setEditable(false);
        txtTiempo.setBackground(new java.awt.Color(63, 63, 63));
        txtTiempo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtTiempo.setForeground(new java.awt.Color(255, 255, 255));
        txtTiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTiempo.setBorder(null);
        txtTiempo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTiempo.setFocusCycleRoot(true);
        txtTiempo.setNextFocusableComponent(txtImporteInicial);
        txtTiempo.setRequestFocusEnabled(false);
        txtTiempo.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtTiempo.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(txtTiempo);
        txtTiempo.setBounds(20, 50, 140, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(20, 530, 180, 100);

        jPanel3.setBackground(new java.awt.Color(48, 48, 48));
        jPanel3.setFocusable(false);
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Tabla de Importes");
        jLabel10.setFocusable(false);
        jLabel10.setRequestFocusEnabled(false);
        jPanel3.add(jLabel10);
        jLabel10.setBounds(20, 10, 440, 30);

        tblImportes.setAutoCreateRowSorter(true);
        tblImportes.setBackground(new java.awt.Color(63, 63, 63));
        tblImportes.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tblImportes.setForeground(new java.awt.Color(255, 255, 255));
        tblImportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblImportes.setFocusTraversalPolicyProvider(true);
        tblImportes.setGridColor(new java.awt.Color(63, 63, 63));
        tblImportes.setRowHeight(20);
        tblImportes.setRowSelectionAllowed(false);
        tblImportes.getTableHeader().setResizingAllowed(false);
        tblImportes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblImportes);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(20, 53, 440, 350);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(220, 210, 480, 420);

        lblValorX.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblValorX.setForeground(new java.awt.Color(255, 51, 51));
        lblValorX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorX.setFocusable(false);
        lblValorX.setRequestFocusEnabled(false);
        getContentPane().add(lblValorX);
        lblValorX.setBounds(460, 140, 200, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        objFlujoFormE4 = null;
        itmFlujoFormE4.setEnabled(true);
        itmFlujoFormE4.setText(nombreProblema);
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        Algoritmo();
        setCursor(null);
        btnBorrar.requestFocus();
    }//GEN-LAST:event_btnCalcularActionPerformed
    
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtImporteInicial.setText(null);
        txtImporteFinal.setText(null);
        txtImpuesto.setText(null);
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        txtTiempo.setText(null);
        txtImporteInicial.requestFocus();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentrarActionPerformed
        this.setLocation(((dpPantalla.getWidth() - this.getWidth()) / 2),
                ((dpPantalla.getHeight() - this.getHeight()) / 2));
    }//GEN-LAST:event_btnCentrarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();        
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtImporteInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImporteInicialKeyTyped
        ValidarEnteroPositivo(evt, txtImporteInicial, lblImporteInicial,  this);
    }//GEN-LAST:event_txtImporteInicialKeyTyped

    private void txtImporteFinalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImporteFinalKeyTyped
        ValidarEnteroPositivo(evt, txtImporteFinal, lblImporteFinal, this);
    }//GEN-LAST:event_txtImporteFinalKeyTyped

    private void txtImpuestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpuestoKeyTyped
        ValidarDecimalCualquiera(evt, txtImpuesto, lblImpuesto, this);
    }//GEN-LAST:event_txtImpuestoKeyTyped

    private void btnCalcularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCalcularKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCalcular.doClick();
        }
    }//GEN-LAST:event_btnCalcularKeyPressed

    private void btnBorrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBorrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnBorrar.doClick();
        }
    }//GEN-LAST:event_btnBorrarKeyPressed

    private void btnCentrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCentrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCentrar.doClick();
        }
    }//GEN-LAST:event_btnCentrarKeyPressed

    private void btnCerrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCerrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCerrar.doClick();
        }
    }//GEN-LAST:event_btnCerrarKeyPressed

    private void txtImporteInicialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImporteInicialKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtImporteFinal.requestFocus();
        }
    }//GEN-LAST:event_txtImporteInicialKeyPressed

    private void txtImporteFinalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImporteFinalKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtImpuesto.requestFocus();
        }
    }//GEN-LAST:event_txtImporteFinalKeyPressed

    private void txtImpuestoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImpuestoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCalcular.requestFocus();
        }
    }//GEN-LAST:event_txtImpuestoKeyPressed

    private void formInternalFrameIconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameIconified
        this.setTitle(nombreProblema);
    }//GEN-LAST:event_formInternalFrameIconified

    private void formInternalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameDeiconified
        this.setTitle(tema + ", " + numEvidencia + ": " + nombreProblema);
    }//GEN-LAST:event_formInternalFrameDeiconified

    private void Algoritmo()
    {        
        long tiempoInicio = System.nanoTime();
        int importeInicial, importeFinal;
        double impuesto;
        
        if (txtImporteInicial.getText().isEmpty() || txtImporteFinal.getText()
                .isEmpty() || txtImpuesto.getText().isEmpty()) {
            MostrarError(2, "Error: Campos vacíos", 
                    "Llene todos los campos antes de calcular", txtImporteInicial);
            return;
        }
        
        try {
            importeInicial = Integer.parseInt(txtImporteInicial.getText());
            importeFinal = Integer.parseInt(txtImporteFinal.getText());
            if (importeFinal <= importeInicial) {
                MostrarError(0, "Error: Importe final inválido", 
                    "El importe final tiene que ser mayor que el importe inicial",
                    txtImporteFinal);
                return;
            }
            impuesto = Double.parseDouble(txtImpuesto.getText());
            if (impuesto <= 0) {
                MostrarError(0, "Error: Impuesto inválido", 
                    "El impuesto tiene que ser mayor que cero",
                    txtImpuesto);
                return;
            }
        }
        catch(Exception e) {
            MostrarError(0, "Error: No se pudieron ingresar los datos", 
                    "Ha ocurrido un error inesperado", txtImpuesto);
            return;
        }
        
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String[] fila = new String[3];
        for (int importe = importeInicial; importe <= importeFinal; importe++) 
        {
            CalcImpuestos = new CalcImpuestos_Clase_Base(impuesto, importe);
            CalcImpuestos.setImpuestoDelImporte();
            CalcImpuestos.setTotal();

            fila[0] = String.valueOf(importe);
            fila[1] = dcfNúmero.format(CalcImpuestos.getImpuestoDelImporte());
            fila[2] = dcfNúmero.format(CalcImpuestos.getTotal());
            modelo.addRow(fila);
        }
        long tiempoFinal = System.nanoTime();
        txtTiempo.setText(((tiempoFinal - tiempoInicio) / 1000000) + " ms");
    }
    
    private void MostrarError(int tipo, String título, String mensaje, 
            javax.swing.JTextField txtCampo)
    {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        txtTiempo.setText(null);
        getToolkit().beep();
        JOptionPane.showMessageDialog(rootPane, mensaje, título, tipo);
        txtCampo.requestFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCentrar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImporteFinal;
    private javax.swing.JLabel lblImporteInicial;
    private javax.swing.JLabel lblImpuesto;
    private javax.swing.JLabel lblValorX;
    private javax.swing.JTable tblImportes;
    private javax.swing.JTextField txtImporteFinal;
    private javax.swing.JTextField txtImporteInicial;
    private javax.swing.JTextField txtImpuesto;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}