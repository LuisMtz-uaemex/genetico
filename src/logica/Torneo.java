/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import clases.*;
import java.util.Random;

/**
 *
 * @author chenc
 */
public class Torneo
{
    Random random= new Random();
    Sujeto[]suj;
    public Sujeto[] selecciona(Sujeto[] su, int k)
    {
        int t=(su.length/k);
        Sujeto[] arrsu=new Sujeto[t];
        suj=su;
        for (int i = 0; i < t; i++)
        {
            arrsu[i]=miniTorneo(k);
        }
        
        return arrsu;
    }
    
    private Sujeto miniTorneo(int k)
    {
        Sujeto ganador = null;
        Sujeto[] arr = new Sujeto[k];

        for (int i = 0; i < k;)
        {
            int nr = random.nextInt(suj.length);

            if (suj[nr] != null)
            {
                arr[i] = suj[nr];
                suj[nr] = null;
                i++;
            }
        }

        ganador = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i].getGanancia() > ganador.getGanancia())
            {
                ganador = arr[i];
            }
        }

        return ganador;
    }

}
