package poo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author alfredo
 */
public class ManipulacionArchivos
{
    
    public static void guardar(Object obj, String s)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("../Datos/" + s);
            ObjectOutputStream arch = new ObjectOutputStream(fos);
            arch.writeObject(obj);
            arch.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("No se encontro el archivo");
        } catch(Exception ex)
        {
            System.out.println("Error..." + ex.toString());
        }
    }
    
    public static void guardar(Object[] obj, String s)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("../Datos/" + s);
            ObjectOutputStream arch = new ObjectOutputStream(fos);
            arch.writeObject(obj);
            arch.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("No se encontro el archivo");
        } catch(Exception ex)
        {
            System.out.println("Error..." + ex.toString());
        }
    }
    
    public static Object carga(String s)
    {
        Object obj = null;
        try
        {
            FileInputStream fis = new FileInputStream("../Datos/" + s);
            ObjectInputStream arch = new ObjectInputStream(fis);
            obj = arch.readObject();
            arch.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("No se econtro el archivo");
        } catch(Exception ex)
        {
            System.out.println("Error..." + ex.toString());
        }
        return obj;
    }
    
    public static Object[] cargaArch(String s)
    {
        Object[] obj = null;
        try
        {
            FileInputStream fis = new FileInputStream("../Datos/" + s);
            ObjectInputStream arch = new ObjectInputStream(fis);
            obj = (Object[]) arch.readObject();
            arch.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("No se econtro el archivo");
        } catch(Exception ex)
        {
            System.out.println("Error..." + ex.toString());
        }
        return obj;
    }
}
