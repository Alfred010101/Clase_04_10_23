
package poo;

/**
 *
 * @author alfredo
 */
public class NoPerecederos extends Productos
{
    private int lote;

    public NoPerecederos()
    {
    }

    public NoPerecederos(int lote, String nombre, double precio, int existencia)
    {
        super(nombre, precio, existencia);
        this.lote = lote;
    }

    /**
     * @return the lote
     */
    public int getLote()
    {
        return lote;
    }

    /**
     * @param lote the lote to set
     */
    public void setLote(int lote)
    {
        this.lote = lote;
    }

    @Override
    public String toString()
    {
        return super.toString() + lote + "\n";
    }
    
    
}
