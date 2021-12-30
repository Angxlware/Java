package Hilos;

import Formularios.Carrera;
import javax.swing.JLabel;

public class Corredor extends Thread {

    private String nombre;
    private JLabel automovil;
    private JLabel meta;
    private JLabel resultado;

    public Corredor(String nombre, JLabel automovil, JLabel meta,
            JLabel resultado) {
        this.nombre = nombre;
        this.automovil = automovil;
        this.meta = meta;
        this.resultado = resultado;
    }

    @Override
    public void run() {
        try {
            this.setName(nombre);
            int posicionX = this.automovil.getX();

            while (true) {
                int avance = GenerarNumeroAleatorio(1, 5);
                
                if ((posicionX + avance) >= (this.meta.getX() - 70)) {
                    this.automovil.setLocation(this.meta.getX() - 70, this.automovil.getY());
                    break;
                } else {
                    posicionX += avance;
                    this.automovil.setLocation(posicionX, this.automovil.getY());
                    Thread.sleep(25);
                }
            }
            Carrera.TerminarCarrera();
            this.resultado.setText("El ganador es el " + this.getName());
            
        } catch (Exception e) {
            System.out.println("Hilo '" + this.getName() + "' interrumpido");
        }
    }

    public int GenerarNumeroAleatorio(int minimo, int maximo) {
        return (int) Math.floor(Math.random() * (maximo - minimo + 1) + minimo);
    }
}
