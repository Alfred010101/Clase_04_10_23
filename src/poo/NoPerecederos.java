
package poo;

/**
 *
 * @author alfredo
 */
public class NoPerecederos extends Productos implements Machote
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

    @Override
    public double calcIva(Double monto)
    {
        return monto*Productos.IVA;
    }

    @Override
    public void accion1()
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int accion2(int x)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String accion3(double d, Object x)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }    
    
}
