
package poo;

/**
 *
 * @author alfredo
 */
public class Productos
{
    private static int folio;
    private String id;
    private String nombre;
    private double precio;
    private int existencia;

    public Productos()
    {
    }
    
    public Productos(String nombre, double precio, int existencia)
    {
        ++folio;
        String s = String.valueOf(folio);
        for (int i = s.length(); i < 5; i++)
        {
            s = "0" + s;
        }
        id = s;
        
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
    }

    /**
     * @return the folio
     */
    public static int getFolio()
    {
        return folio;
    }

    /**
     * @param aFolio the folio to set
     */
    public static void setFolio(int aFolio)
    {
        folio = aFolio;
    }

    /**
     * @return the id
     */
    public String getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio()
    {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    /**
     * @return the existencia
     */
    public int getExistencia()
    {
        return existencia;
    }

    /**
     * @param existencia the existencia to set
     */
    public void setExistencia(int existencia)
    {
        this.existencia = existencia;
    }

    @Override
    public String toString()
    {
        return  id + "\t" + nombre + "\t" + precio + "\t" + existencia + "\t";
    }
    
    
}
