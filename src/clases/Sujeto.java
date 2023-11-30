/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;

/**
 *
 * @author chenc
 */
public class Sujeto implements Serializable
{
    public static final long serialVersionUID=1L;
    
    private int id;
    private int[]vetcor;
    private double horas;
    private double ganancia;

    public Sujeto(int id, int[] vetcor, double horas, double ganancia)
    {
        this.id = id;
        this.vetcor = vetcor;
        this.horas = horas;
        this.ganancia = ganancia;
    }
    
    

    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * @return the vetcor
     */
    public int[] getVetcor()
    {
        return vetcor;
    }

    /**
     * @param vetcor the vetcor to set
     */
    public void setVetcor(int[] vetcor)
    {
        this.vetcor = vetcor;
    }

    /**
     * @return the horas
     */
    public double getHoras()
    {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(double horas)
    {
        this.horas = horas;
    }

    /**
     * @return the ganancia
     */
    public double getGanancia()
    {
        return ganancia;
    }

    /**
     * @param ganancia the ganancia to set
     */
    public void setGanancia(double ganancia)
    {
        this.ganancia = ganancia;
    }

    @Override
    public String toString()
    {
        return "Sujeto{" + "id=" + id + ", vetcor=" + convertir(vetcor) + ", horas=" + horas + ", ganancia=" + ganancia + '}';
    }
    
    
    public String convertir(int []arr)
    {
        String s="";
        
        for (int i = 0; i < arr.length; i++)
        {
            s+=String.valueOf(arr[i]);
        }
        
        return s;
    }
}
