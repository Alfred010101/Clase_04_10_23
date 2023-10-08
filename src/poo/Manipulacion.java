package poo;

/**
 *
 * @author alfredo
 */
public class Manipulacion
{

    public static int pintaMenu(String[] mnu, String s)
    {
        System.out.println("======== Menu " + s + " =========");
        for (int i = 0; i < mnu.length; i++)
        {
            System.out.println((i + 1) + ".-" + mnu[i]);
        }
        System.out.println("elige una opcion");
        return Lecturas.leerEntero(true);
    }

    public static Productos[] inserta(Productos[] p, Productos obj)
    {
        if (p == null)
        {
            p = new Productos[1];
        } else
        {
            Productos nvo[] = new Productos[p.length + 1];
            System.arraycopy(p, 0, nvo, 0, p.length);
            p = nvo;
        }

        p[p.length - 1] = obj;
        return p;
    }

    public static String consultaGral(Productos[] p)
    {
        String s = "";
        try
        {
            System.out.println("=====Consulta general=======");
            s += "id\tnom\tprecio\texit\tlote\\fechaCad";
            for (int i = 0; i < p.length; i++)
            {
                s += "\n" + p[i].toString();
            }
        } catch (Exception ex)
        {
            s = "Error...no hay datos";
        }

        return s;
    }

    public static Productos crearObj(int opc)
    {

        String nom;
        double precio;
        int existencia;
        int lote;
        String fechaCad;

        System.out.print("Nombre :");
        nom = Lecturas.leerCadena();
        System.out.print("Precio :");
        precio = Lecturas.leerDoble();
        System.out.print("Existencia :");
        existencia = Lecturas.leerEntero();

        if (opc == 1)
        {
            System.out.print("Fecha :");
            fechaCad = Lecturas.leerCadena();

            return new Pereceredos(fechaCad, nom, precio, existencia);
        } else
        {
            System.out.print("Lote : ");
            lote = Lecturas.leerEntero();
            return new NoPerecederos(lote, nom, precio, existencia);
        }

    }
    
    public static Productos[] eliminar(Productos[] p, int opc)
    {
        if(p == null)
        {
            System.out.println("No hay productos registrados");
            return p;
        }
        
        int index = buscarProducto(p, idBusqueda("eliminar"));
        
        if(index < 0)
        {
            System.out.println("No se encontro ningun producto asociado al id");
        }else
        {
            if(opc == 1 && p[index] instanceof Pereceredos || opc == 2 && p[index] instanceof NoPerecederos)
            {
                p = delete(p, index);
                System.out.println("Producto eliminado correctamente");
            }else
            {
                System.out.println("El prodocto no puede ser eliminado desde este punto");
            }
        }
        
        return p;
    }
    
    private static Productos[] delete(Productos[] p, int index)
    {
        if(p.length == 1)
        {           
           return null;//p = null;
        }
        
        Productos[] tmpP = new Productos[p.length - 1];
        
        System.arraycopy(p, 0, tmpP, 0, index);
        
        for (int i = index; i < p.length - 1; i++)
        {
            tmpP[i] = p[i + 1];
        }
        
        return tmpP;
    }
    
    public static int buscarProducto(Productos[] p, int id)
    {
        if(p == null)
        {
            return -1;
        }
        
        int i = 0;
        
        for ( ; i < p.length; i++)
        {
            if(Integer.parseInt(p[i].getId()) == id)
            {
                break;                
            }
        }
        
        return (i == p.length) ? -1 : i;
    }
    
    private static int idBusqueda(String accion)
    {
        System.out.println("Ingrese ID del producto a " + accion);
        return Lecturas.leerEntero(true);
    }
    
    public static Productos[] modificar(Productos[] p, int opc)
    {
        if(p == null)
        {
            System.out.println("No hay productos registrados");
            return p;
        }
        
        int index = buscarProducto(p, idBusqueda("modificar"));
        
        if(index < 0)
        {
            System.out.println("No se encontro ningun producto asociado al id");
        }else
        {
            if(opc == 1 && p[index] instanceof Pereceredos || opc == 2 && p[index] instanceof NoPerecederos)
            {
                p[index] = update(p[index], opc);
                System.out.println("Producto modificado correctamente");
            }else
            {
                System.out.println("El prodocto no puede ser modificado desde este punto");
            }
        }
        
        return p;
    }
    
    private static Productos update(Productos p, int opc)
    {
        Productos tmp = crearObj(opc);
        Productos.setFolio(Productos.getFolio() - 1);
        tmp.setId(p.getId());
        p = tmp;
        return p;
    }
     
    public static String consulta(Productos[] p, int opc, String[] mnu)
    {
        String s = "";
        try
        {
            System.out.println("=====Consulta " + mnu[opc - 1] + "=======");
            if (opc == 1)
            {
                s += "id\tnom\tprecio\texit\tfechaCad";
            } else
            {
                s += "id\tnom\tprecio\texit\tlote";
            }

            for (int i = 0; i < p.length; i++)
            {
                if (opc == 1 && p[i] instanceof Pereceredos)
                {
                    s += "\n" + p[i].toString();

                } else
                {
                    if (opc == 2 && p[i] instanceof NoPerecederos)
                    {
                        s += "\n" + p[i].toString();

                    }
                }
            }
        } catch (Exception ex)
        {
            s = "Error...no hay datos";
        }

        return s;
    }
}
