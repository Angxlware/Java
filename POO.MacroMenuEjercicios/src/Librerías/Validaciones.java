package Librerías;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Validaciones 
{
    private static String msgError = null;
    private static Hilo objHilo = null;
    private static final int retraso = 1000;
    
    public static void ValidarEnteroPositivo(java.awt.event.KeyEvent evt, 
            JTextField txt, JLabel lblError, JInternalFrame ventana)
    {
        char c = evt.getKeyChar();
        if(!(((c >= '0') && (c <= '9')) || (c == KeyEvent.VK_BACK_SPACE) 
                || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_ENTER))) {
            if (c == KeyEvent.VK_MINUS) {
                msgError = "Negativo No Permitido";
            }
            else if (c == KeyEvent.VK_PERIOD) {
                msgError = "Decimal No Permitido";
            }
            else {
                msgError = "Caracter No Permitido";
            }
            evt.consume();
            ventana.getToolkit().beep();
            objHilo = new Hilo(lblError);
            objHilo.start();
        }
        else {   
            lblError.setIcon(null);
            lblError.setText(null);
        }
    }

    public static void ValidarDecimalCualquiera(java.awt.event.KeyEvent evt, 
            JTextField txt, JLabel lblError, JInternalFrame ventana)
    {
        char c = evt.getKeyChar();
        if(!(((c >= '0') && (c <= '9')) || (c == KeyEvent.VK_BACK_SPACE) 
                || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_ENTER) 
                || (c == KeyEvent.VK_MINUS) || (c == KeyEvent.VK_PERIOD)) 
                || ((c == KeyEvent.VK_MINUS) && (txt.getText().length() != 0)) 
                || ((c == KeyEvent.VK_PERIOD) && (txt.getText().contains(".")))) {
            if ((c == KeyEvent.VK_MINUS) && (txt.getText().length() != 0)) {
                msgError = "Negativo inválido";
            }
            else if ((c == KeyEvent.VK_PERIOD) && (txt.getText().contains("."))) {
                msgError = "Decimal inválido";
            }
            else {
                msgError = "Caracter no permitido";
            }
            evt.consume();
            ventana.getToolkit().beep();
            objHilo = new Hilo(lblError);
            objHilo.start();
        }
        else {   
            lblError.setIcon(null);
            lblError.setText(null);
        }
    } 

    private static class Hilo extends Thread
    {
        private static final ImageIcon icnError = new ImageIcon
        ("src/Imágenes_Menú/Error.png");
        private JLabel lblError;
        
        public Hilo(JLabel lblError) {
            this.lblError = lblError;
        }
        
        public void run() {
            try {
                lblError.setIcon(icnError);
                lblError.setText(msgError);
                Thread.sleep(retraso);
                lblError.setIcon(null);
                lblError.setText(null);
            }
            catch (Exception e) {
                System.out.println("Ha ocurrido un error inesperado: " + e);
            } 
        }
    }
}