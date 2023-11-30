/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import clases.*;
import logica.*;


/**
 *
 * @author chenc
 */
public class PrbFucion
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Funcion fu= new Funcion();
        ManipulaArchivos arch= new ManipulaArchivos();
        Trabajo[] tr= (Trabajo[])arch.cargaArr("trabajos.dat");
        Sujeto[] sujetos= fu.arrSujeto(tr, 100);
        System.out.println("--------sujetos primeros---------");
        for (int i = 0; i < sujetos.length; i++)
        {
            System.out.println(sujetos[i].toString());
        }
        
        System.out.println("----------------------------------");
        System.out.println("------sujetos seleccionados-------");
        Torneo torneo= new Torneo();
        Sujeto[] sujetos2=torneo.selecciona(sujetos, 3);
        for (int i = 0; i < sujetos2.length; i++)
        {
            System.out.println("i="+(i+1)+" "+sujetos2[i].toString());
        }
    }
    
}
