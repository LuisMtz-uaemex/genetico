/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mauro
 */
public class ManipulaArchivos<Tipo>
{

    public void guarda(String nomArch, Tipo obj)
    {
        try
        {
            FileOutputStream ubicacion = new FileOutputStream(nomArch);
            ObjectOutputStream arch = new ObjectOutputStream(ubicacion);
            arch.writeObject(obj);
            arch.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("Archivo no encontrado");
        } catch (Exception ex)
        {
            System.out.println("Error..." + ex.toString());
        }
    }

    public void guarda(String nomArch, Tipo obj[])
    {
        try
        {
            FileOutputStream ubicacion = new FileOutputStream(nomArch);
            ObjectOutputStream arch = new ObjectOutputStream(ubicacion);
            arch.writeObject(obj);
            arch.close();
            System.out.println("Se guardo el archivo");
        } catch (FileNotFoundException ex)
        {
            System.out.println("Archivo no encontrado");
        } catch (Exception ex)
        {
            System.out.println("Error..." + ex.toString());
        }
    }

    public Tipo carga(String nomArch)
    {
        try
        {
            FileInputStream ubicacion = new FileInputStream(nomArch);
            ObjectInputStream arch = new ObjectInputStream(ubicacion);
            Tipo obj = (Tipo) arch.readObject();
            arch.close();
            return obj;
        } catch (FileNotFoundException ex)
        {
            System.out.println("Archivo no encontrado");
        } catch (Exception ex)
        {
            System.out.println("Error..." + ex.toString());
        }
        return null;
    }

    public Tipo[] cargaArr(String nomArch)
    {
        try
        {
            FileInputStream ubicacion = new FileInputStream(nomArch);
            ObjectInputStream arch = new ObjectInputStream(ubicacion);
            Tipo obj[] = (Tipo[]) arch.readObject();
            arch.close();
            return obj;
        } catch (FileNotFoundException ex)
        {
            System.out.println("Archivo no encontrado");
        } catch (Exception ex)
        {
            System.out.println("Error..." + ex.toString());
        }
        return null;
    }
    
}
