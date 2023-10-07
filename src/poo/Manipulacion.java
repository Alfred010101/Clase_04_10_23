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
            System.out.println("Fecha:");
            fechaCad = Lecturas.leerCadena();

            return new Pereceredos(fechaCad, nom, precio, existencia);
        } else
        {
            System.out.println("Lote");
            lote = Lecturas.leerEntero();
            return new NoPerecederos(lote, nom, precio, existencia);
        }

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
