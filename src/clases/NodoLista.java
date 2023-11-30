/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author LIPM
 */
public class NodoLista <T>
{
    private String etiqueta;
    private T obj;
    private NodoLista sig,anterior,abajo;

    public NodoLista(String etiqueta, T obj)
    {
        this.etiqueta = etiqueta;
        this.obj = obj;
        this.sig = null;
    }

    public NodoLista(T obj)
    {
        this.obj = obj;
    }

    

    
    /**
     * @return the etiqueta
     */
    public String getEtiqueta()
    {
        return etiqueta;
    }

    /**
     * @param etiqueta the etiqueta to set
     */
    public void setEtiqueta(String etiqueta)
    {
        this.etiqueta = etiqueta;
    }

    /**
     * @return the obj
     */
    public T getObj()
    {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(T obj)
    {
        this.obj = obj;
    }

    /**
     * @return the sig
     */
    public NodoLista getSig()
    {
        return sig;
    }

    /**
     * @param sig the sig to set
     */
    public void setSig(NodoLista sig)
    {
        this.sig = sig;
    }

    @Override
    public String toString()
    {
        return "Nodo{" + "etiqueta=" + etiqueta + '}';
    }

    public NodoLista getAnterior()
    {
        return anterior;
    }

    public void setAnterior(NodoLista anterior)
    {
        this.anterior = anterior;
    }

    public NodoLista getAbajo()
    {
        return abajo;
    }

    public void setAbajo(NodoLista abajo)
    {
        this.abajo = abajo;
    }
    
}
