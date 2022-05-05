import java.util.Scanner;

/**
 * Ejercicio_020
 */
public class Ejercicio_020 {

    public static void main(String[] args) {
        //Declarar Variables
        int talla;
        double cantTela, costoTela, cantPant, Pbase=0, UtilUni, pfinal, UtilTotal, cantTP;
        String modelo;
        //Datos de Entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el modelo: ");
        modelo=lt.next();
        System.out.println("Ingrese Talla a confecionar: ");
        talla=lt.nextInt();
        System.out.println("Cantidad de Talla: ");
        cantTela=lt.nextDouble();
        System.out.println("Costo tela por metro: ");
        costoTela=lt.nextDouble();
        System.out.println("Metro de tela por pantalon");
        cantTP=lt.nextDouble();
        //Proceso
        cantPant=Math.round(cantTela/cantTP);
        if (modelo.equals("A")) {
            if (talla==32||talla==36){
                Pbase=costoTela+costoTela*0.80+costoTela*0.04;
            } else {
                Pbase=costoTela+costoTela*0.80;
            }    
        } else {
            if (talla==32||talla==36){
                Pbase=costoTela+costoTela*0.95+costoTela*0.04;
            } else {
                Pbase=costoTela+costoTela*0.95;
            }
        }
        UtilUni=Pbase*0.80;
        pfinal=UtilUni+Pbase;
        UtilTotal=UtilUni*cantPant;
        //Datos de Salida
        System.out.println("Precio de Cada pantalon "+pfinal);
        System.out.println("Utilidad Total "+UtilTotal);
    }
}