package Formularios_CDF;

import Clases_CDF_E3.*;
import static Librerías.Validaciones.ValidarDecimalCualquiera;
import static Formularios_Menú.Menú_FRM.*;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CDF_E3_IFRM extends javax.swing.JInternalFrame 
{   
    private final DecimalFormat dcfNúmero = new DecimalFormat("###,###.##");
    public final String tema = "Control de Flujo";
    public final String numEvidencia = "Evidencia III";
    public final String nombreProblema = "Ordenar ABC";
    private OrdenarABC_Interfaz objOrdenarABC;
    
    public CDF_E3_IFRM() 
    {
        initComponents();
        this.setTitle(tema + ", " + numEvidencia + ": " + nombreProblema);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumB = new javax.swing.JTextField();
        txtNumB.setTransferHandler(null);
        txtNumC = new javax.swing.JTextField();
        txtNumC.setTransferHandler(null);
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumA = new javax.swing.JTextField();
        txtNumA.setTransferHandler(null);
        jLabel6 = new javax.swing.JLabel();
        lblNumA = new javax.swing.JLabel();
        lblNumB = new javax.swing.JLabel();
        lblNumC = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCentrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtNum3 = new javax.swing.JTextField();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(33, 33, 33));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_Menú/Ícono_x16.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(720, 460));
        setPreferredSize(new java.awt.Dimension(720, 460));
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
        jLabel1.setText("Ordenación Ascendente de Números");
        jLabel1.setFocusable(false);
        jLabel1.setRequestFocusEnabled(false);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 640, 50);

        txtNumB.setBackground(new java.awt.Color(63, 63, 63));
        txtNumB.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtNumB.setForeground(new java.awt.Color(255, 255, 255));
        txtNumB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumB.setBorder(null);
        txtNumB.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNumB.setNextFocusableComponent(txtNumC);
        txtNumB.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtNumB.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtNumB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumBKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumBKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumB);
        txtNumB.setBounds(240, 120, 200, 30);

        txtNumC.setBackground(new java.awt.Color(63, 63, 63));
        txtNumC.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtNumC.setForeground(new java.awt.Color(255, 255, 255));
        txtNumC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumC.setBorder(null);
        txtNumC.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNumC.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtNumC.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtNumC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumCKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumCKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumC);
        txtNumC.setBounds(460, 120, 200, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Número C");
        jLabel3.setFocusable(false);
        jLabel3.setRequestFocusEnabled(false);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(460, 90, 200, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Número A");
        jLabel4.setFocusable(false);
        jLabel4.setRequestFocusEnabled(false);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 90, 200, 20);

        txtNumA.setBackground(new java.awt.Color(63, 63, 63));
        txtNumA.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtNumA.setForeground(new java.awt.Color(255, 255, 255));
        txtNumA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumA.setBorder(null);
        txtNumA.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNumA.setNextFocusableComponent(txtNumB);
        txtNumA.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtNumA.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtNumA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumAKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumAKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumA);
        txtNumA.setBounds(20, 120, 200, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Número B");
        jLabel6.setFocusable(false);
        jLabel6.setRequestFocusEnabled(false);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(240, 90, 200, 20);

        lblNumA.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblNumA.setForeground(new java.awt.Color(255, 51, 51));
        lblNumA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumA.setFocusable(false);
        lblNumA.setRequestFocusEnabled(false);
        jPanel1.add(lblNumA);
        lblNumA.setBounds(20, 140, 200, 30);

        lblNumB.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblNumB.setForeground(new java.awt.Color(255, 51, 51));
        lblNumB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumB.setFocusable(false);
        lblNumB.setRequestFocusEnabled(false);
        jPanel1.add(lblNumB);
        lblNumB.setBounds(240, 140, 200, 30);

        lblNumC.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblNumC.setForeground(new java.awt.Color(255, 51, 51));
        lblNumC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumC.setFocusable(false);
        lblNumC.setRequestFocusEnabled(false);
        jPanel1.add(lblNumC);
        lblNumC.setBounds(460, 140, 200, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 680, 170);

        jPanel2.setBackground(new java.awt.Color(48, 48, 48));
        jPanel2.setFocusable(false);
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(null);

        btnCerrar.setBackground(new java.awt.Color(230, 57, 70));
        btnCerrar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrar.setText("Cerrar");
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setNextFocusableComponent(txtNumA);
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
        btnCerrar.setBounds(520, 20, 140, 50);

        btnOrdenar.setBackground(new java.awt.Color(230, 57, 70));
        btnOrdenar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        btnOrdenar.setForeground(new java.awt.Color(0, 0, 0));
        btnOrdenar.setText("Ordenar");
        btnOrdenar.setBorder(null);
        btnOrdenar.setBorderPainted(false);
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        btnOrdenar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnOrdenarKeyPressed(evt);
            }
        });
        jPanel2.add(btnOrdenar);
        btnOrdenar.setBounds(20, 20, 140, 50);

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
        btnBorrar.setBounds(180, 20, 150, 50);

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
        btnCentrar.setBounds(350, 20, 150, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 210, 680, 90);

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
        jLabel7.setBounds(20, 20, 70, 20);

        txtTiempo.setEditable(false);
        txtTiempo.setBackground(new java.awt.Color(63, 63, 63));
        txtTiempo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtTiempo.setForeground(new java.awt.Color(255, 255, 255));
        txtTiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTiempo.setBorder(null);
        txtTiempo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTiempo.setFocusCycleRoot(true);
        txtTiempo.setNextFocusableComponent(txtNumA);
        txtTiempo.setRequestFocusEnabled(false);
        txtTiempo.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtTiempo.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(txtTiempo);
        txtTiempo.setBounds(20, 50, 70, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(590, 320, 110, 100);

        jPanel3.setBackground(new java.awt.Color(48, 48, 48));
        jPanel3.setFocusable(false);
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(null);

        txtNum3.setEditable(false);
        txtNum3.setBackground(new java.awt.Color(63, 63, 63));
        txtNum3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtNum3.setForeground(new java.awt.Color(255, 255, 255));
        txtNum3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum3.setBorder(null);
        txtNum3.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNum3.setFocusCycleRoot(true);
        txtNum3.setNextFocusableComponent(txtNumA);
        txtNum3.setRequestFocusEnabled(false);
        txtNum3.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtNum3.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(txtNum3);
        txtNum3.setBounds(370, 50, 160, 30);

        txtNum1.setEditable(false);
        txtNum1.setBackground(new java.awt.Color(63, 63, 63));
        txtNum1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtNum1.setForeground(new java.awt.Color(255, 255, 255));
        txtNum1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum1.setBorder(null);
        txtNum1.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNum1.setFocusCycleRoot(true);
        txtNum1.setNextFocusableComponent(txtNumA);
        txtNum1.setRequestFocusEnabled(false);
        txtNum1.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtNum1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(txtNum1);
        txtNum1.setBounds(20, 50, 160, 30);

        txtNum2.setEditable(false);
        txtNum2.setBackground(new java.awt.Color(63, 63, 63));
        txtNum2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtNum2.setForeground(new java.awt.Color(255, 255, 255));
        txtNum2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum2.setBorder(null);
        txtNum2.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNum2.setFocusCycleRoot(true);
        txtNum2.setNextFocusableComponent(txtNumA);
        txtNum2.setRequestFocusEnabled(false);
        txtNum2.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtNum2.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(txtNum2);
        txtNum2.setBounds(200, 50, 150, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("-                Números ordenados                +");
        jLabel10.setFocusable(false);
        jLabel10.setRequestFocusEnabled(false);
        jPanel3.add(jLabel10);
        jLabel10.setBounds(20, 10, 510, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 320, 550, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        objFlujoFormE3 = null;
        itmFlujoFormE3.setEnabled(true);
        itmFlujoFormE3.setText(nombreProblema);
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        Algoritmo();
        setCursor(null);
        btnBorrar.requestFocus();
    }//GEN-LAST:event_btnOrdenarActionPerformed
    
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtNumA.setText(null);
        txtNumB.setText(null);
        txtNumC.setText(null);
        txtNum1.setText(null);
        txtNum2.setText(null);
        txtNum3.setText(null);
        txtTiempo.setText(null);
        txtNumA.requestFocus();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentrarActionPerformed
        this.setLocation(((dpPantalla.getWidth() - this.getWidth()) / 2),
                ((dpPantalla.getHeight() - this.getHeight()) / 2));
    }//GEN-LAST:event_btnCentrarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();        
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtNumAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumAKeyTyped
        ValidarDecimalCualquiera(evt, txtNumA, lblNumA, this);
    }//GEN-LAST:event_txtNumAKeyTyped

    private void txtNumBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumBKeyTyped
        ValidarDecimalCualquiera(evt, txtNumB, lblNumB, this);
    }//GEN-LAST:event_txtNumBKeyTyped

    private void txtNumCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumCKeyTyped
        ValidarDecimalCualquiera(evt, txtNumC, lblNumC, this);
    }//GEN-LAST:event_txtNumCKeyTyped

    private void btnOrdenarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnOrdenarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnOrdenar.doClick();
        }
    }//GEN-LAST:event_btnOrdenarKeyPressed

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

    private void txtNumAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumAKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNumB.requestFocus();
        }
    }//GEN-LAST:event_txtNumAKeyPressed

    private void txtNumBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumBKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNumC.requestFocus();
        }
    }//GEN-LAST:event_txtNumBKeyPressed

    private void txtNumCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumCKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnOrdenar.requestFocus();
        }
    }//GEN-LAST:event_txtNumCKeyPressed

    private void formInternalFrameIconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameIconified
        this.setTitle(nombreProblema);
    }//GEN-LAST:event_formInternalFrameIconified

    private void formInternalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameDeiconified
        this.setTitle(tema + ", " + numEvidencia + ": " + nombreProblema);
    }//GEN-LAST:event_formInternalFrameDeiconified

    private void Algoritmo()
    {        
        long tiempoInicio = System.nanoTime();
        double numA, numB, numC;
        
        if ((txtNumA.getText().isEmpty()) || (txtNumB.getText().isEmpty())
                || (txtNumC.getText().isEmpty())) {
            MostrarError(2, "Error: Campos vacíos", 
                    "Llene todos los campos antes de calcular", txtNumA);
            return;
        }
        
        try {
            numA = Double.parseDouble(txtNumA.getText());
            numB = Double.parseDouble(txtNumB.getText());
            numC = Double.parseDouble(txtNumC.getText());
        }
        catch(Exception e) {
            MostrarError(0, "Error: No se pudieron ingresar los datos", 
                    "Ha ocurrido un error inesperado", txtNumA);
            return;
        }
 
        objOrdenarABC = new OrdenarABC_Clase_Base(numA, numB, numC);
        objOrdenarABC.OrdenarNúmeros();
        
        txtNum1.setText(String.valueOf(dcfNúmero.format(objOrdenarABC.getNum1())));
        txtNum2.setText(String.valueOf(dcfNúmero.format(objOrdenarABC.getNum2())));
        txtNum3.setText(String.valueOf(dcfNúmero.format(objOrdenarABC.getNum3())));
        long tiempoFinal = System.nanoTime();
        txtTiempo.setText(((tiempoFinal - tiempoInicio) / 1000000) + " ms");
    }
    
    private void MostrarError(int tipo, String título, String mensaje, 
            javax.swing.JTextField txtCampo)
    {
        txtNum1.setText(null);
        txtNum2.setText(null);
        txtNum3.setText(null);
        txtTiempo.setText(null);
        getToolkit().beep();
        JOptionPane.showMessageDialog(rootPane, mensaje, título, tipo);
        txtCampo.requestFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCentrar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnOrdenar;
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
    private javax.swing.JLabel lblNumA;
    private javax.swing.JLabel lblNumB;
    private javax.swing.JLabel lblNumC;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtNum3;
    private javax.swing.JTextField txtNumA;
    private javax.swing.JTextField txtNumB;
    private javax.swing.JTextField txtNumC;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}