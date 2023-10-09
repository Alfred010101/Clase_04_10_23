
package poo;

/**
 *
 * @author alfredo
 */
public class Pereceredos extends Productos implements Machote
{
    private String fechaCaducidad;
    
    public Pereceredos()
    {
    }

    public Pereceredos(String fechaCaducidad, String nombre, double precio, int existencia)
    {
        super(nombre, precio, existencia);
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * @return the fechaCaducidad
     */
    public String getFechaCaducidad()
    {
        return fechaCaducidad;
    }

    /**
     * @param fechaCaducidad the fechaCaducidad to set
     */
    public void setFechaCaducidad(String fechaCaducidad)
    {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\t" + fechaCaducidad + "\n";
    }

    @Override
    public double calcIva(Double monto)
    {
        return 0;
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
