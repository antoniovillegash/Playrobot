/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front;
import curp.*;
import javax.swing.JOptionPane;
/**
 *
 * @author tony villegas
 */
public class Funciones {
    Persona persona=new Persona();
    
    public Persona[] recorrerPrimero(Persona[] arreglo, int tamañoDeArreglo){
        Persona auxString;
        for(int i=tamañoDeArreglo-1; i>0; i--){
            auxString=arreglo[i-1];
            arreglo[i]=auxString;
        }
        return arreglo;
    }
    
    public Persona[] recorrerUltimo(Persona[] arreglo, int tamañoDeArreglo){
        Persona auxString;
        for(int i=0; i<tamañoDeArreglo-1; i++){
            auxString=arreglo[i+1];
            arreglo[i]=auxString;
        }
        arreglo[tamañoDeArreglo-1]=null;
        return arreglo;
    }
    
    public void imprimirPersona(Persona[] arreglo, int tamañoDeArreglo){
        for(int i=0; i<tamañoDeArreglo; i++){
            System.out.println(i + " "+ arreglo[i]);
        }
    }
    
    public void buscarPorCurp(Persona[] arreglo, int tamañoDeArreglo, String curpABuscar){
        boolean auxBool=false;
        if(!curpABuscar.equals("")){
            for(int i=0; i<tamañoDeArreglo; i++){
            if((arreglo[i].getCurp()).equals(curpABuscar)){
                auxBool=true;
                System.out.println(arreglo[i]);
                JOptionPane.showMessageDialog(null, "se encontró la curp en el indice" + i +"\n" + arreglo[i].getCurp());
                break;
            }
        }
        if(auxBool==false){
            JOptionPane.showMessageDialog(null, "no se encontró ningun curp que coincida");
        }
        }else{
            JOptionPane.showMessageDialog(null, "ingrese curp a buscar");
        }
        
    }
    
    public void buscarPorPosicion(Persona[] arreglo, int tamañoDeArreglo, int posicionABuscar){
        boolean auxBool=false;
        if(arreglo[posicionABuscar]==null){
            JOptionPane.showMessageDialog(null, "no se encontró ningun curp que coincida");
            auxBool=true;
        }else if((arreglo[posicionABuscar].getCurp())!=null){
            auxBool=true;
            System.out.println(arreglo[posicionABuscar]);
            JOptionPane.showMessageDialog(null, "se encontró la curp en el indice" + posicionABuscar +"\n" + arreglo[posicionABuscar].getCurp());
               
        }
        if(auxBool==false){
            JOptionPane.showMessageDialog(null, "no se encontró ningun curp que coincida");
        }
    }
    
    public void eliminarPorCurp(Persona[] arreglo, int tamañoDeArreglo, String curpABuscar){
        boolean auxBool=false;
        if(!curpABuscar.equals("")){
            for(int i=0; i<tamañoDeArreglo; i++){
            if((arreglo[i].getCurp()).equals(curpABuscar)){
                auxBool=true;
                arreglo[i]=null;
                JOptionPane.showMessageDialog(null, "se ha eliminado la curp en el indice" + i +"\n" + arreglo[i].getCurp());
                break;
            }
        }
        if(auxBool==false){
            JOptionPane.showMessageDialog(null, "no se encontró ningun curp que coincida");
        }
        }else{
            JOptionPane.showMessageDialog(null, "ingrese curp a buscar");
        }
        
    }
    
    public void eliminarPorPosicion(Persona[] arreglo, int tamañoDeArreglo, int posicionABuscar){
        boolean auxBool=false;
        if(arreglo[posicionABuscar]==null){
            JOptionPane.showMessageDialog(null, "no se encontró ningun curp que coincida");
            auxBool=true;
        }else if((arreglo[posicionABuscar].getCurp())!=null){
            auxBool=true;
            arreglo[posicionABuscar]=null;
            JOptionPane.showMessageDialog(null, "se eliminó la curp en el indice" + posicionABuscar +"\n" + arreglo[posicionABuscar].getCurp());
               
        }
        if(auxBool==false){
            JOptionPane.showMessageDialog(null, "no se encontró ningun curp que coincida");
        }
    }
    
    public void intercambiarPosiciones(Persona[] arreglo, int posicion1, int posicion2){
        Persona auxString;
        auxString=arreglo[posicion1];
        arreglo[posicion1]=arreglo[posicion2];
        arreglo[posicion2]=auxString;
    }
    
    public void vaciarArreglo(Persona[] arreglo, int tamañoDeArreglo){
        for(int i=0; i<tamañoDeArreglo; i++){
            arreglo[i]=null;
        }
        
    }
}
