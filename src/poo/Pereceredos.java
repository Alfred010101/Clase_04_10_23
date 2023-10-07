
package poo;

/**
 *
 * @author alfredo
 */
public class Pereceredos extends Productos
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
    
    
}
