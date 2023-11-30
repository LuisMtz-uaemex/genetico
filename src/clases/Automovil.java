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
public class Automovil implements Serializable
{
    public static final long serialVersionUID=1L;
    
    private int id;
    private String anio;
    private String modelo;
    private String marca;
    private double motor;

    public Automovil(int id, String anio, String modelo, String marca, double motor)
    {
        this.id = id;
        this.anio = anio;
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
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
     * @return the anio
     */
    public String getAnio()
    {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(String anio)
    {
        this.anio = anio;
    }

    /**
     * @return the modelo
     */
    public String getModelo()
    {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    /**
     * @return the marca
     */
    public String getMarca()
    {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    /**
     * @return the motor
     */
    public double getMotor()
    {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(double motor)
    {
        this.motor = motor;
    }

    @Override
    public String toString()
    {
        return "Automovil{" + "id=" + id + ", anio=" + anio + ", modelo=" + modelo + ", marca=" + marca + ", motor=" + motor + '}';
    }
    
}
