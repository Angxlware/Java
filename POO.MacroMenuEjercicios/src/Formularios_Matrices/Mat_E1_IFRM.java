package Formularios_Matrices;

import Clases_Mat_E1.*;
import static Librerías.Validaciones.*;
import static Formularios_Menú.Menú_FRM.*;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JOptionPane;

public class Mat_E1_IFRM extends javax.swing.JInternalFrame 
{   
    public final String tema = "Matrices";
    public final String numEvidencia = "Evidencia I";
    public final String nombreProblema = "Escalar Matriz";
    private EscalarMatriz_Interfaz objEscalarMatriz;
    
    public Mat_E1_IFRM() 
    {
        initComponents();
        this.setTitle(tema + ", " + numEvidencia + ": " + nombreProblema);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEscalar = new javax.swing.JTextField();
        txtEscalar.setTransferHandler(null);
        txtFilas = new javax.swing.JTextField();
        txtFilas.setTransferHandler(null);
        txtColumnas = new javax.swing.JTextField();
        txtColumnas.setTransferHandler(null);
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblFilas = new javax.swing.JLabel();
        lblEscalar = new javax.swing.JLabel();
        lblColumnas = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCentrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtArMatrizA = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtArMatrizB = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(33, 33, 33));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes_Menú/Ícono_x16.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(720, 640));
        setPreferredSize(new java.awt.Dimension(720, 640));
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
        jLabel1.setText("Matriz MxN Multiplicada por un Escalar");
        jLabel1.setFocusable(false);
        jLabel1.setRequestFocusEnabled(false);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 640, 50);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Columnas");
        jLabel4.setFocusable(false);
        jLabel4.setRequestFocusEnabled(false);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(240, 90, 200, 20);

        txtEscalar.setBackground(new java.awt.Color(63, 63, 63));
        txtEscalar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtEscalar.setForeground(new java.awt.Color(255, 255, 255));
        txtEscalar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEscalar.setBorder(null);
        txtEscalar.setCaretColor(new java.awt.Color(255, 255, 255));
        txtEscalar.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtEscalar.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtEscalar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEscalarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEscalarKeyTyped(evt);
            }
        });
        jPanel1.add(txtEscalar);
        txtEscalar.setBounds(460, 120, 200, 30);

        txtFilas.setBackground(new java.awt.Color(63, 63, 63));
        txtFilas.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtFilas.setForeground(new java.awt.Color(255, 255, 255));
        txtFilas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFilas.setBorder(null);
        txtFilas.setCaretColor(new java.awt.Color(255, 255, 255));
        txtFilas.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtFilas.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtFilas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFilasKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFilasKeyTyped(evt);
            }
        });
        jPanel1.add(txtFilas);
        txtFilas.setBounds(20, 120, 200, 30);

        txtColumnas.setBackground(new java.awt.Color(63, 63, 63));
        txtColumnas.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtColumnas.setForeground(new java.awt.Color(255, 255, 255));
        txtColumnas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtColumnas.setBorder(null);
        txtColumnas.setCaretColor(new java.awt.Color(255, 255, 255));
        txtColumnas.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtColumnas.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtColumnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtColumnasKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColumnasKeyTyped(evt);
            }
        });
        jPanel1.add(txtColumnas);
        txtColumnas.setBounds(240, 120, 200, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Escalar");
        jLabel5.setFocusable(false);
        jLabel5.setRequestFocusEnabled(false);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(460, 90, 200, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Filas");
        jLabel6.setFocusable(false);
        jLabel6.setRequestFocusEnabled(false);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 90, 200, 20);

        lblFilas.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblFilas.setForeground(new java.awt.Color(255, 51, 51));
        lblFilas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFilas.setFocusable(false);
        lblFilas.setRequestFocusEnabled(false);
        jPanel1.add(lblFilas);
        lblFilas.setBounds(20, 140, 200, 30);

        lblEscalar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblEscalar.setForeground(new java.awt.Color(255, 51, 51));
        lblEscalar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEscalar.setFocusable(false);
        lblEscalar.setRequestFocusEnabled(false);
        jPanel1.add(lblEscalar);
        lblEscalar.setBounds(460, 140, 200, 30);

        lblColumnas.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblColumnas.setForeground(new java.awt.Color(255, 51, 51));
        lblColumnas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblColumnas.setFocusable(false);
        lblColumnas.setRequestFocusEnabled(false);
        jPanel1.add(lblColumnas);
        lblColumnas.setBounds(240, 140, 200, 30);

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
        btnCerrar.setNextFocusableComponent(txtEscalar);
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
        btnCerrar.setBounds(420, 20, 110, 50);

        btnGenerar.setBackground(new java.awt.Color(230, 57, 70));
        btnGenerar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 28)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(0, 0, 0));
        btnGenerar.setText("Generar");
        btnGenerar.setBorder(null);
        btnGenerar.setBorderPainted(false);
        btnGenerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        btnGenerar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnGenerarKeyPressed(evt);
            }
        });
        jPanel2.add(btnGenerar);
        btnGenerar.setBounds(20, 20, 120, 50);

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
        btnBorrar.setBounds(160, 20, 110, 50);

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
        btnCentrar.setBounds(290, 20, 110, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 210, 550, 90);

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
        jLabel7.setBounds(20, 10, 70, 30);

        txtTiempo.setEditable(false);
        txtTiempo.setBackground(new java.awt.Color(63, 63, 63));
        txtTiempo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtTiempo.setForeground(new java.awt.Color(255, 255, 255));
        txtTiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTiempo.setBorder(null);
        txtTiempo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTiempo.setFocusCycleRoot(true);
        txtTiempo.setNextFocusableComponent(txtEscalar);
        txtTiempo.setRequestFocusEnabled(false);
        txtTiempo.setSelectedTextColor(new java.awt.Color(33, 33, 33));
        txtTiempo.setSelectionColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(txtTiempo);
        txtTiempo.setBounds(20, 40, 70, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(590, 210, 110, 90);

        jPanel3.setBackground(new java.awt.Color(48, 48, 48));
        jPanel3.setFocusable(false);
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(null);

        jScrollPane3.setBackground(new java.awt.Color(63, 63, 63));
        jScrollPane3.setBorder(null);
        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setOpaque(false);

        txtArMatrizA.setEditable(false);
        txtArMatrizA.setBackground(new java.awt.Color(63, 63, 63));
        txtArMatrizA.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtArMatrizA.setForeground(new java.awt.Color(255, 255, 255));
        txtArMatrizA.setTabSize(4);
        txtArMatrizA.setBorder(null);
        txtArMatrizA.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtArMatrizA.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(txtArMatrizA);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(20, 50, 310, 210);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Matriz escalada");
        jLabel8.setFocusable(false);
        jLabel8.setRequestFocusEnabled(false);
        jPanel3.add(jLabel8);
        jLabel8.setBounds(350, 10, 310, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Matriz generada");
        jLabel9.setFocusable(false);
        jLabel9.setRequestFocusEnabled(false);
        jPanel3.add(jLabel9);
        jLabel9.setBounds(20, 10, 310, 30);

        jScrollPane4.setBackground(new java.awt.Color(63, 63, 63));
        jScrollPane4.setBorder(null);
        jScrollPane4.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setOpaque(false);

        txtArMatrizB.setEditable(false);
        txtArMatrizB.setBackground(new java.awt.Color(63, 63, 63));
        txtArMatrizB.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtArMatrizB.setForeground(new java.awt.Color(255, 255, 255));
        txtArMatrizB.setTabSize(4);
        txtArMatrizB.setBorder(null);
        txtArMatrizB.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtArMatrizB.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(txtArMatrizB);

        jPanel3.add(jScrollPane4);
        jScrollPane4.setBounds(350, 50, 310, 210);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 320, 680, 280);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        objMatFormE1 = null;
        itmMatFormE1.setEnabled(true);
        itmMatFormE1.setText(nombreProblema);
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        Algoritmo();
        setCursor(null);
        btnBorrar.requestFocus();
    }//GEN-LAST:event_btnGenerarActionPerformed
    
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtFilas.setText(null);
        txtColumnas.setText(null);
        txtEscalar.setText(null);
        txtArMatrizA.setText(null);
        txtArMatrizB.setText(null);
        txtTiempo.setText(null);
        txtEscalar.requestFocus();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentrarActionPerformed
        this.setLocation(((dpPantalla.getWidth() - this.getWidth()) / 2),
                ((dpPantalla.getHeight() - this.getHeight()) / 2));
    }//GEN-LAST:event_btnCentrarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();        
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnGenerarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGenerarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnGenerar.doClick();
        }
    }//GEN-LAST:event_btnGenerarKeyPressed

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

    private void formInternalFrameIconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameIconified
        this.setTitle(nombreProblema);
    }//GEN-LAST:event_formInternalFrameIconified

    private void formInternalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameDeiconified
        this.setTitle(tema + ", " + numEvidencia + ": " + nombreProblema);
    }//GEN-LAST:event_formInternalFrameDeiconified

    private void txtEscalarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEscalarKeyTyped
        ValidarDecimalCualquiera(evt, txtEscalar, lblEscalar, this);
    }//GEN-LAST:event_txtEscalarKeyTyped

    private void txtEscalarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEscalarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnGenerar.requestFocus();
        }
    }//GEN-LAST:event_txtEscalarKeyPressed

    private void txtFilasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtColumnas.requestFocus();
        }
    }//GEN-LAST:event_txtFilasKeyPressed

    private void txtFilasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilasKeyTyped
        ValidarEnteroPositivo(evt, txtFilas, lblFilas, this);
    }//GEN-LAST:event_txtFilasKeyTyped

    private void txtColumnasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColumnasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtEscalar.requestFocus();
        }
    }//GEN-LAST:event_txtColumnasKeyPressed

    private void txtColumnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColumnasKeyTyped
        ValidarEnteroPositivo(evt, txtColumnas, lblColumnas, this);
    }//GEN-LAST:event_txtColumnasKeyTyped

    private void Algoritmo()
    {        
        long tiempoInicio = System.nanoTime();
        int[][] matriz;
        int escalar, filas, columnas;
        
        if ((txtFilas.getText().isEmpty()) || (txtColumnas.getText().isEmpty()) 
                || (txtEscalar.getText().isEmpty())) {
            MostrarError(2, "Error: Campos vacíos", 
                    "Llene todos los campos antes de generar la matriz", 
                    txtEscalar);
            return;
        }
        
        try {
            filas = Integer.parseInt(txtFilas.getText());
            if (filas < 2) {
                MostrarError(0, "Error: Valor de las filas inválido", 
                    "El número de filas tiene que ser mayor que uno", txtFilas);
                return;
            }
            columnas = Integer.parseInt(txtColumnas.getText());
            if (columnas < 2) {
                MostrarError(0, "Error: Valor de las columnas inválido", 
                    "El número de columnas tiene que ser mayor que uno", 
                    txtColumnas);
                return;
            }
            if (columnas == filas) {
                MostrarError(0, "Error: Valor de las columnas inválido", 
                    "El número de columnas tiene que ser distinto al número de filas",
                    txtColumnas);
                return;
            }
            escalar = Integer.parseInt(txtEscalar.getText());
        }
        catch (Exception e) {
            MostrarError(0, "Error: No se pudieron ingresar los datos", 
                    "Ha ocurrido un error inesperado", txtFilas);
            return;
        }
        
        matriz = new int[filas][columnas];
        Random rnd = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rnd.nextInt(99) + 1;
            }
        }
        txtArMatrizA.setText(null);
        for (int i = 0; i < matriz.length; i++) {
            txtArMatrizA.append("{");
            for (int j = 0; j < matriz[0].length; j++) {
                txtArMatrizA.append(String.valueOf(matriz[i][j]));
                if (j != (matriz[0].length - 1)) {
                    txtArMatrizA.append(", ");
                }
            }
            txtArMatrizA.append("}\n");
        }
        objEscalarMatriz = new EscalarMatriz_Clase_Base(matriz, escalar);
        objEscalarMatriz.EscalarMatriz();
        
        txtArMatrizB.setText(null);
        for (int i = 0; i < objEscalarMatriz.getMatriz().length; i++) {
            txtArMatrizB.append("{");
            for (int j = 0; j < objEscalarMatriz.getMatriz()[0].length; j++) {
                txtArMatrizB.append(String.valueOf(objEscalarMatriz
                        .getMatriz()[i][j]));
                if (j != (objEscalarMatriz.getMatriz()[0].length - 1)) {
                    txtArMatrizB.append(", ");
                }
            }
            txtArMatrizB.append("}\n");
        }
        long tiempoFinal = System.nanoTime();
        txtTiempo.setText(((tiempoFinal - tiempoInicio) / 1000000) + " ms");
    }
    
    private void MostrarError(int tipo, String título, String mensaje, 
            javax.swing.JTextField txtCampo)
    {
        txtArMatrizA.setText(null);
        txtArMatrizB.setText(null);
        txtTiempo.setText(null);
        getToolkit().beep();
        JOptionPane.showMessageDialog(rootPane, mensaje, título, tipo);
        txtCampo.requestFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCentrar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblColumnas;
    private javax.swing.JLabel lblEscalar;
    private javax.swing.JLabel lblFilas;
    private javax.swing.JTextArea txtArMatrizA;
    private javax.swing.JTextArea txtArMatrizB;
    private javax.swing.JTextField txtColumnas;
    private javax.swing.JTextField txtEscalar;
    private javax.swing.JTextField txtFilas;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}