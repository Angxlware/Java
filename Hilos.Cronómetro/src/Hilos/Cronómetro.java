package Hilos;

import javax.swing.JLabel;

public class Cronómetro extends Thread {

    private JLabel lblTiempo;
    private int h1, h2, m1, m2, s1, s2;

    public Cronómetro(JLabel lblTiempo) {
        this.lblTiempo = lblTiempo;
        this.h1 = this.h2 = this.m1 = this.m2 = this.s1 = this.s2 = 0;
    }

    public void run() {
        try {
            while (true) {
                lblTiempo.setText(h1 + "" + h2 + ":" + m1 + "" + m2 + ":" + s1 + "" + s2);
                s2++;
                if (s2 > 9) {
                    s2 = 0;
                    s1++;
                    if (s1 > 5) {
                        s1 = 0;
                        m2++;
                        if (m2 > 9) {
                            m2 = 0;
                            m1++;
                            if (m1 > 5) {
                                m1 = 0;
                                h2++;
                                if (h2 > 3) {
                                    h2 = 0;
                                    h1++;
                                    if (h1 > 2) {
                                        h1 = h2 = m1 = m2 = s1 = s2 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Hilo interrumpido");
        }
    }
}
