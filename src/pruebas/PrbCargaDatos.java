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
public class PrbCargaDatos
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ManipulaArchivos arch= new ManipulaArchivos();
        Automovil[] au= new Automovil[5];
        Trabajo[] tr= new Trabajo[19];
        
        au[0]=new Automovil(1,"2010","Lancer","Mitsubishi",2);
        au[1]=new Automovil(2,"2012","Sonic","Chevrolet",1.8);
        au[2]=new Automovil(3,"2011","Fiesta","Ford",1.6);
        au[3]=new Automovil(4,"2010","C 350","Mercedes",3.5);
        au[4]=new Automovil(5,"2010","Ram","Dodge",5.7);
        
        arch.guarda("autos.dat", au);
        
        tr[0]=new Trabajo(1,"Frenos",0.5,175);
        tr[1]=new Trabajo(1,"Alineación",5.2,1820);
        tr[2]=new Trabajo(1,"Afinación",3.8,1015);
        
        tr[3]=new Trabajo(2,"Reparar motor",39.2,13720);
        tr[4]=new Trabajo(2,"Afinación",1.7,595);
        tr[5]=new Trabajo(2,"Reparar cabeza",8.8,3080);
        tr[6]=new Trabajo(2,"Reparar cello de cigüeñal",7.6,2660);
        tr[7]=new Trabajo(2,"Alineación",2.4,840);
        
        tr[8]=new Trabajo(3,"Alineación",2.8,980);
        tr[9]=new Trabajo(3,"Afinación",2.6,910);
        tr[10]=new Trabajo(3,"Reparar bomba de agua",2.7,945);
        tr[11]=new Trabajo(3,"Cambiar sensor de cigüeñal",0.5,175);
        
        tr[12]=new Trabajo(4,"Alineación",5.3,1855);
        tr[13]=new Trabajo(4,"Afinación",5.3,1855);
        tr[14]=new Trabajo(4,"Frenos",0.7,245);
        tr[15]=new Trabajo(4,"Carter",12,4200);
        tr[16]=new Trabajo(4,"Reparar cabeza",37.3,13265);
        
        tr[17]=new Trabajo(5,"Alineación",2.5,875);
        tr[18]=new Trabajo(5,"Afinación",2.9,1015);
        
        arch.guarda("trabajos.dat", tr);
        
    }
    
}
