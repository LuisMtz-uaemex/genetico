/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import clases.*;
import logica.ManipulaArchivos;

/**
 *
 * @author chenc
 */
public class CargaData
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        ManipulaArchivos arch= new ManipulaArchivos();
        
        Automovil[] au= (Automovil[])arch.cargaArr("autos.dat");
        Trabajo[] tr= (Trabajo[])arch.cargaArr("trabajos.dat");
        
        System.out.println("Autos");
        for (int i = 0; i < au.length; i++)
        {
            System.out.println(au[i].toString());
        }
        
        System.out.println("Trabajos");
        for (int i = 0; i < tr.length; i++)
        {
            System.out.println(tr[i].toString());
        }
        
    }
    
}
