package Formularios_CDF;

import Clases_CDF_E5.*;
import static Librerías.Validaciones.ValidarDecimalCualquiera;
import static Formularios_Menú.Menú_FRM.*;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CDF_E5_IFRM extends javax.swing.JInternalFrame 
{   
    private final DecimalFormat dcfNúmero = new DecimalFormat("###,###.##");
    public final String tema = "Control de Flujo";
    public final String numEvidencia = "Evidencia V";
    public final String nombreProblema = "Evaluar Lista";
    private EvaluarLista_Interfaz objEvaluarLista;
    
    public CDF_E5_IFRM() 
    {
        initComponents();
        this.setTitle(tema + ", " + numEvidencia + ": " + nombreProblema);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtContador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumIngresado = new javax.swing.JTextField();
        txtNumIngresado.setTransferHandler(null);
        lblNumDatos = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnEvaluar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCentrar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtNumMayor = new javax.swing.JTextField();
        txtRango = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNumMenor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtSumatoria = new javax.swing.JTextField();
        txtPromedio = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();

        setBackground(new java.awt.Color(33, 33, 33));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_Menú/Ícono_x16.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(720, 520));
        setPreferredSize(new java.awt.Dimension(720, 520));
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
        jLabel1.setText("Evaluación de Una Lista de Números");
        jLabel1.setFocusable(false);
        jLabel1.setRequestFocusEnabled(false);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 640, 50);

        txtContador.setEditable(false);
        txtContador.setBackground(new java.awt.Color(63, 63, 63));
        txtContador.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtContador.setForeground(new java.awt.Color(255, 255, 255));
        txtContador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContador.setText("0");
        txtContador.setBorder(null);
        txtContador.setCaretColor(new java.awt.Color(255, 255, 255));
        txtContador.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtContador.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtContador);
        txtContador.setBounds(360, 120, 300, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Números Ingresados");
        jLabel3.setFocusable(false);
        jLabel3.setRequestFocusEnabled(false);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(360, 80, 300, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Número a Ingresar");
        jLabel4.setFocusable(false);
        jLabel4.setRequestFocusEnabled(false);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 80, 320, 30);

        txtNumIngresado.setBackground(new java.awt.Color(63, 63, 63));
        txtNumIngresado.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtNumIngresado.setForeground(new java.awt.Color(255, 255, 255));
        txtNumIngresado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumIngresado.setBorder(null);
        txtNumIngresado.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNumIngresado.setNextFocusableComponent(btnIngresar);
        txtNumIngresado.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtNumIngresado.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtNumIngresado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumIngresadoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumIngresadoKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumIngresado);
        txtNumIngresado.setBounds(20, 120, 320, 30);

        lblNumDatos.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblNumDatos.setForeground(new java.awt.Color(255, 51, 51));
        lblNumDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumDatos.setFocusable(false);
        lblNumDatos.setRequestFocusEnabled(false);
        jPanel1.add(lblNumDatos);
        lblNumDatos.setBounds(20, 140, 320, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 680, 170);

        jPanel2.setBackground(new java.awt.Color(48, 48, 48));
        jPanel2.setFocusable(false);
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(null);

        btnEvaluar.setBackground(new java.awt.Color(230, 57, 70));
        btnEvaluar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        btnEvaluar.setForeground(new java.awt.Color(0, 0, 0));
        btnEvaluar.setText("Evaluar");
        btnEvaluar.setBorder(null);
        btnEvaluar.setBorderPainted(false);
        btnEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluarActionPerformed(evt);
            }
        });
        btnEvaluar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEvaluarKeyPressed(evt);
            }
        });
        jPanel2.add(btnEvaluar);
        btnEvaluar.setBounds(180, 20, 140, 50);

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
        btnCentrar.setNextFocusableComponent(btnCerrar);
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
        btnCentrar.setBounds(180, 90, 140, 50);

        btnIngresar.setBackground(new java.awt.Color(230, 57, 70));
        btnIngresar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(0, 0, 0));
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(null);
        btnIngresar.setBorderPainted(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        btnIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnIngresarKeyPressed(evt);
            }
        });
        jPanel2.add(btnIngresar);
        btnIngresar.setBounds(20, 20, 140, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 210, 340, 160);

        jPanel4.setBackground(new java.awt.Color(48, 48, 48));
        jPanel4.setFocusable(false);
        jPanel4.setRequestFocusEnabled(false);
        jPanel4.setLayout(null);

        btnCerrar.setBackground(new java.awt.Color(230, 57, 70));
        btnCerrar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrar.setText("Cerrar");
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setNextFocusableComponent(txtNumIngresado);
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
        jPanel4.add(btnCerrar);
        btnCerrar.setBounds(20, 0, 140, 90);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(20, 370, 180, 110);

        jPanel3.setBackground(new java.awt.Color(48, 48, 48));
        jPanel3.setFocusable(false);
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(null);

        txtNumMayor.setEditable(false);
        txtNumMayor.setBackground(new java.awt.Color(63, 63, 63));
        txtNumMayor.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtNumMayor.setForeground(new java.awt.Color(255, 255, 255));
        txtNumMayor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumMayor.setBorder(null);
        txtNumMayor.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNumMayor.setFocusCycleRoot(true);
        txtNumMayor.setNextFocusableComponent(txtNumIngresado);
        txtNumMayor.setRequestFocusEnabled(false);
        txtNumMayor.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtNumMayor.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(txtNumMayor);
        txtNumMayor.setBounds(20, 150, 130, 30);

        txtRango.setEditable(false);
        txtRango.setBackground(new java.awt.Color(63, 63, 63));
        txtRango.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtRango.setForeground(new java.awt.Color(255, 255, 255));
        txtRango.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRango.setBorder(null);
        txtRango.setCaretColor(new java.awt.Color(255, 255, 255));
        txtRango.setFocusCycleRoot(true);
        txtRango.setNextFocusableComponent(txtNumIngresado);
        txtRango.setRequestFocusEnabled(false);
        txtRango.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtRango.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(txtRango);
        txtRango.setBounds(170, 220, 130, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Número Menor");
        jLabel10.setFocusable(false);
        jLabel10.setRequestFocusEnabled(false);
        jPanel3.add(jLabel10);
        jLabel10.setBounds(170, 120, 130, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Resultados");
        jLabel11.setFocusable(false);
        jLabel11.setRequestFocusEnabled(false);
        jPanel3.add(jLabel11);
        jLabel11.setBounds(20, 10, 280, 30);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Rango");
        jLabel12.setFocusable(false);
        jLabel12.setRequestFocusEnabled(false);
        jPanel3.add(jLabel12);
        jLabel12.setBounds(170, 190, 130, 30);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Número Mayor");
        jLabel13.setFocusable(false);
        jLabel13.setRequestFocusEnabled(false);
        jPanel3.add(jLabel13);
        jLabel13.setBounds(20, 120, 130, 30);

        txtNumMenor.setEditable(false);
        txtNumMenor.setBackground(new java.awt.Color(63, 63, 63));
        txtNumMenor.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtNumMenor.setForeground(new java.awt.Color(255, 255, 255));
        txtNumMenor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumMenor.setBorder(null);
        txtNumMenor.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNumMenor.setFocusCycleRoot(true);
        txtNumMenor.setNextFocusableComponent(txtNumIngresado);
        txtNumMenor.setRequestFocusEnabled(false);
        txtNumMenor.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtNumMenor.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(txtNumMenor);
        txtNumMenor.setBounds(170, 150, 130, 30);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Sumatoria");
        jLabel14.setFocusable(false);
        jLabel14.setRequestFocusEnabled(false);
        jPanel3.add(jLabel14);
        jLabel14.setBounds(20, 50, 280, 30);

        txtSumatoria.setEditable(false);
        txtSumatoria.setBackground(new java.awt.Color(63, 63, 63));
        txtSumatoria.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtSumatoria.setForeground(new java.awt.Color(255, 255, 255));
        txtSumatoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSumatoria.setBorder(null);
        txtSumatoria.setCaretColor(new java.awt.Color(255, 255, 255));
        txtSumatoria.setFocusCycleRoot(true);
        txtSumatoria.setNextFocusableComponent(txtNumIngresado);
        txtSumatoria.setRequestFocusEnabled(false);
        txtSumatoria.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtSumatoria.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(txtSumatoria);
        txtSumatoria.setBounds(20, 80, 280, 30);

        txtPromedio.setEditable(false);
        txtPromedio.setBackground(new java.awt.Color(63, 63, 63));
        txtPromedio.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtPromedio.setForeground(new java.awt.Color(255, 255, 255));
        txtPromedio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPromedio.setBorder(null);
        txtPromedio.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPromedio.setFocusCycleRoot(true);
        txtPromedio.setNextFocusableComponent(txtNumIngresado);
        txtPromedio.setRequestFocusEnabled(false);
        txtPromedio.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtPromedio.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(txtPromedio);
        txtPromedio.setBounds(20, 220, 130, 30);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Promedio");
        jLabel15.setFocusable(false);
        jLabel15.setRequestFocusEnabled(false);
        jPanel3.add(jLabel15);
        jLabel15.setBounds(20, 190, 130, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(380, 210, 320, 270);

        jPanel5.setBackground(new java.awt.Color(48, 48, 48));
        jPanel5.setFocusable(false);
        jPanel5.setRequestFocusEnabled(false);
        jPanel5.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Tiempo");
        jLabel8.setFocusable(false);
        jLabel8.setRequestFocusEnabled(false);
        jPanel5.add(jLabel8);
        jLabel8.setBounds(20, 10, 100, 30);

        txtTiempo.setEditable(false);
        txtTiempo.setBackground(new java.awt.Color(63, 63, 63));
        txtTiempo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtTiempo.setForeground(new java.awt.Color(255, 255, 255));
        txtTiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTiempo.setBorder(null);
        txtTiempo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTiempo.setFocusCycleRoot(true);
        txtTiempo.setNextFocusableComponent(txtNumIngresado);
        txtTiempo.setRequestFocusEnabled(false);
        txtTiempo.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtTiempo.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel5.add(txtTiempo);
        txtTiempo.setBounds(20, 40, 100, 30);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(220, 390, 140, 90);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        objFlujoFormE5 = null;
        itmFlujoFormE5.setEnabled(true);
        itmFlujoFormE5.setText(nombreProblema);
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluarActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        AlgoritmoEvaluar();
        setCursor(null);
        btnBorrar.requestFocus();
    }//GEN-LAST:event_btnEvaluarActionPerformed
    
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtNumIngresado.setText(null);
        txtContador.setText("0");
        txtSumatoria.setText(null);
        txtNumMayor.setText(null);
        txtNumMenor.setText(null);
        txtPromedio.setText(null);
        txtRango.setText(null);
        txtTiempo.setText(null);
        txtNumIngresado.requestFocus();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentrarActionPerformed
        this.setLocation(((dpPantalla.getWidth() - this.getWidth()) / 2),
                ((dpPantalla.getHeight() - this.getHeight()) / 2));
    }//GEN-LAST:event_btnCentrarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();        
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtNumIngresadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumIngresadoKeyTyped
        ValidarDecimalCualquiera(evt, txtNumIngresado, lblNumDatos, this);
    }//GEN-LAST:event_txtNumIngresadoKeyTyped

    private void btnEvaluarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEvaluarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnEvaluar.doClick();
        }
    }//GEN-LAST:event_btnEvaluarKeyPressed

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

    private void txtNumIngresadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumIngresadoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnIngresar.requestFocus();
        }
    }//GEN-LAST:event_txtNumIngresadoKeyPressed

    private void formInternalFrameIconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameIconified
        this.setTitle(nombreProblema);
    }//GEN-LAST:event_formInternalFrameIconified

    private void formInternalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameDeiconified
        this.setTitle(tema + ", " + numEvidencia + ": " + nombreProblema);
    }//GEN-LAST:event_formInternalFrameDeiconified

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        AlgoritmoIngresar();
        setCursor(null);
        txtNumIngresado.requestFocus();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnIngresarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnIngresar.doClick();
        }
    }//GEN-LAST:event_btnIngresarKeyPressed

    private void AlgoritmoIngresar()
    {
        double numIngresado;
        
        if (txtNumIngresado.getText().isEmpty()) {
            MostrarError(2, "Error: Campo vacío", 
                    "Llene el campo antes de ingresar un número", txtNumIngresado);
            return;
        }
        
        try {
            numIngresado = Double.parseDouble(txtNumIngresado.getText());
        }
        catch(Exception e) {
            MostrarError(0, "Error: No se pudieron ingresar los datos", 
                    "Ha ocurrido un error inesperado", txtNumIngresado);
            return;
        }
        
        if (txtContador.getText().equals("0")) {
            objEvaluarLista = new EvaluarLista_Clase_Base();
        }
        objEvaluarLista.setDatoLeído(numIngresado);
        objEvaluarLista.setContador();
        objEvaluarLista.setNumMayor();
        objEvaluarLista.setNumMenor();
        objEvaluarLista.setSumatoria();
        
        txtContador.setText(String.valueOf(objEvaluarLista.getContador()));
        txtSumatoria.setText(String.valueOf(dcfNúmero.format
        (objEvaluarLista.getSumatoria())));
        txtNumMayor.setText(null);
        txtNumMenor.setText(null);
        txtPromedio.setText(null);
        txtRango.setText(null);
        txtTiempo.setText(null);
    }
    
    private void AlgoritmoEvaluar()
    {        
        long tiempoInicio = System.nanoTime();
        
        if (txtContador.getText().equals("0")) {
            MostrarError(2, "Error: Lista vacía", 
                    "Ingrese un numero antes de evaluar la lista", 
                    txtNumIngresado);
            return;
        }
        
        objEvaluarLista.setPromedio();
        objEvaluarLista.setRango();
        
        txtNumMayor.setText(String.valueOf(dcfNúmero.format
        (objEvaluarLista.getNumMayor())));
        txtNumMenor.setText(String.valueOf(dcfNúmero.format
        (objEvaluarLista.getNumMenor())));
        txtPromedio.setText(String.valueOf(dcfNúmero.format
        (objEvaluarLista.getPromedio())));
        txtRango.setText(String.valueOf(dcfNúmero.format
        (objEvaluarLista.getRango())));
        long tiempoFinal = System.nanoTime();
        txtTiempo.setText(((tiempoFinal - tiempoInicio) / 1000000) + " ms");
    }
    
    private void MostrarError(int tipo, String título, String mensaje, 
            javax.swing.JTextField txtCampo)
    {
        txtNumMayor.setText(null);
        txtNumMenor.setText(null);
        txtPromedio.setText(null);
        txtRango.setText(null);
        txtTiempo.setText(null);
        getToolkit().beep();
        JOptionPane.showMessageDialog(rootPane, mensaje, título, tipo);
        txtCampo.requestFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCentrar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEvaluar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblNumDatos;
    private javax.swing.JTextField txtContador;
    private javax.swing.JTextField txtNumIngresado;
    private javax.swing.JTextField txtNumMayor;
    private javax.swing.JTextField txtNumMenor;
    private javax.swing.JTextField txtPromedio;
    private javax.swing.JTextField txtRango;
    private javax.swing.JTextField txtSumatoria;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}