package Hilos;

import Formulario.Formulario;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Caballo extends Thread {

    private String nombre;
    private JProgressBar pista;
    private JLabel lblGanador;

    public Caballo(String nombre, JProgressBar pista, JLabel lblGanador) {
        this.nombre = nombre;
        this.pista = pista;
        this.lblGanador = lblGanador;
    }

    @Override
    public void run() {
        try {
            this.setName(nombre);

            int porcentaje = 0;
            while (true) {
                porcentaje += GenerarNúmeroAleatorio(1, 15);
                if (porcentaje >= 100) {
                    pista.setValue(100);
                    break;
                } else {
                    pista.setValue(porcentaje);
                    Thread.sleep(1000);
                }
            }
            lblGanador.setText("¡" + this.getName() + " es el ganador!");
            Formulario.TerminarHilos();

        } catch (Exception e) {
            System.out.println("Hilo interrumpido");
        }
    }

    public int GenerarNúmeroAleatorio(int mínimo, int máximo) {
        return (int) Math.floor(Math.random() * (máximo - mínimo + 1) + (mínimo));
    }
}
