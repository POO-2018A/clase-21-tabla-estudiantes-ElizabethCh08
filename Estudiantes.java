/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

/**
 *
 * @author AnalyKarlaCynthia
 */
public class Estudiantes {
    
    String nombre;
    String apellido;
    double nota1;
    double nota2;
    double nota3;
    double promedio;

    public Estudiantes(String nombre, String apellido, double nota1, double nota2, double nota3, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        String  aux= " "+nombre + " - "+ apellido +" - "+nota1+" - "+nota2+" - "+nota3+" -  "+ promedio;
        
        return aux;
    }


    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
    }
    
}
