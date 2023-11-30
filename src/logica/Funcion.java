/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import clases.Sujeto;
import clases.Trabajo;
import java.util.Random;

/**
 *
 * @author chenc
 */
public class Funcion
{
    Random random = new Random();
    
    private Sujeto sujeto(Trabajo[] tr,int num)
    {
        Sujeto su=null;
        int arr[]=arregloInt(tr.length);
        double horaTotal=0;
        double ganancia=0;
        
        for (int i = 0; i < tr.length; i++)
        {
            horaTotal+=(tr[i].getHoras()*arr[i]);
            ganancia+=(tr[i].getGanancia()*arr[i]);
        }
        
        if (horaTotal>0&&horaTotal<=56&&horaTotal>=30)
        {
            return new Sujeto(num+1,arr,horaTotal,ganancia);
        }
        
        return su;
    }
    
    public Sujeto[] arrSujeto(Trabajo[] tr,int numMax)
    {
        Sujeto[] arr= new Sujeto[numMax];
        
        for (int i = 0; i < numMax;)
        {
            Sujeto nu=sujeto(tr,i);
            if (nu!=null)
            {
                arr[i]=nu;
                i++;
            }
        }
        
        return arr;
    }
    private int[] arregloInt(int tr)
    {
        int[] gen=new int[tr];
        
        for (int i = 0; i < gen.length; i++)
        {
            gen[i]=random.nextBoolean() ? 1 : 0;
        }
        
        return gen;
    }
}
