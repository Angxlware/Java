import java.util.ArrayList;
import java.util.List;

public class InsBusqYElim 
{
    private Integer[] conjunto;
    private byte numOperaciones;
    private boolean existeElemento;
    
    public InsBusqYElim()
    {
        this.conjunto = new Integer[50];
        this.numOperaciones = 0;
        this.existeElemento = false;
    }
    
    public void InsertarElemento(int posición, int elemento) throws Exception
    {
        if ((posición < 0) || (posición > (this.conjunto.length - 1)))
            throw new Exception("ERROR: Índice fuera del arreglo");
        this.conjunto[posición] = elemento;
    }
    
    public Integer[] EncontrarPosiciones(int elemento) throws Exception
    {
        this.numOperaciones = 0;
        this.existeElemento = false;
        List<Integer> posicionesLista = new ArrayList();
        
        if (this.conjunto == null)
                throw new Exception("ERROR: No se han ingresado elementos al"
                        + " conjunto");
        for (int i = 0; i < this.conjunto.length; i++) 
        {
            this.numOperaciones++;
            if (this.conjunto[i] == null)
                continue;
            if (this.conjunto[i] == elemento)
            {
                this.existeElemento = true;
                posicionesLista.add(i);
            }
        }
        
        Integer[] posicionesArreglo = new Integer[posicionesLista.size()];
        posicionesArreglo = posicionesLista.toArray(posicionesArreglo);
        return posicionesArreglo;
    }
    
    public void EliminarElemento(int elemento) throws Exception
    {
        this.numOperaciones = 0;
        this.existeElemento = false;
        
        if (this.conjunto == null)
                throw new Exception("ERROR: No se han ingresado elementos al"
                        + " conjunto");
        for (int i = 0; i < this.conjunto.length; i++) 
        {
            this.numOperaciones++;
            if (this.conjunto[i] == null)
                continue;
            if (this.conjunto[i] == elemento)
            {
                this.existeElemento = true;
                this.conjunto[i] = null;
            }
        }
    }
    
    public Integer[] getConjunto()
    {
        return this.conjunto;
    }
    
    public byte getNumOperaciones()
    {
        return this.numOperaciones;
    }
    
    public boolean getExisteElemento()
    {
        return this.existeElemento;
    }
}