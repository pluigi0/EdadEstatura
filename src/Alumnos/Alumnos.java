
package Alumnos;

import javax.swing.JOptionPane;

/*
Dadas las edades y alturas de 5 alumnos, mostrar la edad y 
la estatura media, la cantidad de alumnos mayores de 18 años 
y la cantidad de alumnos que miden mas de 1.75
*/
public class Alumnos {
    public static void main(String[] args) {
        int edad, altos=0, mayores=0, sumaEdad=0, sumaHeight=0;
        float altura, edadMedia, AlturaMedia ;
        
        for (int i =1; i<=5; i++){
            edad= Integer.parseInt(JOptionPane.showInputDialog("Dame la EDAD del "+i+" estudiante"));
            
            altura= Float.parseFloat(JOptionPane.showInputDialog("AHORA dime su ESTATURA del estudiante"));
            
            sumaEdad += edad;
            sumaHeight +=altura;
                    
            
            if (edad > 18){
                mayores++;
            }
            if (altura > 1.75){
                altos++;
            }
        System.out.println("SHOULD BE A: "+i);

    }
        edadMedia = sumaEdad /5;
        System.out.println("edad Media: "+edadMedia);
        
        AlturaMedia = sumaHeight /5;
        System.out.println("Estatura media: "+AlturaMedia);
        
        System.out.println("Alumnos Mayores de 18: "+mayores);
        
        System.out.println("Mas altos de 1.75m: "+altos);
        
        
    }
}
