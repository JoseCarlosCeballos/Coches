
import java.util.Enumeration;
import java.util.Hashtable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario DAM 2
 */
public class Garaje {

    private Hashtable<String, Coches> listadoCoches;

    public Garaje() {
        listadoCoches = new Hashtable();
    }

    public void agregarCoche(Coches coche) {

        listadoCoches.put(coche.getMatricula(), coche);

    }

    public boolean estaCoche(String matricula) {
        return listadoCoches.containsKey(matricula);
    }

    public void eliminarCoche(String matricula) {
        listadoCoches.remove(matricula);
    }
    
    public void listarCoches(){
        Enumeration<Coches> elementos = listadoCoches.elements();
        while (elementos.hasMoreElements()){
            Coches c = elementos.nextElement();
            System.out.println(c);
        }
    }

}
