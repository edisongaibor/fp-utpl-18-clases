
package dowhile;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String jugador;
        int partido;
        int pases=0;
        int goles=0;
        String niveljugador=null;
        int totalpases=0;
        int totalgoles=0;
        double prom;
        int numjugadores=0;
        String cadena;
        int contador=0;
        int bandera=1;
        double prom1=0;
        double prom2=0;
        int suma=0;
        int suma1=0;


        cadena=String.format("%s\n","Reporte de Jugadores del Equipo UTPL");
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese numero de jugadores");
        numjugadores=entrada.nextInt();
        

        
        
        cadena=String.format("%s\t\t%s\t\t%s\t\t%s\n","Nombre del Jugador" ,"Total de Pases","Total Goles","Nivel de jugador");
        

        
        do{
            entrada.nextLine();
            System.out.println("Ingrese nombre de jugador");
            jugador=entrada.nextLine();
            System.out.println("Ingrese numero de partidos");
            partido=entrada.nextInt();
            for(contador=0;contador<=partido;contador++){
                System.out.println("Ingrese total de pases en el partido");
                pases=entrada.nextInt();
                System.out.println("Ingrese total de goles");
                goles=entrada.nextInt();
                contador=contador+1;

                totalpases=totalpases+pases;
                totalgoles=totalgoles+goles;
                suma=suma+totalpases;
                suma1=suma1+totalgoles;
                prom1=suma/numjugadores;
                prom2=suma1/numjugadores;
                

                

               

                if (pases==100){
                    niveljugador=("Excelente");
                }
                if (pases>=80 && pases<=99){
                     niveljugador=("Muy bueno");
                }
                if (pases>=60 && pases<=79){
                     niveljugador=("Bueno");
                }
                if (pases>=0 && pases<=59){
                     niveljugador=("Regular");
                }
                

                        

                cadena=cadena+String.format("%s%30s%d%s%d%20s%d%s%d\n\n%40s%d%20s%d%30s\n",jugador,"P",contador,":",pases,"P",contador,":",goles,"Total:",totalpases,"Total:",totalgoles,niveljugador);
            
            }

            
            bandera=bandera+1;
            
            
            totalpases=0;
            totalgoles=0;
            

  
        }while(bandera<=numjugadores);
      
        
        
        System.out.println("Reporte de Jugadores del Equipo \"UTPL\"\n");
        System.out.printf("%s\n",cadena);
        System.out.println("Datos Finales:\n");
        System.out.println("");
        System.out.printf("%s\t%.2f\n","El promedio de pases del equipo es:",prom1);
        System.out.printf("%s\t%.2f\n\n","El promedio de goles del equipo es:",prom2);
        System.out.println("Departamento Estadístico");
                    


        


    
        
        
        
        
        
        
    }
    
}
