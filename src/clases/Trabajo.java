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
public class Trabajo implements Serializable
{
    public static final long serialVersionUID=1L;
    
    private int idAuto;
    private String trabajo;
    private double horas;
    private double ganancia;

    public Trabajo(int idAuto, String trabajo, double horas, double ganancia)
    {
        this.idAuto = idAuto;
        this.trabajo = trabajo;
        this.horas = horas;
        this.ganancia = ganancia;
    }

    
    /**
     * @return the idAuto
     */
    public int getIdAuto()
    {
        return idAuto;
    }

    /**
     * @param idAuto the idAuto to set
     */
    public void setIdAuto(int idAuto)
    {
        this.idAuto = idAuto;
    }

    /**
     * @return the trabajo
     */
    public String getTrabajo()
    {
        return trabajo;
    }

    /**
     * @param trabajo the trabajo to set
     */
    public void setTrabajo(String trabajo)
    {
        this.trabajo = trabajo;
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
        return "Trabajo{" + "idAuto=" + idAuto + ", trabajo=" + trabajo + ", horas=" + horas + ", ganancia=" + ganancia + '}';
    }
    
    
}
