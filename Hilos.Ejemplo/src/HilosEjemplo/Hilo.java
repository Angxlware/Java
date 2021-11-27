package HilosEjemplo;

import javax.swing.JLabel;

public class Hilo extends Thread
{
    private JLabel lbl;
    private int contador;
    
    public Hilo(JLabel lbl)
    {
        this.lbl = lbl;
    }
    
    @Override
    public void run()
    {
        while(true)
        {
            this.lbl.setText("Ciclo: " + contador++);
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
}
