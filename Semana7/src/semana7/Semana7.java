
package semana7;

public class Semana7 {

    public static void main(String[] args) {
        //el encabezado del ciclo for incluye la inicializacion
        int suma=0;
        int totalsuma=0;
        for (int contador=0;contador<=20;contador+=2){
          suma=suma+contador;
          totalsuma=totalsuma+suma;
          System.out.printf("%d\n",suma);
          
      }  
        System.out.println(""); //imprime nueva linea
    }
    
}
