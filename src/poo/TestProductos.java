/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author alfredo
 */
public class TestProductos
{
    public static void main(String[] args)
    {
        String mnu[] = {"Perecederos", "NoPerecederos", "Consulta Gral", "Presupuesto Productos","Salir"};
        String mnu2[] = {"Altas", "Bajas" , "Consultas", "Modificaciones", "Regresar"};
        
        int opc, opc2;
        
        Productos[] p = null;

        do
        {            
            opc = Manipulacion.pintaMenu(mnu, "Menu Principal");
            
            switch (opc)
            {
                case 1:                    
                case 2:
                    do
                    {                        
                        opc2 = Manipulacion.pintaMenu(mnu2,mnu[opc - 1]);
                        switch (opc2)
                        {
                            case 1:                                
                                p = Manipulacion.inserta(p, Manipulacion.crearObj(opc));
                                break;                                
                             
                            case 2:                                
                                p = Manipulacion.eliminar(p, opc);
                                break;                                
                                
                            case 3:
                                System.out.println(Manipulacion.consulta(p, opc, mnu));
                                break;
                                
                            case 4:
                                p = Manipulacion.modificar(p, opc);
                                break;
                                
                            case 5:
                                break;
                                
                            default:
                                System.out.println("Opcion incorrecta...");
                        }
                        
                    } while (opc2 != mnu2.length);
                    break;
                    
                case 3:
                    System.out.println(Manipulacion.consultaGral(p));
                    break;
                    
                    case 4:
                                Manipulacion.calPresupuesto(p);
                                break;
                                
                case 5: 
                    System.out.println("Saliendo...");
                    break;
                    
                default:
                    System.out.println("Opcion incorrecta...");
            }
            
        } while (opc!=mnu.length);
    }
}
