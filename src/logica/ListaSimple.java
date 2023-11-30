/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import clases.NodoLista;

/**
 *
 * @author Luis
 */
public class ListaSimple
{

    private NodoLista r = null;

    /**
     * @return the r
     */
    public NodoLista getR()
    {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(NodoLista r)
    {
        this.r = r;
    }

    public boolean inserta(NodoLista n)
    {
        if (n == null)
        {
            System.out.println("No se puede insertar");
            return false;
        } else
        {
            if (r == null)//cuando no tiene nada
            {
                r = n;
                return true;
            } else
            {
                if (n.getEtiqueta().compareTo(r.getEtiqueta()) < 0)//cuando n es mayor que r
                {
                    n.setSig(r);
                    r = n;
                } else
                {
                    NodoLista aux = r;
                    boolean b = true;
                    while (aux.getSig() != null && b)
                    {
                        if (aux.getSig().getEtiqueta().compareTo(n.getEtiqueta()) > 0)//cuando aux es mayor a n
                        {
                            n.setSig(aux.getSig());
                            aux.setSig(n);
                            b = false;
                        } else
                        {
                            aux = aux.getSig();
                        }
                    }
                    if (b)
                    {
                        aux.setSig(n);
                    }
                }
                return true;
            }
        }
    }

    public NodoLista elimina(String s)
    {
        if (r == null)
        {
            System.out.println("Lista vacia");
            return null;
        } else
        {
            NodoLista n = null;
            if (r.getEtiqueta().equals(s))
            {
                n = r;
                r = r.getSig();
                n.setSig(null);
            } else
            {
                boolean b = true;
                NodoLista aux = r;
                while (aux.getSig() != null && b)
                {
                    if (aux.getSig().getEtiqueta().equals(s))
                    {
                        n = aux.getSig();
                        aux.setSig(n.getSig());
                        n.setSig(null);
                        b = false;
                    } else
                    {
                        aux = aux.getSig();
                    }
                }
                if (b)
                {
                    System.out.println("Dato no encontrado");
                }
            }
            return n;
        }
    }

    public NodoLista elimina2(String s)
    {
        if (r == null)
        {
            System.out.println("Lista vacía");
            return null;
        } else if (r.getEtiqueta().equals(s))
        {
            NodoLista n = r;
            r = r.getSig();
            n.setSig(null);
            return n;
        } else
        {
            NodoLista aux = r;
            while (aux.getSig() != null)
            {
                if (aux.getSig().getEtiqueta().equals(s))
                {
                    NodoLista n = aux.getSig();
                    aux.setSig(n.getSig());
                    n.setSig(null);
                    return n;
                }
                aux = aux.getSig();
            }
            System.out.println("Dato no encontrado");
            return null;
        }
    }

    public String desp()
    {
        String s = "";
        NodoLista aux = r;
        while (aux != null)
        {
            s += aux.getEtiqueta() + "\n";
            aux = aux.getSig();
        }
        return s;
    }

    public NodoLista buscar(String etiqueta)
    {
        NodoLista aux = r;
        while (aux != null)
        {
            if (aux.getEtiqueta().equals(etiqueta))
            {
                return aux;
            }
            aux = aux.getSig();
        }
        return null;
    }

}
