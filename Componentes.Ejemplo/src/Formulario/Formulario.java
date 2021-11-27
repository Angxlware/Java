package Formulario;

import java.awt.Cursor;
import java.util.Random;
import javax.swing.JOptionPane;

public class Formulario extends javax.swing.JFrame 
{
    private int[] arreglo;
    private int longitud;
    
    public Formulario()
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Nivel_11 = new Componentes.Panel_Nivel_1();
        panel_Nivel_21 = new Componentes.Panel_Nivel_2();
        btnGenerarArreglo = new Componentes.Botón_Defecto();
        btnOrdenarArreglo = new Componentes.Botón_Defecto();
        btnBuscarElemento = new Componentes.Botón_Defecto();
        btnVaciarCampos = new Componentes.Botón_Defecto();
        botón_Salir1 = new Componentes.Botón_Salir();
        panel_Nivel_22 = new Componentes.Panel_Nivel_2();
        etiqueta_Nivel_21 = new Componentes.Etiqueta_Nivel_2();
        try {
            txt_NoEditable1 = new Componentes.Txt_NoEditable();
        } catch (java.lang.Exception e1) {
            e1.printStackTrace();
        }
        panel_Nivel_23 = new Componentes.Panel_Nivel_2();
        etiqueta_Nivel_11 = new Componentes.Etiqueta_Nivel_1();
        etiqueta_Nivel_24 = new Componentes.Etiqueta_Nivel_2();
        etiqueta_Nivel_25 = new Componentes.Etiqueta_Nivel_2();
        txtNumABuscar = new Componentes.Txt_EnteroPositivo();
        txtLongitud = new Componentes.Txt_EnteroPositivo();
        panel_Nivel_24 = new Componentes.Panel_Nivel_2();
        etiqueta_Nivel_22 = new Componentes.Etiqueta_Nivel_2();
        etiqueta_Nivel_31 = new Componentes.Etiqueta_Nivel_3();
        etiqueta_Nivel_32 = new Componentes.Etiqueta_Nivel_3();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArBúsquedas = new Componentes.TxtAr_Defecto();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArArreglo = new Componentes.TxtAr_Defecto();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Unidad II, Evidencia I: Ordenación Quicksort y Búsqueda Binaria");
        setBackground(new java.awt.Color(18, 18, 18));
        setResizable(false);

        btnGenerarArreglo.setText("Generar Arreglo");
        btnGenerarArreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarArregloActionPerformed(evt);
            }
        });
        panel_Nivel_21.add(btnGenerarArreglo);
        btnGenerarArreglo.setBounds(20, 20, 210, 40);

        btnOrdenarArreglo.setText("Ordenar Arreglo");
        btnOrdenarArreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarArregloActionPerformed(evt);
            }
        });
        panel_Nivel_21.add(btnOrdenarArreglo);
        btnOrdenarArreglo.setBounds(20, 80, 210, 40);

        btnBuscarElemento.setText("Buscar Elemento");
        btnBuscarElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarElementoActionPerformed(evt);
            }
        });
        panel_Nivel_21.add(btnBuscarElemento);
        btnBuscarElemento.setBounds(20, 140, 210, 40);

        btnVaciarCampos.setText("Vaciar Campos");
        btnVaciarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarCamposActionPerformed(evt);
            }
        });
        panel_Nivel_21.add(btnVaciarCampos);
        btnVaciarCampos.setBounds(20, 200, 210, 40);

        botón_Salir1.setText("Salir");
        panel_Nivel_21.add(botón_Salir1);
        botón_Salir1.setBounds(20, 260, 210, 40);

        panel_Nivel_11.add(panel_Nivel_21);
        panel_Nivel_21.setBounds(20, 180, 250, 320);

        etiqueta_Nivel_21.setText("Tiempo del Proceso");
        panel_Nivel_22.add(etiqueta_Nivel_21);
        etiqueta_Nivel_21.setBounds(10, 10, 230, 29);
        panel_Nivel_22.add(txt_NoEditable1);
        txt_NoEditable1.setBounds(20, 44, 210, 30);

        panel_Nivel_11.add(panel_Nivel_22);
        panel_Nivel_22.setBounds(20, 520, 250, 90);

        etiqueta_Nivel_11.setText("Ordenación Quicksort y Búsqueda Binaria");
        panel_Nivel_23.add(etiqueta_Nivel_11);
        etiqueta_Nivel_11.setBounds(10, 10, 820, 46);

        etiqueta_Nivel_24.setText("Número a Buscar");
        panel_Nivel_23.add(etiqueta_Nivel_24);
        etiqueta_Nivel_24.setBounds(430, 60, 390, 29);

        etiqueta_Nivel_25.setText("Longitud del Arreglo");
        panel_Nivel_23.add(etiqueta_Nivel_25);
        etiqueta_Nivel_25.setBounds(20, 60, 390, 30);
        panel_Nivel_23.add(txtNumABuscar);
        txtNumABuscar.setBounds(430, 90, 390, 30);
        panel_Nivel_23.add(txtLongitud);
        txtLongitud.setBounds(20, 90, 390, 30);

        panel_Nivel_11.add(panel_Nivel_23);
        panel_Nivel_23.setBounds(20, 20, 840, 140);

        etiqueta_Nivel_22.setText("Resultados");
        panel_Nivel_24.add(etiqueta_Nivel_22);
        etiqueta_Nivel_22.setBounds(10, 10, 550, 29);

        etiqueta_Nivel_31.setText("Arreglo");
        panel_Nivel_24.add(etiqueta_Nivel_31);
        etiqueta_Nivel_31.setBounds(20, 30, 260, 30);

        etiqueta_Nivel_32.setText("Búsquedas");
        panel_Nivel_24.add(etiqueta_Nivel_32);
        etiqueta_Nivel_32.setBounds(300, 30, 250, 30);

        txtArBúsquedas.setRows(5);
        jScrollPane1.setViewportView(txtArBúsquedas);

        panel_Nivel_24.add(jScrollPane1);
        jScrollPane1.setBounds(300, 60, 250, 350);

        txtArArreglo.setRows(5);
        jScrollPane2.setViewportView(txtArArreglo);

        panel_Nivel_24.add(jScrollPane2);
        jScrollPane2.setBounds(20, 63, 260, 350);

        panel_Nivel_11.add(panel_Nivel_24);
        panel_Nivel_24.setBounds(290, 180, 570, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Nivel_11, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Nivel_11, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnOrdenarArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarArregloActionPerformed
        OrdenarArreglo objOrdenar = new OrdenarArreglo();
        objOrdenar.start();
    }//GEN-LAST:event_btnOrdenarArregloActionPerformed
    
    private void btnGenerarArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarArregloActionPerformed
        GenerarArreglo objGenerar = new GenerarArreglo();
        objGenerar.start();
    }//GEN-LAST:event_btnGenerarArregloActionPerformed

    private void btnBuscarElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarElementoActionPerformed
        BuscarElemento objBuscar = new BuscarElemento();
        objBuscar.start();
    }//GEN-LAST:event_btnBuscarElementoActionPerformed

    private void btnVaciarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarCamposActionPerformed
        txtLongitud.setText(null);
        txtNumABuscar.setText(null);
        txtArArreglo.setText(null);
        txtArBúsquedas.setText(null);
        btnGenerarArreglo.setEnabled(true);
        btnOrdenarArreglo.setEnabled(false);
        btnBuscarElemento.setEnabled(false);
        btnGenerarArreglo.requestFocus();
    }//GEN-LAST:event_btnVaciarCamposActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    private class GenerarArreglo extends Thread {
        @Override
        public void run() 
        {
            if (txtLongitud.getText().isEmpty()) {
                MostrarError(0, "Longitud Inválida", "El campo no puede estar "
                        + "vacío", txtLongitud);
                return;
            }
            try {
                longitud = Integer.parseInt(txtLongitud.getText());
                if (longitud == 0) {
                    MostrarError(0, "Longitud Inválida", "La longitud no puede "
                            + "ser cero", txtLongitud);
                }
            }
            catch (Exception e)
            {
                System.out.println("Ha ocurrido un error inesperado: " + e);
                return;
            }
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            btnGenerarArreglo.setEnabled(false);
            btnOrdenarArreglo.setEnabled(false);
            btnBuscarElemento.setEnabled(false);
            /////
            arreglo = new int[longitud];
            Random rnd = new Random();
            
            txtArArreglo.setText(null);
            txtArBúsquedas.setText(null);
            for (int i = 0; i < longitud; i++) {
                arreglo[i] = rnd.nextInt(longitud);
                txtArArreglo.append("Arreglo[" + i + "]: " + arreglo[i] + "\n");
            }
            /////
            setCursor(null);
            btnGenerarArreglo.setEnabled(true);
            btnOrdenarArreglo.setEnabled(true);
            btnBuscarElemento.setEnabled(false);
            btnOrdenarArreglo.requestFocus();
        }
    }
    
    private class OrdenarArreglo extends Thread
    {
        @Override
        public void run()
        {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            btnGenerarArreglo.setEnabled(false);
            btnOrdenarArreglo.setEnabled(false);
            /////
            OrdenaciónQuicksort(arreglo, 0, longitud - 1);
            txtArArreglo.setText(null);
            for (int i = 0; i < arreglo.length; i++) {
                txtArArreglo.append("Arreglo[" + i + "]: " + arreglo[i] + "\n");
            }
            /////
            setCursor(null);
            btnGenerarArreglo.setEnabled(true);
            btnOrdenarArreglo.setEnabled(false);
            btnBuscarElemento.setEnabled(true);
            txtNumABuscar.requestFocus();
        }
    }
    
    private static void OrdenaciónQuicksort(int[] arreglo, int izq, int der) 
    {
        int pivote = arreglo[izq], i = izq, j = der, aux;
        
        while (i < j) 
        {
            while ((arreglo[i] <= pivote) && (i < j)) {
                i++;
            }
            while (arreglo[j] > pivote) {
                j--;
            }
            if (i < j) {
                aux = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = aux;
            }
        }
        
        arreglo[izq] = arreglo[j];
        arreglo[j] = pivote;
        if (izq < (j - 1)) {
            OrdenaciónQuicksort(arreglo, izq, (j - 1));
        }
        if (der > (j + 1)) {
            OrdenaciónQuicksort(arreglo, (j + 1), der);
        }
    }
    
    private class BuscarElemento extends Thread
    {
        @Override
        public void run()
        {
            int numABuscar;
            
            try {
                numABuscar = Integer.parseInt(txtNumABuscar.getText());
            }
            catch (Exception e) {
                MostrarError(0, "Número a Buscar Inválido", "El campo no puede "
                        + "estar vacío", txtLongitud);
                return;
            }
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            btnGenerarArreglo.setEnabled(false);
            btnOrdenarArreglo.setEnabled(false);
            btnBuscarElemento.setEnabled(false);
            /////
            int izq = 0, der = (arreglo.length - 1), cen = ((izq + der) / 2);
        
            while ((izq <= der) && (numABuscar != arreglo[cen])) 
            {
                if (numABuscar > arreglo[cen]) 
                    izq = (cen + 1);
                else 
                    der = (cen - 1);
                cen = ((izq + der) / 2);
            }
            
            if (izq > der) {
                txtArBúsquedas.append(numABuscar + " no encontrado" + "\n");
            }
            else {
                txtArBúsquedas.append(numABuscar + " en la posición #" + cen + "\n");
            }
            /////
            setCursor(null);
            btnGenerarArreglo.setEnabled(true);
            btnBuscarElemento.setEnabled(true);
            btnVaciarCampos.requestFocus();
        }
    }
    
    private void MostrarError(int tipo, String título, String mensaje, 
            javax.swing.JTextField txtCampo)
    {
        getToolkit().beep();
        JOptionPane.showMessageDialog(rootPane, mensaje, título, tipo);
        txtCampo.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componentes.Botón_Salir botón_Salir1;
    private Componentes.Botón_Defecto btnBuscarElemento;
    private Componentes.Botón_Defecto btnGenerarArreglo;
    private Componentes.Botón_Defecto btnOrdenarArreglo;
    private Componentes.Botón_Defecto btnVaciarCampos;
    private Componentes.Etiqueta_Nivel_1 etiqueta_Nivel_11;
    private Componentes.Etiqueta_Nivel_2 etiqueta_Nivel_21;
    private Componentes.Etiqueta_Nivel_2 etiqueta_Nivel_22;
    private Componentes.Etiqueta_Nivel_2 etiqueta_Nivel_24;
    private Componentes.Etiqueta_Nivel_2 etiqueta_Nivel_25;
    private Componentes.Etiqueta_Nivel_3 etiqueta_Nivel_31;
    private Componentes.Etiqueta_Nivel_3 etiqueta_Nivel_32;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private Componentes.Panel_Nivel_1 panel_Nivel_11;
    private Componentes.Panel_Nivel_2 panel_Nivel_21;
    private Componentes.Panel_Nivel_2 panel_Nivel_22;
    private Componentes.Panel_Nivel_2 panel_Nivel_23;
    private Componentes.Panel_Nivel_2 panel_Nivel_24;
    private Componentes.TxtAr_Defecto txtArArreglo;
    private Componentes.TxtAr_Defecto txtArBúsquedas;
    private Componentes.Txt_EnteroPositivo txtLongitud;
    private Componentes.Txt_EnteroPositivo txtNumABuscar;
    private Componentes.Txt_NoEditable txt_NoEditable1;
    // End of variables declaration//GEN-END:variables
}
