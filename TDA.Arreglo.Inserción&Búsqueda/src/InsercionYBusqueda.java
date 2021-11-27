public class InsercionYBusqueda 
{
    private int[] elementos, posiciones;
    private int elementoBúsqueda;
    private byte repeticiones, numOperaciones, posiciónMayor;
    
    public InsercionYBusqueda()
    {
        this.elementos = this.posiciones = null;
        this.elementoBúsqueda = 0;
        this.repeticiones = this.numOperaciones = this.posiciónMayor = 0;
    }
    
    public void setElementos(int[] xElementos)
    {
        this.elementos = xElementos;
    }
    
    public void setElementoBúsqueda(int xElementoBúsqueda)
    {
        this.elementoBúsqueda = xElementoBúsqueda;
    }
    
    public void setRepeticiones()
    {
        for (int i = 0; i < this.elementos.length; i++) 
        {
            this.numOperaciones++;
            if (this.elementos[i] == this.elementoBúsqueda)
            {
                this.repeticiones++;
                this.posiciónMayor = (byte) i;
            }
        }
    }
    
    public void setPosiciones()
    {
        this.posiciones = new int[repeticiones];
        byte apuntador = 0;
        
        for (int i = 0; i < this.elementos.length; i++) 
        {
            this.numOperaciones++;
            if (this.elementos[i] == this.elementoBúsqueda)
            {
                posiciones[apuntador] = i;
                if (i == this.posiciónMayor)
                {
                    break;
                }
                apuntador++;
            }
        }
    }
    
    public int[] getElementos()
    {
        return this.elementos;
    }
    
    public int getElementoBúsqueda()
    {
        return this.elementoBúsqueda;
    }
    
    public byte getRepeticiones()
    {
        return this.repeticiones;
    }
    
    public int[] getPosiciones()
    {
        return this.posiciones;
    }
    
    public byte getNumOperaciones()
    {
        return this.numOperaciones;
    }
}