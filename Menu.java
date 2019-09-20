
import java.util.Hashtable;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario DAM 2
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Hashtable<String, Coches> garaje = new Hashtable();
        Garaje garaje = new Garaje();
        int opcion;
        do {
            System.out.println("1.Registrar coches: ");
            System.out.println("2.Desregistrar coches: ");
            System.out.println("3.Listar coches: ");
            System.out.println("4.Meter coches: ");
            System.out.println("5.Sacar coches: ");
            System.out.println("6.Trabajar con coches en el garaje: ");
            System.out.println("Introduce la opcion a elegir: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    String matricula, marca, modelo;
                    int cv, bastidor;
                    System.out.println("Que matricula?: ");
                    matricula = teclado.next();
                    if (!garaje.estaCoche(matricula)) {
                        // Solo lo pido si no esta el coche
                        System.out.println("Que marca?: ");
                        marca = teclado.next();
                        System.out.println("Que modelo?: ");
                        modelo = teclado.next();
                        System.out.println("Que caballos?: ");
                        cv = teclado.nextInt();
                        System.out.println("Que bastidor?: ");
                        bastidor = teclado.nextInt();
                        Coches coche = new Coches(matricula, marca, modelo, cv, bastidor);
                        garaje.agregarCoche(coche);
                    } else {
                        System.out.println("No puedo agregarlo por que le coche ya existe");
                    }
                    break;
                case 2:
                    String matriculaEliminar;
                    System.out.println("Que matricula?: ");
                    matriculaEliminar = teclado.next();
                    if(!garaje.estaCoche(matriculaEliminar)){
                        System.out.println("No se puede eliminar por que no existe");
                    }else{
                        garaje.eliminarCoche(matriculaEliminar);
                    }
                    break;
                case 3:
                   garaje.listarCoches();
                    break;
                case 7:
                    break;
                default:
                    break;
            }
        } while (opcion != 7);
    }

}
