import java.util.ArrayList;
import java.util.List;

public class NumMayorMenor 
{
    private int[] conjunto;
    
    public NumMayorMenor()
    {
        this.conjunto = new int[10];
    }
    
    public void setConjunto(int[] elementos) 
    { 
        this.conjunto = elementos; 
    }
    
    public int[] getConjunto() 
    { 
        return this.conjunto; 
    }
    
    public List getPosiciónMayor()
    {
        int numMayor = this.conjunto[0];
        for (int i = 0; i < this.conjunto.length; i++)
        {
            if (this.conjunto[i] > numMayor) 
                numMayor = this.conjunto[i];
        }
        
        List posiciones = new ArrayList();
        for (int i = 0; i < this.conjunto.length; i++) 
        {
            if (this.conjunto[i] == numMayor)
                posiciones.add(i + 1);
        }
        return posiciones;
    }
    
    public List getPosiciónMenor()
    {
        int numMenor = this.conjunto[0];
        for (int i = 0; i < this.conjunto.length; i++)
        {
            if (this.conjunto[i] < numMenor)
                numMenor = this.conjunto[i];
        }   
        
        List posiciones = new ArrayList();
        for (int i = 0; i < this.conjunto.length; i++) 
        {
            if (this.conjunto[i] == numMenor)
                posiciones.add(i + 1);
        }
        return posiciones;
    }
}